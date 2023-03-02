public class Task3 {
    public double num;

    public Task3(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Task3 " + num;
    }
}
