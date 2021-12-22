import java.util.Scanner;

public class MainHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();

        int choice;
        do {
            System.out.println("danh sách chọn");
            System.out.println("1. nhập tất cả mọi Người");
            System.out.println("2. nhập người giới tính nam");
            System.out.println("3. nhập người giới tính nữ");
            System.out.println("4. nhập ngưới dưới 20 tuổi");
            System.out.println("5. thêm người");
            System.out.println("6. xóa người theo tên");
            System.out.println("7. sửa người theo tên");
            System.out.println("8. hiển thị tất cả người theo tên nhập vào");
            System.out.println("0. thoát");

            System.out.print("Mời bạn nhập: ");

            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    Manage.displayAllHuman();
                    break;
                case 2:
                    Manage.displayBoy();
                    break;
                case 3:
                    Manage.displayGirl();
                    break;
                case 4:
                    Manage.displayAgelessThan20();
                    break;
                case 5:
                    Manage.addHuman();
                    break;
                case 6:
                    Manage.deleteByName();
                    break;
                case 7:
                    Manage.editByName();
                    break;
                case 8:
                    Manage.searchByName();
                    break;
            }
        } while (choice != 0);

    }
}