package com.prowings.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.demo.dao.ServerDao;
import com.prowings.demo.entity.ServerDetails;



@Service
public class ServerServiceImpl implements ServerService{

	@Autowired
	ServerDao serverDao;
	
	@Override
	public boolean save(ServerDetails server) {
		
		return serverDao.save(server);
	}

	@Override
	public List<ServerDetails> getAllServerDetials() {

		return serverDao.getAllServerDetials();
	}

	@Override
	public ServerDetails getServerByTeam(String team) {

		return serverDao.getServerByTeam(team);
	}

	@Override
	public ServerDetails getServerByTeamEnv(String team, String environment) {

		return serverDao.getServerByTeamEnv(team, environment);
	}

	@Override
	public ServerDetails getServerByTeamEnvApp(String team, String environment, String application) {

		return serverDao.getServerByTeamEnvApp(team, environment, application);
	}

	@Override
	public ServerDetails getServerByTeamEnvAppActive(String team, String environment, String application,
			String isActive) {

		return serverDao.getServerByTeamEnvAppActive(team, environment, application, isActive);
	}

	
}
