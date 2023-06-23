package Java;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Users extends Songs{

	 static Songs song=new Songs();
	 static String songList1[] = Songs.playList1();
	 static String songList2[] = Songs.playList2();
	
	public static void userSpecificList(String user) {
		
		int j=0;
		String User1 ="User1";
		String User2 ="User2";
		//While loop is to Check Results for adding different Songs
		while (j<5) {
		Scanner userInput = new Scanner(System.in);
		
		//Enter the new Song to be added to Play list
		System.out.print("New Song :-" );
		String newSong =userInput.nextLine();
		
		//New Song will be added to the Play list
		String[] newPlayList1 = playListUpdate1(newSong);
		String[] newPlayList2 = playListUpdate2(newSong);
			
			//Mapping Play List to The Users
			LinkedHashMap<String, String[]> userMappingtoPlaylist = new LinkedHashMap<>();
			userMappingtoPlaylist.put(User1, newPlayList1);
			userMappingtoPlaylist.put(User2, newPlayList2);
			
			if(User2.equalsIgnoreCase(user)) {
				String[] newListOfSongs = userMappingtoPlaylist.get(User2);
				for (int i = 0; i < newListOfSongs.length; i++) {
					System.out.print(newListOfSongs[i]+" ");
				}
				System.out.println();
			}
			else if(User1.equalsIgnoreCase(user)) {
				String[] newListOfSongs = userMappingtoPlaylist.get(User1);
				for (int i = 0; i < newListOfSongs.length; i++) {
					System.out.print(newListOfSongs[i]+" ");
				}
				System.out.println();
			}
			else {
				break;
			}
			j++;
		}
	}
	public static String[] playListUpdate1(String newSong)
	{
		for (int i = 0; i < songList1.length-1; i++) {
			songList1[i] = songList1[i+1];
		}
		songList1[songList1.length-1] = newSong;
		
		return songList1;
	}
	public static String[] playListUpdate2(String newSong)
	{
		for (int i = 0; i < songList2.length-1; i++) {
			songList2[i] = songList2[i+1];
		}
		songList2[songList2.length-1] = newSong;
		
		return songList2;
	}
}

