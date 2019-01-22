package Command;

public class RemoteControllerInvoker {

    private Light light;
    private Command lightOn;
    private Command lightOff;

    public RemoteControllerInvoker(Light light) {
        this.light = light;
        lightOn = new LightOnCommand(light);
        lightOff = new LightOffCommand(light);
    }

    public void buttonLightOn() {
        lightOn.execute();
    }

    public void buttonLightOff() {
        lightOff.execute();
    }



}
