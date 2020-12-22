package David.nota;

public class Quiz {
    Student student;
    double grade;
    String nameClass;
    double totalPoints;
    double pointsObtained;

    public Quiz(Student student, double grade, String nameClass, double totalPoints, double pointsObtained) {
        this.student = student;
        this.grade = grade;
        this.nameClass = nameClass;
        this.totalPoints = totalPoints;
        this.pointsObtained = pointsObtained;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getPointsObtained() {
        return pointsObtained;
    }

    public void setPointsObtained(int pointsObtained) {
        this.pointsObtained = pointsObtained;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "student=" + student +
                ", grade=" + grade +
                ", nameClass='" + nameClass + '\'' +
                ", totalPoints=" + totalPoints +
                ", pointsObtained=" + pointsObtained +
                '}';
    }
}
