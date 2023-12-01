public class construtorofjava {

    public static void main(String[] args){
        //ew 연산자를 통해서 Poketmon 클래스를 객체로 생성할 수 있다
        Pokemon pokemon = new Pokemon();

        //객체 변수 안에 접근하기 위해서 dot문법(.)사용해서 호출 
        pokemon.name = "피카츄";
        pokemon.power = 100;

        System.out.println(pokemon.name+"가/이"+pokemon.power+"힘으로");

        //객체를통해 메소드를 불러옴
        pokemon.attack();

    }

}

class Pokemon{
    //클래스 = 설계도
    //필드(멤버변수)
    String name="";
    int power=0;
    //메서드(객체의 동작 정의)
    void attack(){
        System.out.println("암바공격");
    }
}
