import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    static ArrayList<Human> humans = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void displayAllHuman() {
        for (Human human : humans) {
            System.out.println(human);
        }

    }

    public static void displayBoy() {
        System.out.println("nhập giới tính bạn muốn hiển thị");
        String gender = "Boy";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals(gender)) {
                System.out.println();
            }

        }
    }

    public static void displayGirl() {
        System.out.println("nhập giới tính bạn muốn hiển thị");
        String gender = "Girl";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals(gender)) {
                System.out.println();
            }

        }

    }

    public static void displayAgelessThan20() {
        for (int i = 0; i <humans.size() ; i++) {
            if(humans.get(i).getAge()<20){
                System.out.println(humans.get(i));
            }

        }

    }

    public static void addHuman() {
        scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println();

    }

    public static void deleteByName() {

    }

    public static void editByName() {

    }

    public static void searchByName() {

    }
}
