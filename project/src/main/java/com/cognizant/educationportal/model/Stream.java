package com.cognizant.educationportal.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="Stream_Info")
public class Stream {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "stream_course_id")
	int streamCourseId;
	 @Column(name = "stream_name")
	String stream_Name;
	
	public int getStreamCourseId() {
		return streamCourseId;
	}
	public void setStreamCourseId(int streamCourseId) {
		this.streamCourseId = streamCourseId;
	}
	public String getStream_Name() {
		return stream_Name;
	}
	public void setStream_Name(String stream_Name) {
		this.stream_Name = stream_Name;
	}
	
	
    
}
