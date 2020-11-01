package ru.iteco.structural.orm.second;

public class ISecondOrmImpl implements ISecondOrm{

    ISecondOrmContext context;

    public ISecondOrmImpl(ISecondOrmContext context) {
        this.context = context;
    }

    @Override
    public ISecondOrmContext getContext() {
        return context;
    }
}
