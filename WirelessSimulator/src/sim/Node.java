package sim;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class Node implements Runnable{
	final List<Integer> neighborsNodeList;
	Channel channel;
	final int id;
	CyclicBarrier barrier;
	
	public Node(int id, List<Integer>integers, Channel channel,CyclicBarrier barrier){
		this.neighborsNodeList=integers;
		this.id=id;
		this.channel=channel;
		this.barrier=barrier;
	}
	
	private void addSignal(String contentString,int length){
		channel.addSignal(this.neighborsNodeList, this.id, contentString, length);
	}
	
	//Test
	public void run(){
		for (int time=0;time<100;time++){
			System.out.print(time);
			if (time==id+10){
				this.addSignal("Data", 20);
			}
			try {
				barrier.await();
			} catch (BrokenBarrierException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
