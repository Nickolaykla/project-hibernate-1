package com.game.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Race {
    @Enumerated(EnumType.ORDINAL)
    HUMAN,
    @Enumerated(EnumType.ORDINAL)
    DWARF,
    @Enumerated(EnumType.ORDINAL)
    ELF,
    @Enumerated(EnumType.ORDINAL)
    GIANT,
    @Enumerated(EnumType.ORDINAL)
    ORC,
    @Enumerated(EnumType.ORDINAL)
    TROLL,
    @Enumerated(EnumType.ORDINAL)
    HOBBIT
}