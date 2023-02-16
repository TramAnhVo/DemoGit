package com.mycompany.demo;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int t= 0;
        if ( t > 0  && t % 2 == 0)
            App.setRoot("secondary");
    }
}
