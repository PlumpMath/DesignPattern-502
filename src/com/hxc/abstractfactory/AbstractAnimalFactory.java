package com.hxc.abstractfactory;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public abstract class AbstractAnimalFactory {
    abstract Animal getAnimal(String animal);
    abstract Color getColor(String color);
}