package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewMessage;


public class ControllersMessage implements ActionListener {
    ModelMessage modelMessage;
    ViewMessage viewMessage;

    public ControllersMessage(ViewMessage viewMessage, ModelMessage modelMessage){
        this.viewMessage = viewMessage;
        this.modelMessage = modelMessage;
        viewMessage.jbt_hello.addActionListener(this);
        viewMessage.jbt_bye.addActionListener(this);
        initView();
    }
   

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jbt_hello)
            btnHelloActionPerformed();
        else if(e.getSource()==viewMessage.jbt_bye)
            btnByeActionPerformed();
    }

    private void btnHelloActionPerformed(){
        modelMessage.setMessage("Hello from MVC");
        viewMessage.jl_message.setText(modelMessage.getmessage());
    }

    private void btnByeActionPerformed(){
        modelMessage.setMessage("Bye from MVC");
        viewMessage.jl_message.setText(modelMessage.getmessage());
    }

    public final void initView(){
        viewMessage.setTitle("Hello MVC");
        viewMessage.setLocationRelativeTo(null);
        viewMessage.jl_message.setText(modelMessage.getmessage());
        viewMessage.setVisible(true);
    }
}
