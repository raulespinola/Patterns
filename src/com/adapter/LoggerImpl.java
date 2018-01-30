package com.adapter;

public class LoggerImpl extends Logger {

	@Override
	public void trace(String str) {
		System.out.print("TRACE: ");
		System.out.println(str);
	}

	@Override
	public void debug(String str) {
		System.out.print("DEBUGH: ");
		System.out.println(str);
		
	}

	@Override
	public void log(String str) {
		System.out.print("LOG: ");
		System.out.println(str);
	}

}
