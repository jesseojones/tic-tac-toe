package com.jesseojones.tictactoe.domain;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public Map<Integer, Coordinate> integerToCoordinate() {
		final Map<Integer, Coordinate> map = new HashMap<>();

		map.put(0, new Coordinate(0, 0));
		map.put(1, new Coordinate(1, 0));
		map.put(2, new Coordinate(2, 0));
		map.put(3, new Coordinate(0, 1));
		map.put(4, new Coordinate(1, 1));
		map.put(5, new Coordinate(2, 1));
		map.put(6, new Coordinate(0, 2));
		map.put(7, new Coordinate(1, 2));
		map.put(8, new Coordinate(2, 2));

		return map;
	}

}
