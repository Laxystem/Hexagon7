package io.github.laylameower.hex;

import io.github.gaming32.kiloengine.KiloEngineGame;
import org.jetbrains.annotations.NotNull;

public final class HexagonGame extends KiloEngineGame {
    @NotNull
    @Override
    public String getTitle() {
        return "Hexagon";
    }

    @Override
    public void loadInitScene() {
        getSceneLoader().loadScene("/hexagon/hexagon.level.json5", getScene());
    }

    public static void main(String[] args) {
        new HexagonGame().main();
    }
}