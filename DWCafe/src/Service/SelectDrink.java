package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeeDAO;
import DAO.TeaDAO;
import DTO.Coffee;
import DTO.Tea;

public class SelectDrink implements Kiosk{
	
	private HashMap<Integer, Coffee> coffee;
	private HashMap<Integer, Tea> tea;
	
	public SelectDrink() {	// 생성자 메서드	
		
	}
	
	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		
		while( true ) {
			System.out.println("1. 커피 2. 티 : ");
			int category = scan.nextInt();
		
			switch( category ) {
				case 0: System.out.println("다음에 만나요"); return;
				case 1: selectCoffee(); break;
				case 2: selectTea(); break;
				default:
					System.out.println("다시 입력하세요");
			}
		}
	}
	
	// 커피 선택
	private void selectCoffee() {
		CoffeeDAO dao = new CoffeeDAO();
		coffee = dao.findAll();
		
		Set<Integer> ids = coffee.keySet();
		for( Integer id : ids) {
			System.out.println(id+". "+coffee.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order( coffee.get(menu));
		order.action();
	}
	// 티 선택
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		
		tea.forEach((k,v) -> System.out.println(k+". "+v));
//		Set<Integer> idss = tea.keySet();
//		for( Integer id2 : idss) {
//			System.out.println(id2+". "+tea.get(id2));
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order( tea.get(menu));
		order.action();
	}
}
