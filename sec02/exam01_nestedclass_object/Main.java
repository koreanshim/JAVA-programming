package sec02.exam01_nestedclass_object;

//바깥 class
class A{
    A() {System.out.println("A 객체가 생성됨");}

    //인스턴스 멤버 클래스: 정적 필드/메소드 X
    public class B {
        B() {System.out.println("B 객체가 생성됨.");}
        int field1;
        //static int field2;
        void method1(){}
        //static void method2(){}
    }

    //정적 멤버 클래스: static 키워드, 모든 종류 가능
    static class C {
        C() {System.out.println("c 객체가 생성됨");}
        int field1;
        static int field2;
        void method1(){}
        static void method2() {}
    }

    void method(){
        //로컬 클래스: 메소드 내애서만 사용, 많이 사용 X, 정적 필드/메소드 X
        class D {
            D() {System.out.println("D 객체가 생성됨");}
            int field1;
            //static int field2;
            void method1(){}
            //static void method2;
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}

public class Main {
    public static void main(String[] args){
        A a = new A();

        //인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        //정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        //로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();

    }
}
