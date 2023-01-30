public class AUserRegistration {

    private String firstName;
    private int birthdayDate;
    private String email;
    private int phoneNumber;


    public AUserRegistration(String firstName, int birthdayDate, String email, int phoneNumber) {
        this.firstName = firstName;
        this.birthdayDate = birthdayDate;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    private String lastName;
    private int weight;
    private int pressure;
    int theNumberOFStepsTakenPerDay;
    private int age;

    public void AUserRegistrationVariableParameters(String lastName, int weight, int pressure, int theNumberOFStepsTakenPerDay) {
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.theNumberOFStepsTakenPerDay = theNumberOFStepsTakenPerDay;
        this.age = 2020;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int birthdayDate() {
        return this.birthdayDate;
    }

    public String getEmail() {
        return this.email;
    }

    public int phoneNumber() {
        return this.phoneNumber;

    }


    public int getWeight() {
        return this.weight;
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getTheNumberOFStepsTakenPerDay() {
        return this.theNumberOFStepsTakenPerDay;

    }

    public int getAge() {
        return this.age = 2020;
    }

    public void setLastName(String LastName){
        this.lastName =lastName;

}
    public void setWeight(String weight) {
        this.weight = weight;

    }
    public void setTheNumberOFStepsTakenPerDay(String heNumberOFStepsTakenPerDay) {
        this.theNumberOFStepsTakenPerDay = theNumberOFStepsTakenPerDay;
    }


       public void printAUserRegistrationInformation(){
        System.out.println("Display current parameters specifed by a user");
    }
}

