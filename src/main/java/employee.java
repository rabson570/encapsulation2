public class employee {
    private int base_salary;
    private int hourly_rate;

    public int calculating_wage(int extra_hours){
        return getBase_salary() + (getHourly_rate() * extra_hours);
    }

    public int getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(int base_salary) {
        if (base_salary<=0)
            throw new IllegalArgumentException("can't be zero or less");
        this.base_salary = base_salary;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        if (hourly_rate<=0)
            throw new IllegalArgumentException("hourly_rate can't be zero or less");
        this.hourly_rate = hourly_rate;
    }
}
