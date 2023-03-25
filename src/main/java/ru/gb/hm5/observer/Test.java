package ru.gb.hm5.observer;

import java.util.Observable;

public class Test {
    public static void main(String[] args) {


        JobSeeker bob = new JobSeeker("Bob");
        JobSeeker lu = new JobSeeker("Lu");

        EmploymentAgency jobPostings = new EmploymentAgency();

        jobPostings.addObserver(bob);
        jobPostings.addObserver(lu);



        jobPostings.addJob(new JobPost("Developer"));

    }
}
