public class allfieldclass {

    public static void main(String[] args){
        //객체 생성
        Song song = new Song();
        song.singer = "IU";
        song.singtitle ="좋은날";
        
        System.out.println(song.singer+"가 부른" +song.singtitle);

    }
    
}

class Song{
    String singer="";
    String singtitle = ""; 
}
