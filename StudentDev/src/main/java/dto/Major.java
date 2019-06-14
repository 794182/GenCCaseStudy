package dto;

public class Major {
    private String name;
    private int difficulty;
    private double cost;

    public Major() {
        super();
    }

    public Major(String inputName, int inputDifficulty, double inputCost) {
        super();
        name = inputName;
        difficulty = inputDifficulty;
        cost = inputCost;
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

    @Override
    public String toString() {
        return "Major{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", cost=" + cost +
                '}';
    }
}
