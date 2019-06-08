
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
        if (sumOfweights > maxCapacity) {
            fitnessResult *= -1;
        }
        return fitnessResult;
    }

}
