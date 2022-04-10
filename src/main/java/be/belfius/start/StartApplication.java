package be.belfius.start;

import be.belfius.start.apple.Apple;
import be.belfius.start.config.ConfogenResource;
import be.belfius.start.config.DocumentType;
import be.belfius.start.domain.Employee;
import be.belfius.start.domain.Gender;
import be.belfius.start.domain.Manager;
import be.belfius.start.domain.Person;
import be.belfius.start.generics.Printer;
import be.belfius.start.service.GeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.*;
import java.util.stream.Collectors;


@Slf4j
@SpringBootApplication
public class StartApplication {
	public static List<Apple> filterRedApples(List<Apple> inventory) {

		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor().equalsIgnoreCase("RED")) {
				result.add(apple);
			}

		}
		return result;
	}
// https://www.w3schools.com/java/java_lambda.asp
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

	public static void main(String[] args) {

		SpringApplication.run(StartApplication.class, args);
		log.debug("Starting");
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
		log.debug("--------------------");

		System.out.println("--------------------");
//		Employee ken = new Manager();
//		ken.setName("Ken");
//		int salary = 200;
//		ken.setSalary((double)(salary));
//
//		log.debug("Manager "+ ken.getName() +", salary: "+ken.getSalary());
//		log.debug("--------------------");
//		Printer<Integer> printer = new Printer<>(23);
//		printer.print();
//
//		Printer<Double> doublePrinter = new Printer<>(53.3);
//		doublePrinter.print();
//
//		Printer<String> stringPrinter = new Printer<>("A string");
//		stringPrinter.print();
		log.debug("--------------------");
		Apple a1 = new Apple(100,"green");
		Apple a2 = new Apple(160,"red");
		Apple a3 = new Apple(200, "green");
//		Comparator<Apple> byWeight =
//			(Apple a1, Apple a2) -> a1.getWeigth().compareTo(a2.getWeigth());



//		List<Apple> appleList = Arrays.asList(a1,a2,a3);
//		List<Apple> appleList = new ArrayList<>();
//		appleList.add(a1);
//		appleList.add(a2);
//		appleList.add(a3);
//		log.debug("Size = " +appleList.size());
//		List<Apple> redApples =filterRedApples(appleList);
//		List<Apple> redApples = filter(appleList, (Apple apple) -> "red".equalsIgnoreCase((apple.getColor())));
//		for(Apple apple : redApples)
//			log.debug(apple.toString());
//		Map<Integer,String> apples = new HashMap<>();
//		apples.put(a1.getWeigth(),a1.getColor());
//		apples.put(a2.getWeigth(),a2.getColor());
//		apples.put(a3.getWeigth(),a3.getColor());
//		for(Apple apple : apples)
//		apples.forEach((key,value)->{
//			if(apple.getColor().equalsIgnoreCase("RED")){
//				log.debug("RED");
//			}else{
//				log.debug(apple.getColor());
//			}
//		});

//		Map<Character,String> charType = new HashMap<Character,String>();
//		charType.put('J',"Java");
//		charType.put('H',"Hibernate");
//		charType.put('P',"Python");
//		charType.put('A',"Angular");
//		charType.forEach(
//				(key,value) -> System.out.println(key + " = " + value)
//		);

//		int countAudit = 0, countQM = 0, countIQM = 0, countTF = 0, countETF = 1;
//		String bodyText="Number of rows in specific query AFTER in Audit="+ countAudit +". ";
//		bodyText = bodyText + "\nNumber of rows in specific query AFTER in Audit="+ countAudit +", in QM=" +countQM +" in IQM=" +countIQM  +", in TF=" +countTF +", in ETF=" +countETF +".";
//
//		log.debug(bodyText);
//		GeneratorService generatorService = new GeneratorService();
//		ConfogenResource resource = new ConfogenResource();
//		resource.setDocumentType(DocumentType.FIXI);
//		resource.setBoDealNumber("BO123555");
//		generatorService.receiveConfogen(resource);

//		log.debug("-----------------");
////		String Regex = "[a-zA-Z0-9]+)([\s]+)([a-zA-Z ]+)([\s]+)([0-9]+" ;
//		String Regex = "(\\w+)";
//		String regexpOfdate = "([0-9]{8})\\.[0-9]{4}\\+[0-9]{4}-[0-9]{4}\\+[0-9]{4}";
//		String regexpOfName = "(\\{.+(\\{.+(\\[.+\\]).+\\}).+\\})";
//		String work = "";
//		Pattern p = Pattern.compile( regexpOfName);
//		Matcher m = p.matcher(eMessage);
//		if(m.find()){
//			log.debug("m0: {},",m.group(0));
//			log.debug("m1: {},",m.group(1));
//			log.debug("m2: {},",m.group(2));
//			log.debug("m3: {},",m.group(3));
//			work = m.group(3);
//			log.debug("work: {},",work);
//		}
////		Regex:([a-zA-Z0-9]+)([\s]+)([a-zA-Z ]+)([\s]+)([0-9]+)

	}

}
