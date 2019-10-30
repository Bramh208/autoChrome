package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class app {

    public static void main(String[] args){
        System.out.println("Hello World");
        JUnitCore core = new JUnitCore();
        Result result = core.run(com.testing.runners.Runner.class);

        System.out.println(result.getFailureCount());
    }
}
