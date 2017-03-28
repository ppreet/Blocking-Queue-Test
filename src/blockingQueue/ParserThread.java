package blockingQueue;

import java.util.concurrent.*;

public class ParserThread extends Thread{

	protected BlockingQueue bqueue = null;
	
	//Constructor to get the BlockingQueue
	public ParserThread(BlockingQueue q){
		
		System.out.println("Parser init done");
		this.bqueue = q;
	}
	
	//Constantly check the queue for objects to pop
	public void run(){
		
		System.out.println("Parser running");
		
		while(true){
			
			if(!bqueue.isEmpty()){
				
				try {
					System.out.println("Popping " + bqueue.take());
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
}
