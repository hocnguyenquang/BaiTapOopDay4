package Work;

import java.util.Scanner;

public class Worker extends Person {
	private String Position;
	private int NumberProduct;
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Worker(String iD, String name, int age, String address) {
		super(iD, name, age, address);
		// TODO Auto-generated constructor stub
	}

	public Worker(String position, int numberProduct) {
		super();
		Position = position;
		NumberProduct = numberProduct;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public int getNumberProduct() {
		return NumberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		NumberProduct = numberProduct;
	}
	
	public void input(Scanner sc, int index) {
		System.out.println("Nhập thông tin công nhân thứ "+ (index+1) + ": ");
		System.out.println("Nhập ID: ");
		this.setID(sc.nextLine());
		System.out.println("Nhập tên: ");
		this.setName(sc.nextLine());
		do {
			System.out.println("Nhập tuổi: ");
			this.setAge(sc.nextInt());
			if(this.getAge() <= 0) {
				System.out.println("Nhập lại tuổi!!!");
			}
		}while(this.getAge() <= 0);
		sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.setAddress(sc.nextLine());
		System.out.println("Nhập chức vụ: ");
		this.setPosition(sc.nextLine());
		do {
			System.out.println("Nhập số sản phẩm: ");
			this.setNumberProduct(sc.nextInt());
			if(this.getNumberProduct() <= 0) {
				System.out.println("Nhâp lại số sản phẩm!!!");
			}
		}while(this.getNumberProduct() <= 0);
		sc.nextLine();
	}
	
	public void output(int index) {
		System.out.println("Thông tin công nhân thứ "+(index+1) + ": ");
		System.out.println("ID: "+this.getID());
		System.out.println("Name: "+this.getName());
		System.out.println("Age: "+this.getAge());
		System.out.println("Address: "+this.getAddress());
		System.out.println("Position: "+this.getPosition());
		System.out.println("NumberProduct: "+this.getNumberProduct());
	}
	public double Money() {
		return NumberProduct*120;
	}
}
