package structuralPatterns.bridge.one.withoutBridge;

public class WindowsMainMenu implements MainMenu {
    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public SystemInfo systemInfo() {
        return null;
    }
}
