package com.keyword;

class School
{
    int roll_no;         //Following all are default variables in Class School
    String Name;
    String School;
    public void Display()
    {
        System.out.println(roll_no+" "+Name+" "+School);
    }

}

public class DefaultAsVariable
{
    public static void main(String[] args)
    {
        School student = new School();
        student.Display();//Default values are executed if we did not assign any values
    }
}
