
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Merve
 */
public class KnapsackProblem {

    String name;
    double result = 0;
    int dimension;
    double[] values;
    double[] weights;
    double maxCapacity;
    Item items[];

//    public KnapsackProblem(int dimension, double[] values, double[] weights, double maxCapacity) {
//        this.dimension = dimension;
//        this.maxCapacity = maxCapacity;
//        this.values = values;
//        this.weights = weights;
//    }
    KnapsackProblem(int dimension, Item[] items, double maxCapacity) {
        this.items = items;
        this.dimension = dimension;
        this.maxCapacity = maxCapacity;
    }

    double getFitness(Particle p) {
        return solveProblem(p);
    }

    double solveProblem(Particle particle) {
        double fitnessResult = 0;
        double sumOfweights = 0;
        int x[] = particle.position;
        for (int i = 0; i < dimension; i++) {
            fitnessResult += x[i] * items[i].value;
            sumOfweights += x[i] * items[i].weight;
        }
//         System.out.println("fitness result: "+ fitnessResult);
//         System.out.println("sum of weights: "+ sumOfweights);
        if (sumOfweights > maxCapacity) {
            fitnessResult *= -1;
        }
//        System.out.println("after max capacity : " + fitnessResult);

        return fitnessResult;
    }

}
