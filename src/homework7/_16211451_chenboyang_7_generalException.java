package homework7;

public class _16211451_chenboyang_7_generalException extends Exception {//通用寻源异常
    String src;//来源
    _16211451_chenboyang_7_generalException(){setSrc("");}
    _16211451_chenboyang_7_generalException(String str){setSrc(str);}
    public String getSrc(){return src;}
    void setSrc(String str){src=str;}
}