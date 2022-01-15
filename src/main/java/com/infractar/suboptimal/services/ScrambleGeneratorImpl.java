package com.infractar.suboptimal.services;


import com.infractar.suboptimal.enums.PuzzleEnums;
import org.springframework.stereotype.Service;
import org.worldcubeassociation.tnoodle.scrambles.Puzzle;
import org.worldcubeassociation.tnoodle.scrambles.PuzzleRegistry;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScrambleGeneratorImpl implements IScrambleGenerator{

    @Override
    public List<String> scrambleSet(String puzzle, int n) {
        PuzzleRegistry lazyScrambler = PuzzleEnums.getRegistryByName(puzzle);
        final Puzzle scrambler = lazyScrambler.getScrambler();

        List<String> scrambles = new ArrayList<>();

        for (int i=0; i<n; i++){
            String scramble = scrambler.generateScramble();
            scrambles.add(scramble);
        }

        return scrambles;
    }
}
