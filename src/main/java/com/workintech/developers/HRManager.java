package com.workintech.developers;

import java.util.Arrays;

// HRManager sınıfı Employee'den miras alıyor
public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    // HRManager yapıcı metodu
    public HRManager(long id, String name, Double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    // JuniorDeveloper ekleme metodu
    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    // MidDeveloper ekleme metodu
    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    // SeniorDeveloper ekleme metodu
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full, some record exists!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager started working.");
    }


    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
