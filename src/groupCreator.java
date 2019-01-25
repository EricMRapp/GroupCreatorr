import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class groupCreator {
	

	static ArrayList<String> allStudents = new ArrayList<String>();
	static ArrayList<String> GroupsTwo = new ArrayList<String>();
	static ArrayList<String> GroupsTwoPartTwo = new ArrayList<String>();
	static ArrayList<String> GroupsThree = new ArrayList<String>();
//	static ArrayList<String> GroupsFour = new ArrayList<String>();
//	static ArrayList<String> GroupsFive = new ArrayList<String>();
//	static ArrayList<String> GroupsSix = new ArrayList<String>();
//	static ArrayList<String> GroupsSeven = new ArrayList<String>();
//	static ArrayList<String> GroupsEight = new ArrayList<String>();
//	static ArrayList<String> GroupsNine = new ArrayList<String>();
//	static ArrayList<String> GroupsTen = new ArrayList<String>();
//	static ArrayList<String> GroupsEleven = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		Scanner namesList = new Scanner(new File("StudentList.txt"));
		System.out.println("How many people would you like per group??");
		Scanner groups= new Scanner(System.in);
		
		while(namesList.hasNext())
		{
			allStudents.add(namesList.nextLine());
		}
		
		int numberOfGroups = groups.nextInt();
		int size = allStudents.size();
		int groupSize = 0;
		int lastGroupSize = 0;
		int temp = 0;
		
		if(allStudents.size() % numberOfGroups == 0)
		{
			groupSize = allStudents.size() / numberOfGroups;
			System.out.println("You should have " + numberOfGroups + " groups of " + groupSize + ".");
		}
		else if(allStudents.size() % numberOfGroups != 0)
		{
			groupSize = size/numberOfGroups;
			temp = size % numberOfGroups;
			lastGroupSize = groupSize + 1;
			System.out.println("You should have " + (numberOfGroups - temp) + " groups of " + groupSize + " and " + temp +  " groups of " + lastGroupSize);
		}
	

		
		switch(numberOfGroups)
		{
		
		case 2:
		{
			System.out.println("Awesome two people per group");
			while(namesList.hasNext())
			{
				GroupsTwo.add(namesList.nextLine());
				GroupsTwoPartTwo.add(namesList.nextLine());
			}
//			twoPeople();
			break;
		}
		case 7:
		{
			
			threePeople();
			break;
		}	
		case 4:
		{
			System.out.println("Awesome four people per group");
			while(namesList.hasNext())
			{
//				GroupsFour.add(namesList.nextLine());
			}
		}
		case 5:
		{
			System.out.println("Awesome five people per group");
			while(namesList.hasNext())
			{
//				GroupsFive.add(namesList.nextLine());
			}
	
		}
		
		
		
	}
	}

	

//	private static void twoPeople() {
//		
//		for(int i = 0; i <  GroupsTwo.size(); i+=1)
//		{
//		System.out.println("Group " + i + " " + GroupsTwo.get(i) + " and " + GroupsTwoPartTwo.get(i));
//		
//		}
//		System.out.println("Would you like to shuffle the groups??");
//		
//		
//		Scanner yesNoShuffle2= new Scanner(System.in);
//		String shuffle2 = yesNoShuffle2.nextLine();
//		
//		if(shuffle2.equals("yes"))
//		{
//			Collections.shuffle(GroupsTwoPartTwo);
//			Collections.shuffle(GroupsTwo);
//			for(int i = 0; i <  GroupsTwo.size(); i+=1)
//			{
//				
//			System.out.println("Group " + i + " " + GroupsTwo.get(i) + " and " + GroupsTwoPartTwo.get(i));
//			
//			}
//			
//		}
//		else
//		{
//			System.out.println("awesome thanks");
//		}
//		
//	}
	
	private static void threePeople() throws IOException{
		Scanner namesList = new Scanner(new File("StudentList.txt"));
		
		while(namesList.hasNext())
		{
			
			GroupsThree.add(namesList.nextLine());
			
		}
		
		for(int i = 0; i < GroupsThree.size(); i++)
		{
			System.out.println("Group " + (i + 1));
		System.out.println(GroupsThree.get(i));
		
		if(GroupsThree.size() % )
		{
			System.out.println("hi");
		}
		
		else if(GroupsThree.get(i).substring(0,1).equals(GroupsThree.get(i + 1).substring(0,1)))
		{
			System.out.println("hey boss");
		}
		}
//		Collections.shuffle(GroupsThree);
//		while(((Iterator<String>) GroupsThree).hasNext())
//		{
//			G
//		}
		
		
		
//		Collections.sort(GroupsThree);
//		Scanner userInput = new Scanner(System.in);
//		String equation = userInput.nextLine();
//		String[] SplitingArray3 = equation.split(" ");
		
		
		
		
	}
	}

