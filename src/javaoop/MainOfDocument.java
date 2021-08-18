package javaoop;

import java.util.ArrayList;
import java.util.Scanner;
public class MainOfDocument {
    public static void main(String[] args) {
        // Quản lý danh sách thư viện.
        ArrayList<Document> documentArrayList = new ArrayList<>();
        // Quản lý danh sách Sách.
        ArrayList<Book> bookArrayList = new ArrayList<>();
        int choose;
        Scanner sc = new Scanner (System.in);
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    int n;
                    System.out.println("Enter Number Book: ");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Book B = new Book();
                        B.getInforBook();

                        //Lưu danh sách Sách vào
                        bookArrayList.add(B);
                    }
                    break;
                case 2:
                    for(Book B : bookArrayList){
                        B.displayBook();
                    }
                    break;
                case 3:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.err.println("Enter Error");
            }

        }while (choose !=3);
    }
    static void showMenu(){
        System.out.println("Chọn 1.Nhập thông tin sách: ");
        System.out.println("Chọn 2.Hiển thị tất cả sách ra màn hình");
        System.out.println("Chọn 3.Thoát");
    }
}
