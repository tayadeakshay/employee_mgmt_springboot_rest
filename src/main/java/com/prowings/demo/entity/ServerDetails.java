package com.prowings.demo.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class ServerDetails {

	@Id
	String iPAddress;
	
//	String serverName;
	
//	String serverType;
	
//	int portNo;
	
//	String CommissionDate;
	
	String isActive;
	
//	String usageCapacity;
	
//	String operatingSystem;
	
	String Team;
	
	String environment;
	
	String application;
}
