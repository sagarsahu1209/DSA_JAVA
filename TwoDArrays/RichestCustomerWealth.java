package TwoDArrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
    int[][] arr={{1,2,3},{3,2,4},{4,3,1}};
        System.out.println(maxWealth(arr));
    }

    public static int maxWealth(int[][] accounts) {
        //person = row
        // account=col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // When you take a new col, take a new sum for that row
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                    sum+=accounts[person][account];
            }

            //Now we have sum of each accounts of person
            //check with overall ans
            if(sum > ans){
                ans =sum;
            }
        }
        return ans;
    }
}

