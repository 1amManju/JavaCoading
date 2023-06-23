package Java;

public class Songs {
	
	static String song1 = "S1";
	static String song2 = "S2";
	static String song3 = "S3";
	static String song4 = "M1";
	static String song5 = "M2";
	static String song6 = "M3";
	 
	public static String[] playList1() {
		String user1PlayList[] = {song1 , song2 , song3 };
		return user1PlayList;
	}
	public static String[] playList2() {
		String user2PlayList[] = {song4 , song5 , song6 };
		return user2PlayList;
	}
	
}
