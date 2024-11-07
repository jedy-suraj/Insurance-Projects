package com.insuranceproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceproject.model.Policy;
import com.insuranceproject.repository.PolicyRepository;
import com.insuranceproject.service.PolicyService;

@Service
public class PolicyImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
	Policy policy1=	policyRepository.save(policy);
		return policy1;
	}

}
