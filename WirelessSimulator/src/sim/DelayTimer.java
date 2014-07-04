package sim;

import java.util.TimerTask;

import view.DisplayData;

public class DelayTimer extends TimerTask {
	DisplayData displayData;
	public DelayTimer(DisplayData displayData){
		this.displayData=displayData;
	}
	@Override
	public void run() {
		displayData.setData(displayData.num+1);
	}

}
