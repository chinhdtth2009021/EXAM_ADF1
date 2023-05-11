package com.company;

import java.time.Month;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday() {
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
// inSameMonth so sánh đối tượng trong holiday có cùng tháng hay không
//
    public boolean inSameMonth(Holiday holiday) {
        return this.month.equals(holiday.month);
    }
//tính trung bình ngày nghỉ của một mảng ngày nghỉ được thêm vào
    public static double avgDate(Holiday[] holidays) {
        int totalDate = 0;
        for (Holiday holiday : holidays) {
            totalDate += holiday.day;
        }
        return (double) totalDate / holidays.length;
    }

}
