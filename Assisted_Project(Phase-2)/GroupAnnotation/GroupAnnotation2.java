package com.GroupAnnotation;

import org.testng.annotations.Test;

public class GroupAnnotation2 {

	@Test(priority = '1', groups = { "smoke", "functional", "regression" })
	public void opentheAccountPage() {

		System.out.println("Open the browser and open Account page");
	}

	@Test(priority = '2', groups = { "functional" })
	public void login() {

		System.out.println("Login into account page");
	}

	@Test(priority = '3', groups = { "functional" })
	public void Accounts() {

		System.out.println("Check account page");
	}

	@Test(priority = '4', groups = { "functional", "regression" })
	public void createAccounts() {

		System.out.println("Create an account");
	}

	@Test(priority = '5', groups = { "smoke", "functional", "regression" })
	public void Logout() {

		System.out.println("Logout form account page");
	}

}
