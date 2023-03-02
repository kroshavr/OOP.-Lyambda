public class Task4 {
    private int nomer;

    public Task4(int nomer) {
        this.nomer = nomer;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "Task4 " + nomer;
    }
}
