package com.app.test.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.app.test.util.Util;

public class ExtendedHandCricket {

	private static final int DEFAULT_BALLS_COUNT = 6;

	private static final int DEFAULT_OVERS_COUNT = 1;

	private List<HandCricketPlayer> players = new ArrayList<>();

	private int overBallCount;

	private int matchOverCount;

	public ExtendedHandCricket(List<HandCricketPlayer> players) {
		this(players, DEFAULT_BALLS_COUNT, DEFAULT_OVERS_COUNT);
	}

	public ExtendedHandCricket(List<HandCricketPlayer> players, int overs) {
		this(players, DEFAULT_BALLS_COUNT, overs);
	}

	public ExtendedHandCricket(List<HandCricketPlayer> players, int overBallCount, int overs) {
		this.players = players;
		this.overBallCount = overBallCount;
		this.matchOverCount = overs;
	}

	public void startMatchRandom() {
		int cnt = 0;
		for (HandCricketPlayer batsMan : players) {
			HandCricketPlayer bowler = getRandomPlayer(batsMan);
			System.out.println("\nRound " + (++cnt) + ": " + batsMan.name() + " is batting");
			for (int i = 1; i <= matchOverCount; i++) {
				System.out.println("Over " + i);
				if (0 == play(batsMan, bowler)) {
					break;
				}
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
						+ batsman.name() + "'s Out & Total Score is " + batsman.getScore());
				return 0;
			}
		}
		return matchOverCount;
	}

	public void matchResult() {
		System.out.println();
		TreeMap<Integer, List<HandCricketPlayer>> scoreMap = players.stream().collect(Collectors.groupingBy(
				obj -> obj.getScore(), () -> new TreeMap<>(Collections.reverseOrder()), Collectors.toList()));
		if (scoreMap.size() == 1) {
			System.out.println("Match is Tie");
		} else {
			List<HandCricketPlayer> winCricketPlayers = scoreMap.entrySet().iterator().next().getValue();
			System.out.print("The winning player" + (winCricketPlayers.size() == 1 ? " is " : "s are"));
			for (HandCricketPlayer hcp : winCricketPlayers) {
				System.out.print(" " + hcp.name());
			}
		}
	}

	public HandCricketPlayer getRandomPlayer(HandCricketPlayer currentPlayer) {
		HandCricketPlayer handCricketPlayer;
		handCricketPlayer = players.get(Util.getRandom(players.size() - 1));
		return currentPlayer.name().equals(handCricketPlayer.name()) ? getRandomPlayer(currentPlayer)
				: handCricketPlayer;
	}
}
