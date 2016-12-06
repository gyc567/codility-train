package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/6/2016.
 */
public class NULL {
    private String id;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NULL aNull = (NULL) o;

        return id.equals(aNull.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }



    public static void haha(){
        System.out.println("haha");
    }
    public static void main(String[] args) {
        ((NULL)null).haha();
    }


}
