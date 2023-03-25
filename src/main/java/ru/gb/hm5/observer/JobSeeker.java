package ru.gb.hm5.observer;


import java.util.Observer;
import java.util.Observable;

public class JobSeeker implements Observer {

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(arg instanceof JobPost) {
            JobPost jobPost = (JobPost) arg;
            System.out.println("Hi " + this.name + "! New job posted: " + jobPost.getTitle());
        }
    }
}
