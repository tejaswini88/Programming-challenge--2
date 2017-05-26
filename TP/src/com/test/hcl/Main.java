package com.test.hcl;

import java.util.List;

public class Main {
	 public static void main(String[] args){
	        UserService userService = new UserService();
	        userService.addUser();
	        List<User> user = userService.allUsers();
	        if(user != null) {

	            for (User u : user) {
	                System.out.println(u);
	            }

	        }
	        else{
	            System.out.println("data not pesent");
	        }



	    }



}
