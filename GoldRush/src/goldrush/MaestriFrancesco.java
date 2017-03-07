/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

/**
 *
 * @author cl428055
 */
public class MaestriFrancesco extends GoldDigger{
    
    @Override
    public int chooseDiggingSite(int[] distances){
        
        int buffer = distances[0],index = 0;
        
        for(int i = 0; i < distances.length; i++){
            
            if (buffer > distances[i]){
                
                index = i;
                
                buffer = distances[i];
                
            }
            
        }
        
        return index;
        
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        /* Do nothing by default. */
    }
    
}