package org.example;

public class House {

    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasGarage;

    //private constructor to enforce the use of the builder
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;

    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }

    public static class HouseBuilder{
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarden;
        private boolean hasGarage;

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
