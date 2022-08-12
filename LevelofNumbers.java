package day11;
/*
 Author name:A.Theboral 12/8/22
 */

import java.util.Scanner;

public class LevelofNumbers{
	
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  if (num > 0 && num < 100)
              System.out.println("level 1");
          else if (num > 1000 && num < 10000)
              System.out.println("level 1");
          else if (num > 100 && num < 200)
              System.out.println("level 2");
          else if (num > 10000 && num < 20000)
              System.out.println("level 2");
          else if (num > 200 && num < 300)
              System.out.println("level 3");
          else if (num > 20000 && num < 30000)
              System.out.println("level 3");
          else if (num > 30000 && num < 40000)
              System.out.println("level 4");
          else
        	  System.out.println("level completed");
		  
	  
	}
	}
                  
        
	

	


