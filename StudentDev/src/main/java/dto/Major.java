package dto;

public class Major {

    int majorId;
    private String name;
    private int difficulty;
    double cost;

    public Major() {super();}

    public Major(String name, int difficulty, double cost){
        super();
        this.name = name;
        this.difficulty = difficulty;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMajorId() { return majorId; }

    public void setMajorId(int inputId) { majorId = inputId; }

    @Override
    public String toString() {
        return "Major{" +
                "majorId=" + majorId +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", cost=" + cost +
                '}';
    }
}
