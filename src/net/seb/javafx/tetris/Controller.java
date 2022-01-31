package net.seb.javafx.tetris;

import net.seb.javafx.tetris.forms.Tetromino;
import net.seb.javafx.tetris.utils.Constants;

public class Controller {
    public static void rotate(Tetromino tetromino) {
        String name  = tetromino.getName();
        int position = tetromino.getPosition();
        double aX = tetromino.getA().getX();
        double aY = tetromino.getA().getY();
        double bX = tetromino.getB().getX();
        double bY = tetromino.getB().getY();
        double cX = tetromino.getC().getX();
        double cY = tetromino.getC().getY();
        double dX = tetromino.getD().getX();
        double dY = tetromino.getD().getY();
        switch (name) {
            case "i" :
                if (position == 0) {
                    tetromino.getA().setX(aX + 2 * Constants.BOX_SIZE);
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getB().setX(bX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else {
                    if (aX < 2 * Constants.BOX_SIZE) {
                        tetromino.getA().setX(0);
                        tetromino.getB().setX(Constants.BOX_SIZE);
                        tetromino.getC().setX(2 * Constants.BOX_SIZE);
                        tetromino.getD().setX(3 * Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX - 2 * Constants.BOX_SIZE);
                        tetromino.getB().setX(bX - Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
            case "j" :
                if (position == 0) {
                    tetromino.getA().setX(aX + Constants.BOX_SIZE);
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setX(cX - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setX(dX - 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else if (position == 1) {
                    if (aX == Constants.WIDTH - Constants.BOX_SIZE) {
                        tetromino.getB().setX(bX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - 2 * Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(2);
                } else if (position == 2) {
                    tetromino.getA().setX(aX - Constants.BOX_SIZE);
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setX(dX + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(3);
                } else if (position == 3) {
                    if (aX == 0) {
                        tetromino.getB().setX(bX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX + 2 * Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
            case "l" :
                if (position == 0) {
                    tetromino.getA().setX(aX - Constants.BOX_SIZE);
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else if (position == 1) {
                    if (aX == Constants.WIDTH - Constants.BOX_SIZE) {
                        tetromino.getA().setX(aX - 2 * Constants.BOX_SIZE);
                        tetromino.getB().setX(bX - Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX + Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + 2 * Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.setPosition(2);
                } else if (position == 2) {
                    tetromino.getA().setX(aX + Constants.BOX_SIZE);
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setX(cX - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(3);
                } else if (position == 3) {
                    if (aX == 0) {
                        tetromino.getA().setX(aX + 2 * Constants.BOX_SIZE);
                        tetromino.getB().setX(bX + Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - 2 * Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
            case "s" :
                if (position == 0) {
                    tetromino.getA().setX(aX - Constants.BOX_SIZE);
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setX(dX + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else if (position == 1) {
                    if (aX == 0) {
                        tetromino.getA().setX(aX + 2 * Constants.BOX_SIZE);
                        tetromino.getB().setX(bX + Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - 2 * Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
            case "z" :
                if (position == 0) {
                    tetromino.getA().setX(aX + Constants.BOX_SIZE);
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else if (position == 1) {
                    if (aX == 0) {
                        tetromino.getB().setX(bX + Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + 2 * Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
            case "t" :
                if (position == 0) {
                    tetromino.getA().setX(aX + Constants.BOX_SIZE);
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setX(cX - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - Constants.BOX_SIZE);
                    tetromino.setPosition(1);
                } else if (position == 1) {
                    if (aX == Constants.WIDTH - Constants.BOX_SIZE) {
                        tetromino.getB().setX(bX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - 2 * Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX - Constants.BOX_SIZE);
                        tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setY(dY - Constants.BOX_SIZE);
                    tetromino.setPosition(2);
                } else if (position == 2) {
                    tetromino.getA().setX(aX - Constants.BOX_SIZE);
                    tetromino.getA().setY(aY + Constants.BOX_SIZE);
                    tetromino.getC().setX(cX + Constants.BOX_SIZE);
                    tetromino.getC().setY(cY - Constants.BOX_SIZE);
                    tetromino.getD().setX(dX + Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + Constants.BOX_SIZE);
                    tetromino.setPosition(3);
                } else if (position == 3) {
                    if (aX == 0) {
                        tetromino.getB().setX(bX + Constants.BOX_SIZE);
                        tetromino.getC().setX(cX + 2 * Constants.BOX_SIZE);
                    } else {
                        tetromino.getA().setX(aX - Constants.BOX_SIZE);
                        tetromino.getC().setX(cX + Constants.BOX_SIZE);
                        tetromino.getD().setX(dX - Constants.BOX_SIZE);
                    }
                    tetromino.getA().setY(aY - Constants.BOX_SIZE);
                    tetromino.getC().setY(cY + Constants.BOX_SIZE);
                    tetromino.getD().setY(dY + Constants.BOX_SIZE);
                    tetromino.setPosition(0);
                }
                break;
        }
    }

    public static void drop(Tetromino tetromino) {
        tetromino.getA().setY(tetromino.getA().getY() + Constants.BOX_SIZE);
        tetromino.getB().setY(tetromino.getB().getY() + Constants.BOX_SIZE);
        tetromino.getC().setY(tetromino.getC().getY() + Constants.BOX_SIZE);
        tetromino.getD().setY(tetromino.getD().getY() + Constants.BOX_SIZE);
    }
}
