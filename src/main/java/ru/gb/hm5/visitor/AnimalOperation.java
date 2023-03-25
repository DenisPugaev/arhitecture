package ru.gb.hm5.visitor;

public interface AnimalOperation {

    void visitLion(Lion lion);
    void visitDog(Dog dog);
    void visitCat(Cat cat);


}
