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
      int target = currentVolume + 1;
      setCurrentVolume(target);
   }

   public void decreaseVolume() {
      int target = currentVolume - 1;
      setCurrentVolume(target);
   }


   //Радиостанция
   public int currentChannel;

   public int getCurrentChannel() {
      return currentChannel;
   }

   public void setCurrentChannel(int newCurrentChannel) {
      if (newCurrentChannel < -1) {
         return;
      }
      if (newCurrentChannel > 10) {
         return;
      }
      currentChannel = newCurrentChannel;
   }

   public void nextChannel() {
      int target = currentChannel + 1;
      if (target >= 10) {
         target = 0;
      }
      setCurrentChannel(target);
   }

   public void prevChannel() {
      int target = currentChannel - 1;
      if (target <= -1) {
         target = 9;
      }
      setCurrentChannel(target);
   }
}

