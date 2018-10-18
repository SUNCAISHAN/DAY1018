package com.iss.demo;

public class Main4 {
	 public static void main(String[] args) {
	        int n = 10;
	        int[] array = new int[n];
	        for(int i =0;i<10;i++) {
	            array[i] = (int) (Math.random() * 100 + 1);
	        }
	        for (int i = 0; i < 10; i++) {

	            System.out.print(array[i] + "  ");
	        }
	        System.out.println();
	        maxdigit(array);
	        mindigit(array);
	        BubbleSort(array);
	    }
	    public static void maxdigit(int array[]){
	        int max=array[0];
	        for(int j=1;j<array.length;j++)
	        {
	            if(array[j]>max) max=array[j];
	        }
	        System.out.println("最大值为："+max);
	    }
	    public static void mindigit(int array[]){
	        int min=array[0];
	        for(int j=1;j<array.length;j++)
	        {
	            if(array[j]<min) min=array[j];
	        }
	        System.out.println("最小值为："+min);
	    }
	    public static void BubbleSort(int array[]){
	        for(int i=0;i<array.length-1;i++){
	            for(int j=0;j<array.length-1-i;j++){
	                if(array[j]>array[j+1]){
	                    int temp=array[j];
	                    array[j]=array[j+1];
	                    array[j+1]=temp;
	                   }
	              }
	          }
	        System.out.println("排序后的数组为：");
	            for(int num:array) {
	                System.out.print(num + " ");
	            }
	    }
}
