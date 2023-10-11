package com.edubridgeindia.mini_project.membership.viewmemberships;

import com.edubridgeindia.mini_project.interfaces.FormatString;

public class FormatMembersInfo implements FormatString {

	
	public String formatStringInfo(String info) {
		int count=0;
		StringBuffer formatString=new StringBuffer();
		String spaces=" ";
		if(info.length()<20) {
			count=20-info.length();
			formatString.append(info);
			formatString.append(spaces.repeat(count));
			}
		
		return formatString.toString();
	}


	public String formatIntInfo(int info) {
		int count=0;
		StringBuffer formatString=new StringBuffer();
		String spaces=" ";
		String strInfo=String.valueOf(info);
		if(strInfo.length()<20) {
			count=20-strInfo.length();
			formatString.append(info);
			formatString.append(spaces.repeat(count));
		}
		return formatString.toString();
	}
	


}
