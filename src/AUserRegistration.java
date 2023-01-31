public class AUserRegistration {

    private String firstName;
    private int birthdayDate;
    private int monthOfBirthday;
    private int yearOfBirthday;
    private String email;
    private int phoneNumber;
    private String lastName;
    private int weight;
    private int pressure;
    int theNumberOfStepsTakenPerDay;
    private int age;


    public AUserRegistration(String firstName, int birthdayDate, int monthOfBirthday, int yearOfBirthday , String email, int phoneNumber, String lastName, int weight, int pressure, int theNumberOfStepsTakenPerDay, int age) {
        this.firstName = firstName;
        this.birthdayDate = birthdayDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.theNumberOfStepsTakenPerDay = theNumberOfStepsTakenPerDay;
        this.age = 2020 - yearOfBirthday ;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public int birthdayDate() {
        return this.birthdayDate;
    }
    public int monthOfBirthday() {
        return this.monthOfBirthday ;
    }
    public int yearOfBirthday() {
        return this.yearOfBirthday;
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

    public int getTheNumberOfStepsTakenPerDay() {
        return this.theNumberOfStepsTakenPerDay;

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
        this.theNumberOfStepsTakenPerDay = theNumberOFStepsTakenPerDay;
    }


       public void printAUserRegistrationInformation(){
        System.out.println(this);
    }
    @Override
    public String toString() {
return "AUserRegistrationInformation:\n" +
        "firstName " + this.firstName + "\n" +
       "birthdayDate " + this.birthdayDate + "\n" +
       "email " + this.email  + "\n" +
        "phoneNumber "+ this.phoneNumber  + "\n" +
       "lastName " + this.lastName + "\n" +
        " weight " +  this.weight+ "\n" +
        " pressure " +  this.pressure  + "\n" +
        "theNumberOFStepsTakenPerDay  " +  this.theNumberOfStepsTakenPerDay  + "\n" +
        " age " + this.age + "\n"  + "\n" ;


    }


}

