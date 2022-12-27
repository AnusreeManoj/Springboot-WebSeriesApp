package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.Webseries.SeriesClass;

import jakarta.transaction.Transactional;

public interface SeriesDao extends JpaRepository<SeriesClass, Integer>{
	
	@Query(value="select * from web_series where id=?1",nativeQuery = true)
	List<SeriesClass> seriesById(int id);
	
	@Query(value="select * from web_series where name=?1",nativeQuery = true)
	List<SeriesClass> seriesByName(String sname);
	
	@Modifying
	@Transactional
	@Query(value="update web_series set name=?2 where id=?1",nativeQuery = true)
	void update(int id,String sname);
	
	@Modifying
	@Transactional
	@Query(value="delete from web_series where id=?1",nativeQuery = true)
	void delete(int id);

}