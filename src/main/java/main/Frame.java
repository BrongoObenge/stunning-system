package main;

import decorator.BusinessPackage;
import decorator.NewCar;
import decorator.PlainCar;
import decorator.SportPackage;
import factory.Audi;
import factory.AudiFactory;
import iterator.CoolAndHipIterator;
import iterator.datastructures.AArray;
import iterator.datastructures.AList;
import iterator.datastructures.AMap;
import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;
import visitor.VehicleVisitor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    private AList<Audi> alist = fillList();
    private AArray<Audi> aArray = fillArray();
    private AMap<Integer, Audi> aMap = fillMap();

    public AMap<Integer, Audi> fillMap() {
        AMap<Integer, Audi> map = new AMap<Integer, Audi>();
        map.add(1, new AudiFactory().getAudi("A5"));
        map.add(2, new AudiFactory().getAudi("A3"));
        map.add(3, new AudiFactory().getAudi("A3"));
        map.add(4, new AudiFactory().getAudi("A5"));
        return map;
    }
    public AArray<Audi> fillArray() {
        AArray<Audi> arr = new AArray<Audi>();
        arr.add(new AudiFactory().getAudi("A5"));
        arr.add(new AudiFactory().getAudi("A5"));
        arr.add(new AudiFactory().getAudi("A3"));
        return arr;
    }
    public AList<Audi> fillList(){
        AList<Audi> list = new AList<Audi>();

        list.add(new AudiFactory().getAudi("A5"));
        list.add(new AudiFactory().getAudi("A3"));
        list.add(new AudiFactory().getAudi("A3"));
        list.add(new AudiFactory().getAudi("A5"));
        return list;

    }
    public Frame(String title){

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame("Software Engineering 2");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(900,900);

                JTextArea textarea = new JTextArea();
                JPanel jpanelNorth = new JPanel(new GridLayout());
                JPanel jpanelSouth = new JPanel(new GridLayout());

                JPanel jPanelwest = new JPanel(new GridLayout());
                JButton giveCars = new JButton("AllCars IteratorFactoryTest");
                jPanelwest.add(giveCars);


                JButton carsound = new JButton("Car sound");
                jpanelNorth.add(carsound);
                JButton boatsound = new JButton("Boat sound");
                jpanelNorth.add(boatsound);
                JButton planesound = new JButton("Plane Sound");
                jpanelNorth.add(planesound);
                JButton sportPackage  = new JButton("audi with sportpackage");
                jpanelSouth.add(sportPackage);
                JButton SportAndBusinessPackage = new JButton("Car with sports+businesspackage");
                jpanelSouth.add(SportAndBusinessPackage);

                giveCars.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Audi a;
                        CoolAndHipIterator<Audi> aListIterator = alist.getIterator();
                        CoolAndHipIterator<Audi> aArrayIterator = aArray.getIterator();
                        CoolAndHipIterator<Audi> aMapIterator = aMap.getIterator();

                        int index = 1;

                        System.out.println("\n==ListIterator==");
                        while(aListIterator.hasNext()){
                            a = aListIterator.getCurrent().get();
                            textarea.append(index+ "|LIST| " +a.getDescription()+"\n");
                            aListIterator.moveNext();
                            index++;
                        };

                        System.out.println("\n==ArrayIterator==");
                        while(aArrayIterator.hasNext()){
                            a = aArrayIterator.getCurrent().get();
                            textarea.append(index+ "|ARR| " +a.getDescription()+"\n");
                            aArrayIterator.moveNext();
                            index++;
                        };
                        System.out.println("\n==MapIterator==");
                        while(aMapIterator.hasNext()){
                            a = aMapIterator.getCurrent().get();
                            textarea.append(index+ "|MAP| " +a.getDescription()+"\n");
                            aMapIterator.moveNext();
                            index++;
                        };


                    }

                });



                carsound.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        VehicleVisitor visitor = new VehicleVisitor();
                        Car audi = new Car("vroem, vroem");
                        System.out.println("");
                        textarea.append(audi.accept(visitor)+ "\n");

                    }

                });

                boatsound.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        VehicleVisitor visitor = new VehicleVisitor();
                        Boat shgip = new Boat("Toet, Toet");
                        textarea.append(shgip.accept(visitor)+ "\n");

                    }

                });
                planesound.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        VehicleVisitor visitor = new VehicleVisitor();
                        Plane airbus= new Plane("Toet, Toet");
                        textarea.append(airbus.accept(visitor)+ "\n");

                    }

                });
                planesound.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        VehicleVisitor visitor = new VehicleVisitor();
                        Plane airbus= new Plane("Toet, Toet");
                        textarea.append(airbus.accept(visitor)+ "\n");

                    }

                });

                sportPackage.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        NewCar newcar = new SportPackage(new PlainCar());
                        textarea.append("Your car has the following options: " + newcar.getOptions() + "\n" + "The total cost of your vehicle is: " + newcar.getPrice() +"\n");

                    }

                });

                SportAndBusinessPackage.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        NewCar newcar = new BusinessPackage(new SportPackage(new PlainCar()));
                        textarea.append("Your car has the following options: " + newcar.getOptions() + "\n" + "The total cost of your vehicle is: " + newcar.getPrice() +"\n");

                    }

                });

                frame.add(jpanelNorth, BorderLayout.NORTH);
                frame.add(jpanelSouth, BorderLayout.SOUTH);
                frame.add(textarea, BorderLayout.CENTER);
                frame.add(jPanelwest, BorderLayout.WEST);
                frame.pack();

            }
        });
    }



}
