import java.util.Scanner;

public class HomeWork15PersonInfo {

    public static void main(String[] args) {
        Person person = new Person();

        String[] names = {"Will ", "Jackie ", "Sherlock "};
        String[] surName = {"Smith", "Chan", "Holmes"};
        String[] city = {"New York", "Shanghai", "London"};
        long[] phone = {15551234567L, 442071234567L, 61361234567L};

        for (int i = 0; i < names.length; i++) {
            Person.personInfoStatic(names[i], surName[i], city[i], phone[i]);
            person.personInfo(names[i], surName[i], city[i], phone[i]);
        }
    }
}
