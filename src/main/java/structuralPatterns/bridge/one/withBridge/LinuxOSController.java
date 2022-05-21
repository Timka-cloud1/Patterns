package structuralPatterns.bridge.one.withBridge;

public class LinuxOSController implements OSController{
    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {
        System.out.println("Linux volume down");
    }

    @Override
    public SystemInfo systemInfo() {
        return SystemInfo.builder()
                .systemType(SystemType.LINUX).build();
    }
}
