package Empregado;

class Employee {
    private String firstName;
    private String lastName;
    private float monthlySalary;
    
    public Employee(String firstName, String lastName, float monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = (monthlySalary > 0.0) ? monthlySalary : 0;
    }
    
    @Override
    public String toString() {
        return String.format(
            "-- Empregado --\nNome : %s %s | Salário Mensal: %.2f | Salário Anual : %.2f"
        , firstName, lastName, monthlySalary, monthlySalary * 12);
    }

    
}