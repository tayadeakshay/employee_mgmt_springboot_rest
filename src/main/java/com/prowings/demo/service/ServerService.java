package com.prowings.demo.service;

import java.util.List;

import com.prowings.demo.entity.ServerDetails;

public interface ServerService {

	public boolean save(ServerDetails server);
	
	public List<ServerDetails> getAllServerDetials();

	public ServerDetails getServerByTeam(String team);
	
	public ServerDetails getServerByTeamEnv(String team,String environment);
	
	public ServerDetails getServerByTeamEnvApp(String team,String environment,String application);
	
	public ServerDetails getServerByTeamEnvAppActive(String team,String environment,String application,String isActive);
}
