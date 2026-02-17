package Fun;

public enum Days {
	SUN("sunday"),MON("monday"),TUE("tuesday"),WED("wednesday"),THUR("thurday"),FRI("friday"),SAT("saturday");
	
	private String nama;
	public String getNama() {
		return this.nama;
	}
	private Days(String nama) {
		this.nama=nama;
		System.out.println("This is it "+nama); 
		
	}

}
