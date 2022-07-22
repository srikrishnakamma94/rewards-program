package com.rewards.program.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class RewardsProgram {
	Date transactionDate;
	Double dollerSpent;
	Integer points;
}
