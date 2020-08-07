package com.app.test.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleHandCricket {

	private static final int DEFAULT_BALLS_COUNT = 6;

	private static final int DEFAULT_OVERS_COUNT = 1;

	private List<HandCricketPlayer> players = new ArrayList<>();

	private HandCricketPlayer playerFirst;

	private HandCricketPlayer playerSecond;

	private int overBallCount;

	private int matchOverCount;

	public SimpleHandCricket(HandCricketPlayer player1, HandCricketPlayer player2) {
		this(player1, player2, DEFAULT_BALLS_COUNT, DEFAULT_OVERS_COUNT);
	}

	public SimpleHandCricket(HandCricketPlayer player1, HandCricketPlayer player2, int overs) {
		this(player1, player2, DEFAULT_BALLS_COUNT, overs);
	}

	public SimpleHandCricket(HandCricketPlayer player1, HandCricketPlayer player2, int overBallCount, int overs) {
		this.playerFirst = player1;
		this.playerSecond = player2;
		this.overBallCount = overBallCount;
		this.matchOverCount = overs;
		players.add(player1);
		players.add(player2);
	}

	public void whoBatFirst(String playerName) {
		System.out.println("Who bats first? " + playerName);
		if (!playerFirst.name().equals(playerName)) {
			this.playerFirst = players.get(1);
			this.playerSecond = players.get(0);
		}
	}

	public void startMatch() {
	
		System.out.println("Round 1: " + playerFirst.name() + " is batting");
		for (int i = 1; i <= matchOverCount; i++) {
			System.out.println("Over " + i);
			if (0 == play(playerFirst, playerSecond)) {
				break;
			}
		}

		System.out.println("\nRound 2: " + playerSecond.name() + " is batting");
		for (int i = 1; i <= matchOverCount; i++) {
			System.out.println("Over " + i);
			if (0 == play(playerSecond, playerFirst)) {
				break;
			}
		}
	}

	public int play(HandCricketPlayer batsman, HandCricketPlayer bowler) {
		for (int i = 0; i < this.overBallCount; i++) {
			Thread.currentThread();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int bat = batsman.play();
			int bowel = bowler.play();
			if (bat != bowel) {
				batsman.addScore(bat);
				System.out.println(batsman.name() + " throws " + bat + " , " + bowler.name() + " throws " + bowel + ". "
						+ batsman.name() + "'s score is " + batsman.getScore());
			} else {
				System.out.println(batsman.name() + " throws " + bat + " , " + bowler.name() + " throws " + bowel + ". "
						+ batsman.name() + "'s Out");
				return 0;
			}
		}
		return matchOverCount;
	}

	public void matchResult() {
		System.out.println();
		if (playerFirst.getScore() > playerSecond.getScore()) {
			System.out.println("Game Winner is " + playerFirst.name());
		} else if (playerSecond.getScore() > playerFirst.getScore()) {
			System.out.println("Game Winner is " + playerSecond.name());
		} else {
			System.out.println("Game is Tie");
		}
	}
}
