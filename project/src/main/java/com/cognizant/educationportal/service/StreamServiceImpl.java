package com.cognizant.educationportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cognizant.educationportal.dao.StreamDAO;
import com.cognizant.educationportal.model.Stream;
@Service("StreamService")
public class StreamServiceImpl implements StreamService{

	@Autowired
	StreamDAO streamDAO;
	@Transactional
	public void saveStream(Stream theStream) {
		// TODO Auto-generated method stub
		streamDAO.saveStream(theStream);
	}

	@Transactional
	public Stream getStream(int theId) {
		// TODO Auto-generated method stub
		return streamDAO.getStream(theId);
	}

}
