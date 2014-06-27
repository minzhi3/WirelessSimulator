package sim;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Channel {
	int currentTime;
	Vector<LinkedList<Signal>> chArray;
	public Channel(int numNode){
		this.currentTime=0;
		this.chArray=new Vector<LinkedList<Signal>>();
		for (int i=0;i<numNode;i++){
			this.chArray.add(new LinkedList<Signal>());
		}
	}

	public void addSignal(List<Integer> neighbor,int id,String content,int length){
		for (int i : neighbor) {
			this.addSignal(i, id, content, length);
		}
	}
	public void addSignal(int i,int id,String content,int length){
		Signal s=new Signal(id, content, length);
		this.chArray.get(i).add(s);
	}
	public void Output(){
		int i=0;
		for (LinkedList<Signal> signals:chArray){
			System.out.println();
			System.out.println(i++);
			for (Signal s:signals){
				System.out.println(s.idFrom+" "+s.contentString+" "+s.countDown);
			}
		}
	}
}
