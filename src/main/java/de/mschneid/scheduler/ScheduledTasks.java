package de.mschneid.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import de.mschneid.service.UpdateJobService;

@Component
public class ScheduledTasks {

	@Autowired
	private UpdateJobService updateJobService;

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		// System.out.println("The time is now " + dateFormat.format(new
		// Date()));
		updateJobService.updateAgencies();
	}
}
