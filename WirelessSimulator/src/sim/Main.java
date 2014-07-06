package sim;

import java.sql.Time;
import java.util.Timer;

import view.DisplayData;
import view.MainFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();
		mainFrame.setVisible(true);
		//for (int i=0;i<100;i++){
		//	displayData.setData(i);
		//}
		DisplayData displayData=new DisplayData();
		displayData.addObserver(mainFrame);

		SimTask simTask=new SimTask(displayData,3);
		DelayTimer delayTimer=new DelayTimer(simTask);
		Timer timer=new Timer();
		timer.schedule(delayTimer, 100,100);
		//mainFrame.setState("DDDD");
	}

}
