package com.infractar.suboptimal.enums;

import lombok.Getter;
import org.worldcubeassociation.tnoodle.scrambles.PuzzleRegistry;

@Getter
public enum PuzzleEnums {
    THREE("333", PuzzleRegistry.THREE, "3x3x3"),
    TWO("222", PuzzleRegistry.TWO, "2x2x2"),
    FOUR("444", PuzzleRegistry.FOUR, "4x4x4"),
    FIVE("555", PuzzleRegistry.FIVE, "5x5x5x"),
    SIX("666", PuzzleRegistry.SIX, "6x6x6"),
    SEVEN("777", PuzzleRegistry.SEVEN, "7x7x7"),
    THREE_BLD("333bld", PuzzleRegistry.THREE_NI, "3x3x3 BLD"),
    FOUR_BLD("444bld", PuzzleRegistry.FOUR_NI, "4x4x4 BLD"),
    FIVE_BLD("555bld", PuzzleRegistry.FIVE_NI, "5x5x5 BLD"),
    THREE_FM("333fm", PuzzleRegistry.THREE_FM, "3x3x3 Fewest Moves"),
    PYRA("pyra", PuzzleRegistry.PYRA, "Pyraminx"),
    SQ1("sq1", PuzzleRegistry.SQ1, "Square-1"),
    MEGA("minx", PuzzleRegistry.MEGA, "Megaminx"),
    CLOCK("clock", PuzzleRegistry.CLOCK, "Clock"),
    SKEWB("skewb", PuzzleRegistry.SKEWB, "Skewb"),
    THREE_OH("333oh", PuzzleRegistry.THREE, "3x3x3 OH"),
    THREE_MBLD("333mbld", PuzzleRegistry.THREE_NI, "3x3x3 Multiple Blindfolded"),
    FOUR_FAST("444fast", PuzzleRegistry.FOUR_FAST, "A random moves version of 4x4x4");

    private final String name;
    private final PuzzleRegistry puzzleRegistry;
    private final String description;

    private PuzzleEnums(String name, PuzzleRegistry puzzleRegistry, String description) {
        this.name = name;
        this.puzzleRegistry = puzzleRegistry;
        this.description = description;
    }

    public static PuzzleRegistry getRegistryByName(String name) {
        for (PuzzleEnums puzzle : PuzzleEnums.values()) {
            if (puzzle.name.equals(name)) {
                return puzzle.puzzleRegistry;
            }
        }
        return PuzzleRegistry.THREE;
    }
}
