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

    public AUserRegistration(String michael, String s, String email, String s1, int i, String s2, int i1) {
    }


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
    public void setWeight(int weight) {
        this.weight = weight;

    }
    public void setTheNumberOFStepsTakenPerDay(int theNumberOFStepsTakenPerDay) {
        this.theNumberOFStepsTakenPerDay = theNumberOFStepsTakenPerDay;
    }


       public void printAUserRegistrationInformation(){
        System.out.println("Display current parameters specifed by a user");
    }
    @Override
    public String toString() {
return "AUserRegistrationInformation:\n" +
        "firstName" + this.firstName + "\n" +
       "birthdayDate" + this.birthdayDate + "\n" +
       "email" + this.email  + "\n" +
        "phoneNumbe"+ this.phoneNumber  + "\n" +
       "lastName " + this.lastName + "\n" +
        " weight" +  this.weight+ "\n" +
        " pressure" +  this.pressure  + "\n" +
        "theNumberOFStepsTakenPerDay  " +  this.theNumberOFStepsTakenPerDay  + "\n" +
        " age " + this.age + "\n" + "\n" ;


    }

    public void setEmail(String s) {
    }

    public void setPressure(int i, int i1) {
    }
}

