
package assignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
        public static ArrayList<MyCommittee> com = new ArrayList<MyCommittee>();
        public static ArrayList<MyPeople> peo = new ArrayList<MyPeople>();
    public static void read(){
        try{
            Scanner sc = new Scanner(new File("Committee.txt"));
            while(sc.hasNext()){
                String a = sc.nextLine();
                int x = Integer.parseInt(sc.nextLine());
                sc.nextLine();
                MyCommittee c = new MyCommittee(a,x);
                com.add(c);
            }
            Scanner sp = new Scanner(new File("People.txt"));
            while(sp.hasNext()){
                String b = sp.nextLine();
                int y = Integer.parseInt(sp.nextLine());
                sp.nextLine();
                MyPeople f = new MyPeople(b,y);
                peo.add(f);
            
        }
            
            
        }catch(Exception e){
            System.out.println("Error in read!");
        }
    }
    
    public static void write(){
        try{
            PrintWriter p = new PrintWriter("Committee.txt");
            for(int i=0; i<com.size(); i++){
                p.println(com.get(i).getName());
                p.println(com.get(i).getPassword());
                p.println();
            }
            p.close();
            
            PrintWriter z = new PrintWriter("People.txt");
            for(int j=0;j<peo.size();j++){
                z.println(peo.get(j).getName());
                z.println(peo.get(j).getPassword());
                z.println(peo.get(j).getRealName());
                z.println(peo.get(j).getNoic());
                z.println(peo.get(j).getDob());
                z.println(peo.get(j).getEmail());
                z.println(peo.get(j).getAddress1());
                z.println(peo.get(j).getAddress2());
                z.println(peo.get(j).getPostcode());
                z.println(peo.get(j).getCity());
                z.println(peo.get(j).getAddress1());
                z.println();
            }
        } catch(Exception e){
            System.out.println("Error in write!");
        }
    }
    
    public static MyCommittee checking(String x){
        MyCommittee found = null;
        for(MyCommittee c : com){
            if(x.equals(c.getName())){
                return c;
            }
        }
        return null;
    }
    
    public static MyPeople check(String y){
        MyPeople found = null;
        for(MyPeople f : peo){
            if(y.equals(f.getName())){
                return f;
            }
        }
        return null;
    }
}