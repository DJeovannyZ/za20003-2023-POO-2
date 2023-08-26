package ues.za20003;

public class App {
    public static void main(String[] args) {

        Pet dog = new Pet(2, 4.5, 35.4, "Perro");
        Record dogRecord = new Record("Julian", "Parvo Virus");
        double costDogAppointment = Utility.calculateCost(dog.getAge());
        Appointment dogAppointment = new Appointment(dog, dogRecord, costDogAppointment);
        System.out.println(dogAppointment);
        System.out.println();

        Pet cat = new Pet(5, 2.3, 22, "Gato");
        Record catRecord = new Record("Alberto", "Desnutricion");
        double costCatAppointment = Utility.calculateCost(cat.getAge());
        Appointment catAppointment = new Appointment(cat, catRecord, costCatAppointment);
        System.out.println(catAppointment);
        System.out.println();

        Pet turtle = new Pet(15, 5.4, 12.2, "Tortuga");
        Record turtleRecord = new Record("Julieta", "Parasitos");
        double costTurtleAppointment = Utility.calculateCost(turtle.getAge());
        Appointment turtleAppointment = new Appointment(turtle, turtleRecord, costTurtleAppointment);
        System.out.println(turtleAppointment);

    }
}
