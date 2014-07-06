package sim;

import java.util.TimerTask;

import view.DisplayData;

public class DelayTimer extends TimerTask {
	SimTask simTask;
	public DelayTimer(SimTask simTask){
		this.simTask=simTask;
	}
	@Override
	public void run() {
		simTask.nextStep();
	}

}
