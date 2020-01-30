package io.micronaut.docs.injectionpoint;

// tag::class[]
class V6Engine implements Engine {
    private final int cylinders = 6;
    private final CrankShaft crankShaft;

    public V6Engine(CrankShaft crankShaft) {
        this.crankShaft = crankShaft;
    }

    public String start() {
        return "Starting V6";
    }
}
// end::class[]
