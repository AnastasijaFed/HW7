public class Car extends Transport implements Ridable {
    String name;
    private Boolean isElectric;
    private Engine engine = new Engine();

    Car(String name, Boolean isElectric) {
        this.name = name;
        this.isElectric = isElectric;
    }

    @Override
    String getName() {

        return name;
    }

    @Override
    public void ride() {
        System.out.println(getName() + " started moving");
    }
        public Engine defineEngine(){
            return engine;
        }


    class Engine {
        String engineType;

        String getEngineType() {
            if (Car.this.isElectric == true) {
                engineType = "Electric engine";
            } else engineType = "Internal combustion engine";
            return this.engineType;

        }


    }
}
