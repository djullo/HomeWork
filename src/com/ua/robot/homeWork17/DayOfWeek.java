package com.ua.robot.homeWork17;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private final int numberDay;

    public int getNumberDay() {
        return numberDay;
    }

    DayOfWeek(int numberDays) {
        this.numberDay = numberDays;
    }

    public static DayOfWeek getDayOfWeek(int numberDays) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getNumberDay() == numberDays) {
                return dayOfWeek;
            }
        }
        return null;
    }
}
