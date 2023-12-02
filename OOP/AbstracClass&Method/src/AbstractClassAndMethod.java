import Child.Rectangle;
import Child.Square;
import Parent.Shape;

public class AbstractClassAndMethod {
    public static void main(String[] args) {
        Shape persegi = new Square("Hijau", 5);
        Shape persegiPanjang = new Rectangle("Biru", 5, 2.5);
        
        System.out.println(persegi.getArea());
        System.out.println(persegiPanjang.getArea());
    }
}
