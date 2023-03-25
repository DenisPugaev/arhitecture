package ru.gb.hm5.visitor;

public interface Animal {
    void accept(AnimalOperation operation);
}
