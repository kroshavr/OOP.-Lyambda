public class Task1 {
    private int number;

    public Task1(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TaskPredicate" + number;
    }
}
