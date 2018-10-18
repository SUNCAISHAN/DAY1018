package com.iss.demo;

public class Main3 {

	public static void main(String[] args) {
		        char a[]={'H','e','l','l','o','\0'};
		        for(int x=0;x<a.length-1;x++){
		            for(int y=x+1;y<a.length;y++){
		                if(a[x]<a[y]){
		
		                    char tmp = a[x];
		                    a[x]=a[y];
		                    a[y]=tmp;
		                }
		            }
		        }
		        for(int x=0;x<a.length;x++){
		            System.out.print(a[x]+" ");
		        }
		    }

}
