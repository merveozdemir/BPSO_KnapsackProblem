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
        double values[] = {15, 10, 9, 5, 8, 7, 12, 4, 6};
        double weights[] = {1, 5, 3, 4, 2, 4, 7, 2, 4};
        double maxCapacity = 12;
        KnapsackProblem p = new KnapsackProblem(values.length, values, weights, maxCapacity);
        PSO particalSwarmOptimisation = new PSO(20, p, 50);
        particalSwarmOptimisation.run();
    }
}
