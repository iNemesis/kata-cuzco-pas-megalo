package com.company;

import com.company.application.ChambreApplication;
import com.company.infrastructure.ChambreAdapter;

public class Main {

    public static void main(String[] args) {

        var chambreAdapter = new ChambreAdapter();
        var chambreApplication = new ChambreApplication(chambreAdapter);
        chambreApplication.printTableauDeChambres();
    }
}
