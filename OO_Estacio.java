
//====================================

package co.maxwellfarias;

//People eh uma classe abstrata e por isso nao podesse ser instanciada
public abstract class People {

    protected String name;
    protected int age;
    protected static int count = 0;

    //Esse eh o construtor da classe, sempre que for instanciado um objeto, essas variaveis devem ser colocadas como entrada
    public People(String name, int age) {

        //this faz referencia a variavel de campo e nao a variavel que eh captada pelo construtor
        this.name = name;
        this.age = age;

    }

    //Esse metodo deverá obrigatoriamente ser implementado pelas subclasses dessa classe
    protected abstract void introduction();

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}

//As interfaces sao usadas para "obrigar uma classe a implementar determinados metodos"

//Hi eh a superinterface de Bye
interface Hi {
    void sayHi ();
}

interface Bye_Hi extends Hi {
    void sayBye ();
}


//==================================================================================

package co.maxwellfarias;

public class Teacher extends People implements Bye_Hi{

    //O modificador final impede que a variavel imutavel seja modificada.
    protected final int imutavel = 50;

    public Teacher(String name, int age ) {
        super(name, age);

        //Devido a variavel count ser static (ver a classe People), esta sempre tera o seu valor acrescido em um 1 a cada nova instanciação
        count ++;
    }

    //Realizando a implementação do metodo abstrado instroduction da classe People
    @Override
    protected void introduction() {
        System.out.println("I'm teacher");
    }

    //Realizando a implementação da inteface  Bye_Hi
    @Override
    public void sayBye () {
        System.out.println("Teacher says Bye");
    };

    //Realizando a implementação da inteface  Bye_Hi
    @Override
    public void sayHi() {
        System.out.println("Teacher says Hi");
    }
}


//=======================================================================

package co.maxwellfarias;


//extends serve para dizer que a classe Student seja um subclasse de People
public class Student extends People {


   public Student (String name, int age) {
     super(name, age);
       count ++;
   }

    //Realizando a implementação do metodo abstrado instroduction da classe People
    @Override
    protected void introduction() {
        System.out.println("I'm student");
    }




    public void acelerar () {
        System.out.println("Acelerar aqui");
    }
    public void doAnythong () {
        System.out.println("ldhjk");
    }


}




//==========================================================

package co.maxwellfarias;

public class myFirstProgram {

    //Declarando um array de um determinado tipo de objeto
    static private People people [];

    public static void main(String[] args) {


        people = new People[2];

        people[0] = new Teacher("Maxwell", 25);
        people[1] = new Student("Danielle", 27);

        //Mesmo chamando a mesma função, esta age de forma distinta uma vez que foi modificada na subclasse (polimorfismo)
        people[0].introduction();
        people[1].introduction();

        Teacher teacher = new Teacher("Antonio Farias", 53);
        teacher.sayBye();
        teacher.sayHi();
    }







}
