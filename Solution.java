package hackerRank;

import java.util.LinkedList;
import java.util.Scanner;



public class Solution{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
        DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
        LinkedList<String> arr = new LinkedList<String>(); 
        
        int limit = input.nextInt();
        String arrayType = input.next();
        
        
        if(arrayType.equals("ARR")){
            for(int i = 0; i < limit; i++){
                    int function = input.nextInt();
                    String letter;
                    switch(function){
                        case 1 -> {
                            letter = input.next();
                            arr.addFirst(letter);
                        }
                        case 2 -> {
                            letter = input.next();
                            arr.addLast(letter);
                        }
                        case 3 -> arr.removeFirst();
                        case 4 -> arr.removeLast();
                    }
            }
            System.out.println("ARR: " + arr);
        }
        if(arrayType.equals("SLL")){
            for(int i = 0; i < limit; i++){
                    int function = input.nextInt();
                    String letter;
                    switch(function){
                        case 1 -> {
                            letter = input.next();
                            sll.addFirst(letter);
                            break;
                        }
                        case 2 -> {
                            letter = input.next();
                            sll.addLast(letter);
                            break;
                        }
                        case 3 -> {
                            sll.removeFirst();
                        break;
                        }
                        case 4 -> {
                            sll.removeLast();
                        break;
                        }
                    }
            }
            System.out.println("SLL: " + sll.display());
        }
        if(arrayType.equals("DLL")){
            for(int i = 0; i < limit; i++){
                    int function = input.nextInt();
                    String letter;
                    switch(function){
                        case 1 -> {
                            letter = input.next();
                            dll.addFirst(letter);
                            break;
                        }
                        case 2 -> {
                            letter = input.next();
                            dll.addLast(letter);
                            break;
                        }
                        case 3 -> {
                            dll.removeFirst();
                        break;
                        }
                        case 4 -> {
                            dll.removeLast();
                        break;
                        }
                    }
            }
            System.out.println("DLL: " + dll.display());
        }
    }   
}
