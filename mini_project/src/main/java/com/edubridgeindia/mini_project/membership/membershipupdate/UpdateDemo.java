package com.edubridgeindia.mini_project.membership.membershipupdate;

import com.edubridgeindia.mini_project.membership.ExistingMemberships;
import com.edubridgeindia.mini_project.membership.exceptionhandling.ExceptionHandlingUpdateMember;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateMemberShip m=new UpdateMemberShip();
		ExistingMemberships exitsInstance=new ExistingMemberships();
		ExceptionHandlingUpdateMember ex=new ExceptionHandlingUpdateMember();
		ex.updateMembers(exitsInstance.existingMembers(), 2);
		System.out.println(exitsInstance.existingMembers());
		m.updateMembersInfo(exitsInstance.existingMembers(), 1);

	}

}
