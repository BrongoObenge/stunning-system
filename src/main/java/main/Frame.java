package main;

import javafx.scene.layout.Pane;
import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;
import visitor.VehicleVisitor;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Frame extends JFrame {

    public Frame(String title){
        super(title);
        // layout manager
        setLayout(new BorderLayout());
        //create Swing components
        JTextArea textarea = new JTextArea();
        JButton carButton = new JButton("car sound!");
        JButton boatButton = new JButton("Boat Sound");
        JButton planeButton = new JButton("Plane Sound");

        //Add swing components
        Container container = getContentPane();
        container.add(textarea, BorderLayout.CENTER);
        container.add(carButton, BorderLayout.SOUTH);
        container.add(boatButton, BorderLayout.EAST);
        container.add(planeButton, BorderLayout.WEST);

        carButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                VehicleVisitor visitor = new VehicleVisitor();
                Car audi = new Car("vroem, vroem");
                textarea.append(audi.accept(visitor)+ "\n");
                String path =  "http://images.dealer.com/ddc/resize/440x/quality/95/sharpen/1/ddc/ddc/vehicles/2016/Audi/Q3/SUV/perspective/front-left/2016_31.png";
                URL url;
                try {
                    url = new URL(path);
                    BufferedImage image = ImageIO.read(url);
                    JLabel label = new JLabel(new ImageIcon(image));
                    container.add(label);
                } catch (MalformedURLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }

        });

        boatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VehicleVisitor visitor = new VehicleVisitor();
                Boat boat = new Boat("Toet, toet");
                textarea.append(boat.accept(visitor)+ "\n");
            }
        });
        planeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VehicleVisitor visitor = new VehicleVisitor();
                Plane plane = new Plane("WOOOOOOOSHHHHH");
                textarea.append(plane.accept(visitor)+ "\n");
            }
        });
    }
}
