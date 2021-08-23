package com.example;

import static spark.Spark.get;

public class Api {

    public static void main(String[] args) {

        get("/hello", (request, response) -> "Hello world!");
    }
}