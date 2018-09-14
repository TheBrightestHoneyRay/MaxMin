public class StarTriangle {
    private int width;
    private String start = "";
    private String star = "[*]";

    public StarTriangle(){
    };

    public StarTriangle(int uwidth){
        width = uwidth;
    }



    public String toString(){
        for(int i = 0; i < width; i++){
            for(int j = 0; j <= i; j++){
                start += star;
            }
            start = start + "\n";
        }
        return start;
    }


}
