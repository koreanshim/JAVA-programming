package sec04.exam01_nestedinterface;

public class Button {
    interface OnClickListener {
        void onClick();
    }
    //중첩 인터페이스 선언
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
}