package builder;

public interface Clock {
    void addDisplay(displays someDisplay);
    void removeDisplay(displays someDisplay);
    void startClock();
    void notifyDisplays();
}
