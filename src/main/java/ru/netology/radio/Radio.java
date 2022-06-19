package ru.netology.radio;

public class Radio {

   //Громкость
   public int currentVolume;

   public int getCurrentVolume() {
      return currentVolume;
   }

   public void setCurrentVolume(int newCurrentVolume) {
      if (newCurrentVolume < 0) {
         return;
      }
      if (newCurrentVolume > 10) {
         return;
      }
      currentVolume = newCurrentVolume;
   }

   public void increaseVolume() {
      int target = currentVolume;
      if (currentVolume < 10) {
         target = currentVolume + 1;
      }
      setCurrentVolume(target);
   }

   public void decreaseVolume() {
      int target = currentVolume;
      if (currentVolume > 0) {
         target = currentVolume - 1;
      }
      setCurrentVolume(target);
   }


   //Радиостанция
   public int currentChannel;

   public int getCurrentChannel() {
      return currentChannel;
   }

   int channelMin = 0;
   int channelMax = 9;
   public int setCurrentChannel(int newCurrentChannel) {
      if (newCurrentChannel < 0) {
         currentChannel = channelMin;
         return currentChannel;
      }
      if (newCurrentChannel > 9) {
         currentChannel = channelMax;
         return currentChannel;
      }
      currentChannel = newCurrentChannel;
      return currentChannel;
   }

   public void nextChannel() {
      int target = currentChannel + 1 ;
      if (target >= 10) {
         target = 0;
      }
      setCurrentChannel(target);
   }

   public void prevChannel() {
      int target = currentChannel - 1;
      if (target < 0) {
         target = 9;
      }
      setCurrentChannel(target);
   }
}

