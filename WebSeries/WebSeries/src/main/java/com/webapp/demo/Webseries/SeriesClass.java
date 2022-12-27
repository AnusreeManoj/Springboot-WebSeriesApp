package com.webapp.demo.Webseries;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SeriesClass {
	@Id
	private int seriesId;
	private String seriesName;
	private String seriesSeason;
	private String seriesEpisodes;
	private String seriesRating;
	public int getId() {
		return seriesId;
	}
	public void setId(int seriesId) {
		this.seriesId = seriesId;
	}
	public String getName() {
		return seriesName;
	}
	public void setName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getSeason() {
		return seriesSeason;
	}
	public void setSeason(String seriesSeason) {
		this.seriesSeason = seriesSeason;
	}
	public String getEpisodes() {
		return seriesEpisodes;
	}
	public void setEpisodes(String seriesEpisodes) {
		this.seriesEpisodes = seriesEpisodes;
	}
	public String getRating() {
		return seriesRating;
	}
	public void setRating(String seriesRating) {
		this.seriesRating = seriesRating;
	}
	
	
	
}