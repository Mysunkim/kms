public class allmethodclass {

    public static void main(String[] args){
        //객체 생성
        Varible vb = new Varible();
        //메서드 호출
        int nResult = vb.add(2,3);

        System.out.println(nResult);

    }
    
}

//데이터를 포함하는 멤버 변수 없이 동작만을 가지고있는클래스
class Varible{

    int add(int a,int b){
        return a+b;
    }
}
