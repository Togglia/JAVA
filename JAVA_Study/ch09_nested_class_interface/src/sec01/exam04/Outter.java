package sec01.exam04;
//로컬 클래스에서 사용제한
public class Outter {

    public void method2(int arg){
        int localVariale =1;
        class Inner{
            public void method(){
                int result = arg + localVariale;
            }
        }
    }
}
