package Ativ_2;

public class Main {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        emp.setNome("Carlos Silva");
        emp.setSalario(5000.75);
        System.out.println(emp);

        Gerente gen = new Gerente("São Judas Tadeu");
        gen.setNome("Thallys Cleiton");
        gen.setSalario(4000.00);
        System.out.println(gen);

        Vendedor ven = new Vendedor("Jhony Clenderson", 5000, 10);
        ven.setTotalVendas(20000); //total de vendas do vendedor no mes
        System.out.println(ven);

    }
}
