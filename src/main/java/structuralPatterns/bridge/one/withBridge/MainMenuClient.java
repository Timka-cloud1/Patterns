package structuralPatterns.bridge.one.withBridge;

public class MainMenuClient {
    public static void main(String[] args) {
        MainMenu mainMenu = MainMenuImpl.builder()
                .osController(new LinuxOSController())
                .build();
        mainMenu.volumeDown();
        SecondaryMenu secondaryMenu = SecondaryMenuImpl.builder()
                .osController(new WindowsOSController())
                .build();
        secondaryMenu.volumeDown();
    }
}
