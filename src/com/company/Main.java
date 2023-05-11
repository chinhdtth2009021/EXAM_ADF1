package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//kiểu nhập thẳng vào hàm và in ra trực tiếp
        Holiday giotohungvuong = new Holiday("Giỗ tổ hùng vương", 10, "Tháng 3");
        System.out.println("Tên ngày lễ là : " + giotohungvuong.getName());
        System.out.println("Ngày : " + giotohungvuong.getDay());
        System.out.println("Tháng : " + giotohungvuong.getMonth());

//        mảng  nhập ngày nghỉ
        Holiday[] arraylist = {
                new Holiday("Ngày lễ giáng sinh ", 25, "Tháng 12"),
                new Holiday("Ngày tết dương lịch ", 1, "Tháng 1"),
                new Holiday("Ngày quốc khánh", 30, "Tháng 4"),
        };

        Holiday holiday1 = arraylist[0];
        Holiday holiday2 = arraylist[1];

        System.out.println("Ngày nghỉ cùng tháng : " + holiday1.inSameMonth(holiday2)); //gọi đến hàm so sánh
        System.out.println("ngày nghỉ trung bình : " + Holiday.avgDate(arraylist));// gọi đến hàm tính trung bình ngày nghỉ
    }
}
