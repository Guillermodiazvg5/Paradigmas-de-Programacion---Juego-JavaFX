

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module MVCJava {
    requires javafx.swt;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    
    
    opens juegoMatematicasInfantiles123.application  to javafx.graphics ,javafx.fxml; 
    opens juegoMatematicasInfantiles123.controller to javafx.fxml;
}

