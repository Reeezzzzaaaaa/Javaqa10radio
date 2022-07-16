package ru.netology.radio;

public class Radio {

   private int maxVolume = 10;
   private int minVolume = 0;
   private int maxChannel = 9;
   private int minChannel = 0;
   private int newMaxVolume = 10;
   private int currentVolume = minVolume;
   private int currentChannel = minChannel;

   public Radio() {
   }

   protected Radio(int amount) {
      maxVolume = minVolume + amount;
      maxChannel = minChannel + (amount - 1);
   }

   public int getNewMaxVolume() {
      return newMaxVolume;
   }

   protected int getCurrentVolume() {
      return currentVolume;
   }

   protected int getCurrentChannel() {
      return currentChannel;
   }

   protected int getMaxVolume() {
      return maxVolume;
   }

   protected int getMinVolume() {
      return minVolume;
   }

   protected int getMaxChannel() {
      return maxChannel;
   }

   protected int getMinChannel() {
      return minChannel;
   }

   public void setNewMaxVolume(int newMaxVolume) {
      this.maxVolume = newMaxVolume;
   }

   protected void setCurrentVolume(int newCurrentVolume) {
      if (newCurrentVolume < minVolume) {
         return;
      }
      if (newCurrentVolume > maxVolume) {
         return;
      }
      currentVolume = newCurrentVolume;
   }

   protected void setCurrentChannel(int newCurrentChannel) {
      if (newCurrentChannel < minChannel) {
         currentChannel = minChannel;
         return;
      }
      if (newCurrentChannel > maxChannel) {
         currentChannel = maxChannel;
         return;
      }
      currentChannel = newCurrentChannel;
   }


   protected void increaseVolume() {
      int target = currentVolume;
      if (currentVolume < maxVolume) {
         target = currentVolume + 1;
      }
      setCurrentVolume(target);
   }

   protected void decreaseVolume() {
      int target = currentVolume;
      if (currentVolume > minVolume) {
         target = currentVolume - 1;
      }
      setCurrentVolume(target);
   }

   protected void nextChannel() {
      int target = currentChannel + 1;
      if (target > maxChannel) {
         target = minChannel;
      }
      setCurrentChannel(target);
   }

   protected void prevChannel() {
      int target = currentChannel - 1;
      if (target < minChannel) {
         target = maxChannel;
      }
      setCurrentChannel(target);
   }
}
