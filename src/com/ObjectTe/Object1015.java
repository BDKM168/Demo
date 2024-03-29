package com.ObjectTe;

public class Object1015 {
    /**
     * 在java 虚拟机堆区中，每个对象都可能处于以下三种状态之一。
     * （1）、可触及状态：当一个对象被创建后，之哟啊程序中还有引用变量引用它，那么它就始终处于可触及状态。
     * （2）、可复活状态：当程序不再有任何引用变量引用该对象时，该对象就进入可复活状态。
     *  在这个状态下，垃圾回收器会准备释放它所在用的内存。在释放之前，会调用它及其他可复活状态的对象的finalize 方法，
     *  这些finalize 方法 有可能使该对象重新转到可触及状态。
     *  （3）、不可触及状态：当java虚拟机执行完所有可复活对象的finalize方法后，如果这些方法没有使该对象转到可触及状态。
     *  垃圾回收器才会真正回收它占用的内存。
     *
     *  调用System.gc()或者Runtime.gc() 方法也不能保证回收操作一定执行，它只是提高了java垃圾回收器尽快回收垃圾的可能性。
     */
}
