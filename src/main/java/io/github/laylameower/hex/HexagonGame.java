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
    public void loadInitLevel() {
        getLevelLoader().loadLevel("hexagon/hexagon.level.json5", getLevel());
    }

    public static void main(String[] args) {
        new HexagonGame().main();
    }
}