package sim;

public class SimTask {
	Channel channel;
	int numNode;
	public SimTask(int num){
		this.numNode=num;
		channel=new Channel(num);
	}
	public void run(){
		
	}

}
