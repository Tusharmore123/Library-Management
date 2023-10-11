package com.edubridgeindia.mini_project.membership.clearmembership;

import com.edubridgeindia.mini_project.membership.ExistingMemberships;

public class ClearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExistingMemberships exitsInstance=new ExistingMemberships();
		ClearMemberShip c=new ClearMemberShip();
		System.out.println(c.clearMember(exitsInstance.existingMembers(), 1));
		System.out.println();
	}

}
