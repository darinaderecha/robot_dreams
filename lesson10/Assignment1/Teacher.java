package Assignment1;

public class Teacher extends Person {
    private int salary;
    private int hoursOfTeachingPerWeek;
    private String bossName;
    private boolean couldTakeTheExam;

    private int yearsOfTeaching;

    public Teacher() {
    }

    public Teacher(String name, int age, boolean isMan, int salary,
                   int hoursOfTeachingPerWeek, String bossName, boolean couldTakeTheExam, int yearsOfTeaching) {
        super(name, age, isMan);
        this.salary = salary;
        this.hoursOfTeachingPerWeek = hoursOfTeachingPerWeek;
        this.bossName = bossName;
        this.couldTakeTheExam = couldTakeTheExam;
        this.yearsOfTeaching = yearsOfTeaching;
    }

    public boolean canBeABoss(boolean couldTakeTheExam, int yearsOfTeaching) {
        if (couldTakeTheExam && yearsOfTeaching > 10) {
            return true;
        }
        return false;
    }

    public double calculateSalary(int yearsOfTeaching, int hoursOfTeachingPerWeek) {
        if (yearsOfTeaching > 20) {
            return getSalary() + (yearsOfTeaching * 1000) + (hoursOfTeachingPerWeek * 100);
        } else if (yearsOfTeaching < 20 && yearsOfTeaching > 10) {
            return getSalary() + (yearsOfTeaching * 500) + (hoursOfTeachingPerWeek * 100);
        } else if (yearsOfTeaching < 10 && yearsOfTeaching > 5) {
            return getSalary() + (yearsOfTeaching * 1000) + (hoursOfTeachingPerWeek * 70);
        }
        return getSalary() + (hoursOfTeachingPerWeek * 38);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHoursOfTeachingPerWeek() {
        return hoursOfTeachingPerWeek;
    }

    public void setHoursOfTeachingPerWeek(int hoursOfTeachingPerWeek) {
        this.hoursOfTeachingPerWeek = hoursOfTeachingPerWeek;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public boolean isCouldTakeTheExam() {
        return couldTakeTheExam;
    }

    public void setCouldTakeTheExam(boolean couldTakeTheExam) {
        this.couldTakeTheExam = couldTakeTheExam;
    }

    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }
}

