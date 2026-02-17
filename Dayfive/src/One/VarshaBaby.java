package One;
// single ten only one instance can be accessed many times
public class VarshaBaby {
	private String username;
	private static VarshaBaby baby = null;
	
	private VarshaBaby(String username,String password) {
		this.username=username;
		//this.password=password;
	}
	public static VarshaBaby getUser(String username,String password ) {
		if(baby == null) {
			baby = new VarshaBaby(username,password);
			return baby;
		}
		else
			return baby;
	}
	public String getUsername() {
		return username;
	}

}
