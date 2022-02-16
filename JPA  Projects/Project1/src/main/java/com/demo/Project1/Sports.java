package com.demo.Project1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.Project1.entity.Player;
import com.demo.Project1.entity.Team;

public class Sports 
{
	public static void main(String args[]){
	    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Player_details");
	    EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();

	    Team team = new Team();
	    Player p1 = new Player();
	    Player p2 = new Player();

	    em.persist(team);
	    em.persist(p1);
	    em.persist(p2);

	    team.setName("JAVA");
	    p1.setNickName("System");
	    p1.setTeam(team);
	    p2.setNickName("Jar");
	    p2.setTeam(team);
	    em.getTransaction().commit();
	    
	    Team team1 = new Team();
	    Player p3 = new Player();
	    Player p4 = new Player();

	    em.persist(team1);
	    em.persist(p3);
	    em.persist(p4);

	    team.setName("Python");
	    p1.setNickName("Vicky");
	    p1.setTeam(team1);
	    p2.setNickName("Root");
	    p2.setTeam(team1);
	    em.getTransaction().commit();
	  }
	
	
}