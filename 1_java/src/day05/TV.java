package day05;

public class TV {
		// data(속성) + 기능(method)
	
	//member variable	
	String color; 
	int size;
	boolean power;
	int channel;
	
	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void power() {
		this.power = !this.power;
	}
	
	public void print() {
		System.out.printf("TV[전원상태 %b , 현재채널 : %d,  %s] %n"
				,this.power,this.channel,this.color);
		//(this.)power,(this.)channel,(this.)color 각각 앞에 this.생략 
	}

	
	
}
