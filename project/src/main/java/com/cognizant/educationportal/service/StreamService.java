package com.cognizant.educationportal.service;

import com.cognizant.educationportal.model.Stream;

public interface StreamService {

	public void saveStream(Stream theStream);
	public Stream getStream(int theId);
}
