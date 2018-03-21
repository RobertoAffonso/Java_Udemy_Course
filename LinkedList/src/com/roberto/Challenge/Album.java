package com.roberto.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Roberto Affonso, created on 12/03/18
 **/

public class Album
{
    private String artist;
    private String title;
    private List<Song> songs;
    Scanner input = new Scanner(System.in);

    public Album(String artist, String title)
    {
        this.artist = artist;
        this.title = title;
        songs = new ArrayList<>();
    }

    public String getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return title;
    }

    public List<Song> getSongs()
    {
        return songs;
    }

    protected Song getSong(int key)
    {
        Song selectedSong = songs.get(key);
        return selectedSong;
    }

    public void listAllSongs()
    {
        int i =1;
        for (Song song : songs)
        {
            System.out.println(i + " " + song.toString());
            i++;
        }
    }

    protected boolean addSong()
    {
        System.out.println("Please enter the song's title: ");
        String title = input.next();
        System.out.println("Now please enter the song's duration: ");
        double duration = input.nextDouble();
        if(addSong(title, duration))
        {
            System.out.println(title + " added!");
            return true;
        }
        System.out.println("There was an issue adding " + title);
        return false;
    }

    private boolean addSong(String title, double duration)
    {
        Song song = new Song(title, duration);
        if(songs.add(song))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Artist: " + getArtist() + " || " + "Title: " + getTitle();
    }
}
