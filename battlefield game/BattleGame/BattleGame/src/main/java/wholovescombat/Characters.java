
package wholovescombat;

/**
 *
 * @author Alecia Sutherland
 */
public class Characters {

    private int speed;
    private int numberOfLives;
    private int numberOfClaws;
    private int LooseClaw;
    private boolean getDamage;

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

    public Characters(int numberOfClaws, int numberOfLives, int speed) {
        this.numberOfClaws = numberOfClaws;// three properties to be declared as private: numberOfClaws, numberOfLives,
                                           // speed
        this.numberOfLives = numberOfLives;
        this.speed = speed;
    }

    // three getters

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfLives() {
        return this.numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfClaws() {
        return this.numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }

    // three setters

    // attack(): this is abstract, void method without parameter
    public void attack() {
    }

    @Override
    public String toString() {
        return "{" +
                " speed='" + getSpeed() + "'" +
                ", numberOfLives='" + getNumberOfLives() + "'" +
                ", numberOfClaws='" + getNumberOfClaws() + "'" +
                "}";
    }

}
