package org.example;

import org.example.job.NovosPedidosJob;
import org.example.listeners.EntregaListener;
import org.example.listeners.FaturamentoListener;
import org.example.listeners.Listener;
import org.example.model.PedidoVenda;
import org.example.notifier.Notificador;
import org.example.notifier.NotificadorNovosPedidos;


import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
public class Main {
    public static void main(String[] args) throws Exception {
        Notificador notificador = new NotificadorNovosPedidos();

        Listener logisticaListener = new EntregaListener(notificador);
        Listener faturamentoListener = new FaturamentoListener(notificador);

        JobDataMap jobDataMap = new JobDataMap();
        PedidoVenda pedidoVenda = new PedidoVenda();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("pedidoVenda", pedidoVenda);
        jobDataMap.put("notificador", notificador);

        JobDetail job = newJob(NovosPedidosJob.class)
                .setJobData(jobDataMap)
                .withIdentity("novosPedidoJob", "novosPedidoGroup")
                .build();

        CronTrigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("* * * * * ?"))
                .build();

        scheduler.scheduleJob(job, trigger);

        scheduler.start();

        Thread.sleep(220000);

        scheduler.shutdown(true);
    }
}