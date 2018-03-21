package com.roberto.Challenge;

import java.util.*;

/**
 * @author Roberto Affonso, created on 12/03/18
 **/

public class Main
{
    private static List<Song> playlist = new LinkedList<>();
    private static List<Album> albumList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        populateAlbums();
        int choice;
        boolean quit = false;

        while (!quit)
        {
            generateMenu();
            choice = input.nextInt();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;

                case 1:
                    listAlbums();
                    break;

                case 2:
                    addSongs();
                    break;

                case 3:
                    listPlaylistSongs();
                    break;

                case 4:
                    startPlaylist(playlist);
                    break;
            }
        }
    }

    public static void generateMenu()
    {
        System.out.println("Please select an option:" + "\n" +
                "\t" + "0 - Quit" + "\n" +
                "\t" + "1 - List albums" + "\n" +
                "\t" + "2 - Add songs to playlist" + "\n" +
                "\t" + "3 - List songs in your playlist" + "\n" +
                "\t" + "4 - Start Playlist");
    }

    private static void generatePlaylistMenu()
    {
        System.out.println("\t" + "0 - Exit playlist" + "\n" +
                           "\t" + "1 - Next song" + "\n" +
                           "\t" + "2 - Previous Song" + "\n" +
                           "\t" + "3 - Replay current song" + "\n" +
                           "\t" + "4 - Remove current song");
    }

    public static void listAlbums()
    {
        System.out.println("Albums you own: ");
        for (Album album : albumList)
        {
            System.out.println("\t" + album.toString());
        }
    }

    public static boolean addSongs()
    {
        System.out.println("Please select an album: ");
        int i = 1;
        boolean quit = false;
        for (Album album : albumList)
        {
            System.out.println("\t" + i + " - " + album.toString());
            i++;
        }
        int choice = input.nextInt();
        Album selected = albumList.get(choice - 1);
        selected.listAllSongs();
        choice = input.nextInt();
        if(playlist.add(selected.getSong(choice - 1)))
        {
            Song song = selected.getSong(choice - 1);
            System.out.println(song.getTitle() + " added to playlist");
            return true;
        }
        return false;
    }


    public static void listPlaylistSongs()
    {
        for(Song song: playlist)
        {
            System.out.println(song.toString());
        }
    }

    public static void startPlaylist(List<Song> playlist)
    {
        ListIterator<Song> iterator = playlist.listIterator();
        boolean quit = false;
        boolean forward = true;
        int choice;

        if(playlist.isEmpty())
        {
            System.out.println("The playlist is empty.");
        }

        System.out.println("Now Playing: " + iterator.next());
        while(!quit)
        {
            generatePlaylistMenu();
            choice = input.nextInt();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;

                case 1:
                    if(!forward)
                    {
                        if(iterator.hasNext())
                        {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if(iterator.hasNext())
                    {
                        System.out.println("Now Playing " + iterator.next());
                    }
                    else
                    {
                        System.out.println("You have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward)
                    {
                        if(iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if(iterator.hasPrevious())
                    {
                        System.out.println("Now Playing " + iterator.previous());
                    }
                    else
                    {
                        System.out.println("You have reached the beginning of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    break;
                case 4:
                    if(!iterator.hasNext() && !iterator.hasPrevious())
                    {
                        iterator.remove();
                    }
                    else if(iterator.hasNext())
                    {
                        iterator.remove();
                        iterator.next();
                    }
                    break;
            }
        }
    }

    public static void populateAlbums()
    {
        Album storm = new Album("Dissection", "Storm of the light's Bane");
        Song fathomless = new Song("At the fathomless depths", 1.56);
        Song night = new Song("Night's Blood", 6.40);
        Song unhallowed = new Song("Unhallowed", 7.28);
        Song angels = new Song("Where Dead Angels Lie", 5.52);
        Song retribution = new Song("Retribution - Storm of the Light's Bane", 4.50);
        Song thorns = new Song("Thorns of Crimson Death", 8.07);
        Song soulreaper = new Song("Soulreaper", 6.56);
        Song dreams = new Song("No Dreams Breed in Breathless Sleep", 1.26);
        storm.getSongs().add(fathomless);
        storm.getSongs().add(night);
        storm.getSongs().add(unhallowed);
        storm.getSongs().add(angels);
        storm.getSongs().add(retribution);
        storm.getSongs().add(thorns);
        storm.getSongs().add(soulreaper);
        storm.getSongs().add(dreams);

        Album meliora = new Album("Ghost", "Meliora");
        Song spirit = new Song("Spirit", 5.15);
        Song pinnacle = new Song("From the Pinnacle to the Pit", 4.02);
        Song cirice = new Song("Cirice", 6.02);
        Song spoksonat = new Song("Spöksonat", 0.56);
        Song he = new Song("He Is", 4.13);
        Song mummy = new Song("Mummy Dust", 4.07);
        Song majesty = new Song("Majesty", 5.24);
        Song devil = new Song("Devil Church", 1.06);
        Song absolution = new Song("Absolution", 4.50);
        Song deus = new Song("Deus in Absentia", 5.37);
        meliora.getSongs().add(spirit);
        meliora.getSongs().add(pinnacle);
        meliora.getSongs().add(cirice);
        meliora.getSongs().add(spoksonat);
        meliora.getSongs().add(he);
        meliora.getSongs().add(mummy);
        meliora.getSongs().add(majesty);
        meliora.getSongs().add(devil);
        meliora.getSongs().add(absolution);
        meliora.getSongs().add(deus);


        Album jester = new Album("In Flames", "The Jester Race");
        Song moonshield = new Song("Moonshield", 4.58);
        Song dance = new Song("The Jester's Dance", 2.09);
        Song artifacts = new Song("Artifacts of the Black Rain", 3.17);
        Song graveland = new Song("Graveland", 2.46);
        Song hypnos = new Song("Lord Hypnos", 4.16);
        Song eternity = new Song("Dead Eternity", 5.01);
        Song race = new Song("The Jester Race", 4.51);
        Song december = new Song("December Flower", 4.10);
        Song wayfaerer = new Song("Wayfaerer", 4.41);
        Song god = new Song("Dead God in Me", 4.15);
        jester.getSongs().add(moonshield);
        jester.getSongs().add(dance);
        jester.getSongs().add(artifacts);
        jester.getSongs().add(graveland);
        jester.getSongs().add(hypnos);
        jester.getSongs().add(eternity);
        jester.getSongs().add(race);
        jester.getSongs().add(december);
        jester.getSongs().add(wayfaerer);
        jester.getSongs().add(god);


        Album time = new Album("Iron Maiden", "Somewhere in time");
        Song caught = new Song("Caught Somewhere in Time", 7.26);
        Song wasted = new Song("Wasted Years", 5.07);
        Song sea = new Song("Sea of Madness", 5.42);
        Song heaven = new Song("Heaven Can Wait", 7.22);
        Song runner = new Song("The Loneliness of the Long Distance Runner", 6.31);
        Song stranger = new Song("Stranger in a Strange Land", 5.45);
        Song dejavu = new Song("Deja-Vu", 4.56);
        Song alexander = new Song("Alexander the Great", 8.35);
        time.getSongs().add(caught);
        time.getSongs().add(wasted);
        time.getSongs().add(sea);
        time.getSongs().add(heaven);
        time.getSongs().add(runner);
        time.getSongs().add(stranger);
        time.getSongs().add(dejavu);
        time.getSongs().add(alexander);

        albumList.add(storm);
        albumList.add(meliora);
        albumList.add(jester);
        albumList.add(time);

        playlist.add(caught);
        playlist.add(moonshield);
        playlist.add(cirice);
        playlist.add(retribution);
    }
}


