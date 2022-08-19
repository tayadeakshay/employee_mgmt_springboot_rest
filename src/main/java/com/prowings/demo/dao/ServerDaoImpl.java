package com.prowings.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.demo.entity.ServerDetails;

@Repository
public class ServerDaoImpl implements ServerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean save(ServerDetails server) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(server);
		
		tx.commit();
		System.out.println("Server details saved successfully");
		return true;
	}
	
	@Override
	public List<ServerDetails> getAllServerDetials() {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from server_details");
		
		List<ServerDetails> serverList = query.list();
		tx.commit();
		return serverList;
	}

	@Override
	public ServerDetails getServerByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerDetails getServerByTeamEnv(String team, String environment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerDetails getServerByTeamEnvApp(String team, String environment, String application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServerDetails getServerByTeamEnvAppActive(String team, String environment, String application,
			String isActive) {
		// TODO Auto-generated method stub
		return null;
	}


}
