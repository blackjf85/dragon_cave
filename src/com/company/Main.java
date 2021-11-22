package com.company;

public class Main {
    public static void main(String[] args) {

        Story.story();

        int choice = Choice.getChoice();

        Result.ending(choice);

    }
}
