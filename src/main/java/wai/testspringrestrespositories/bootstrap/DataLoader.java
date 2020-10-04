package wai.testspringrestrespositories.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wai.testspringrestrespositories.domain.Car;
import wai.testspringrestrespositories.repositories.CarRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final CarRepository carRepository;

    public DataLoader(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCars();
    }

    private void loadCars() {
        Car car1 = new Car(1L,"red","Polo");
        Car car2 = new Car(2L,"blue","Golf");
        Car car3 = new Car(3L,"yellow","E-Gold");
    }
}
