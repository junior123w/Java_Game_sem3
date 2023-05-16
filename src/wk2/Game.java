package wk2;

public interface Game {
    void start();
    void resume();
    void end();
    String rules();
    void stop();
    void pause();
    void turn(wk2.Player attacking, wk2.Player gettingAttacked);
    boolean save(String filename);
    boolean load(String filename);

}
