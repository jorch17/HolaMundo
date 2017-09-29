package main;
import views.ViewMessage;
import models.ModelMessage;
import controllers.ControllersMessage;

public class Main {
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllersMessage controllersMessage;
   
    public static void main(String[] jla) {
        viewMessage = new ViewMessage();
        modelMessage = new ModelMessage();
        controllersMessage = new ControllersMessage(viewMessage, modelMessage);
    }
    
}