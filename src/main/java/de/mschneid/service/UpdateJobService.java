package de.mschneid.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class UpdateJobService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public void updateAgencies() {
		System.out.println("The time is now " + dateFormat.format(new Date()));
	}

}
