package Entity;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import contract.IActor;
import contract.ILevel;
import contract.Permeability;
import contract.Sprite;

/**
 * <h1>The Mobile Class.</h1>
 *
 * @author Paul-Kamga
 * @version 0.3
 */

public class Actor extends Element implements IActor {

    /**
     * The x.
     */
    private Point position;

    /** The alive. */
    private Boolean alive = true;

    /** The road. */
    private ILevel   level;

    /** The board. */
    private IBoard  board;

    /**
     * Instantiates a new Actor.
     *
     * @param sprite
     *            the sprite
     * @param road
     *            the level
     * @param permeability
     *            the permeability
     */
    Actor(final Sprite sprite, final ILevel level, final Permeability permeability) {
        super(sprite, permeability);
        this.setLevel(level);
        this.position = new Point();
    }

    /**
     * Instantiates a new mobile.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    Actor(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability) {
        this(sprite, level, permeability);
        this.setX(x);
        this.setY(y);
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#moveUp()
     */
    @Override
    public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#moveLeft()
     */
    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#moveDown()
     */
    @Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see  model.element.Actor.IActor#moveRight()
     */
    @Override
    public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#doNothing()
     */
    @Override
    public void doNothing() {
        this.setHasMoved();
    }

    /**
     * Sets the has moved.
     */
    private void setHasMoved() {
        this.getLevel().setActorHasChanged();
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#getX()
     */
    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isCrushed()) {
            this.die();
        }
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getY()
     */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     *            the new y, as the road is an infinite loop, there's a modulo
     *            based on the road height.
     */
    public final void setY(final int y) {
        this.getPosition().y = (y + this.getLevel().getHeight()) % this.getLevel().getHeight();
        if (this.isCrushed()) {
            this.die();
        }
    }

    /**
     * Gets the road.
     *
     * @return the road
     */
    public ILevel getLevel() {
        return this.level;
    }

    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     */
    private void setLevel(final ILevel level) {
        this.level = level;
    }

    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor.IMobile#isAlive()
     */
    @Override
    public Boolean isAlive() {
        return this.alive;
    }

    /**
     * Dies.
     */
    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#isCrashed()
     */
    @Override
    public Boolean isCrushed() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    /*
     * (non-Javadoc)
     * @see model.element.Actor.IActor#getPosition()
     */
    @Override
    public Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }
}
