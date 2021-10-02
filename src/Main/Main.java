package Main;

import java.util.List;
import java.util.Scanner;

import Service.LogicService;
import Service.LogicServiceInterface;
import Work.Worker;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LogicServiceInterface logicService = new LogicService(); //Interface k thể khởi tạo đối tượng
		System.out.println("----------Programming Worker----------");
		List<Worker> cv = logicService.insert(sc); //insert là với giá trị trả về là list worker
		logicService.show(cv);
	}

}

