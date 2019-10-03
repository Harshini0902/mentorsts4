package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MentorCalendar;
import com.example.demo.service.MentorCalendarService;


@RestController
public class MentorCalendarController {
	@Autowired
	private MentorCalendarService mentorCalendarService;

	

	@RequestMapping(method = RequestMethod.POST, value = "/mentorcalendar/{userName}")
	public void addMentorCalendar(@RequestBody MentorCalendar mentorCalendar,@PathVariable String userName) {
		mentorCalendarService.setMentorCalendar(mentorCalendar,userName);
	}
}
