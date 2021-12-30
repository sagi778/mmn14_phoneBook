package Phone_Book;

import java.util.*;

public class BookLogic extends TreeMap {

    //constructor
    public BookLogic(){super();}
    public BookLogic(String name, String num){
        super();
        put(name,num);
    }

    //methods
    public boolean remove(String name){ //remove element

        if( get(name) != null ){
            super.remove(name);
            return true;
        }
        else{
            return false;
        }
    }
    public Iterator KeyIterator(){ // return table iterator

        return (Arrays.asList( super.keySet() )).iterator();
    }


    public String toString(){

        String str = "";
        //ArrayList<Person> arr = Arr
        Iterator<Person> iter = KeyIterator();

        while( iter.hasNext() ){

            str += iter.next() + "\n";
        }
        return str;
    }
}
