package com.cognizant.educationportal.dao;


import com.cognizant.educationportal.model.Stream;

public interface StreamDAO {

	public void saveStream(Stream theStream);
	public Stream getStream(int theId);
}
