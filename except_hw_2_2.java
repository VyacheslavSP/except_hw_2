// Один из случаев когда я совсем не понял что я должен сделать в задании. что мы вообще хотим сделать?
// что есть intArray[8]? это значение с индексом 8 из ранее объявленного массива?
// это попытка поделить массив как таковой на число? это попытка поделить не число на число? (char[] intArray_1= new char[10];)-хоть,естественно не выкинет ошибку обработать вручную и выкинуть свое
//
public class except_hw_2_2 {
public static void main(String[] args) {
    try {
   int d = 0;
   int[] intArray= new int[10];
  
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

}
}