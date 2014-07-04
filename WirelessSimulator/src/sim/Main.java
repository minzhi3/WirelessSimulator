package sim;

import java.sql.Time;
import java.util.Timer;

import view.DisplayData;
import view.MainFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();
		mainFrame.setVisible(true);
		DisplayData displayData=new DisplayData();
		displayData.addObserver(mainFrame);
		//for (int i=0;i<100;i++){
		//	displayData.setData(i);
		//}
		DelayTimer delayTimer=new DelayTimer(displayData);
		Timer timer=new Timer();
		timer.schedule(delayTimer, 100,100);
		//mainFrame.setState("DDDD");
	}

}
