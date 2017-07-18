package com.analogue.clock.main;

import com.analogue.clock.setUp.SetUp;

public class Main {
	public static void main(String[] args) {
		SetUp setup = new SetUp("Analog Saat", 500);
		setup.start();

	}
}
