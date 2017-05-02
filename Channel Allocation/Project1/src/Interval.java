/*
 * Seyed Ali Mojarrad - Project 1 - Comp 496 - Fall 2016
 */

//Class of Intervals to use Intervals as Objects for easier track of start,finish and position time 
public class Interval {
	private int startTime, finishTime;
	public Interval(){
		startTime =0;
		finishTime =0;
	}
	
	public int getStartTime(){
		return startTime;
	}
	public int getFinishTime(){
		return finishTime;
	}
	
	
	void setStartTime(int startTime){
		this.startTime = startTime;
	}
	
	void setFinishTime(int finishTime){
		this.finishTime = finishTime;
	}
	
	

}
