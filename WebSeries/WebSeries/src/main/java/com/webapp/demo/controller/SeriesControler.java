package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.SeriesDao;
import com.webapp.demo.Webseries.SeriesClass;

@RestController
public class SeriesControler {
	@Autowired
	SeriesDao dao;
@RequestMapping("/addSeries")
@ResponseBody
public void addSeries(@RequestParam int id, @RequestParam String sname, @RequestParam String serSeasons, @RequestParam String serEpisodes, @RequestParam String sRating, SeriesClass obj) {
	
	obj.setId(id);
	obj.setName(sname);
	obj.setSeason(serSeasons);
	obj.setEpisodes(serEpisodes);
	obj.setRating(sRating);
	dao.save(obj);
	System.out.println("series added");
	
}

@RequestMapping("/series")
@ResponseBody
public List<SeriesClass> addSeries() {
	
	return dao.findAll();
}

@RequestMapping("/seriesById")
@ResponseBody
public List<SeriesClass> seriesById(@RequestParam int id) {
	System.out.println("series by id");
	return dao.seriesById(id);
	
}

@RequestMapping("/seriesByName")
@ResponseBody
public List<SeriesClass> seriesByName(@RequestParam String sname) {
	System.out.println("series by name");
	return dao.seriesByName(sname);
	
}

@RequestMapping("/update")
@ResponseBody
public void updateSeries(@RequestParam int id,@RequestParam String sname) {
	
	System.out.println("series name updated");
	dao.update(id,sname);
	
}

@RequestMapping("/delete")
@ResponseBody
public void deleteSeries(@RequestParam int id) {
	
	System.out.println("series deleted");
	dao.delete(id);
	
}






}