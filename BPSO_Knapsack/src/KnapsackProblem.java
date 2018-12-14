
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

    public KnapsackProblem(int dimension, double[] values, double[] weights, double maxCapacity) {
        this.dimension = dimension;
        this.maxCapacity = maxCapacity;
        this.values = values;
        this.weights = weights;
    }

    double getResult(Particle p) {
        return calculate(p);
    }

    double calculate(Particle particle) {
        double fitnessResult = 0;
        double sumOfweights = 0;
        int x[] = particle.position;
        for (int i = 0; i < dimension; i++) {
            fitnessResult += x[i] * values[i];

            sumOfweights += x[i] * weights[i];

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
