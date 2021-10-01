package Main;

import java.util.List;
import java.util.Scanner;

import Service.LogicService;
import Service.LogicServiceInterface;
import Work.Worker;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LogicServiceInterface logicService = new LogicService();
		System.out.println("Nhập công việc: ");
		List<Worker> cv = logicService.insert(sc);
		logicService.show(cv);
	}

}
