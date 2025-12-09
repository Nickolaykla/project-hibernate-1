package com.game.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Profession {
    @Enumerated(EnumType.ORDINAL)
    WARRIOR,
    @Enumerated(EnumType.ORDINAL)
    ROGUE,
    @Enumerated(EnumType.ORDINAL)
    SORCERER,
    @Enumerated(EnumType.ORDINAL)
    CLERIC,
    @Enumerated(EnumType.ORDINAL)
    PALADIN,
    @Enumerated(EnumType.ORDINAL)
    NAZGUL,
    @Enumerated(EnumType.ORDINAL)
    WARLOCK,
    @Enumerated(EnumType.ORDINAL)
    DRUID
}