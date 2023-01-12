/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Define a class "People", there are three parameters: "String name", "int age" and
 * "String gender", you can define them with keywords "public" and "private", so that
 * users can access "name" anywhere in class, but will have a compile-time error message
 * if they want to access "gender" and "age".
 *
 * Write a method getName() in class People, and call it in "main" to print member1 and
 * member2' names.
 *
 * Input: None
 * Output: all members' names.
 *
 */

public class Q3_People {

    //you can modify class People to finish the question
    static class People {
        public static String name;
        private static int age;
        private static String gender;

        static void getName(String Name1, String Name2) {
            name = Name1;
            System.out.println("Member1 name:" + name);

            name = Name2;
            System.out.println("Member2 name:" + name);
        }

        public static void Define(String n_ame, int Age, String gen) {
            name = n_ame;
            age = Age;
            gender = gen;
        }
        /*
    //Changed version
    static class People{
        public String name;
        private int age;
        private String gender;

        public void get_Name(String ){
            System.out.println("Name:" + name);
        }

        public People(String _name, int _age, String _gender) {
            name = _name;
            age = _age;
            gender = _gender;
        }
        */

    }
        public static void main(String[] args) {
            // define two members with following information
            // name:"Jack", age:19, gender:"Male";
            // name:"Rose", age:18, gender:"Female"

            Define ("Jack", 19, "Male");
            Define ("Rose", 18, "Female");

            getName("Jack","Rose");

            /*
            //Changed version
            People jack;
            jack = new People("Jack", 19, "Male");
            People rose;
            rose = new People("Rose", 18, "Female");
            get_Name("Jack");
            */
        }

    }

