
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
         for(int i=0;i<array1.Length;i++){
             sum[i]=array1[i] + array2[i];
             Console.Write(sum[i] + " ");
         }

         int[,] arr1={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
         };

         int[,] arr2={
            {2,4,5},
            {1,4,2},
            {2,6,5}
         };

         int [,] resultArr={
            {3,6,8},
            {5,9,8},
            {9,14,14}
         };
            int[,] result= new int[3,3];
            Console.WriteLine("\n2D array addition");
            Console.WriteLine(arr1.Length +"=array1 length");


            for(int i=0;i<arr1.GetLength(0);i++){
                for(int j=0;j<arr1.GetLength(1);j++){
                result[i,j]=arr1[i,j]+arr2[i,j];
                Console.Write(result[i,j] + "");
            }
            Console.Write("\n");

            }

            Console.WriteLine("given array is:");

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    Console.Write(arr2[i,j]);
                }
                    Console.Write("\n");
            }

}
}