/**
 * WildlifeSimulator - Manages population dynamics for multiple species
 * Uses an array of Species objects to store and simulate species data
 */
public class WildlifeSimulator {
    private Species[] species;
    private int speciesCount;
    
    public WildlifeSimulator(int maxSpecies) {
        //TODO
        species = new Species[maxSpecies];
    }
    
    /**
     * Add a species to the simulator
     */
    public void addSpecies(Species s) {
        //TODO
        species[speciesCount++] = s;
    }
    
    /**
     * Simulate one year of population changes for all species
     */
    public void simulateYear() {
        //TODO
        for(Species s: species){
            s.simulateYear();
        }

    }
    
    /**
     * Simulate multiple years
     */
    public void simulate(int years) {
        //TODO
        for(int i = 0; i < years; i++){
            simulateYear();
        }
    }
    
    /**
     * Get species at given index
     */
    public Species getSpecies(int index) throws IllegalArgumentException{
        //TODO
        if(index < 0 || index > this.species.length){
            throw new IllegalArgumentException();
        }
        return species[index];
    }
    
    /**
     * Get species info as formatted string
     */
    public String getSpeciesInfo(int index) {
        return species[index].toString();
    }
    
    public String toString(){
        String m = "";
        for(Species s: species){
            if(s!=null)
            m += s.toString() + "\n";
        }
        return m;
    }
    /**
     * Get total wildlife count across all species
     */
    public double getTotalPopulation() {
        //TODO
        double total = 0;
        for(Species s: species){
            total += s.getPopulation();
        }
        return total;
    }
    
    /**
     * Find the species with largest population
     */
    public int getMostPopulousIndex() {
        //TODO
        int maxIndex = 0;
        for(int i = 0; i < species.length - 1; i++){
            if(species[i].getPopulation() > species[maxIndex].getPopulation()){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    /**
     * Find the species with smallest population (most endangered)
     */
    public int getMostEndangeredIndex() {
        //TODO
        int minIndex = 0;
        for(int i = 0; i < species.length - 1; i++){
            if(species[i].getPopulation() < species[minIndex].getPopulation()){
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public int getSpeciesCount() {
        return speciesCount;
    }
    
    /**
     * Get array of all species
     */
    public Species[] getSpeciesArray() {
        return species;
    }
}
