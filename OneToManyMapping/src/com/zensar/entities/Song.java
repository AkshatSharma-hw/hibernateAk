package com.zensar.entities;

/**
 * @author AK
 * @version 2.0
 * @creation_date 27.9.19
 * @creation_time 16.42pm
 * 
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SongId;
	private String Song_Name;
	
	@ManyToOne
	@JoinColumn(name = "mid")
	private Movie movie;

	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Song(int songId, String song_Name) {
		super();
		SongId = songId;
		Song_Name = song_Name;
	}

	public int getSongId() {
		return SongId;
	}

	public void setSongId(int songId) {
		SongId = songId;
	}

	public String getSong_Name() {
		return Song_Name;
	}

	public void setSong_Name(String song_Name) {
		Song_Name = song_Name;
	}

	@Override
	public String toString() {
		return "Song [SongId=" + SongId + ", Song_Name=" + Song_Name + "]";
	}

}
