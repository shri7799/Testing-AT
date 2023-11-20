package com.GroupAnnotation;

import org.testng.annotations.Test;

public class GroupsAnnotation1 {

	@Test(priority = '1', groups = { "smoke", "functional", "regression" })
	public void openapp() {

		System.out.println("Open the browser and open URL");
	}

	@Test(priority = '2', groups = { "functional" })
	public void loginSample1() {

		System.out.println("Login Successfully..");
	}

	@Test(priority = '3', groups = { "regression" })
	public void loginWithInvalidData() {

		System.out.println("Login Failed..");
	}

	@Test(priority = '4', groups = { "regression" })
	public void loginWithWrongPassword() {

		System.out.println("Wrong password..");
	}

}
