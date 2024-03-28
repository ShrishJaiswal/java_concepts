public class PersonMain {
    public static void main(String[] args) throws Exception {

        Person aliceObj = new Person("Alice", 25);
        Person bobObj = new Person("Bob", 30);
        
        getNameAndAge(aliceObj);
        getNameAndAge(bobObj);
    }

    public static void getNameAndAge(Person person){
        System.out.println("Name: "+person.getName()+" and age is: "+person.getAge());
    }
}
