package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMeasurableContainer Interface");

        ContainerManager manager = new ContainerManager();
        manager.add( new Box(.4,0.2,0.3,2.55));
        manager.add( new Cylinder(.5,.8,1.50));

        double totalWeight = manager.totalWeight();
        System.out.println("Total weight = " + totalWeight);

        double totalRectangularVolume = manager.totalRectangularVolume();
        System.out.println("Total volume = " + totalRectangularVolume);

    }
}