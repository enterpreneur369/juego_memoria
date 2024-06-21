package com.juegomemoria;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class JuegoMemoria extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(800);
        gameSettings.setHeight(600);
        gameSettings.setTitle("Juego de Memoria");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
