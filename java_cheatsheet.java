******************************************************************************BASIC************************************************************
public class Main{
       class name same as name of java file
     public static void main(String[] args){
        byte b=5; // 1byte
        short s=5; //2 bytes
        int i=5; //4 bytes
        char c='a'; //2 bytes
        double d=5.5; //8 bytes
        float f=5.5f; //4 bytes
        long l=500000000000l;
        c=97;
        System.out.print(c); //ascii of a output-> a
        double d1=5; //double stores int, implicit conversion ->5.0
        int casting=(int)5.5; //type casting, explicit conversion
        System.out.println(casting);
        
        //byte->short->int->long->float->double
                     //char->->int->long->float->double
 
*****************************************************************NAMING CONVENTIONS*********************************************************

        //interface name ->Runable, Serializable ->adjective ->first letter caps
        //class->Student,Engineer->noun->first letter caps
        //method->print,perform->verb->first letter small
        //variable->about entity->first letter small
        //constant->PI,G,MAX_DENSITY->won't change->all letters caps
        //packages->every letter small
        
        //eg abc
        // variable-> abc
        // constant->ABC
        // constructor->Abc()
        // class->Abc
        // method->abc()
        // interface->flexible
                
        //java uses camel case-> MyFirstJavaClass

***********************************************    *****************OPERATORS******************************************************************************

        // Arithmetic->+,-,/,*,%
        // a++ ->post inc-> print a then increment
        // ++a ->pre inc-> first increment then print
        // bitwise->
        // relational
        // logical
        
        // println() It adds new line after the message gets dispalyed.	
        // print() It does not add any new line.
        //adding brackets or removing them won't change a thing, but provides code readability
        //more than one statement use brackets
    
        int a=5;
        if(a%2==0)
            System.out.println("even");
        
        else
            System.out.println("odd");   
        
        // ternary operator-> ?:->condition?true:false
        int a1=2,b1=3,c1;
        c1=(a1>b1)?1:0;
        System.out.println(c1);  
 
******************************************************************************SWITCH CASE******************************************************************************

        // char choice='a';
        String choice="abc";
        switch(choice){
            case "abc":
                System.out.println(choice); 
                break;
            case "b":
                System.out.println(choice);
                break;
            default:
                System.out.println(choice); 
                break;
            
        }
        
    }
}


******************************************************************************PATTERN******************************************************************************

public class Main{
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==1 & j==1 || i==1 & j==2 ||i==2 & j==1||i==2 & j==2){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }    
            }
            System.out.println();
            
        } 
    }
    
}

******************************************************************************CONSTRUCTOR******************************************************************************

class demo{
    int a,b; //variables
    float result;
    public demo(){
        //constructor->same name as class name
        //allocates memory required for an object of a class
        //never returns anything
        //if constructor is not created explicitely, it is there 
        //also called default constructor
        //helps to provide initial values to variables
        //no need to call, gets called automatically
        //one class can have multiple constructors provided they have diff num of param
        //aka constructor overloading
    }
    public void addition(char n,float c){  //method
        result=a+b+n+c;
    }
}
public class Main{
    public static void main(String[] args){
        // to call a method from class we need an object,
        //to call main method we need object but main is starting point of our program
        //i.e. to call main we need object and to create object we need main thereby creating a deadlock situation
        //therefore we declare main method as static, thus we don't require object to call main just a class name is enough
    
        demo d1=new demo(); //creating object -> new keyword set space required
        demo d2=new demo(); //creating object -> new provide memory based on constructor
        
        d1.a=2;
        d1.b=5;
        d1.addition('a',3.3f);
        System.out.println(d1.result);
        
    }
}


class demo{
    int a,b,e,f;
    String sent;
    float result;
    public demo(int a,int b){  //constructor
        // a=2;  //initializing
        // b=3;  //if uncommented output is 0,0,2,3
        e=a;
        f=b;
    }
    public demo(){  //2nd constructor
        sent="empty";
    }
    
}

public class Main{
    public static void main(String[] args){ //main
        demo d=new demo(5,6);  //object->calls constructor
        demo d1=new demo();
        System.out.println(d.a); //0
        System.out.println(d.b); //0
        System.out.println(d.e); //5
        System.out.println(d.f); //6
        System.out.println(d1.sent);
    }
}

******************************************************************************THIS KEYWORD******************************************************

class demo{ //class
    int num1,num2;
    char a,b;
    public demo(int m,int n){ //constructor
        num1=m; //3 is assigned //when diff local and instance variable name no need to use this keyword
        num2=n; //4 is assigned
    }
    public demo(char a,char b){
        // a=a;//same instance and local variable cause issue
        // b=b;//this assumes both variabls are local
        //to fix this issue we use this keywordto indicate that the 
        //variable is an instance variable and not local
        
        this.a=a; //this represents current object/instance
        this.b=b;
    }
    
    
}
public class Main{  //main class
    public static void main(String[] args){ //main method
        demo d=new demo(3,4);  //creating object
        demo d1=new demo('a','b');
        System.out.println(d.num1); //3
        System.out.println(d.num2); //4
        System.out.println(d1.a); //a
        System.out.println(d1.b); //b
    }
}

******************************************************************************METHOD OVERLOADING*************************************************

// method overloading-> same method name, but diff number of param or diff datatype of param
class operation{
    int result;
    // public operation(int a,int b){
    //     this.a=a;
    //     this.b=b;
    // }
    public void add(int a,int b){
        result=a + b;
        System.out.println(result);
    }
    public void add(int a,int b,int c){
        result=a + b+c;
        System.out.println(result);
    }
    
}

public class Main{
    public static void main(String[] args){
        operation o=new operation();
        // operation p=new operation(3,4);
        o.add(1,2);
        o.add(3,4,2);
        
    }
}


// constructor overloading same as method overloading

******************************************************************************STATIC VARIABLE, STATIC BLOCK****************************************************

class student{
    int roll;  //static var goes into class loader memory
    static String school_name; //makes school_name static i.e it stays same for all the instances even if just one instance is changed
    
    public student(){  //constructor to initialize, gets called for every object
        roll=10;
        // school_name="a"; //instead of calling school_name again and again evry time new obj is created we use static block
        //to initialize static vars as they are same for every instance of a class
    }
    
    static{
        school_name="stats"; //school_name becomes stats when school_name is not initialized or not provided by user/programmer
    }
    
    public void show(){
        System.out.println(roll+" "+school_name);
    }
    
}

//non static var->constructor, can have multiple constructor blocks
//static var-> static block, can have multiple static blocks
//static block gets executed first and then the constructor
//cannot access non static var inside a static method
public class Main{
    public static void main(String[] args){
        student s1=new student(); //in heap
        student s2=new student(); //in heap
        student s3=new student();  //in heap
        s1.roll=1;
        s2.roll=2;
        s1.school_name="abc"; //set s1 school as abc
        s2.school_name="abc"; //set s2 school as abc
        s2.school_name="pqr"; //set s2 school as pqr, since school name is static it changes school name for s1 and s2 obj
        
        student.school_name="uvw"; //static var can be accessed using class names
        s1.show();
        s2.show();
        s3.show(); //even when no info provided int takes 0 as default and school nme becomes pqr
    }
}


******************************************************************************ONE CLASS INSIDE OTHER, STATIC CLASS*****************************************
//one class inside another
class outer{
    public void show(){
        System.out.println("from outer class");
    }
    class inner{ //class name outer$inner.class file gets created
        public void show(){
            System.out.println("from inner class");
        }
    }
    
    static class inner_static{ //static class
        public void show(){
            System.out.println("from static inner class");
        }
    }
    
}
public class Main{
    public static void main(String[] args){
        outer o=new outer();  //object of outer class
        o.show();
        
        outer.inner i=o.new inner();  //object of inner class
        //create ref using class name, and call constructor using object name 
        i.show();
        
        outer.inner_static i=new outer.inner_static(); //object of inner static class
        //create ref using class name and call constructor using class name as the class you are calling is a static class
        //so that class can be referenced/called using class name istead of object name
        is.show();
        
        
    }
}

// types of classes we have
// member class->the simple class we've been using without static keyword
// static class->the one that can be referenced using class name and has static keyword
// anonymous class-> class that has no name

******************************************************************************ARRAYS******************************************************************************

// Arrays->i-row,j-cols
// 1d->has i  
// ****
// 2d->has i and j, for every i, j is same  
// ****    ***
// ****    ***
// ****    ***
// jagged array->has i and j, for every i, j may or may not be same
//   ***
// ********
//  **
// ***


class student{
    int roll;
    String name;
    public student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public void show(){
        System.out.println(roll+", "+name);
    }
    
}

public class Main{
    public static void main(String[] args){
        int a[]=new int[3]; 
        //int->dtype, arr[]->array name, new->arrays are object and we declare objects using new keyword, int[size]->size for array
        System.out.println(a[1]); //output->0 creates arrays of 0 as default for int is 0
        
        a[0]=10;
        a[1]=20;
        a[2]=30;
        
        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
        
        int b[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
        
        //creating array of objects;
        student s=new student(1,"abc");
        student t=new student(2,"cde");
        student u=new student(3,"efg");
        student d=new student(4,"ghi");
        student e=new student(5,"ijk");
        
        // student s_arr=new student[5]; and then set val or
        student s_arr[]={s,t,u,d,e};
        for(int i=0;i<5;i++){
            System.out.println(s_arr[i]); 
            System.out.println(s_arr[i].roll);
            System.out.println(s_arr[i].name);
            s_arr[i].show();
        }
        
        //2d array
        int two_d_arr[][]={
            {1,2,3},
            {3,4,5},
            {5,6,7}
            
        };
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(two_d_arr[i][j]);
            }
            System.out.println();
        }
        
        //jagged array
        int jagged_arr[][]={
            {1,2,3,4,5},
            {1,2,3},
            {6,7,8,9,1,4,3,4}
        };
        
        for(int i=0;i<jagged_arr.length;i++){
            for(int j=0;j<jagged_arr[i].length;j++){
                System.out.print(jagged_arr[i][j]);
            }
            System.out.println();
        }

*********************************************************************ENHANCED FOR LOOPS**************************************************

        //enhanced for loop for arrays
        
        
        int new_for_loop_1d[]={10,20,30,40};
        for(int i:new_for_loop_1d){
            System.out.print(" "+i);
        }
        
        
        int new_for_loop[][]={{6,9,0},{1,2,3,4,5}};
        for(int j[]:new_for_loop){
            for(int i:j){
                System.out.print(i);
            }
            System.out.println();
        }
        



*************************************************VARIABLE LENGTH ARGUMENT******************************************************************************

//variable length arguments
class demo{
    public int add(int ...a){  //come as array->{1,1,1,1,1,1}
        int total=0;
        for(int i:a){
            total+=i;
        }
        
        return total;
    }
}

public class Main{
    public static void main(String[] args){
        demo d=new demo();
        System.out.println(d.add(1,1,1,1,1,1));
    }
}

******************************************************************************INHERITANCE******************************************************************************

//inheritance
//type of inheritance in oops-> single, multilevel, multiple, heirarchical, hybrid
// types of inheritance in java->single level->multi-level->heirarchical

************************************************************SINGLE LEVEL INHERITANCE******************************************************************************

//single level inheritance  a->b, a->c
class vehicles{  //super,parent,base
    public void move(){
        System.out.println("moving...");
    }
}

class car extends vehicles{ //sub,child,derived
    public void tyre(){
        System.out.println("no of tyre for car");
    }
}

class truck extends vehicles{ //sub,child,derived
    public void load(){
        System.out.println("load carried by truck");
    }
}

public class Main{
    public static void main(String[] args){

        car c=new car(); //object of chile/sub class
        truck t=new truck(); //object of chile/sub class
        c.move();
        t.move();
        c.tyre();
        t.load();

    }
}


******************************************************************************MULTI LEVEL INHERITANCE*********************************************************

//multi-level-inheritance   a->b, b->c
class a{
    public void grandpa(){
        System.out.println("this is grandpa");
    }
    public void introduce(){
        System.out.println("my name is gp");
    };
}

class b extends a{
    public void parent(){
        System.out.println("this is parent");
    }
    public void introduce(){
        System.out.println("my name is pp");
    };
}

class c extends b{
    public void kid(){
        System.out.println("this is child");
    }
    public void introduce(){
        System.out.println("my name is cc");
    };
}
public class Main{
    public static void main(String[] args){
        c child=new c();  //can access a and b class
        child.kid();
        child.parent();
        child.grandpa();
        child.introduce();
    }
}


******************************************************************************SUPER KEYWORD******************************************************************************

//super
// during inheritance, when we create object  of sub class we call constructor of both
// sub and superclass
//but if super and sub class have prameterized constructor along with default one 
// when we call object of sub class the parameterized constructorof subclass gets called
// but the default constructor for super class is called instead of parameterized one as show below

class a{
    public a(){
        System.out.println("in default constructor of a");
    }
    public a(int n){
        System.out.println("in parameterized constructor of a with n value as "+n);
    }
}
class b extends a{
    public b(){
        System.out.println("in default constructor of b");
    }
    public b(int n){
        System.out.println("in parameterized constructor of b with n value as "+n);
    }
}

public class Main{
    public static void main(String[] args){
        b obj=new b();
        b obj1=new b(2);
        //output-> default a, default b, default a, parameterized b

    }
}

//this happens because every constructor in subclass will by default have a method called super() even when not mentioned
//thus when sub class calls the parameterized constructor it calls supper class but it has no paramters as it is default one
//so when we add param to supper(param) it calls constructor of super class with param instead of empty method 
//thereby calling parameterized constructor of superclass as below

class a
{
  public a ()
  {
    System.out.println ("in default a");
  }
  public a(int n)
  {
    System.out.println ("in parameterized a");
  }
}

class b extends a{
    public b(){
        // super(5)  //to call default of b but parameterized of a 
        System.out.println("in default b");
    }
    public b(int n){
        super(n);
        System.out.println("in parameterized b");
    }
}

public class Main{
    public static void main(String[] args){
        b obj=new b();  //->default a, default b
        b obj1=new b(5); //without super()->default a,default b, default a, parameterized b
        b obj2=new b(6); //with super()->default a,default b, parameterized a, parameterized b,parameterized a, parameterized b
    }
}


// java doesn't support multiple inheritance directly because of ambiguity
// ambiguity-> when c extends a and b, a and b both have show method but c doesnt, when c calls show java is confused which show to call whether from a or b

******************************************************************************METHOD OVERRIDING******************************************************************************

//method Override
class a
{
  public void show()
  {
    System.out.println ("in  a");
  }
  
}

class b extends a{
    public void show(){
        super.show(); //calls show method of a as well
        System.out.println("in  b");
    }
   
}

public class Main{
    public static void main(String[] args){
        b obj=new b();  
        obj.show(); //child class overrides parent class show method
        //to get parent as well as child class show method using super to represent parent class
        //without super->in b
        //with super-> in a, in b
        
    }
}
 
 
******************************************************************************DYNAMIC METHOD DISPATCH*************************************************************

// dynamic method dispatch->refer telusko video for more
// //dynamic method dispatch-> ref of superclass and object of subclass
// // superclass ref=new subclass() ->creating object
// //executes those methods of subclass which are present in superclass

// //to achieve dynamic method dispatch we need to first achieve runtime polymorphism

class a{
    public void show(){
        System.out.println("in a ");
    }
}
class b extends a{
    public void show(){
        System.out.println("in b");
    }
    public void temp(){
        System.out.println("in temp");
    }
}
class c extends a{
    public void show(){
        System.out.println("in c");
    }
}

public class Main{
    public static void main(String[] args){
        a obj=new b();//runtime polymorphism
        obj.show();//executes show of subclass as object is of subclass hence reference doesn't matter
        // obj.temp(); //won't execute as temp method is not in reference that is in a class
        obj=new c(); //dynamic method dispatch
        //same reference but object of c
        obj.show();//prints in c
    }
}


******************************************************************************ENCAPSULATION******************************************************************************

// encapsulation ->getters and setters
//binding variables with methods->variables can only by accesses by using methods
// this is done by making variable private and methods public

class encap{
    private int a=6;  
    public void setA(int a){ //setter
        this.a=a;
    }
    public int getA(){  //getter
        return this.a;
    }
}

public class Main{
    public static void main(String[] args){
        encap e=new encap(); //a is 6
        e.setA(5); //a is set to 5
        System.out.println(e.getA()); //prints 5
    }
}

******************************************************************************WRAPPER CLASS, AUTOBOX***********************************************************

// wrapper classes->autoboxing
// int,float,etc are primitive datatype but in oops everything is in terms of object, so we use wrapper class to do that

public class Main{
    public static void main(String[] args){
        int a=5;//primitive datatype
        Integer b=new Integer(5); //object->integer is called wrapper class
        Float f=new Float(1.1f); //wrapper class
        System.out.println(a+b); //10
        System.out.println(f);
        
        //putting primitive value into wrapper is called boxing
        
        int w=20;
        Integer i=new Integer(w); //boxing
        System.out.println(i); //20
        
        int j=i.intValue(); //unboxing, since i is now object we need method to gt it back
        System.out.println(j); //20
        
        Integer value=15; //autoboxing->implements automatically the new Integer() part
        //assign i object directly to object
        System.out.println(value); //15
        
        // int j=i.intValue(); instead of doing this we can use autounboxing
        Integer k=15; //autounboxing
        System.out.println(k); //15
        
        // boxing->Integer i=new Integer(5);        ->creates int object
        // unboxing->Integer value=i.intValue();    ->access int's value from object
        // autoboxing->Integer j=10;                ->creates int object
        // autounboxing->Integer value=j;           ->access int's value from object
        
        //primitive works faster that wrapper
        //some frameworks only work with wrapper class
        
        String s="12345";
        int n=Integer.parseInt(s);  //parseInt is static method so we need class name
        System.out.println(n); //gets int n from string s
        
    }
}


******************************************************************************ABSTRACT CLASS******************************************************************************

//abstract class->cannot create object of an abstract class
// incase you want to create a class but do not want to add any functionality but just extend it we use abstract class
// lets you define methods instead of declaring it
// to have an abstract method, it need to be inside an abstract class
//here, human class is called abstract class and women class is called concrete class

abstract class Human{ //abstract class
    public abstract void eat(); //abstract method to declare a method like an int, has to be Overridden
    public void sleep(){ //no need to define in subclass
        System.out.println("sleeping...");
    }
}

class Women extends Human{ //class that extends an abstract class
    //when we have an abstract method in superclass we need to define it in subclass
    //if abstract method is not defined in subclass, then subclass also becomes an abstract class
    public void eat(){
        System.out.println("this is eat from subclass,compulsary to be defined");
    }
    public void show(){
        System.out.println("hii");
    }
    
}
public class Main{
    public static void main(String[] args){
        // Human h=new Human(); //cannot be instantiated as its an abstract class
        //we can create reference of Human but not its object
        Human h=new Women(); //valid, reference of abstrat class but object is of subclass
        // h.show();//error as human has no show method->dynamic method dispatch
        h.eat();
        
        Women w=new Women();
        w.eat();
        w.show();
        w.sleep();
        
    }
}

******************************************************************************NEED OF ABSTRACT CLASS**************************************************

// need of abstract class
// eg-> integer and float both extends number class
class temp{
    public void show(Integer i){
        System.out.println(i);
    }
    public void show(Float i){
        System.out.println(i);
    }
}

class demo{
    public void show(Number i){
        System.out.println(i);
    }
    
}
public class Main{
    public static void main(String[] args){
        temp t=new temp();
        t.show(5); //have to pass int as show takes integer as param
        t.show(1.1f);
        //to pass float another method will be needed using method overloading which is tedious as then
        //we'll need another method for every datatype thus what we can do is instead of taking Integer i as param
        //we can use Number i as param, number class is super class and int, float,etc are subclass
        //so that method based on param passed will execute as shown in demo snippet
        
        demo d=new demo();
        d.show(1);
        d.show(1.1);
        d.show(10l); //no need to create separate method for each dtype, now numbers in this exampe is an abstract class
    }
}
abstract class human{
    abstract public void eat();
    abstract public void sleep();
}

class man extends human{
    public void eat(){
        System.out.println("man eating");
    }
    public void sleep(){
        System.out.println("man sleeping");
    }
}

class woman extends human{
    public void eat(){
        System.out.println("woman eating");
    }
    public void sleep(){
        System.out.println("woman sleeping");
    }
}

class execute{
    // public void show(man i){
    //     i.eat();
    //     i.sleep();
    // }
    // public void show(woman i){
    //     i.eat();
    //     i.sleep();
    // }
    
    //had to create 2 separate methods but now we can pass in any object of human class 
    public void show(human i){
        i.eat();
        i.sleep();
    }
}

public class Main{
    public static void main(String[] args){
        execute e=new execute();
        // man m=new man();
        // woman w=new woman();
        // e.show(m); //man eat, sleep
        // e.show(w); //woman eat, sleep
        human m=new man();
        human w=new woman();
        e.show(m); //man eat, sleep
        e.show(w); //woman eat, sleep
    }
}

******************************************************************************FINAL KEYWORD-VARIABLES*********************************************************

//final keyword another name for constants->values that cannot be changed
class A{
    int i=0; //normal variable
    final double PI=3.14; //constant with final keyword
    final double DEGREE; //declaring constant
    public A(){
        i=10; //can be changed
        // PI=10; cannot be changed once set
        DEGREE=360.0; //assigning val to constant now it cannot be changed after set once
    }
}
public class Main{
    public static void main(String[] args){
        A a=new A();
        System.out.println(a.i);
        System.out.println(a.PI);
        System.out.println(a.DEGREE);
    }
}

******************************************************************************FINAL KEYWORD-CLASSES******************************************************************

//constant classes using final keyword
// in scenarios where we don't want other classes to extend our class we set the class as constant
final class A{
    public void show(){
        System.out.println("in a");
    }
}
class B extends A{ //cannot inherit from A as A is constant class, this throws error

}

public class Main{
    public static void main(String[] args){
        B b=new B();
        b.show(); //error
    }
}

******************************************************************************FINAL KEYWORD-METHOD******************************************************************************

//constant method using final keyword
//to avoid overriding done by subclass
class A{
    final public void show(){
        System.out.println("in a");
    }
}
class B extends A{ 
    public void show(){
        System.out.println("in b");
    }
}

public class Main{
    public static void main(String[] args){
        B b=new B();
        b.show();  //error: show() in B cannot override show() in A

    }
}


//final with -> class ->no other class can then inherit from it
// final with -> method ->no subclass methods can override it
// final with -> variable ->once set its value cannot be changed

******************************************************************************ABSTRACT VS INTERFACE*******************************************************************

//abstract class vs interface
// in java multiple inheritance is not supported directly thus one class cannot inherit from multiple classes

// in interface class we can only define abstract methods
//indirect creation of multiple inheritance using inetrface, instead of extends use implements
//in following eg mother and father extend brother and sister
//brother and sister extend both mother and father class, but java does not support multiple inheritance
//so instead of both superclass being abstract we declare one of them as an interface, all methods in interface have to be abstract
//we cannot create object of interface only reference for it

interface mother{ 
    // public abstract void show();
    void show(); //no need to write public abstract as all methods in interface are by default abstract
    when we create variable inside interface it become constant by default

}    
interface me{
    void about();
}

abstract class father{
    public abstract void show();
}


class brother extends father implements mother,me {
    public void show(){
        System.out.println("brother");
    }
    public void about(){
        System.out.println("about brother");
    }
}
class sister extends father implements mother,me{
    public void show(){
        System.out.println("sister");
    }
    public void about(){
        System.out.println("about sister");
    }
}

public class Main{
    public static void main(String[] args){
        father b=new brother(); //we cannot create object of abstract only reference for it
        mother s=new sister(); //we cannot create object of interface only reference for it
        me m=new sister();
        b.show();
        s.show();
        m.about();
    }
}

//we can implement multiple interfaces but not multiple class
// cannot define methods in interface just declare it


******************************************************************************ANONYMOUS CLASS******************************************************************************

// anonymous class->class that doesn't have a name

class a
{
  public void show ()
  {
    System.out.println ("in a show");
  }
}

class b extends a{  //to have a print something diff we override a's existing method that is the only
// funationality of b, instead of this we create anonymous class while creating object of a 
    public void show(){
        System.out.println("some diff text other than what a prints");
    }
}


public class Main
{
  public static void main (String[]args)
  {
    a obj = new a(){
        public void show(){
        System.out.println("some diff text other than what a prints");
    }
        
    };//this is anonymous class
    obj.show();
      
  }
}


******************************************************************************ANONYMOUS CLASS WITH INTERFACE****************************************************************

//anonymous class with interface

interface a{
    void show();
}

// class b implements a{
//     public void show(){
//         System.out.println("in b show");
//     }
// } 
//we cannot create object of interfae so we created class b for it, but instead we can
// use anonymous class to define b while creating object itself
//thus we created object f interface indirectly whithout creating  a separate class for it

public class Main{
    public static void main(String[] args){
        a obj=new a(){
                public void show(){
                    System.out.println("in a show");
                    //thus we created object f interface indirectly whithout creating  a separate class for it
                }
        };
        obj.show();
    }
}


******************************************************************************TYPES OF INTERFACE******************************************************************************

// types of interface
// 1.normal interface->if interface has more than one abstract method
// 2.single abstract method interface->interface that has only one abstract method ->
        // in java sam 8-> called as functional interface-> we can use lambda expression
// 3.marker interface->has no methods/abstract method in it 


******************************************************************************FUNCTIONAL INTERFACE******************************************************************************

@functionalInterface //annotation, not imp but helps to keep restrictions
interface a{
    void show();
}

interface b{
    void info();
    void about();
}


public class Main{
    public static void main(String[] args){
        //we can create object of an interface in one line using lambda expression
        // a obj=new a(){
        //     public void show{
        //         System.out.println("in a interface using anonymous func");
        //     }
        // };  declared using anonymous
        
        a obj=() -> System.out.println("in a interface but using lambda exp");
        //lambda expression only possible for functional interface, one method interface
        obj.show();
    }
}

**************************************************DEFAULT METHODS******************************************************************************

// default methods
//abstract class can declare and define methods but interface can only declare methods
//but in latest version of java 1.8 interface can define methods as well

interface a{
    void show();
    default void about(){
        System.out.println("in interface a about");  //this method can be overriden in implementation
    }
}
//interface a is still functional interface as it has only one abstract method
public class Main{
    public static void main(String[] args){
        a obj=()->System.out.println("hello");  //lambda exp as a is functional interface
        obj.show();
        obj.about();
    }
}


//using default keyword generated problem with multiple inheritance
//because f default we can now create methds in interface as well 
//thus when one class implements  interfaces it gets confused about which interface to implement, 
// this can removed by either having the method inside our class or using superclass

interface a{
    default void show(){
        System.out.println("in a show");
    }
}
interface b{
    default void show(){
        System.out.println("in b show");
    }
}

class c implements a,b{
    public void show(){
        a.super.show();
        b.super.show();
    }
}

public class Main{
    public static void main(String[] args){
        c obj=new c();
        obj.show();
    }
}


***********************************************************STATIC METHODS IN INTERFACE******************************************************************

//static methods in interface -> instead of creating a whole new class and then implement interfacce
// we can create static method inside an interface which don't need an object to call them

interface demo{  //interface
    static void show(){
        System.out.println("in demo show");
    }
}

public class Main{
    public static void main(String[] args){
        
        demo.show();
    }
}

class demo{  //class
    static void show(){
        System.out.println("in demo show");
    }
}

public class Main{
    public static void main(String[] args){
        
        demo.show();
    }
}


******************************************************************************ACCESS MODIFIERS******************************************************************************

//access modifiers -> final, abstract, private, public, protected

// with class we can only use -> final, abstract, public(default)
//if public keyword is not specified for a class we cannot access that class outside the package
//by default variable class are public but if public keyword is not mentioned those classes and vars can't be accessed outside that package

// private->specific class or package
// public->any class or package
// default->specific package
// protected->subsiding(sub class can access protected class) class or package

******************************************************************************EXCEPTION HANDLING******************************************************************************

//Exception handling- try catch finally

public class Main{
    public static void main (String[] args) {
        int val, i=5;
        try{
            val=i/0; //critical statement
        }
        catch(Exception e){
            System.err.println("error");  //err prints msg in red color
        }
        finally{
            System.out.println("finally block runs code whether there is an exception or not");
        }
        System.err.println("rest of code");
    }
}

******************************************************************************MULTIPLE CATCH BLOCKS*******************************************************

// multiple catch blocks
public class Main{
    public static void main (String[] args) {
        int val, i=5;
        int arr[]=new int[5];
        try{
            // val=i/0; //critical statement
            arr[6]=8; //critical statement
        }
        // catch(ArithmeticException e){
        //     System.err.println("error");  //err prints msg in red color
        // }
        // catch(IndexOutOfBoundsException e){
        //     System.err.println("error2");  //err prints msg in red color
        // }
        
        catch(ArithmeticException | IndexOutOfBoundsException e){
            System.err.println("error 3"+e);
        }
        
        
        System.err.println("rest of code");
    }
}

******************************************************************************CREATING YOUR OWN EXCEPTIONS******************************************************************

//creating own Exception
class NewException extends Exception{
    public NewException(String s){
        super(s); //goes to Exception and then detailMessage
    }
}
public class Main{
    public static void main (String[] args) throws Exception {
        int a=1,b=2;
        try{
            if(a<=b){
            throw new NewException("you messed up"); //goes to constructor
        } 
        else{
            System.out.println("done");
        }
        }
        catch(NewException e){
            System.out.println("got it: "+e.getMessage());
        }
        
    }
}

******************************************************************************INPUT******************************************************************************

// Java brings various Streams with its I/O package that helps the user to perform all the input-output operations.
//  3 standard or default streams that Java has to provide:
// ->System.in: std input stream used to read from the keyboard or any other standard input device.
// ->System.out: std output stream that is used to produce the result of a program on an output device like the computer screen.
// print()->prints, println()->cursor to next line,printf()->may take multiple argument
// ->System.err: std error stream to output all the error data that a program might throw, on a computer screen

// user input->scanner, bufferreader

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main{
    public static void main (String[] args) throws Exception {
        System.out.println("enter num: ");
        InputStreamReader is=new InputStreamReader(System.in);  // create input stream obj and pass System.in into it
        BufferedReader br=new BufferedReader(is); //create buffer obj and pass input stream obj in it
        int i=Integer.parseInt(br.readLine()); //br.readLine() gives you a String so we parse it
        System.out.println(i);
    }
}

import java.util.*; //to get scanner class
public class Main{
    public static void main (String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(i);
    }
}


******************************************************************************THREADING******************************************************************************

//threading
// thread-> by default we have one thread that is main, all execution is done by  that one main thread

class a extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in a");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in b");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class Main{
    public static void main (String[] args) {
        a obj1=new a();
        b obj2=new b();
        obj1.start(); //internally calls run method
        obj2.start();
    }
}

//in cases where classes have to inherit from Thread as well as some other class we use interface Runnable to create threads as 
// java doesn't support mulitple inheritance


******************************************************************************RUNNABLE******************************************************************************

abstract class god{
    public abstract void show();
}

class a extends god implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in a");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
    public void show(){
        System.out.println("in a show");
    }
}
class b extends god implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in b");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
    public void show(){
        System.out.println("in b show");
    }
}

public class Main{
    public static void main (String[] args) {
        a obj1=new a();
        b obj2=new b();
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start(); //internally calls run method
        t2.start();
        obj1.show();
        obj2.show();
    }
}

*****************************************************************MULTI THREAD USING LAMBDA EXPRS**************************************************************

// multi-threading using lambda expressions
// purpose of classes a and b is to implement runnable that's it, since runnable is functional interface
// we can use lambda expression to define class a and b

public class Main{
    public static void main (String[] args) throws Exception{
        
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
            System.out.println("in a");
            try{Thread.sleep(500);} catch(Exception e){}
        }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
            System.out.println("in b");
            try{Thread.sleep(500);} catch(Exception e){}
        }
        });
        
        t1.start(); //internally calls run method
        t2.start();
        
        t1.join();
        t2.join();
        
        //lets both Thread execute first and then th main thread starts executing
        System.out.println("done");
        
    }
}


******************************************************************************SYNCHRONIZATION******************************************************************************

//synchronization
// when working with 2 threads it is possible that they both access same wal at same time and change it leading to inconsistency
// this is avoided using synchroization, when applied to method it restrict one thread to execute that particular method at a time

class counter{
    int j=0;
    public synchronized void inc(){
        j++;
    }
}
public class Main{
    public static void main (String[] args) throws Exception{
        
        counter c=new counter();
        Thread t1=new Thread(
            ()->{
                for(int i=0;i<1000;i++){
                    c.inc();
                }
            }
            );
            
        Thread t2=new Thread(
            ()->{
                for(int i=0;i<1000;i++){
                    c.inc();
                }
            }
            );
            
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.j); //1540 without synchroization, 2000 with synchroization
    }
}


******************************************************************************COLLECTIONS AND GENERICS************************************************************

//collections and generics
// collection->collection of elements->we have them as class, interface, etc
//collection is interface so we need class to create an object
//collection doesn't support index nums
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Collection val=new ArrayList();
        val.add(1);
        val.add(5);
        val.add(9);
        val.add(4);
        System.out.println(val); //[1,5,9,4]
        
        //to fetch vals from collection we can use iterator interface
        Iterator it=val.iterator(); //Iterator->interface, iterator()->method
        System.out.println(it.next()); //1
        System.out.println(it.next()); //5
        
        //or we can use while loop
        while(it.hasNext()){ //hasNext()->method->checks if iterator has anything in it
            System.out.println(it.next()); //9 //4
        }
        
        //collection doesn't h ave method to insert value at a specific index, but list has it
        List list_val=new ArrayList(); //can take in any dtype as it's a List
        list_val.add(1);
        list_val.add(8);
        list_val.add(5);
        list_val.add(1,3);  //.add(index,value)
        // System.out.println(list_val); //[1,3,8,5]
        for(int i=0;i<list_val.size();i++){  //size method 
            // System.out.println(list_val.get(i)); //get method to acces elements
        }
        for(Object i:list_val){ //.add() method takes iin object, has wrapper inside it
            System.out.println(i);
        }
        
    }
}

******************************************************************************GENERICS******************************************************************************

// generics
// using <dtype> to create restricted collection
import java.util.*;
public class Main{
    public static void main (String[] args) {
        List<Integer> list_val=new ArrayList<Integer>(); //will now only take in ints
        list_val.add(1);
        list_val.add(9);
        list_val.add(5);
        
        for(Object o:list_val){
            System.out.println(o);
        }
    }
}

***************************************************************USE OF COLLECTIONS******************************************************************************

// use of collection
import java.util.*;
public class Main{
    public static void main (String[] args) {
        List<Integer> list_val=new ArrayList<Integer>(); //will now only take in ints
        list_val.add(1);
        list_val.add(9);
        list_val.add(5);
        
        Collections.sort(list_val); //[1,5,9]
        Collections.reverse(list_val); //[9,5,1]
        for(Object o:list_val){
            System.out.println(o);
        }
    }
}

******************************************************************************COMPARABLE INTERFACE******************************************************************************

import java.util.*;
class Student implements Comparable<Student>{
    int roll;
    String name;
    public Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    
    public String toString(){
        return "roll: "+roll+" name: "+name;
    }
    
    public int compareTo(Student s){
        return roll>s.roll?1:-1;
    }
    
}


public class Main{
    public static void main (String[] args) {
        
        // Student s=new Student(2,"abc");
        // Student s2=new Student(5,"pqr");
        // System.out.println(s); //roll: 2 name: abc
        
        List<Student> list_val=new ArrayList<Student>(); 
        list_val.add(new Student(9,"uvw"));
        list_val.add(new Student(17,"qwerty"));
        list_val.add(new Student(3,"bhgj"));
        
        // Collections.sort(list_val); //to sort objects we need to make sure that our class implements Comparable
        //instead of creating separate method for comparing we can also do it in oneline
        Collections.sort(list_val,(i,j)->i.roll>j.roll?1:-1);
        for(Object o:list_val){
            System.out.println(o);
        }
    }
}


import java.util.*;
public class Main{
    public static void main (String[] args) {
        Set<Integer> set_val=new HashSet<Integer>();  //use TreeSet for values in ascending sequence
        set_val.add(1);
        set_val.add(10);
        set_val.add(1);
        set_val.add(6);
        set_val.add(9);
        
        for(Object o:set_val){
            System.out.println(o); //1,6,9,10
        }

    }
}


// map- key:value
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Map<String,String> m=new HashMap<>(); //Map<key,value>, can also use HashTable
        //HashTable issynchronized, HashMap isn't
        m.put("name","purva"); //.put(key,value)
        m.put("age","21");
        m.put("hobby","nothing");
        
        System.out.println(m); //{name=purva,age=21,hobby=nothing}
        
        Set<String> keys=m.keySet();
        
        for(String key:keys){
            System.out.println(m.get(key)); //purva,21,nothing
        }
    }
}

*******************************************************Custom Exception *******************************************************

class customException extends Exception{
    customException(String s){
        super(s);
    }    
}

class Calculator{
    int power(int n,int p) throws customException{
        
        if(n<0 || p<0){
            throw new customException("n and p should be non-negative");   
        }
        else{
            int pow=1;
            for(int i=0;i<p;i++){
                pow*=n;
            }
            return pow;
            
        }
            
    }
}
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
