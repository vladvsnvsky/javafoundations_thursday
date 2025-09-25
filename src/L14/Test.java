package L14;

class TestCar {
        String model;

        public void printModel() {
            System.out.println("Model: " + model);
        }

        public static void main(String[] args) {
            TestCar myCar = new TestCar();
            myCar.printModel();
        }
}

