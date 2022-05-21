package structuralPatterns.bridge.one.withoutBridge;

public interface MainMenu {
    // для других ОС придется создавать еще два класса, например MacMainMenu and MacSecondaryMenu
    // а если добавится еще менюшки то к каждому добавлять еще один класс, например LinuxThirdMenu и так далее
    void powerOff();
    void volumeUp();
    void volumeDown();
    SystemInfo systemInfo();
}
