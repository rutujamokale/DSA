
public class Program{
    public static void Main(string [] args){

        // string [] names={"Rutaa","Nikita","Pranta","Sanika"};

        // for(int i=0;i<names.Length;i++){
        //     Console.WriteLine(names[i]);
        // }


         int [,] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
         };

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Console.Write(arr[i,j] + "");
            }
            Console.WriteLine("\n");
         }

         //addition of two array

         int [] array1={2,3,4,5};
         int [] array2={4,5,6,7};
         int [] sum= new int[4];

         Console.WriteLine("1D addition");
         for(int i=0;i<array.length;i++){
             sum[i]=array1[i] + array[i];
             Console.Write(sum[i] + " ");
         }
    }
}
