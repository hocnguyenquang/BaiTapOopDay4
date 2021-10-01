package Service;

import java.util.Scanner;

import Work.Worker;

import java.util.ArrayList;
import java.util.List;

public class LogicService implements LogicServiceInterface{
	
	@Override
	public java.util.List<Worker> insert(Scanner sc) {
		// TODO Auto-generated method stub
		List<Worker> workers = new ArrayList<>();
		int n;
		do {
			System.out.print("Nhập số lượng công nhân: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Nhập lại số lượng công nhân!!!");
			}
		} while (n <= 0);
		sc.nextLine();
		for (int index = 0; index < n; index++) {
			Worker worker = new Worker();
			worker.input(sc, index);
			workers.add(worker);
		}
		return workers;
	}

	@Override
	public void show(java.util.List<Worker> cv){
		// TODO Auto-generated method stub
		int index = 0;
		for (Worker worker : cv) {
			worker.output(index);
			index++;
		}
	}
}
