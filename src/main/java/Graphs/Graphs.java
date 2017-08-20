package Graphs;

/**
 * Created by artur on 20.08.2017.
 */
public class Graphs {

    public static void main(String[] args) {
        //generateGnp (4, 0.5);
        //generateGnk(4,3);
        transformEtoA(4,3);
    }
    public static void generateGnp (int n, double p) {
        boolean [][] result = GraphGnp.generateGnp(n,p);
        PrintStructues.printA(result);
    }

    public static void generateGnk (int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n,k);
        PrintStructues.printE(result);
    }
    public static void transformEtoA (int n, int k) {
       Edge[] graphGnk = GraphGnk.generateGnk(n,k);
        boolean[][] result = Transforms.transformEtoA(n,k, graphGnk);
        PrintStructues.printA(result);
    }
}
