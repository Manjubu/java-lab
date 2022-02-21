package com.Exception;

public class ValidateName
{
public static void main(String[] args)
{
String firstName="gfgjj";
String lastname="";
String fullName=firstName.concat(lastName);
if(firstName=="" && lastName=="")
{
System.out.println(fullName);
}
try
{
empName( firstName, lastName);
}
catch(NameValidateException e)
{
System.out.println("FIRSTNAME AND LAST NAME SHOULD NOT BE EMPTY");
}
}

public static void empName(String firstName,String lastName) throws NameValidateException
{

if(firstName=="" || lastName=="") {
  throw new NameValidateException();
}
else
{
System.out.println("FirstName And LastName Filled Successfully"):
}
}
}
