package org.example.entity;

import java.util.Arrays;

public class Prescription {
    private Drug[] drugs = new Drug[10];
    int index = 0;

    public void add(Drug prescription) {
        if (index > drugs.length - 1) {
            drugs = Arrays.copyOf(drugs, drugs.length * 2);
        }
        drugs[index] = prescription;
        index++;
    }

    public void remove(int id) {
        if (id < index) {
            drugs[id] = null;
        }
        if (index - id >= 0) System.arraycopy(drugs, id + 1, drugs, id, index - id);
    }
}
