package br.com.cod3r.chain.process.service;

import br.com.cod3r.chain.process.steps.CheckPassword;
import br.com.cod3r.chain.process.steps.CreateMap;
import br.com.cod3r.chain.process.steps.GetUserByEmail;
import br.com.cod3r.chain.process.steps.GetUserToken;
import br.com.cod3r.chain.process.steps.GetUsers;
import br.com.cod3r.chain.process.steps.ProcessStep;
import br.com.cod3r.chain.process.steps.SaveUser;
import br.com.cod3r.chain.process.steps.ValidateMandatoryField;
import br.com.cod3r.chain.process.steps.ValidateToken;

public class ServicesCatalog {
	
	public static ProcessStep saveUserProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.name"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new SaveUser());
	
	public static ProcessStep loginProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new GetUserByEmail(),
			new CheckPassword(),
			new GetUserToken());
	
	public static ProcessStep getUsersProcess = buildChain(
			new ValidateToken(),
			new GetUsers());
	
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}