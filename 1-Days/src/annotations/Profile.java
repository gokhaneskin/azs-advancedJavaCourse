package annotations;

public class Profile {

	//Profile nesne olarak �retilmesi laz�m	
	
	@User(id = 100,name = "Gokhan")
	public void userProfile() {
		System.out.println("userProfile");
	}
	
	@User(id = 200,name = "Ali", surname = "Veli", type=EUser.admin)
	public void adminProfile(int price) {
		System.out.println("adminProfile");
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
