package MusicPlaylist;

import java.util.LinkedList;
public class MusicPlaylist	{
public static void main(String[] args){

	LinkedList<String> songs = new LinkedList<String>();
	LinkedList<String> artists = new LinkedList<String>();
	LinkedList<String> playlist = new LinkedList<String>();

		songs.add("Back To December (Taylor's Version)");
		songs.add("Look at the Sky");
		songs.add("vampire");
		songs.add("Super Shy");
		songs.add("Home To Another One");

		artists.add("Taylor Swift");
		artists.add("Porter Robinson");
		artists.add("Olivia Rodrigo");
		artists.add("NewJeans");
		artists.add("Madison Beer");

		for(int i=0;i<songs.size();i++)
			playlist.add(songs.get(i) + " - " + artists.get(i));

		System.out.println(songs);
		System.out.println(artists);
		for(String s: playlist)
		System.out.println(s);
	}
}