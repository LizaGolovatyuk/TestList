package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class ListTestingTime {
    private List<Double> list;
    final int testingCount =7000;

    /**
     * Конструктор, инициализирующий поле list
     * @param list
     */
    public ListTestingTime(List<Double> list){
        this.list=list;
    }

    /**
     * Метод, подсчитывающий время выполнения метода Add для testingCount запусков
     * @return время выполнения
     */
    public long AddTestingTime(){
        int tmp1=0,tmp2 = 0;
        double element;
        long time=0;
        Instant time1, time2;
        element = Math.random();
        time1 = Instant.now();
        while(tmp1<4) {
            while (tmp2 < testingCount) {
                list.add(element);
                tmp2++;
            }
            time2 = Instant.now();
            time = time+ Duration.between(time1, time2).toNanos();
            tmp1++;
        }
        time=time/4;
        return time;
    }

    /**
     * Метод, подсчитывающий время выполнения метода Get для testingCount запусков
     * @return время выполнения
     */
    public long GetTestingTime(){
        long time = 0;
        if(!list.isEmpty() && list.size()>= testingCount) {
            int tmp1 = 0, tmp2 = 0, index = 0;
            Instant time1, time2;
            double element;
            time1 = Instant.now();
            while (tmp1 < 4) {
                while (tmp2 < testingCount) {
                    element = list.get(index);
                    tmp2++;
                    index++;
                }
                time2 = Instant.now();
                time = time + Duration.between(time1, time2).toNanos();
                tmp1++;
            }
        }
        time=time/4;
        return time;
    }

    /**
     * Метод, подсчитывающий время выполнения метода Remove для testingCount запусков
     * @return  время выполнения
     */
    public long RemoveTestingTime() {
        long time = 0, time_middle=0;
        if (!list.isEmpty() && list.size() >= testingCount) {
            int tmp1 = 0, tmp2=0;
            Instant time1, time2;
            double element;
            while (tmp1 < 4) {
                while (tmp2 < testingCount) {
                    element = list.get(0);
                    time1 = Instant.now();
                    list.remove(element);
                    time2 = Instant.now();
                    time = time + Duration.between(time1, time2).toNanos();
                    tmp2++;
                }
                time_middle=time_middle+time;
                tmp1++;
            }
        }
        time_middle=time_middle/4;
        return time;
    }

    /**
     * Метод, подсчитывающий время выполнения метода Set для testingCount запусков
     * @return время выполнения
     */
    public long SetTestingTime(){
        int tmp1 = 0, tmp2=0;
        double element;
        long time = 0;
        Instant time1, time2;
        element = Math.random();
        time1 = Instant.now();
        while (tmp1 < 4) {
            while (tmp2 < testingCount) {
                list.set(0, element);
                tmp2++;
            }
            time2 = Instant.now();
            time = time + Duration.between(time1, time2).toNanos();
            tmp1++;
        }
        time=time/4;
        return time;
    }

    /**
     * Метод, подсчитывающий время выполнения метода IndexOf для testingCount запусков
     * @return время выполнения
     */
    public long IndexOfTestingTime() {
        long time = 0;
        if (!list.isEmpty() && list.size() >= testingCount) {
            int tmp1 = 0, tmp2=0;
            Instant time1, time2;
            double element = list.get(0);
            time1 = Instant.now();
            while (tmp1 < 4) {
                while (tmp2 < testingCount) {
                    list.indexOf(element);
                    tmp2++;
                }
                time2 = Instant.now();
                time = time + Duration.between(time1, time2).toNanos();
                tmp1++;
            }
        }
        time=time/4;
        return time;
    }

    /**
     * Метод, подсчитывающий время выполнения метода Contains для testingCount запусков
     * @return время выполнения
     */
    public long ContainsTestingTime() {
        long time = 0, time_middle=0;
        if (!list.isEmpty() && list.size() >= testingCount) {
            int tmp1 = 0, tmp2=0;
            boolean check;
            Instant time1, time2;
            double element = list.get(0);
            while (tmp1 < 4) {
                while (tmp2 < testingCount) {
                    time1 = Instant.now();
                    check = list.contains(element);
                    time2 = Instant.now();
                    time = time + Duration.between(time1, time2).toNanos();
                    tmp2++;
                }
                time_middle=time_middle+time;
                tmp1++;
            }
        }
        time_middle=time_middle/4;
        return time;
    }
}
