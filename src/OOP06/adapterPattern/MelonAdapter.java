package OOP06.adapterPattern;

public class MelonAdapter implements MusicPlayer{
  MelonMusic melonMusic = new MelonMusic();
  @Override
  public void playMusic() {
    melonMusic.playMusic();
  }

  @Override
  public void stopMusic() {
    melonMusic.playMusic();
  }
}
