package com.biz.game;

public class GameEx_01 {
	
	
	
	public static void main(String[] args) {
		
		GameService gameService = new GameServiceImplV1();
		
		while(true) {
			if(!gameService.play()) {
				break;
			}
		}
		
		
		
	}

}
