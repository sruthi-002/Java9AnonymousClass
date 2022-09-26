package com.company;
abstract class  Classes<T>{
    abstract T add(T a,T b);
}
public class Main {
    public static void main(String[] args) {
        Classes<String> a = new Classes<String>(){
            String add(String a,String b){
                return a+b;
            }
        };
        String result = a.add("Java","9");
        System.out.println(result);
    }
}
