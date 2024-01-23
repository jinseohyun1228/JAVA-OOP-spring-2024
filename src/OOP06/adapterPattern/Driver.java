package OOP06.adapterPattern;

public class Driver {
  public static void main(String[] args) {
    MelonMusic melonMusic = new MelonMusic();
    melonMusic.playMusic();
    melonMusic.stopMusic();

    YoutubeMusic youtubeMusic = new YoutubeMusic();
    youtubeMusic.redButton();
    youtubeMusic.blueButton();

    MusicPlayer musicPlayer01 = new YoutubeAdapter();
    MusicPlayer musicPlayer02 = new MelonAdapter();

    musicPlayer01.playMusic();
    musicPlayer02.playMusic();
  }


}
