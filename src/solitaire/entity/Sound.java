package solitaire.entity;

public class Sound
{
    private int soundNum;
    private String soundName;
    
    public Sound()
    {
        
    }
    public Sound(int soundNum, String soundName)
    {
        this.soundNum = soundNum;
        this.soundName = soundName;
    }

    public int getSoundNum()
    {
        return soundNum;
    }
    public void setSoundNum(int soundNum)
    {
        this.soundNum = soundNum;
    }  
    
    public String getSoundName()
    {
        return soundName;
    }
    public void setSoundName(String soundName)
    {
        this.soundName = soundName;
    }
    
}