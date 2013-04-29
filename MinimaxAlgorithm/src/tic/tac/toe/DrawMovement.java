package tic.tac.toe;

import lejos.nxt.Motor;
import lejos.util.Delay;

public class DrawMovement {
	// gets coordinate as parameter and makes move on that coordinate

		public static void makeMove(int y, int x) {

			// column 4
			// coordinate 4,4
			if (y == 4 && x == 4) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(8900);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.backward();
				Delay.msDelay(2600);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.forward();
				Delay.msDelay(2620);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(8900);
				Motor.B.stop();
			}
			// coordinate 4,3
			if (y == 4 && x == 3) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(11500);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(2600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(2620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(11500);
		        Motor.B.stop();	
			}
			// coordinate 4,2
			if (y == 4 && x == 2) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(14100);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(2600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(2620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(14100);
		        Motor.B.stop();	
			}
			// coordinate 4,1
			if (y == 4 && x == 1) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(16500);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(2600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(2620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(16500);
		        Motor.B.stop();	
			}
			// coordinate 4,0
			if (y == 4 && x == 0) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(19000);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(2600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(2620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(19000);
		        Motor.B.stop();	

			}

			// column 3
			// coordinate 3,4
			if (y == 3 && x == 4) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(8200);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(1600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(1620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(8200);
		        Motor.B.stop();
			}
			// coordinate 3,3
			if (y == 3 && x == 3) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(10600);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(1700);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(1720);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(10600);
		        Motor.B.stop();	
			}
			// coordinate 3,2
			if (y == 3 && x == 2) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(13000);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(1700);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(1720);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(13000);
		        Motor.B.stop();
			}
			// coordinate 3,1
			if (y == 3 && x == 1) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(15400);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(1700);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(1720);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(15400);
		        Motor.B.stop();	
			}
			// coordinate 3,0
			if (y == 3 && x == 0) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(18000);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.backward();
		        Delay.msDelay(1700);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.forward();
		        Delay.msDelay(1720);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(18000);
		        Motor.B.stop();
			}

			// column 2
			// coordinate 2,4
			if (y == 2 && x == 4) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(7800);
		        Motor.B.stop();

		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();

		        Motor.B.forward();
		        Delay.msDelay(7800);
		        Motor.B.stop();
			}
			// coordinate 2,3
			if (y == 2 && x == 3) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(10000);
		        Motor.B.stop();

		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();

		        Motor.B.forward();
		        Delay.msDelay(10000);
		        Motor.B.stop();
			}
			// coordinate 2,2
			if (y == 2 && x == 2) {

				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(13000);
				Motor.B.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.B.forward();
				Delay.msDelay(13000);
				Motor.B.stop();
			}
			// coordinate 2,1
			if (y == 2 && x == 1) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(15000);
		        Motor.B.stop();

		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();

		        Motor.B.forward();
		        Delay.msDelay(15000);
		        Motor.B.stop();
			}
			// coordinate 2,0
			if (y == 2 && x == 0) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(17700);
		        Motor.B.stop();

		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();

		        Motor.B.forward();
		        Delay.msDelay(17700);
		        Motor.B.stop();

			}
			// column 1
			// coordinate 1,4
			if (y == 1 && x == 4) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(7800);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.forward();
		        Delay.msDelay(1500);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.backward();
		        Delay.msDelay(1520);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(7800);
		        Motor.B.stop();
			}
			// coordinate 1,3
			if (y == 1 && x == 3) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(10500);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.forward();
		        Delay.msDelay(1600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.backward();
		        Delay.msDelay(1620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(10500);
		        Motor.B.stop();	
			}
			// coordinate 1,2
			if (y == 1 && x == 2) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(13000);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.forward();
		        Delay.msDelay(1600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.backward();
		        Delay.msDelay(1620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(13000);
		        Motor.B.stop();
			}
			// coordinate 1,1
			if (y == 1 && x == 1) {

				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(15400);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.forward();
		        Delay.msDelay(1600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.backward();
		        Delay.msDelay(1620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(15400);
		        Motor.B.stop();
			}
			// coordinate 1,0
			if (y == 1 && x == 0) {
				Motor.B.setSpeed(40);
		        Motor.B.backward();
		        Delay.msDelay(17800);
		        Motor.B.stop();

		        Motor.A.setSpeed(60);
		        Motor.A.forward();
		        Delay.msDelay(1600);
		        Motor.A.stop();
		        
		        Motor.C.setSpeed(220);
		        Motor.C.forward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        Motor.C.backward();
		        Delay.msDelay(9000);
		        Motor.C.stop();
		        
		        Motor.A.backward();
		        Delay.msDelay(1620);
		        Motor.A.stop();

		        Motor.B.forward();
		        Delay.msDelay(17800);
		        Motor.B.stop();
			}
			
			// column 0
			// coordinate 0,4
			if (y == 0 && x == 4) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(8400);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.forward();
				Delay.msDelay(2500);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.backward();
				Delay.msDelay(2525);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(8400);
				Motor.B.stop();
			}
			// coordinate 0,3
			if (y == 0 && x == 3) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(11300);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.forward();
				Delay.msDelay(2600);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.backward();
				Delay.msDelay(2620);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(11300);
				Motor.B.stop();
			}
			// coordinate 0,2
			if (y == 0 && x == 2) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(13200);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.forward();
				Delay.msDelay(2600);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.backward();
				Delay.msDelay(2620);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(13200);
				Motor.B.stop();
			}
			// coordinate 0,1
			if (y == 0 && x == 1) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(15800);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.forward();
				Delay.msDelay(2600);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.backward();
				Delay.msDelay(2620);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(15800);
				Motor.B.stop();
			}
			// coordinate 0,0
			if (y == 0 && x == 0) {
				Motor.B.setSpeed(40);
				Motor.B.backward();
				Delay.msDelay(18400);
				Motor.B.stop();

				Motor.A.setSpeed(60);
				Motor.A.forward();
				Delay.msDelay(2600);
				Motor.A.stop();

				Motor.C.setSpeed(220);
				Motor.C.forward();
				Delay.msDelay(9000);
				Motor.C.stop();
				Motor.C.backward();
				Delay.msDelay(9000);
				Motor.C.stop();

				Motor.A.backward();
				Delay.msDelay(2620);
				Motor.A.stop();

				Motor.B.forward();
				Delay.msDelay(18400);
				Motor.B.stop();
			}
		}
}
