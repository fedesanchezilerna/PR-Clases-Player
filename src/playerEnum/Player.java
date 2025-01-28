package playerEnum;

public class Player {

    // Attributes

    private String name;
    private String surname;
    private float height;
    private float weight;
    private byte age;
    private Sex sex;
    private int points;
    private Team team;
    private Position position;
    private boolean active;
    private byte cards;

    static final int INITIAL_POINTS = 0;
    static final byte INITIAL_AGE = 0;
    static final byte MAX_CARDS = 0;


    // Constructors

    public Player(String name, String surname, float height, float weight, byte age, Sex sex, int points, Team team, Position position, boolean active) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.age = (byte) Math.max(age, 18);
        this.sex = sex;
        this.points = Math.min(points, 100);
        this.team = team;
        this.position = position;
        this.active = active;
    }

    public Player(String name, String surname, float height, float weight, Team team, Position position) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.team = team;
        this.position = position;
    }

    public Player(String name, String surname, Sex sex, Team team, Position position) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.team = team;
        this.position = position;
    }

    public Player(String name, String surname, byte age, Sex sex, Team team, Position position) {
        this.name = name;
        this.surname = surname;
        this.age = (byte) Math.max(age, 18);
        this.sex = sex;
        this.team = team;
        this.position = position;
    }


    // Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public byte getCards() {
        return cards;
    }

    public void setCards(byte cards) {
        this.cards = cards;
    }
}
