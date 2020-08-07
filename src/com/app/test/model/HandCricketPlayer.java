package com.app.test.model;

import com.app.test.util.Util;

public class HandCricketPlayer implements IPlayer {

	private String playerName;

	private int score = 0;

	public HandCricketPlayer() {
		this("Player_" + Util.getRandom(100));
	}

	public HandCricketPlayer(String name) {
		this.playerName = name;
	}

	@Override
	public String name() {
		return playerName;
	}

	@Override
	public PlayerType getPlayerType() {
		return PlayerType.HAND_CRICKET;
	}

	public int play() {
		return Util.getRandom(6);
	}

	@Override
	public int getScore() {
		return score;
	}

	public void addScore(int sc) {
		this.score += sc;
	}
}
