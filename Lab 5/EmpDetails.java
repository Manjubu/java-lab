package com.cg.eis.exception;
public class EmpDetails{
public static void main(String[] args)
{
double salary=2000;
try
{
salEmp(salary);
}
catch(EmployeeException e)
{
System.out.println("Salary is less than 3000");
}
}
public static void salEmp(double salary) throws Employee Exception
{
if(salary<3000)
{
throw new EmployeeException();
}
else
{
System.out.println("Salary is greater to 3000");
}
}
}