package Java;

import java.util.Scanner;

public class UserPlayList {

	public static void main(String[] args) {
		Scanner userName = new Scanner(System.in);
		System.out.println("Choose User Name as User1 or User2");
		
		//Selecting Specific User to get his PlayList
		String name = userName.nextLine();
		Users user = new Users();
		
		//User Specific Method will return you the PlayList of Selected User and You can add new Songs to PlayList 
		user.userSpecificList(name);
		userName.close();
	}

}
