/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor.  
 */

/**
 *
 * @author Merve
 */
public class Test {

    public static void main(String[] args) {
        Item items[] = new Item[11];
        double values[] = {15, 10, 9, 5, 8, 3, 10, 23, 12, 6, 7};
        double weights[] = {1, 5, 3, 4, 4, 5, 10, 2, 9, 8, 5, 7};
        double maxCapacity = 15;

        for (int i = 0; i < items.length; i++) {
            Item item = new Item(values[i], weights[i]);
            items[i] = item;
            //  System.out.println(item);
        }

        KnapsackProblem p = new KnapsackProblem(items.length, items, maxCapacity);
        PSO psoForKnapsack = new PSO(10, p, 100);
        psoForKnapsack.solve();
    }
}
