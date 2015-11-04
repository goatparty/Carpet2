import java.util.*;
import java.io.Console;
import java.io.*;

public class Carpet {
    private char[] password;
    Console con = new System.console();
    Scanner keyboard = new Scanner(System.in);
    private double price = 8.00;
    private double xDim, yDim;
    private boolean roomDim0 = true;
    private final char[] PASSWORD= {'H','u','n','t','e','r','1','2','3'};

    public Carpet() {
        xDim = yDim = 0;
        roomDim0 = true;
    }

	public Carpet(double xDim) {
		this.xDim = xDim;
        this.yDim = yDim;
        roomDim0 = false;
	}

	public double getPrice() {
		return price;
	}

	public double getXDim() {
		return xDim;
	}

    public double getYDim() {
		return yDim;
	}

	public void setXDim(double xDim) {
		this.xDim = xDim;
	}

    public void setYDim(double yDim) {
		this.yDim = yDim;
	}

    public double getSquareFootage() {
        return yDim * xDim;
    }

    public double getTotalPrice() {
        return getSquareFootage() * price;
    }

    public void setPrice() {
        System.out.print("Please Enter Password: ");
        try {
            password = con.readPassword();
        }
        catch (IOException i) {
            System.out.println("IOException");
        }
        if (password == PASSWORD) {
            System.out.print("Password Correct, enter price: ");
            price = keyboard.nextDouble();
        }
        else {
            System.out.println("Incorrect Password - Exiting Program");
            System.exit(404);
        }

    }

}
