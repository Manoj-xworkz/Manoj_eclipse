package com.xworkz.constructor.boot;


import com.xworkz.constructor.things.Song;

public class SongRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Song track= new Song();
	System.out.println("************Default Values******************");
	System.out.println("Name:"+track.name);
	System.out.println("Language:"+track.lang);
	System.out.println("Singer:"+track.singer);
	System.out.println("Lyrcist:"+track.lyricst);
	System.out.println("Type:"+track.type);
	
	track.name="Singara Siriye";
	track.lang="Kannada";
	track.singer="Vijay Prakash";
	track.lyricst="Pramod Maravanthe";
	track.type="Romantic";
	
	System.out.println("************After Instantiation******************");
	System.out.println("Name:"+track.name);
	System.out.println("Language:"+track.lang);
	System.out.println("Singer:"+track.singer);
	System.out.println("Lyrcist:"+track.lyricst);
	System.out.println("Type:"+track.type);

	}

}
