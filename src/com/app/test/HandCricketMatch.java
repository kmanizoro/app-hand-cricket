package com.app.test;

import java.util.Arrays;
import java.util.List;

import com.app.test.model.ExtendedHandCricket;
import com.app.test.model.HandCricketPlayer;
import com.app.test.model.SimpleHandCricket;

public class HandCricketMatch {

	public static void main(String[] args) {
		HandCricketPlayer player1 = new HandCricketPlayer("Sachin");
		HandCricketPlayer player2 = new HandCricketPlayer("Dravid");
		SimpleHandCricket handCricket = new SimpleHandCricket(player1, player2, 6, 1);
		System.out.println();
		handCricket.whoBatFirst(player2.name());
		handCricket.startMatch();
		handCricket.matchResult();

		List<HandCricketPlayer> playerList = Arrays.asList(new HandCricketPlayer("Sachin"),
				new HandCricketPlayer("Dravid"), new HandCricketPlayer("Kholi"), new HandCricketPlayer("Dhoni"));
		ExtendedHandCricket handCricket2 = new ExtendedHandCricket(playerList, 6, 1);
		handCricket2.startMatchRandom();
		handCricket2.matchResult();
	}
}
