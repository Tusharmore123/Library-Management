package com.edubridgeindia.mini_project.membership;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor

public class MembershipDetails {
	public String studentFirstName;
	public int studentId;
	public long StudentNumber;
	public String email;
	public String studentLastName;
	private StudentAddress address;
	
	
	

}
