package Service;

import java.util.List;
import java.util.Scanner;

import Work.Worker;
public interface LogicServiceInterface {
	List<Worker> insert(Scanner sc);
	void show(List<Worker> cv);
}
