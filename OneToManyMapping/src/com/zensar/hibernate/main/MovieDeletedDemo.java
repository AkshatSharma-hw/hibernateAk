package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeletedDemo {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie n = s.get(Movie.class, 3);
		System.out.println(n.getMovieName());
		System.out.println(n.getReleaseDate());
		List<Song> songs = n.getSongs();
		for (Song song : songs) {
			System.out.println(song);
		}
		
		if (n!=null) {
			s.delete(n);
			System.out.println("deleted movie");
		}else {
			System.out.println("movie not found");
		}		
		t.commit();
		s.close();
		System.exit(0);

	}

}
