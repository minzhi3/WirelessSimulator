package sim;

import view.DisplayData;

public class SimTask {
	Channel channel;
	int numNode;
	DisplayData displayData;
	public SimTask(DisplayData displayData, int num){
		this.numNode=num;
		channel=new Channel(num);
		this.displayData=displayData;
	}
	public void nextStep(){
		this.displayData.setData(this.displayData.num+1);
	}


}
