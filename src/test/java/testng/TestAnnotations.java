package testng;

import org.testng.annotations.BeforeClass;

public class TestAnnotations {


    @BeforeClass
    void beforeClass(){
        System.out.println("Ant actions that you want to get happen before class");

    }



}
