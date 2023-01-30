

public class Main {
    public static void main(String[] args) {
        AUserRegistration michael = new AUserRegistration("Michael", "18,11,1991", " Rosynskiy91@gmail.com", "+15049367531", 80, "75, 110", 15000);
        michael.printAUserRegistrationInformation();
        michael.setEmail(" Rosynskiy91@gmail.com");
        michael.setPressure(75,100);


        AUserRegistration louis= new AUserRegistration("Louis", "01,12,1962", " Armstrong62@gmail.com", "+15049257531", 90, "93, 130", 11000);
        louis.printAUserRegistrationInformation();
        AUserRegistration jimmy = new AUserRegistration(" Jimmy ","17,11,1960", " Hendrix60@gmail.com", "+15049367831", 85, "87, 120", 23000 );
        jimmy.printAUserRegistrationInformation();
    }
}