package com.java8.training.basic;

import com.java8.training.basic.com.java8.training.model.Article;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        List<Article> articles = loadArticles();

        Optional<Article> javaArticles = articles.stream().
                                         filter(article -> article.getTags().contains("java"))
                                         .findFirst();

        if(javaArticles.isPresent()){
            Article jArticle = javaArticles.get();
            System.out.println(" Java Aritcle : " + jArticle.getAuthor());
        }

      //  List<Article> allJavaArticles = articles.stream().
                                //        filter(article -> article.getTags().contains("java")).collect(Collectors.toList());

        articles.stream().filter(article -> article.getTags().contains("java")).
                forEach(System.out::println);

       long count = articles.stream().filter(article -> article.getTags().contains("java")).count();

        System.out.println("No of Java articles : " + count);

        articles.stream().filter(article -> article.getTags().contains("java")).

       // allJavaArticles.forEach(article -> System.out.println(article));
       // System.out.println(" Java Aritcle : " + javaArticles.get());

        //allJavaArticles.forEach(System.out::println);
    }

    private static List<Article> loadArticles(){

        return Arrays.asList(

                new Article("Spring Fundamentals","plural-sight", Arrays.asList("spring","spring-boot","java")),
                new Article("AmberJs","youtube", Arrays.asList("amberjs","javascript","spa")),
                new Article("React-Native","youtube", Arrays.asList("react-native","native-app")),
                new Article("Java Functional Programming","sabari", Arrays.asList("java","functional","streams","lambda")),
                new Article("Advanced Java","java code geeks", Arrays.asList("java","advanced")),
                new Article("Android Basics","java revisited", Arrays.asList("java","android","native-app")),
                new Article("IOS Apps Basics","ios forums", Arrays.asList("swift","ios","native-app")),
                new Article("ReactJs","react forum", Arrays.asList("reactjs","javascript","hybrid-app")),
                new Article("AngularJs","angular forum", Arrays.asList("angular","javascript","hybrid-app")),
                new Article("Python Advanced","python forum", Arrays.asList("python","advanced")),
                new Article("Python Basics","python forum", Arrays.asList("python","basic")),
                new Article("java multithreading","sabari", Arrays.asList("core","java","multi-threading"))
        );

    }


}
