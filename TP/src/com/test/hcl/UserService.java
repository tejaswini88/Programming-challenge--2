package com.test.hcl;

import java.util.ArrayList;
import java.util.List;

public class UserService {


	private List<User> user=new ArrayList<>();

	public void addUser()
	{
		user.add(new User(1, "Tejaswini", "66666666666", "Atlanta, GA" ));
		user.add(new User(2, "Benjamin", "7777777777", "Atlanta, GA" ));
		user.add(new User(1, "Divya", "8888888888", "Atlanta, GA" ));
	}

	public List<User> allUsers()
	{
		return user;
	}
}
