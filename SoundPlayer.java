import java.io.*;
import sun.audio.*;
import java.util.*;
//gamer
public class SoundPlayer
{
    ArrayList<String> ghit = new ArrayList<String>();
    ArrayList<String> gsunk = new ArrayList<String>();
    ArrayList<String> bsunk = new ArrayList<String>();
    ArrayList<String> gmiss = new ArrayList<String>();
    ArrayList<String> win = new ArrayList<String>();
    ArrayList<String> lose = new ArrayList<String>();
    ArrayList<String> bhit = new ArrayList<String>();
    ArrayList<String> bmiss = new ArrayList<String>();
    int randNum;
    public SoundPlayer()
    {
        ghit.add( "clang.wav" );
        ghit.add( "oof.wav" );
        gsunk.add("dancinS.wav");
        bsunk.add("fine.wav");
        ghit.add( "hit-or-miss.wav" );
        ghit.add("kachowLit.wav");
        bsunk.add("fissionmailed.wav");
        gmiss.add("clownhorn.wav");
        gmiss.add("water.wav");
        gmiss.add("oof.wav");
        bmiss.add("oof.wav");
        bhit.add("clang.wav");
        gsunk.add("dog.wav");
        bsunk.add("ohno.wav");
        bmiss.add("fissionmailed.wav");
        bmiss.add("mariomiss.wav");
        bsunk.add( "bruh.wav" );
        bmiss.add("water.wav");
        bhit.add("oof.wav");
        
        
        gsunk.add("star.wav");
        gmiss.add("adminhelp.wav");
        bmiss.add( "adminhelp.wav" );
        bmiss.add( "clownhorn.wav" );
        gsunk.add( "fbi.wav" );
        bhit.add("sansh.wav");
        bsunk.add( "sadviolin.wav" );
        bsunk.add( "jono.wav" );
        bsunk.add("lionKingMeme.wav");
        gsunk.add( "sans.wav" );
        win.add( "bangindonk.wav" );
        win.add( "torture.wav" );
        lose.add( "clownmusic.wav" );
        lose.add( "dog.wav" );
        gsunk.add("oldmanScream.wav");
        ghit.add("beans.wav");
        bsunk.add("rave.wav");
        bsunk.add("run.wav");
        gsunk.add("avengers.wav");
        bmiss.add("let me in.wav");
        win.add("dancinS.wav");
        bhit.add("steve.wav");
        bmiss.add("daway.wav");
        gsunk.add("win.wav");
        gsunk.add("mafia.wav");
        ghit.add("hitmarker.wav");
    }
    public void player( String type ) throws Exception
    {
        String file = "Audio/" + type;
        
        InputStream in = new FileInputStream( file );
         
        AudioStream audioStream = new AudioStream( in );
        
        AudioPlayer.player.start( audioStream );
    }
    public void ghitSound() throws Exception
    {
        randNum = (int)( Math.random() * ghit.size() );
        player( ghit.get( randNum ) );
    }
    public void bhitSound() throws Exception
    {
        randNum = (int)( Math.random() * bhit.size() );
        player( bhit.get( randNum ) );
    }
    public void bsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * bsunk.size() );
        player( bsunk.get( randNum ) );
    }
    public void gsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * gsunk.size() );
        player( gsunk.get( randNum ) );
    }
    public void bmissSound() throws Exception
    {
        randNum = (int)( Math.random() * bmiss.size() );
        player( bmiss.get( randNum ) );
    }
    public void gmissSound() throws Exception
    {
        randNum = (int)( Math.random() * gmiss.size() );
        player( gmiss.get( randNum ) );
    }
    public void winSound() throws Exception
    {
        randNum = (int)( Math.random() * win.size() );
        player( win.get( randNum ) );
    }
    public void loseSound() throws Exception
    {
        randNum = (int)( Math.random() * lose.size() );
        player( lose.get( randNum ) );
    }
}