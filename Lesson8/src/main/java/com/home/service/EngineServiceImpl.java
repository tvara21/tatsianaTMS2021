package com.home.service;

import com.home.model.Engine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EngineServiceImpl implements EngineService {
    private final Engine engine;

    @Override
    public boolean isRunning() {
        return engine.isRunning();
    }

    @Override
    public void start() {
        if (!isRunning()) {
            this.engine.setRunning(true);
            System.out.println(" --> Двигатель запустился");
        }

    }

    @Override
    public void stop() {
        if (isRunning()) {
            this.engine.setRunning(false);
            System.out.println(" --> Двигатель заглушился");
        }

    }


}
