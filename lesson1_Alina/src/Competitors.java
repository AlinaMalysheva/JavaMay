import java.util.Objects;

public interface Competitors {
    void run(int _competDist);
    void jump(int _competDist);
    int getRunDist();
    int getJumpDist();
    String getName();
}
