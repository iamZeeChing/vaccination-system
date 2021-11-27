
package assignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataIO {
        public static ArrayList<MyCommittee> com = new ArrayList<MyCommittee>();
        public static ArrayList<MyPeople> peo = new ArrayList<MyPeople>();
    public static void read(){
        try{
            //File comfile = new File("Committee.txt");
            Scanner sc = new Scanner(new File("Committee.txt"));
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                String[] arrayCom = data.split(Pattern.quote("-"), 12);
                String cuname = arrayCom[0];
                String password = arrayCom[1];
                String cname = arrayCom[2];
                String cic = arrayCom[3];
                String cnationality = arrayCom[4];
                String cdob = arrayCom[5];
                String cgender = arrayCom[6];
                String ccontactNo = arrayCom[7];
                String cemail = arrayCom[8];
                String caddress = arrayCom[9];
                String csecQues = arrayCom[10];
                String csecAns = arrayCom[11];
                MyCommittee mc = new MyCommittee(cuname,  password,  cname,  cic,  cnationality,  cdob,  cgender,  ccontactNo,  cemail,  caddress,  csecQues,  csecAns);
                com.add(mc);
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
                p.println(com.get(i).getName()+"-"+com.get(i).getPassword()+"-"+com.get(i).getName()+"-"+
                        com.get(i).getIc()+"-"+com.get(i).getNationality()+"-"+com.get(i).getDob()+"-"+
                        com.get(i).getGender()+"-"+com.get(i).getContactno()+"-"+com.get(i).getEmail()+"-"+
                        com.get(i).getSecQuestion()+"-"+com.get(i).getSecAns());
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