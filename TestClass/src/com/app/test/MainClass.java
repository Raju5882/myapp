package com.app.test;

public class MainClass
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
             
            if(i == 15)
            {
                break;
            }
        }
    }
}