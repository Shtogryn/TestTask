package com.shtohryn.menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.shtohryn.model.Department;
import com.shtohryn.model.EmployeeEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Menu {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);
    private static SessionFactory ourSessionFactory;

    public Menu() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        menu.put("1", "   1 - Read all table");
        menu.put("2", "   2 - Read customer table for know dish name");
        menu.put("3", "   3 - Insert new order for customer table");
        menu.put("4", "   4 - Insert new order for customer table");
        menu.put("5", "   5 - Insert new order for customer table");
        menu.put("q", "   q - exit");
    }

    static {
        try {
            ourSessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String key : menu.keySet())
            if (key.length() == 1) System.out.println(menu.get(key));
    }

    private void outputSubMenu(String fig) {

        System.out.println("\nSubMENU:");
        for (String key : menu.keySet())
            if (key.length() != 1 && key.substring(0, 1).equals(fig)) System.out.println(menu.get(key));
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();

            if (keyMenu.matches("^\\d")) {
                outputSubMenu(keyMenu);
                System.out.println("Please, select menu point.");
                keyMenu = input.nextLine().toUpperCase();
            }
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("q"));
    }

    private void ReadDepartmentTable() {
        final Session session = getSession();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number table for Dish_name: ");
        String table_in = input.next();

        Department departmentStatistic = (Department) session.load(Department.class, table_in);
        if (departmentStatistic != null) {
            System.out.format("\n%s: %s\n", table_in, "Dish_name");
            for (EmployeeEntity obj : departmentStatistic.getLectors())
                System.out.format("    %s\n", obj.
        } else System.out.println("invalid number of table");
    }

}

