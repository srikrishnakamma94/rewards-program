package com.rewards.program.service;

import java.util.List;

public interface RewardsProgramService {
	List<String> getAllTransactions();

	Long getRewardpointCount();
}
