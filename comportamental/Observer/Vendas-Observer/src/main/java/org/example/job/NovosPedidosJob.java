package org.example.job;

import java.util.List;

import org.example.model.PedidoVenda;
import org.example.notifier.Notificador;
import org.example.repository.PedidosVenda;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;



public class NovosPedidosJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();

		PedidosVenda pedidos = (PedidosVenda) jobDataMap.get("pedidoVenda");
		Notificador notificador = (Notificador) jobDataMap.get("notificador");
		
		List<PedidoVenda> novosPedidosVenda = pedidos.getAll();
		notificador.novosPedidos(novosPedidosVenda);
	}

}
