package com.prowings.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prowings.demo.entity.ServerDetails;


public interface ServerDao{

	public boolean save(ServerDetails server);
	
	public List<ServerDetails> getAllServerDetials();

	public ServerDetails getServerByTeam(String team);
	
	public ServerDetails getServerByTeamEnv(String team,String environment);
	
	public ServerDetails getServerByTeamEnvApp(String team,String environment,String application);
	
	public ServerDetails getServerByTeamEnvAppActive(String team,String environment,String application,String isActive);
	
}
