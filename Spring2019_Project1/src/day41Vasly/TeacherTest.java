package day41Vasly;

public class TeacherTest {

	  private String name;
	  private int age;
	  private long ssn;
	  private int batchNumber;
	  private String specialty;

	  // provide setters and getters
	  // create method print info
	  public String getName() {
	    return name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public long getSsn() {
	    return ssn;
	  }

	  public int getBatchNumber() {
	    return batchNumber;
	  }

	  public String getSpecialty() {
	    return specialty;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public void setSsn(long ssn) {
	    this.ssn = ssn;
	  }

	  public void setBatchNumber(int batchNumber) {
	    this.batchNumber = batchNumber;
	  }

	  public void setSpecialty(String specialty) {
	    this.specialty = specialty;
	  }

	  @Override
	  public String toString() {
	    return "name: " + getName() + "\nage: " + getAge() + "\nSSN: " + getSsn() + "\nbatch number: "
	        + getBatchNumber() + "\nspecialty: " + getSpecialty();
	  }
	}