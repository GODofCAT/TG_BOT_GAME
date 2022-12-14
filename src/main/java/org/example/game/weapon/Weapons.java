package org.example.game.weapon;

import java.util.HashMap;
import java.util.Map;

public class Weapons {
    public static Map<WeaponsName,Integer> weapons = new HashMap<>();
    static {
        weapons.put(WeaponsName.empty, 1);
        weapons.put(WeaponsName.stick, 5);
        weapons.put(WeaponsName.sword, 10);
    }
}
