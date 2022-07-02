package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {


   private int maxVolume = 10;
   private int minVolume = 0;
   private int maxChannel = 9;
   private int minChannel = 0;
   private int amount;
   private int min;
   private int max;
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
      this.amount = amount;
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

   public int getCurrentChannel() {
      return currentChannel;
   }

   public void setMaxVolume(int maxVolume) {
      this.maxVolume = maxVolume;
   }

   public void setMinVolume(int minVolume) {
      this.minVolume = minVolume;
   }

   public void setMaxChannel(int maxChannel) {
      this.maxChannel = maxChannel;
   }

   public void setMinChannel(int minChannel) {
      this.minChannel = minChannel;
   }

   public void setCurrentVolume(int currentVolume) {
      if (currentVolume < minVolume) {
         return;
      }
      if (currentVolume > maxVolume) {
         return;
      }this.currentVolume = currentVolume;
   }

   protected void setCurrentChannel(int currentChannel) {
      if (currentChannel < minChannel) {
         currentChannel = minChannel;
         return;
      }
      if (currentChannel > maxChannel) {
         currentChannel = maxChannel;
         return;
      }
      this.currentChannel = currentChannel;
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

   public int nextChannel() {

      int target = currentChannel + 1;
      if (target > maxChannel) {
         target = minChannel;
         return target;
      }
      setCurrentChannel(target);
      return target;
   }

   public void prevChannel() {
      int target = currentChannel - 1;
      if (target < minChannel) {
         target = maxChannel;
      }
      setCurrentChannel(target);
   }
}
