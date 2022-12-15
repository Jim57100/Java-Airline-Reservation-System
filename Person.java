import java.util.Arrays;

public class Person {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;
  String[] passport;
  
  public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber; 
    this.passport = new String[3];
  }

  public Person(Person source) {
    this.name = source.name;
    this.nationality = source.nationality;
    this.dateOfBirth = source.dateOfBirth;
    this.seatNumber = source.seatNumber;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getSeatNumber() {
    return this.seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public String[] getPassport() {
    return Arrays.copyOf(this.passport, this.passport.length);
  }

  public void setPassport() {
    this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
  }


  /**************** METHODS ******************/
  
  /**
   * Function name: applyPassport
   * @return boolean
   */
  public boolean applyPassport() {
    int number = (int) (Math.random() * 2);
    boolean validation;
    switch(number) {
      case 0: validation = false; break;
      case 1: validation = true; break;
      default: validation = false; break;
    }
    return validation;
  }

  /**
   * function name: chooseSeat
   * @return void
   */
  public void chooseSeat() {
    this.seatNumber = (int) (Math.random() * 11 + 1);
  };

  public String toString() {
    return "Name: " + this.name + "\n"
    +  "Nationality: " + this.nationality + "\n"
    +  "Date of Birth: " + this.dateOfBirth + "\n"
    +  "Seat Number: " + this.seatNumber + "\n"
    +  "Passport: " + Arrays.toString(this.passport) + "\n";
  }
}