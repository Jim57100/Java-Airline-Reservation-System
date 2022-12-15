public class Airline {
  
  Person[] people;
  // createReservation();
  
  /**
   * Constructor
   */
  public Airline() {
    this.people = new Person[11];
  }

  public Person getPerson(int index) {
    return new Person(this.people[index]);
  }

  public void setPerson(Person person) {
    int index = person.getSeatNumber() - 1;
    this.people[index] = new Person(person);
  }
 
  public void createReservation(Person person) {
    
    while( this.people[person.getSeatNumber() - 1] != null) {
      System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
      person.chooseSeat();
    }
    
    int index = person.getSeatNumber() - 1;
    this.people[index] = new Person(person);
    System.out.println("Thank you " + person.getName() + "for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n"); 
  }
}
