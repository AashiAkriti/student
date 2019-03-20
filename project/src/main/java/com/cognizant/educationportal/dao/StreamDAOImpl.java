package com.cognizant.educationportal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.cognizant.educationportal.model.Stream;

@Repository("streamDAO")
public class StreamDAOImpl implements StreamDAO {

	@Autowired
	SessionFactory sessionFactory1;
	public void saveStream(Stream theStream) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory1.getCurrentSession();
		currentSession.saveOrUpdate(theStream);
	}

	public Stream getStream(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory1.getCurrentSession();
		Stream theStream=currentSession.get(Stream.class, theId);
		return theStream;
	}

}
