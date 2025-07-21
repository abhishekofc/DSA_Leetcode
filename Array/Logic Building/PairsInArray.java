public class PairsInArray{
    public static void printPairs(int[] arr){
        int totalPairs = 0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printPairs(arr);
        
    }
}


// total Pairs: n(n-1)/2