package Behavioral.Command;

public class Client {

    public static void main(String[] args) {
        RemoteControllerInvoker remoteController = new RemoteControllerInvoker(new Light());
        remoteController.buttonLightOn();
        remoteController.buttonLightOff();
    }

}
