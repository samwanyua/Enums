package intellij;

public enum Cereals {
    CAPATAIN_CRUNCH(75,748.34 ),
    FROOT_LOOPS(23, 3443.54),
    REESES_PUFFS(33, 34859.09),
    COCOA_PUFFS(36, 93759.4);
//    final - prevent any changes
    final int deliciousness;
    final double price;

    Cereals(int deliciousness, double price) {
        this.deliciousness = deliciousness;
        this.price = price;
    }

}
