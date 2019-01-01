
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Merve
 */
public class PSO {

    private final int PARTICLE_SIZE;
    public Particle[] particles;
    Particle gBest;
    private int maxIteration = 0;
    private double fitness = 0;
    static public KnapsackProblem problem;

    public PSO(int Partical_size, KnapsackProblem p, int iteration) {
        PARTICLE_SIZE = Partical_size;
        problem = p;
        this.maxIteration = iteration;

    }

    public void solve() {
        Swarm swarm = new Swarm(PARTICLE_SIZE);
        particles = swarm.initializeSwarm(problem.dimension);

        swarm.updateGlobalBestParticle();

        int iteration = 0;

        while (iteration < maxIteration) {

            for (int i = 0; i < swarm.particles.length; i++) {

                swarm.particles[i].updateVelocity(swarm.gBestParticle, swarm.particles[i].pBestParticle);
                swarm.particles[i].updatePosition();

                fitness = problem.getFitness(swarm.particles[i]);
                swarm.particles[i].setFitness(fitness);
                swarm.particles[i].updateBestParticle();
            }

            swarm.updateGlobalBestParticle();
            iteration++;
            System.out.println(iteration + ". iteration     -     Globasl Best Value: " + swarm.gBestParticle.fitness);

        }
        
        for (int p : swarm.gBestParticle.position) {
            System.out.print(p+ " ");
        }
        int index = 0;
        System.out.println("\nÇantaya koyulacak item değerleri:");
        for (int p : swarm.gBestParticle.position) {
            if(p == 1){
                System.out.print(problem.items[index].value + " - ");      
            }
            index++;
            

        }

    }

}
