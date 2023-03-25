package ru.gb.hm5.visitor;

public class Speak implements AnimalOperation {
    @Override
    public void visitLion(Lion lion) {
        lion.roar();
    }

    @Override
    public void visitDog(Dog dog) {
        dog.bark();

    }

    @Override
    public void visitCat(Cat cat) {
        cat.meow();

    }
}
