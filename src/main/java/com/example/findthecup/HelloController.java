package com.example.findthecup;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class HelloController{
    public int lvl = 1;
    public Text prev = new Text();
    public int ballLocation = (int) getnewRound();
    public Text level = new Text();
    public Circle ball = new Circle(322,520,33);
    public void left(ActionEvent e) {
        if (ballLocation == 0){
            lvl++;
        }
        else{
            lvl--;
        }
        level.setText(String.valueOf(lvl));
        System.out.println("1");
        getnewRound();
    }

    public void middle(ActionEvent e) {
        if (ballLocation == 1){
            lvl++;
        }
        else{
            lvl--;
        }
        level.setText(String.valueOf(lvl));
        System.out.println("2");
        getnewRound();
    }

    public void right(ActionEvent e) {
        if (ballLocation == 2){
            lvl++;
        }
        else{
            lvl--;
        }
        level.setText(String.valueOf(lvl));
        System.out.println("3");
        getnewRound();
    }

    private Object getnewRound() {
        double x = Math.random()*2;
        ballLocation = (int) x;
        prev.setText(String.valueOf((ballLocation+1)));
        System.out.println((ballLocation+1)+"\n");
        changeBall();
        return ballLocation;
    }
    public void changeBall(){
        Circle ball = this.ball;
        switch(ballLocation+1){
            case(1):
        //ball.setCenterX(108);
                break;
            case(2):
        //ball.setCenterX(322);
                break;
            case(3):
        //ball.setCenterX(536);
                break;
            default:
        System.out.println("Error in Change ball switch");
        }
    }
    //*IMPORTANT*       Cup Animations

    int cuplocation;

    private ImageView CupWithBall;
    private ImageView Cup2;
    private ImageView Cup3;

   /* public Object CupTranslations(){
        TranslateTransition translate = new TranslateTransition();
        /*
         Extra Animations
        ------------------
         Moving Cup w/ball to ball location

        if(cuplocation != ballLocation) {
        if (cuplocation > ballLocation) {
           translate.setNode(CupWithBall);
        if(cuplocation - ballLocation == 1){
           translate.setByX(-214);
            }
        else{
           translate.setByX(-428);

            }
        }
            if (cuplocation < ballLocation) {
                translate.setNode(CupWithBall);
                if(ballLocation - cuplocation == 1){
                    translate.setByX(214);
                }else{
                    translate.setByX(428);

                }
            translate.play();
            }
        }
        return null;
    }
    */
}