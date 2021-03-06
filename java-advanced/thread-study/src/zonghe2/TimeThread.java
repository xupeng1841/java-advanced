package zonghe2;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread{
    private JLabel timeLabel;
    public void setTimeLabel(JLabel timeLabel){
        this.timeLabel = timeLabel;
    }
    @Override
    public void run(){
        while (true){
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("澳  门  风  云  "+"              " +
                    "              " +
                    "                  " +
                    "                   "+"yyyy-MM-dd hh:mm:ss    ");
            timeLabel.setText(String.valueOf(simpleDateFormat.format(date)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
