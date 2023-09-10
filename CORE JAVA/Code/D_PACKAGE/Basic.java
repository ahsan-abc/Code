/*
A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form.
1. built-in package 
2. user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql , applet etc.

-->The package keyword is used to create a package in java.
-->The import keyword is used to import package in java.

To Compile: javac -d . Basic.java
To Run: java pack.Basic

                  
 
 */
package pack;


  class Student 
 {

     private String name;
     private int roll;

     public void set (String name , int roll)
     {
         this.name = name;
         this.roll = roll;
     }
      
     public void get ()
     {
         System.out.println("Name = " + name);
         System.out.println("ROll = " + roll);
     }

     Student() {
         name = "no fill";
         roll = 0;

     }

 }