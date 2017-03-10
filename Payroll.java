public class Payroll
{
  
    private final int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    //Setters

    public void setHours(int hoursIn, int indexIn)
    {
        hours[indexIn] = hoursIn;
    }

 
    public void setPayRate(double rateIn, int indexIn)
    {
        payRate[indexIn] = rateIn;
    }


    public void setWages(double wageIn, int indexIn)
    {
        wages[indexIn] = wageIn;
    }

    //Getters
  
    public int getHours(int indexIn)
    {
        return hours[indexIn];
    }

   
    public double getPayRate(int indexIn)
    {
        return payRate[indexIn];
    }


    public double getWages(int indexIn)
    {
        return wages[indexIn];
    }


    public int getEmployeeId(int indexIn)
    {
        return employeeId[indexIn];
    }

    public int getNumEmployees()
    {
        return employeeId.length;
    }

 
    public double getGrossPay(int idIn)
    {
        int index = 0;
        boolean found = false;
        //find employee
        for(int i=0; i < employeeId.length; i++)
        {
             if(employeeId[i] == idIn)
             {
                 index = i;
                 found = true;
             }
        }
        if(!found)
        {
            System.out.println("Employee Id doesn't match records.");
            return -1;
        }
        else
        {
            //calc pay
            setWages((getPayRate(index) * getHours(index)), index);
            return getWages(index);
        }

    }
}   