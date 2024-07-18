package findmatch.model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GridGenerator {
        private int[] values;
        private int[] found;
        private int selections;
        private int prevIndex;
        private int gridSize;
        private double gridDimension;
        
        public GridGenerator(int gridSize) {
            this.gridSize = gridSize;
            this.gridDimension = Math.sqrt(gridSize);
            
            values = new int[gridSize];
            found = new int[gridSize];
            
            // Generate random numbers for values array
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < gridSize/2; i++) {
                list.add(i);
                list.add(i);
            }
            Collections.shuffle(list);
            for (int i = 0; i < gridSize; i++) {
                values[i] = list.get(i);
                found[i] = 0;
            }
            
            selections = 0;
            prevIndex = -1;
        }
        
        public int getValue(int index) {
            return values[index];
        }
        
        public boolean isFound(int index) {
            return found[index] == 1;
        }
        
        public void setFound(int index) {
            found[index] = 1;
        }
        
        public int getSelections() {
            return selections;
        }
        
        public void setSelections(int selections) {
            this.selections = selections;
        }
        
        public int getPrevIndex() {
            return prevIndex;
        }
        
        public void setPrevIndex(int prevIndex) {
            this.prevIndex = prevIndex;
        }
    }    
}
