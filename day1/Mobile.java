package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel;
		float mobileWeight;
		System.out.println("This is my Mobile");
	}
	public void sendMsg() {
		boolean isFullCharged;
		int mobileCost;
		System.out.println("Mobile Message");
	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makeCall();
		m.sendMsg();
		

	}

}
