package OOP06.adapterPattern;

public class YoutubeAdapter implements MusicPlayer{
  YoutubeMusic youtubeMusic = new YoutubeMusic();
  @Override
  public void playMusic() {
    youtubeMusic.redButton();
  }

  @Override
  public void stopMusic() {
    youtubeMusic.blueButton();
  }
}
