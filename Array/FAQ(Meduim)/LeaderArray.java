import java.util.*;
public class LeaderArray{
    public static ArrayList<Integer> leaders(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader= true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader) ans.add(arr[i]);
        }
        return (ArrayList<Integer>) ans;
    }
    public static void main(String[]args){
        int arr[]={1, 2, 5, 3, 1, 2};
        System.out.println(leaders(arr));
    }
}