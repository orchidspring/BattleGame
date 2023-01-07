
package wholovescombat;

/**
 *
 * @author Alecia Sutherland
 */
public class Absaka {

    private int speed;
    private int numberOfLives;
    private int numberOfClaws;
    private int LooseClaw;
    private boolean getDamage;

    public Absaka(int numberOfClaws, int numberOfLives, int speed) {
        super();
        this.numberOfClaws = numberOfClaws;// three properties to be declared as private: numberOfClaws, numberOfLives,
                                           // speed
        this.numberOfLives = numberOfLives;
        this.speed = speed;
    }

    public Absaka(String string) {
    }

    public int getLooseClaw() {
        return this.LooseClaw;
    }

    public void setLooseClaw(int LooseClaw) {
        this.LooseClaw = LooseClaw;
    }

    public boolean isGetDamage() {
        return this.getDamage;
    }

    public boolean getGetDamage() {
        return this.getDamage;
    }

    public void setGetDamage(boolean getDamage) {
        this.getDamage = getDamage;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfLives() {
        return this.numberOfLives;
    }

    /**
     * @param numberOfLives
     */
    public void setNumberOfLives(int numberOfLives) {
        int lives;
        while (numberOfLives > 0) {
            for (numberOfLives = 10, lives = 5; numberOfLives > 0 && lives > 0; numberOfLives--)
                ;
        }

    }

    public int getNumberOfClaws() {
        return this.numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }

    @Override
    public String toString() {
        return "{" +
                " speed='" + getSpeed() + "'" +
                ", numberOfLives='" + getNumberOfLives() + "'" +
                ", numberOfClaws='" + getNumberOfClaws() + "'" +
                ", LooseClaw='" + getLooseClaw() + "'" +
                ", getDamage='" + isGetDamage() + "'" +
                "}";
    }

    public char[] attack() {
        return null;
    }
}