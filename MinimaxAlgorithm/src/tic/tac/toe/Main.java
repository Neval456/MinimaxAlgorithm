package tic.tac.toe;

import java.io.*;
import java.util.Random;
import javax.bluetooth.*;
import lejos.nxt.*;
import lejos.nxt.comm.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		String name = "NXT";
		LCD.drawString("Connecting...", 0, 0);
		RemoteDevice btrd = Bluetooth.getKnownDevice(name);
		Random random = new Random();

		if (btrd == null) {
			LCD.clear();
			LCD.drawString("No such device", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}

		BTConnection btc = Bluetooth.connect(btrd);

		if (btc == null) {
			LCD.clear();
			LCD.drawString("Connect fail", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}

		LCD.clear();
		LCD.drawString("Connected", 0, 0);

		DataInputStream dis = btc.openDataInputStream();
		DataOutputStream dos = btc.openDataOutputStream();

		int randX = random.nextInt(5);
		int randY = random.nextInt(5);
		game.makeManualMove(randX, randY);
		System.out.println(game.toString());
		try {
			DrawMovement.makeMove(randX, randY);
			dos.writeInt(randX);
			dos.writeInt(randY);
			dos.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("OCU1");
			Button.waitForAnyPress();
		}

		while (!game.isFinished()) {

			int x;
			int y;

			try {
				x = dis.readInt();
				y = dis.readInt();
				game.makeManualMove(x, y);
				System.out.println("X: " + x + "Y: " + y);
				Button.waitForAnyPress();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("OCU2");
				Button.waitForAnyPress();
			}

			game.makeAutomaticMove(2);

			try {
				System.out.println("X: " + game.getCurrentX() + "Y: " + game.getCurrentY());
				DrawMovement.makeMove(game.getCurrentX(),game.getCurrentY());
				dos.writeInt(game.getCurrentX());
				dos.writeInt(game.getCurrentY());
				dos.flush();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("OCU6");
				Button.waitForAnyPress();
			}

			System.out.println(game.toString());
		}

	}

}
