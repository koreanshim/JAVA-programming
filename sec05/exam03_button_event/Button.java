package sec05.exam03_button_event;

public class Button {
    interface OnClickListener {
        void onClick();
    }

    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }
}
