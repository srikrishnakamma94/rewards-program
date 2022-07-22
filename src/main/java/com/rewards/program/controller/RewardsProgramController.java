package com.rewards.program.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.program.model.RewardsProgram;

@RestController
@RequestMapping("rewards-program")
public class RewardsProgramController {

	@GetMapping
	public List<RewardsProgram> getRewardsTransaction() {

		return null;
	}

	@PostMapping
	public int calculateRewardPoints() {

		return 0;
	}

}
