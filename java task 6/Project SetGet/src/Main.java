public class Main {
    public static void main(String[] args) {
        System.out.println("______SetGet______");
        System.out.println();

        class Person {
            private String firstname;
            private String lastname;
            private int age;

            public void set_Name(String firstname, String lastname) {
                this.firstname = firstname;
                this.lastname = lastname;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void get_Name() {
                System.out.println(this.firstname+" "+this.lastname);
            }

            public void getAge() {
                System.out.println(this.age);
            }
        }

        Person person1 = new Person();

        person1.set_Name("Sathiya", "Priya");
        person1.setAge(38);

        person1.get_Name();
        person1.getAge();

    }
}