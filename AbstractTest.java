abstract class Employee
{
    private String name;
    private long aadhaarNumber;
    
    public abstract double earnings();

    
    public Employee(String name, long aadhaarNumber)
    {
        this.set_name(name);
        this.set_aadhaar(aadhaarNumber);
    }    
    public void set_name(String name)
    {
        this.name=name;    
    }
    public void set_aadhaar(long aadhaarNumber)
    {
        this.aadhaarNumber=aadhaarNumber;    
    }

    public String get_name()
    {
        return this.name;
    }
    public long get_aadhaar()
    {
        return this.aadhaarNumber;
    }
}

class CommissionEmployee extends Employee
{
private double grossSales;
private double commissionRate;

public double earnings()
{
    return grossSales*commissionRate/100;
}

public CommissionEmployee(String name,long aadhaarNumber,double grossSales,double commissionRate)
{
    super(name,aadhaarNumber);    
    this.set_grossSales(grossSales);
    this.set_commissionRate(commissionRate);
}
public void set_grossSales(double grossSales)
{
    this.grossSales=grossSales;
}
public void set_commissionRate(double commissionRate)
{
    this.commissionRate=commissionRate;
}
public double get_grossSales()
{
    return this.grossSales;
}
public double get_commissionRate()
{
    return this.commissionRate;
}

}

class BasePlusCommissionEmployee extends CommissionEmployee
{
private double baseSalary;

public BasePlusCommissionEmployee(String name,double grossSales,double commissionRate, double baseSalary)
{
    super(name,grossSales,commissionRate);
    this.set_baseSalary(baseSalary);
}

public void set_baseSalary(double baseSalary)
{
    this.baseSalary=baseSalary;
}
public double get_baseSalary()
{
    return this.baseSalary;
}

public double earnings()
{
    return get_grossSales() * get_commissionRate() * baseSalary/100;
}

}

class SalariedEmployee extends Employee
{
    private double weeklySalary;
    
    public SalariedEmployee(String name, long aadhaarNumber,double weeklySalary)
    {
        super(name,aadhaarNumber);
        this.set_weeklySalary(weeklySalary);
    }
    
    public void set_weeklySalary(double weeklySalary)
    {
        this.weeklySalary=weeklySalary;    
    }
    
    public double get_weeklySalary()
    {
        return this.weeklySalary;    
    }
    
}

class HourlyEmployee extends Employee
{
    private double hours;
    private double wages;
    
    public HourlyEmployee(String name, long aadhaarNumber, double hours, double wages)
    {
        super(name,aadhaarNumber);
        this.set_hours(hours);
        this.set_wages(wages);
    }
    
    public void set_wages(double wages)
    {
        this.wages=wages;    
    }
    public void set_hours(double hours)
    {
        this.hours=hours;    
    }
    public double get_wages()
    {
        return this.wages;    
    }
    public double get_hours()
    {
        return this.hours;    
    }
    
    public double earnings()
    {
        if(hours>40)
        {
            double temp;
            temp=(hours-40)*wages*1.5;
            return temp+(40*wages);
        }
        else
        {
            return hours*wages;    
        }    
    }
}

public class AbstractTest
{
public static void main(String args[])
{
    CommissionEmployee ce = new CommissionEmployee("Mihir",123456789,5000,5);
    System.out.println(ce.get_name());
    System.out.println(ce.get_grossSales());
    System.out.println(ce.get_commissionRate());
    System.out.println(ce.earnings());
    System.out.println(ce.get_aadhaar());
    
    BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Raj",10000,7,7000);
    
}
}
