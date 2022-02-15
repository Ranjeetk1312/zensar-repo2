package com.zensar;

public class EnumDemo {

	public enum weekdays {

		SUN(100), MON(200), TUE(500), WED(700), THU(900), FRI(1200), SAT(1500);

		private int value;

		weekdays(int value) {
			this.value = value;
		}

	};
	
	public enum ThreadPriority {
		MIN_PRIORITY(1),NORM_PRIORITY(5),MAX_PRIORITY(10);
		
		private int value;

		ThreadPriority(int value) {
			this.value = value;
		}
	};

	private int id;
	private String name;
	private weekdays dayOfJoining; // reference variable
	private ThreadPriority myThreadPriority;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public weekdays getDayOfJoining() {
		return dayOfJoining;
	}

	public void setDayOfJoining(weekdays dayOfJoining) {
		this.dayOfJoining = dayOfJoining;
	}

	public EnumDemo(int id, String name, weekdays dayOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.dayOfJoining = dayOfJoining;
	}
	
	

	public EnumDemo(int id, String name, weekdays dayOfJoining, ThreadPriority myThreadPriority) {
		super();
		this.id = id;
		this.name = name;
		this.dayOfJoining = dayOfJoining;
		this.myThreadPriority = myThreadPriority;
	}

	

	@Override
	public String toString() {
		return "EnumDemo [id=" + id + ", name=" + name + ", dayOfJoining=" + dayOfJoining + ", myThreadPriority="
				+ myThreadPriority.value + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enhanced for loop - arrays, collections, group of values like enum,
		// enumerations, enumarator, iterator
		for (weekdays w : weekdays.values()) {
			System.out.println(w + " Value =" + w.value);
		}

		EnumDemo obj = new EnumDemo(100, "ABC", weekdays.SUN,ThreadPriority.MIN_PRIORITY);
		
		EnumDemo obj2 = new EnumDemo(120, "ThreadDemo", weekdays.FRI, ThreadPriority.NORM_PRIORITY);

		System.out.println(obj);
		
		System.out.println(obj2);

		int a[] = { 5, 7, 8 };

	}

}
