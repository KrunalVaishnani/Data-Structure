import java.util.*;

public class Graph{
    
    public static void main(String[] args){
    
    int source;
    int dest;
    int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter node");
        n=sc.nextInt();
        System.out.println("enter edge");
        int e = sc.nextInt();
        int adj[][]=new int[n][n];
        System.out.println("enter source and dest");
        for(int i=0;i<e;i++){
            System.out.println("enter source");
            source = sc.nextInt();
            System.out.println("enter dest");
            dest = sc.nextInt();
            adj[source][dest]=1;
            adj[dest][source]=1;
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(adj[i][j]);
        }
        System.out.println();
    }
        
    }
}