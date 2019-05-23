public class LinearSearch {
   public static void main(String args[]) {
      int counter, num, item, array[];
      
      Scanner input = new Scanner(System.in);
      System.out.println("Введите размер массива: ");
      num = input.nextInt();
 
      array = new int[num]; // создаем пустой массив, определенного выше размера
      System.out.println("Введите " + num + " чисел");
      for (counter = 0; counter < num; counter++) {
        array[counter] = input.nextInt();
      }
      System.out.println("Введите число, которое надо найти: ");
      item = input.nextInt();
 
      for (counter = 0; counter < num; counter++) {
         if (array[counter] == item) {
           System.out.println(item + " является " + (counter+1) + " по счету в массиве");
           // Число найдено, следовательно прекращаем поиск
           // вызовом оператора break
           break;
         }
      }
      if (counter == num) {
        System.out.println("Число " + item + " не найдено в массиве");
      }
   }
}