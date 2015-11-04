import java.util.*;
import java.io.*;
public class Carpet {
    private char[] password;
    Console console = new Console();
    Scanner keyboard = new Scanner(System.in);
    private double price = 8.00;
    private double xDim, yDim;
    private boolean roomDim0 = true;
    private final String = "Hunter123";

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
        return getSquareFootage() * PRICE;
    }

    public double setPrice() {
        System.out.print("Please Enter Password: ");
        try {
            password = console.readPassword();
        }
        catch (IOException) {
            System.out.println("IOExcepttion")
        }
        for
        (int x = 0;)

    }

}
