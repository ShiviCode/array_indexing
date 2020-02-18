package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("program to find greatest and smallest elements in an array ");
        int  a[] = {2,9,7,5,10,55};
        int i;
        int max=0,min=a[0];

        for(i=0;i < a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }

        }
        System.out.println("greatest element in array  "+max);
        System.out.println("smallest element in array  "+min);
        System.out.println();
        System.out.println("====================================================== ");
        System.out.println();

        int temp=0,j,count=4;
        for (i=0; i<a.length; i++){
            temp=a[a.length-1];
            System.out.println("temp store last value="+temp);
            j=4;
            while ( j>=i ) {
                a[j+1] = a[j];
                System.out.print("  index "+j+"  a[j] "+a[j]);
                j--;
            }
            //count--;
            a[i]=temp;
            System.out.println();
            System.out.println("a[i]=temp  "+a[i]+" index"+i);
        }
        for (i=0; i<a.length; i++){
            System.out.println("ans array "+a[i]);
        }
    }
}
