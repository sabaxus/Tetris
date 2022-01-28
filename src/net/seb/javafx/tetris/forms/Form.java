package net.seb.javafx.tetris.forms;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import net.seb.javafx.tetris.utils.Constants;

public class Form {

    private Rectangle a, b, c, d;
    private String name;
    private int position;

    private void setColor(Color color) {
        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }

    public Form(String name) {
        this.name = name;
        this.position = 0;
        this.a = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.b = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.c = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.d = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        switch (name) {
            case "i":
                setColor(Color.LIGHTBLUE);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setY(Constants.BOX_SIZE);
                this.c.setY(2 * Constants.BOX_SIZE);
                this.d.setY(3 * Constants.BOX_SIZE);
                break;
            case "j":
                setColor(Color.DARKBLUE);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                this.b.setY(Constants.BOX_SIZE);
                this.c.setY(2 * Constants.BOX_SIZE);
                this.d.setY(2 * Constants.BOX_SIZE);
                break;
            case "l":
                setColor(Color.ORANGE);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2);
                this.b.setY(Constants.BOX_SIZE);
                this.c.setY(2 * Constants.BOX_SIZE);
                this.d.setY(2 * Constants.BOX_SIZE);
                break;
            case "o":
                setColor(Color.YELLOW);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2);
                this.c.setY(Constants.BOX_SIZE);
                this.d.setY(Constants.BOX_SIZE);
                break;
            case "s":
                setColor(Color.GREEN);
                this.a.setX(Constants.WIDTH / 2);
                this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                this.c.setY(Constants.BOX_SIZE);
                this.d.setY(Constants.BOX_SIZE);
                break;
            case "z":
                setColor(Color.RED);
                this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2);
                this.c.setY(Constants.BOX_SIZE);
                this.d.setY(Constants.BOX_SIZE);
                break;
            case "t":
                setColor(Color.MAGENTA);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2);
                this.b.setY(Constants.BOX_SIZE);
                this.c.setY(Constants.BOX_SIZE);
                this.d.setY(Constants.BOX_SIZE);
                break;
        }
    }

    public Form(String name, int position) {
        this.name = name;
        this.position = position;
        this.a = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.b = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.c = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        this.d = new Rectangle(Constants.BOX_SIZE - 1, Constants.BOX_SIZE - 1);
        switch (name) {
            case "i":
                setColor(Color.LIGHTBLUE);
                if (position == 0 || position == 2) {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(2 * Constants.BOX_SIZE);
                    this.d.setY(3 * Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2);
                    this.d.setX(Constants.WIDTH / 2 + Constants.BOX_SIZE);
                }
                break;
            case "j":
                setColor(Color.DARKBLUE);
                if (position == 0) {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(2 * Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                } else if (position == 1) {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else if (position == 2) {
                    this.a.setX(Constants.WIDTH / 2);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2);
                    this.d.setX(Constants.WIDTH / 2);
                    this.d.setY(Constants.BOX_SIZE);
                }
                break;
            case "l":
                setColor(Color.ORANGE);
                if (position == 0) {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(2 * Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                } else if (position == 1) {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.a.setY(Constants.BOX_SIZE);
                } else if (position == 2) {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2);
                    this.d.setX(Constants.WIDTH / 2);
                    this.a.setY(Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                }
                break;
            case "o":
                setColor(Color.YELLOW);
                this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.b.setX(Constants.WIDTH / 2);
                this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                this.d.setX(Constants.WIDTH / 2);
                this.c.setY(Constants.BOX_SIZE);
                this.d.setY(Constants.BOX_SIZE);
                break;
            case "s":
                setColor(Color.GREEN);
                if (position == 0 || position == 2) {
                    this.a.setX(Constants.WIDTH / 2);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                }
                break;
            case "z":
                setColor(Color.RED);
                if (position == 0 || position == 2) {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(2 * Constants.BOX_SIZE);
                }
                break;
            case "t":
                setColor(Color.MAGENTA);
                if (position == 0) {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else if (position == 1) {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(2 * Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else if (position == 2) {
                    this.a.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2);
                    this.d.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                } else {
                    this.a.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.b.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.c.setX(Constants.WIDTH / 2 - Constants.BOX_SIZE);
                    this.d.setX(Constants.WIDTH / 2 - 2 * Constants.BOX_SIZE);
                    this.b.setY(Constants.BOX_SIZE);
                    this.c.setY(2 * Constants.BOX_SIZE);
                    this.d.setY(Constants.BOX_SIZE);
                }
                break;
        }
    }

    public Rectangle getA() {
        return a;
    }

    public Rectangle getB() {
        return b;
    }

    public Rectangle getC() {
        return c;
    }

    public Rectangle getD() {
        return d;
    }
}
