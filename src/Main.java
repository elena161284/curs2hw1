import java.util.Arrays;

public class Main {
            public static void main(String[] args) {
                int value = 33;
                changeValue(value);
                System.out.println(value);

                Integer value1 = 33;
                changeValue(value1);
                System.out.println(value1);

                Integer[] arr = new Integer[]{3, 4};
                changeValue(arr);
                System.out.println(Arrays.toString(arr));

                changeValue1(arr);
                System.out.println(Arrays.toString(arr));

                Person person = new Person("Lyapis", "Trubetskoy");
                changePerson(person);
                System.out.println(person);

                changePersonName(person);
                System.out.println(person);
            }

            public static void changeValue(int value) {
                value=22;
            }
            public static void changeValue(Integer value) {
                value = 22;
            }
            public static void changeValue(Integer[] value) {
                value = new Integer[]{1, 2};
            }
            public static void changeValue1(Integer[] value) {
                value[0] = 99;
            }
            public static void changePerson(Person person) {
                person = new Person("Ilya", "Lagutenko");
            }
            public static void changePersonName(Person person) {
                person.setName("Ilya");
                person.setSurName("Lagutenko");
    }
            }