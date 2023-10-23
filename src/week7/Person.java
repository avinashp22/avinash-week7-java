package week7;
public class Person {

String firstName;
String lastName;
int age;

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public int getAge() {return age;}

    public String setFirstName(String firstName){firstName=firstName;return firstName;}

    public String setLastName(String lastName){lastName=lastName;return lastName;}

    public int setAge(int age){
        if (age >= 0 && age <=100){
           return age = age;
    }       else
    return age;
        }


    public boolean isTeen(){
    if (getAge() >12 && getAge() <20){
      return true;
    } else
        return false;
    }

       public String getFullName(){
       if (firstName.isEmpty()) {
           return firstName;
       }else if (lastName.isEmpty()){
           return lastName;

       }

String fullName = (firstName + " " + lastName);
return fullName;

        }


    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }



    }