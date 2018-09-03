package com.dc.schedule.inspection;

import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;

import com.dc.entity.Equipment;
import com.dc.service.EquipmentService;

@Component
public class NextDateInspectionSchedule {

	@Autowired
	private ThreadPoolTaskScheduler taskScheduler;

	@Autowired
	private PeriodicTrigger periodicTrigger;
	
	@Autowired
	private EquipmentService equipmentService;

	@PostConstruct
	public void init() {
		taskScheduler.schedule(new RunnableTask(), periodicTrigger);
	}

	class RunnableTask implements Runnable {

		@Override
		public void run() {
			Iterable<Equipment> equipments = equipmentService.findByProximaInspecaoLessThan(new Date());
			Logger.getLogger(this.getClass().getName()).info("Shedule running");

			equipments.forEach(e->{
				e.setInspecaoValida(false);
				equipmentService.save(e);
				Logger.getLogger(this.getClass().getName()).info("executed");
			});
		}
	}

}
