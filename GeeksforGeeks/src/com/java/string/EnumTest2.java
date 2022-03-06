package com.java.string;



enum Days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}





public class EnumTest2 {

	Days days;
	
	
	public EnumTest2(Days day) {
	
		this.days=days;
		
		
	}
	
  public void thisdays() {
	  switch (days)
	  {
  case MONDAY:
      System.out.println("Mondays are bad.");
      break;
  case FRIDAY:
      System.out.println("Fridays are better.");
      break;
  case SATURDAY:
  case SUNDAY:
      System.out.println("Weekends are best.");
      break;
  default:
      System.out.println("Midweek days are so-so.");
      break;
	  }
  }
	
	
	
	public static void main(String[] args) {
		String str = "MONDAY";
		EnumTest2   t1 = new EnumTest2(Days.valueOf(str));
        t1.thisdays();

	}

}
