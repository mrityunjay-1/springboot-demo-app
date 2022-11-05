package com.example.demo.courseapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List<Topic> getAllTopics() {
		return  Arrays.asList(
    			new Topic("101", "Rust", "Bestest programming language ever created on this planet / other any other universe's planet."),
    			new Topic("102", "JavaScript", "Best programming language."),
    			new Topic("103", "PHP", "Server side programming language."),
    			new Topic("104", "Java", "Worst Programming Language.")
		);
	}
	
	public Topic getTopicById(String id) {
		return getAllTopics().stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
}
