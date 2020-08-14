package solitaire.entity;

import java.net.URL;

public class Sound
{
    private URL soundSource;

    public URL getSoundSource()
    {
        return soundSource;
    }

    public void setSoundSource(URL soundSource)
    {
        this.soundSource = soundSource;
    }
    
}


/*

    //import java.applet.Applet;
    //import java.applet.AudioClip;

    private ArrList<Sound> sound = new ArrList<Sound>();

    private void initializeSound()
    {
        //Sound Effects for Suffering Cards/Start of the game
        String url = "client/sounds/Shuffling_Cards.mp3";
        sound.add(Applet.newAudioClip(this.getClass().getResource(url)));

        //Sound Effect for player holding tha card(Play once)
        String url = "client/sounds/Card_Take_1.mp3";
        sound.add(Applet.newAudioClip(this.getClass().getResource(url)));

        //Sound Effect for player putting Card (Err...choose one of it?)
        String url = "client/sounds/Card_Put_1.mp3";
        sound.add(Applet.newAudioClip(this.getClass().getResource(url)));
        String url = "client/sounds/Card_Put_2.mp3";
        sound.add(Applet.newAudioClip(this.getClass().getResource(url)));

        //Sound Effect for open the hidden card(Auto)
        String url = "client/sounds/Card_Flip.mp3";
        sound.add(Applet.newAudioClip(this.getClass().getResource(url)));
       
        
    }

    private static void playSoundEffect()
    {
        //Did we really need it?
        int sleepTime = 600;

        Thread.sleep(sleepTime);
        sound.getSoundSource().play;
    }

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

    void playMusic(String musicLocation)
    {
        try
        {
            File musicPath = new File (musicLocation);
            
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip audioClip = AudioSystem.getClip();
                clip.start();
            }
            else
            {
                System.out.println("Cannot found the music");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

https://www.youtube.com/watch?v=TErboGLHZGA

    }
*/