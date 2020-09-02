package com.biz.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameServiceImplV1 implements GameService {
	
	public Scanner scan;
	public List<GameVO> gameList;
	public Random rnd;

	@Override
	public boolean play() {
		scan = new Scanner(System.in);
		gameList = new ArrayList<GameVO>();
		GameVO gameVO = new GameVO();
		rnd = new Random();
		
		
		// 첫번쨰 핀 쓰러트린 갯수에서 두번째 핀 쓰러트려야 한다.
		// 수정하기
		
		System.out.print(" 플레이어의 이름을 입력하세요 (종료 : END) >> ");
		String strName =scan.nextLine();
		
		if(strName.equals("END")) {
			return false;
		}
		
		System.out.println(Line.D_LINE);
		System.out.println("신나는 볼링 한판 V1");
		System.out.println(Line.D_LINE);
		System.out.println("플레이어 이름 : " + strName);
		
		
		for(int i = 0; i <10 ; i ++) {
		
			System.out.printf("%d번째 판 :" , i+1);
			
			
			if(i == 0) {
				int intScore1 = rnd.nextInt((10)+1);
				gameVO.setRoundSum1(intScore1);
				int intScore2 = rnd.nextInt((10)+1);
				gameVO.setRoundSum2(intScore2);
				System.out.println("첫번째 라운드");
				System.out.printf("1번째 : %d , ", intScore1);
				System.out.printf("2번째 : %d \n", intScore2);
				
			}if(i !=0){
				int strike = 10;
				int spare = 10;
				
				
				// 그 전판에서 첫번째에서 스트라이크가 떴을 때
				if(gameList.get(i-1).getScore1() == 10) {
					
					int intScore1 = (rnd.nextInt((10)+1)+strike) ;
					int intScore2 = (rnd.nextInt((10)+1)+strike);

					System.out.println("그 전판에서 첫번째 스트라이크가 떴을 떄");
					System.out.printf("1번째 : %d , ", intScore1);
					System.out.printf("2번째 : %d /n", intScore2);
					
					gameVO.setRoundSum1(intScore1);
					gameVO.setRoundSum2(intScore2);
					
					// 그 전판에서 두번째에서 스퀘어가 떴을 때
				} else if(gameList.get(i-1).getScore2() == 10) {
					int intScore1 = rnd.nextInt((10)+1)+spare;
					int intScore2 = rnd.nextInt(10)+1;
					System.out.println("그 전판에서 두번째에서 스퀘어가 떴을 때");
					System.out.printf("1번째 : %d , ", intScore1);
					gameVO.setRoundSum1(intScore1);
					System.out.printf("2번째 : %d /n", intScore2);
					gameVO.setRoundSum2(intScore2);
					
				} else {
					
					System.out.println("스퀘어도 스트라이크도 안떴을 때");
					int intScore1 = rnd.nextInt((10)+1);
					gameVO.setRoundSum1(intScore1);
					int intScore2 = rnd.nextInt((10)+1);
					gameVO.setRoundSum2(intScore2);
					System.out.printf("1번째 : %d , ", intScore1);
					System.out.printf("2번째 : %d \n", intScore2);
					
				}
				
			}
			
			System.out.println(Line.D_LINE);
			// 일단 마지막 판 빼고 콘솔 돌려보기
			
			gameList.add(gameVO);
		}
		
		return true;
	}

}
