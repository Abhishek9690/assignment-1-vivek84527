package list;

public class List {
    ArrayList<Person> per=new ArrayList<Person>();
    Scanner sc =new Scanner(System.in);
    public void add(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the First Name");
        String f=sc.nextLine();
        System.out.println("Enter the Last Name");
        String l=sc.nextLine();
        System.out.println("Enter Your Mobile No");
        String m=sc.nextLine();
        System.out.println("ENter your EMail Id");
        String e=sc.nextLine();
        Person p=new Person(f,l,e,m);
        per.add(p);
    }
    public void view(){
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        for(Person i:per){
            System.out.println("First Name: "+i.getFirst_name()+"\n"+"Last Name: "+i.getLast_name()+"\n"+"Contact Number(s): "+i.getContact_number()+"\n"+"Email address:"+i.getEmail_id());
            System.out.println("-------- * -------- * -------- * --------\n" +
                    "-------- * -------- * -------- * --------");
        }
    }

    }


}
