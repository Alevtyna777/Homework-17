

public class Main {
    public static void main(String[] args) {
        AUserRegistration michael = new AUserRegistration("Michael", 18, 11, 1991, " Rosynskiy91@gmail.com", 7257531, "Rosynskiy",80, 84, 17000,29);
        michael.printAUserRegistrationInformation();

        AUserRegistration louis= new AUserRegistration("Louis", 1,12,1992, " Armstrong62@gmail.com", 7257531, "Armstrong",90, 93, 11000,28);
        louis.printAUserRegistrationInformation();
        AUserRegistration jimmy = new AUserRegistration(" Jimmy ",17,11,1993, " Hendrix60@gmail.com", 7257831, "Hendrix",85, 80, 23000,27 );
        jimmy.printAUserRegistrationInformation();
    }
}