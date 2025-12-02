class Solution {
    void merge(int p[], int q[], int l, int mid, int u){
        int k=l, i=l, j=mid+1;
        while(i<=mid && j<=u){
            if(p[i]<=p[j]){
                q[k]=p[i];
                i++;
            }
            else{
                q[k]=p[j];
                j++;
            }    
            k++;
        }
        if(i>mid){
            while(j<=u){
                q[k]=p[j];
                j++;
                k++;
            }
        }
        if(j>u){
            while(i<=mid){
                q[k]=p[i];
                i++;
                k++;
            }
        }
        for(int i2=l; i2<=u; i2++)
            p[i2]=q[i2];
    }
    void mergeSort(int p[], int q[],  int l, int u){
        if(l<u){
            int mid=l+(u-l)/2;
            mergeSort(p, q, l, mid);
            mergeSort(p, q, mid+1, u);
            merge(p, q, l, mid, u);
        }
    }
    public int[] sortArray(int[] nums) {
        int q[]=new int[nums.length];
        mergeSort(nums, q, 0, nums.length-1);
        return nums;
    }
}