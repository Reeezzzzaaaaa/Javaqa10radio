package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Radio {

   private int maxVolume = 10;
   private int minVolume = 0;
   private int maxChannel = 9;
   private int minChannel = 0;
   private int currentVolume = minVolume;
   private int currentChannel = minChannel;

   public Radio(int min, int max) {
      this.minVolume = min;
      this.maxVolume = max;
      this.minChannel = min;
      this.maxChannel = max;
      this.currentVolume = minVolume;
      this.currentChannel = minChannel;
   }

   public Radio(int amount) {
      maxVolume = minVolume + amount;
      maxChannel = minChannel + (amount - 1);
   }

   public int getMaxVolume() {
      return maxVolume;
   }

   public int getMinVolume() {
      return minVolume;
   }
   public int getMaxChannel() {
      return maxChannel;
   }
   public int getMinChannel() {
      return minChannel;
   }
   public int getCurrentVolume() {
      return currentVolume;
   }

   public void setCurrentVolume(int currentVolume) {
      if (currentVolume < minVolume) {
         return;
      }
      if (currentVolume > maxVolume) {
         return;
      }
      this.currentVolume = currentVolume;
   }

   public int getCurrentChannel() {
      return currentChannel;
   }

   public int setCurrentChannel(int currentChannel) {
      if (currentChannel < minChannel) {
         currentChannel = minChannel;
         this.currentChannel = currentChannel;
         return currentChannel;
      }
      if (currentChannel > maxChannel) {
         currentChannel = maxChannel;
         this.currentChannel = currentChannel;
         return currentChannel;
      }
      this.currentChannel = currentChannel;
      return currentChannel;
   }

   public void increaseVolume() {
      int target = currentVolume;
      if (currentVolume < maxVolume) {
         target = currentVolume + 1;
      }
      setCurrentVolume(target);
   }

   public void decreaseVolume() {
      int target = currentVolume;
      if (currentVolume > minVolume) {
         target = currentVolume - 1;
      }
      setCurrentVolume(target);
   }

   public void nextChannel() {
      int target = currentChannel + 1;
      if (target > maxChannel) {
         target = minChannel;
      }
      setCurrentChannel(target);
   }

   public void prevChannel() {
      int target = currentChannel - 1;
      if (target < minChannel) {
         target = maxChannel;
      }
      setCurrentChannel(target);
   }
}




//
//   public Radio(int min, int max) {
//      this.minVolume = min;
//      this.maxVolume = max;
//      this.minChannel = min;
//      this.maxChannel = max;
//      this.currentVolume = minVolume;
//      this.currentChannel = minChannel;
//   }
//
//   public Radio(int amount) {
//      maxVolume = minVolume + amount;
//      maxChannel = minChannel + (amount - 1);
//   }
//
//
//   public int getCurrentVolume() {
//      return currentVolume;
//   }
//   public void setCurrentVolume(int newCurrentVolume) {
//      if (newCurrentVolume < minVolume) {
//         return;
//      }
//      if (newCurrentVolume > maxVolume) {
//         return;
//      }
//      currentVolume = newCurrentVolume;
//   }
//
//   public int getCurrentChannel() {
//      return currentChannel;
//   }
//   public int setCurrentChannel(int newCurrentChannel) {
//      if (newCurrentChannel < minChannel) {
//         currentChannel = minChannel;
//         return currentChannel;
//      }
//      if (newCurrentChannel > maxChannel) {
//         currentChannel = maxChannel;
//         return currentChannel;
//      }
//      currentChannel = newCurrentChannel;
//      return currentChannel;
//   }
//
//   public int getMaxVolume() {
//      return maxVolume;
//   }
//
//   public int getMinVolume() {
//      return minVolume;
//   }
//
//   public int getMaxChannel() {
//      return maxChannel;
//   }
//
//   public int getMinChannel() {
//      return minChannel;
//   }
//
//
//   public void increaseVolume() {
//      int target = currentVolume;
//      if (currentVolume < maxVolume) {
//         target = currentVolume + 1;
//      }
//      setCurrentVolume(target);
//   }
//
//   public void decreaseVolume() {
//      int target = currentVolume;
//      if (currentVolume > minVolume) {
//         target = currentVolume - 1;
//      }
//      setCurrentVolume(target);
//   }
//
//   public void nextChannel() {
//      int target = currentChannel + 1;
//      if (target > maxChannel) {
//         target = minChannel;
//      }
//      setCurrentChannel(target);
//   }
//
//   public void prevChannel() {
//      int target = currentChannel - 1;
//      if (target < minChannel) {
//         target = maxChannel;
//      }
//      setCurrentChannel(target);
//   }
//}

