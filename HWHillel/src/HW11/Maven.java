package com.hillel.hw;

//Установить java 14 и попробовать новый функционал - https://habr.com/ru/post/491546/\
//        Установить maven + прочитать приложенную статью MAVEN pdf
//        https://www.youtube.com/watch?v=0uwMKktzixU - видео про мавен

import java.util.Objects;

public class Maven {
    public record M_user(String name, int age) {
        public M_user {
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public int age() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            M_user m_user = (M_user) o;
            return age == m_user.age && Objects.equals(name, m_user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        static String sql = """ 
                 SELECT name, age 
                 FROM PERSON
                 WHERE name = 'Igor'
                   AND car='Niva'
                 """;
    }

    public static void main(String[] args) {
        System.out.println(M_user.sql + "/s");
        Object obj = "AlexaAlex";

        if (obj instanceof String s){
            System.out.println(s.length());
        }
    }
}
