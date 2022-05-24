package p2;

import p1.Protection;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Конструктор другого пакета");
        // ДОступно только для данного класса
        // System.out.println("n = " + p.n);
        // доступно только для данного класса
        // System.out.println("n_pri = " + n_pri);
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}