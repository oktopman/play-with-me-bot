package com.oktop.bot.drawing_lots;

import java.util.Collections;
import java.util.List;

public class DrawingLots {
	public List<String> draw(List<String> users, int count) {
		Collections.shuffle(users);
		return users.subList(0, count);
	}
}
