/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package channel;

/**
 *
 * @author sameeh boshra
 */
public class TV {
    static int channell =1 ;
    static int volumeLevel =0;
    public boolean on    ;
//    public int channelUp=0;
//    public int channelDown=0;
   // public int volumeUp=0;
  //  public int volumedown=0;
    
    /**
     *
     * @param o
     */
    public TV(  )
    {
       
    }
    public void turnOn()
    {
        on =true;
        System.out.println("true");
    }
     public void turnOff()
    {
        on = false;
        System.out.println("false");
    }
     public void setChannel(int newChannel)
     {
         if(on && newChannel>=1 && newChannel<=120)
         {
             channell=newChannel;
         }
         else
         {
             System.out.println("no channel found ");
         }
     }
      public void setVolume(int newvolume)
     {
         if(on && newvolume>=1 && newvolume<=7)
         {
             channell=newvolume;
         }
          else
         {
             System.out.println("no volume  ");
         }
     }
    public  void channelU( )
    {
        if(channell==120)
        {
            System.out.println("this is the last channel");
        }
        else
        {
        channell++;
        System.out.println(" channel is  :  "+channell);
        }
    }
    public void channelD( )
    {
        if(channell < 1 )
        {
            System.out.println(" This is the first channel ");
        }
        else
        {
        channell--;
        System.out.println("channel is  :  "+channell);
        }
    }
    public void volumeU()
    {
        if(volumeLevel==7)
        {
            System.out.println("this is the high volume ");
            
        }
        else
        {
        volumeLevel ++;
        System.out.println("volume level is : " +volumeLevel);
        }
    }
    
        public void volumeD()
    {
        if (volumeLevel <= 0 )
        {
            System.out.println("This is the last volume in TV ");
        }
        else
        {
               volumeLevel --;
        System.out.println("volume level is : " +volumeLevel); 
        }
    
    }
     
}
