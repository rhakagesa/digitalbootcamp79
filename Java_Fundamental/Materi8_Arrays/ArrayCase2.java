import java.util.Scanner;


public class ArrayCase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number[] = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};    
        int inputIndex, inputValue;
        Boolean isTrue = true;
    
        System.out.println("Merubah nilai dari Arrays numbers.");
        System.out.println("List Angka :");
        System.out.print("{");
        for (int i = 0; i < number.length; i++) {
            if(i != number.length-1){        
                System.out.print(number[i] + ", ");
            } else{
                System.out.print(number[i]);
            }            
        }
        System.out.print("}");

        System.out.println();
        while (isTrue) {
            System.out.print("Masukan posisi yang mau diganti (1-13) cari : ");
            inputIndex = input.nextInt();
            if(inputIndex > 13 || inputIndex < 1){
                isTrue = true;
            } else {
                System.out.print("Masukan nilai yang akan diinputkan ke dalam array number : ");
                inputValue = input.nextInt();
                
                for (int i = 0; i < number.length; i++) {
                    if(i == inputIndex-1){        
                        number[i] = inputValue;            
                    }
                }
                isTrue = false;
            }    
        }

        

        System.out.println("Menampilkan array number setelah dirubah :");
        System.out.print("{");
        for (int i = 0; i < number.length; i++) {
            if(i != number.length-1){        
                System.out.print(number[i] + ", ");
            } else{
                System.out.print(number[i]);
            }            
        }
        System.out.println("}");

        
        
    
    }

}
