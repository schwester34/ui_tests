package tests;

import com.github.javafaker.Faker;

public class TestData {

    public static Faker faker = new Faker();
    public static final String RANDOM_BOOK = faker.book().title();

    public static final String CRIME_AND_PUNISHMENT_TITLE = "Преступление и наказание";
    public static final String CRIME_AND_PUNISHMENT_AUTHOR = "Достоевский Федор Михайлович";

    public static final String EXPECTED_TITLE = "Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры";

}
