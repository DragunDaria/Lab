public class Main1 {
    public static void main(String[] args) {
        PassengerAircraft plane1 = new PassengerAircraft("Boeing 737", 150, 5000.0);
        PassengerAircraft plane2 = new PassengerAircraft("Airbus A320", 180, 4800.0);
        CargoAircraft cargoPlane = new CargoAircraft("Boeing 747 Cargo", 0, 25000.0);

        Airline airline = new Airline();
        airline.addAircraft(plane1);
        airline.addAircraft(plane2);
        airline.addAircraft(cargoPlane);

        // Сериализация авиакомпании
        airline.serialize("airline.ser");

        // Десериализация авиакомпании
        Airline deserializedAirline = Airline.deserialize("airline.ser");

        if (deserializedAirline != null) {
            int totalPassengerCapacity = deserializedAirline.getTotalPassengerCapacity();
            double totalCargoCapacity = deserializedAirline.getTotalCargoCapacity();

            System.out.println("Общая вместимость авиакомпании: " + totalPassengerCapacity + " пассажиров");
            System.out.println("Общая грузоподъемность авиакомпании: " + totalCargoCapacity + " кг");

        }
    }
}
