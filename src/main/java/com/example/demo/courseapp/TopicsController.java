package com.example.demo.courseapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/getTopics")
    public List<Topic> getTopics() {
    	return topicService.getAllTopics();
    }
	
	@RequestMapping("/getTopicById/{topicId}")
	public Topic getTopicById(@PathVariable String topicId) {
		try {
			return topicService.getTopicById(topicId);
		} catch(Exception e) {
			return new Topic("000", "000", "000");
		}
	}

}
