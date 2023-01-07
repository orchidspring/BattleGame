
package wholovescombat;

import java.util.Objects;

/**
 *
 * @author Alecia Sutherland
 * @param
 */
public class Carmika extends Characters {

    /**
     *
     */
    private static final int DamageVictim = 0;
    private int speed;
    private int numberOfLives;
    private int numberOfClaws;
    private int LooseClaw;
    private boolean getDamage;

    public Carmika(int numberOfClaws, int numberOfLives, int speed, boolean getDamage, int LooseClaw,
            boolean DamageVictim) {
        super(numberOfClaws, numberOfLives, speed);
        this.numberOfClaws = numberOfClaws;// three properties to be declared as private: numberOfClaws, numberOfLives,
                                           // speed
        this.numberOfLives = numberOfLives;
        this.speed = speed;

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

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfClaws() {
        return this.numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }
    // constructor (three parameters: numberOfClaws, numberOfLives, speed)

    // attack()
    /**
     * @param name
     */

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carmika)) {
            return false;
        }
        Carmika carmika = (Carmika) o;
        return speed == carmika.speed && numberOfLives == carmika.numberOfLives
                && numberOfClaws == carmika.numberOfClaws;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, numberOfLives, numberOfClaws);
    }
    // Attack routine specification (sword, claw, rock, etc.).

    /*
     * (non-Javadoc)
     * 
     * @see wholovescombat.Characters#attack()
     */
    public void attack() {
    }

    // loose 2 claw,
    /**
     * @return
     */
    public int looseClaw() {
        return LooseClaw = (int) -2.;
    }

    // speed is reduce by one third
    public int speed() {
        return speed = 1 / 3;
    }

    /**
     * @return
     */
    public boolean DamageVictim() {
        return DamageVictim < 1;
    }
    // damage victim one life

    /*
     * (non-Javadoc)
     * 
     * @see wholovescombat.Characters#toString()
     */
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
}