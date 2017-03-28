package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{

	protected BlockingQueue bq = null;
	
	//Constructor to get the BlockingQueue
	public Producer(BlockingQueue q){
		
		System.out.println("Producer init done");
		this.bq = q;
	}
	
	//Constantly check the queue for objects to pop
	public void run(){
		
		System.out.println("Producer running");
		
		//Put items in the queue
		for(int i = 5; i >= 0; i-=2){			

			try {
				bq.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(bq);
		
		//Put more items in the queue
		for(int i = 10; i >= 5; i-=2){			

			try {
				bq.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(bq);
	}
}
