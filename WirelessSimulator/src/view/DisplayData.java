package view;

import java.util.Observable;

public class DisplayData extends Observable {
	public int num;
	public DisplayData(){
		num=0;
	}
	public void setData(int num){
		this.num=num;
		this.setChanged();
		this.notifyObservers(num);
	}

}
