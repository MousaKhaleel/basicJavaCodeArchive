
package study;

public class genericClass <E> {
    E x;
    E y;
    genericClass(E x,E y){
        this.x=x;
        this.y=y;
    }
    public void setX(E x){
        this.x=x;
    }
        public void setY(E x){
        this.y=y;
    }
    public E getX(){
        return x;
    }
        public E getY(){
        return x;
    }
}
