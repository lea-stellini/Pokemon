package com.zenikaPoei;

public interface ElementType {
    ElementTypes getType();
    boolean isStrongerAgainstType(ElementTypes type);
    int specialAttack();
}
