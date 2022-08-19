package com.prowings.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.demo.entity.ServerDetails;
import com.prowings.demo.service.ServerService;


@RestController
@RequestMapping("/api/server")
public class ServerRestController {
	
	@Autowired
	ServerService serverService;
	
	@PostMapping
	public ResponseEntity<ServerDetails> save(@RequestBody ServerDetails server)
	{
		if(serverService.save(server))
		{
		return new ResponseEntity<ServerDetails>(server, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<ServerDetails>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@GetMapping
	public List<ServerDetails> getAllServers()
	{
		return serverService.getAllServerDetials();
	}
	
	@GetMapping("team")
	public ResponseEntity getServerByTeam(@PathVariable("team") String team)
	{
			ServerDetails server = serverService.getServerByTeam(team);
			return new ResponseEntity<ServerDetails>(server, HttpStatus.OK);
		
	}
	
	@GetMapping("team/environment")
	public ResponseEntity getServerByTeamEnv(@PathVariable("team") String team,@PathVariable("environment") String environment)
	{
		ServerDetails server = serverService.getServerByTeamEnv(team,environment);
		return new ResponseEntity<ServerDetails>(server, HttpStatus.OK);
	}
	
	@GetMapping("team/environment/application")
	public ResponseEntity getServerByTeamEnvApp(@PathVariable("team") String team,@PathVariable("environment") String environment,@PathVariable("application") String application)
	{
		ServerDetails server = serverService.getServerByTeamEnvApp(team, environment, application);
		return new ResponseEntity<ServerDetails>(server, HttpStatus.OK);
	}
	
	@GetMapping("team/environment/application/environment")
	public ResponseEntity getServerByTeamEnvAppActive(@PathVariable("team") String team,@PathVariable("environment") String environment,@PathVariable("application") String application,@PathVariable("isActive") String isActive)
	{
		ServerDetails server = serverService.getServerByTeamEnvAppActive(team, environment, application, isActive);
				return new ResponseEntity<ServerDetails>(server, HttpStatus.OK);
	}


}