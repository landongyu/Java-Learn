package com.atguigu.team.service;

import com.atguigu.team.domain.*;
import com.atguigu.team.team.domain.*;

import static com.atguigu.team.service.Data.*;

/**
* 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
*/
public class NameListService {
    private Employee[] employees; //数组

    public NameListService() {
        //初始化数组了，但里面都是null
        employees = new Employee[EMPLOYEES.length]; //光标能显示 是因为上面import了

        for (int i = 0; i < employees.length; i++) { //遍历数组，根据类型，一个一个造对象
            // 获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]); //把string转化为int

            // 获取 Employee 的 4 个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * @Description 获取指定 index 上的员工设备 * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        String ModelOrName = EQUIPMENTS[index][1];
        switch (key) {
            case com.atguigu.team.domain.PC: //21
                String display = EQUIPMENTS[index][2]; //数组脚标
                return new PC(ModelOrName, display);
            case NOTEBOOK: //22
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(ModelOrName, price);
            case PRINTER: //23
                String type = EQUIPMENTS[index][2];
                return new Printer(ModelOrName, type);
        }
        return null;
    }

    /*
    * 获取当前所有员工
    * */
    public Employee[] getAllEmployees() {
        return employees; //返回员工数组
    }

    /*
    * 获取指定 ID 的员工对象
    * */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException(" 找不到指定员工 "); //编译时异常
    }

}
