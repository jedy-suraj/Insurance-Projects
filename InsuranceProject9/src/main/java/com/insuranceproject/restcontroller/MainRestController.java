package com.insuranceproject.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceproject.model.Policy;
import com.insuranceproject.model.User;
import com.insuranceproject.service.PolicyService;
import com.insuranceproject.service.UserService;

@RestController
public class MainRestController {

	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@PostMapping("/saveUser")
	public User saveUSer(@RequestBody User user) {
		// for single user
		User user2 = userService.saveUSer(user);

		// for multiple policies
		List<Policy> policyList = user.getPolicyList();
		for (Policy policy : policyList) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return user2;
	}
}
