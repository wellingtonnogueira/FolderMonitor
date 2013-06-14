package br.com.wrn.foldermonitor.util;

public enum Duration {
	infinite(0),

	milis(1),
	
	second(milis.getTimeMilis() * 1000),
	
	minute(60 * second.getTimeMilis()),
	
	hour(60 * minute.getTimeMilis());

	private int durationMultiplier;

	private Duration(int durationMultiplier) {
		this.durationMultiplier = durationMultiplier;
	}

	int getTimeMilis() {
		return this.durationMultiplier;
	}
}