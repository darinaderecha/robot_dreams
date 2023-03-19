package lesson14;

import lesson14.Human;

import java.util.UUID;

public class Teacher extends Human {

    private Salary salary;

    private TeacherId id;

    public Teacher(Salary salary, TeacherId id) {
        this.salary = salary;
        this.id = id;
    }

    @Override
    public void move() {
        System.out.println("Get by car");
    }

    public static class Salary {
        protected double salary;
        protected double hoursPerWeek;
        protected int yearsOfExperience;
        protected boolean doResearch;

        public double getSalary() {
            return salary;
        }

        public double setSalary(double hoursPerWeek, int yearsOfExperience, boolean doResearch) {
            if (doResearch) {
                return 6000.0 * (hoursPerWeek * 4 * yearsOfExperience) * 1.5;
            }
            return 6000.0 * (hoursPerWeek * 4 * yearsOfExperience) * 0.4;
        }
    }

    private class TeacherId {
        private UUID teacherIdId;

        UUID getTeacherIdId() {
            return teacherIdId;
        }

        void setTeacherIdId(UUID teacherIdId) {
            this.teacherIdId = teacherIdId;
        }
    }

}
