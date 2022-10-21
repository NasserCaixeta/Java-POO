package Tools;

public class TextArea {
    private String text;
    int linecount; //defalut
    protected void formatext(){
 System.out.print("formatext()");
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }

}

