package structuralPatterns.bridge.one.withBridge;

public class WindowsOSController implements OSController{

    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {
        System.out.println("Windows volume down");
    }

    @Override
    public SystemInfo systemInfo() {
        return SystemInfo.builder().systemType(SystemType.WINDOWS).build();
    }
}
