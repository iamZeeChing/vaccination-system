
package assignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ComIO {
        public static ArrayList<MyCommittee> com = new ArrayList<MyCommittee>();
        public static ArrayList<MyPeople> peo = new ArrayList<MyPeople>();
    public static void read(){
        try{
            //Scanner sc = new Scanner(new File("Committee.txt"));
            //while(sc.hasNextLine()){
                Scanner sc = new Scanner(new File("Committee.txt"));
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
//need to split it and match the column/variable name
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
//for testing purpose REMOVE IT BEFORE SUBMIT
/*System.out.println(id+' '+name+' '+citizen+' '+phone+' '+email+' '+gender+' '+street+' '+city+
' '+postcode+' '+state+' '+password+' '+securityQuestion+' '+securityAns);*/
                MyCommittee mc = new MyCommittee(cuname, password, cname, cic,
                        cnationality, cdob, cgender, ccontactNo, cemail, caddress,
                        csecQues, csecAns);
                com.add(mc);
            }
//                String data = sc.nextLine();
//                String[]arrayCom = data.split(Pattern.quote("\\-"), 12);
//                String cuname = arrayCom[0];
//                String password = arrayCom[1];
//                String cname = arrayCom[2];
//                String cic = arrayCom[3];
//                String cnationality = arrayCom[4];
//                String cdob = arrayCom[5];
//                String cgender = arrayCom[6];
//                String ccontactNo = arrayCom[7];
//                String cemail = arrayCom[8];
//                String caddress = arrayCom[9];
//                String csecQues = arrayCom[10];
//                String csecAns = arrayCom[11];
//                MyCommittee mc = new MyCommittee(cuname,  password,  cname,  cic,  
//                        cnationality,  cdob,  cgender,  ccontactNo,  cemail,  caddress,  
//                        csecQues,  csecAns);
//                System.out.println(cuname+ " " +password+ " " +cname+ " "+cic+" "+cnationality+" "
//                        +cdob+ " "+cgender+" " +ccontactNo+" "+cemail+" "+caddress+" "+csecQues+" "+csecAns);
//                        
//                com.add(mc);
              
        }catch(Exception e){
            System.out.println("Error in read!"+e);
        }
    }
    
    public static void write(){
        try{
            PrintWriter p = new PrintWriter("Committee.txt");
            p.println("Username-Password-Full Name-IC/Passport No-Nationality-Date of Birth-Gender-Contact No-Email-Security Question-Security Answer");
            for(int i=0; i<com.size(); i++){
                p.println(com.get(i).getUsername()+"-"+com.get(i).getPassword()+"-"+com.get(i).getName()+"-"+
                        com.get(i).getIc()+"-"+com.get(i).getNationality()+"-"+com.get(i).getDob()+"-"+
                        com.get(i).getGender()+"-"+com.get(i).getContactno()+"-"+com.get(i).getEmail()+"-"+
                        com.get(i).getAddress()+"-"+com.get(i).getSecQuestion()+"-"+com.get(i).getSecAns());
            }
            p.close();
        } catch(Exception e){
            System.out.println("Error in write!");
        }
    }
    
    public static MyCommittee checking(String x){
        MyCommittee found = null;
        for(MyCommittee c : com){
            if(x.equals(c.getUsername())){
                return c;
            }
        }
        return null;
    }
}