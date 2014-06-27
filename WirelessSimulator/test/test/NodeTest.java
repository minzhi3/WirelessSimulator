package test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

import org.junit.Before;
import org.junit.Test;

import sim.*;

public class NodeTest {

	Channel channel;
	@Before
	public void setUp() throws Exception {
		channel=new Channel(3);
	}

	@Test
	public void test() {
		List<Integer> n0 = new LinkedList<Integer>();
		List<Integer> n1 = new LinkedList<Integer>();
		List<Integer> n2 = new LinkedList<Integer>();
		n0.add(1);
		n1.add(0);
		n1.add(2);
		n2.add(1);
		Node[] nodes=new Node[3];
		CyclicBarrier cb=new CyclicBarrier(3,new Runnable(){

			@Override
			public void run() {
				channel.Output();
				
			}
		});

		nodes[0]=new Node(0, n0, channel,cb);
		nodes[1]=new Node(1, n1, channel,cb);
		nodes[2]=new Node(2, n2, channel,cb);
		Thread[] threads=new Thread[3];
		for (int i=0;i<3;i++){
			threads[i]=new Thread(nodes[i]);
			threads[i].start();
		}
		try {
			Thread.currentThread().wait(10000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
