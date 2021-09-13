package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("Brayan Flores",      "Activo",          "Viajes y gastos", 730,  "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins",      "Cancelado",       "Viajes y gastos", 2500, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Jon Snow",           "Validacion PLD",  "Viajes y gastos", 2300, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Cersei Lannister",   "Inactivo",        "Viajes y gastos", 2000, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Jaime Lannister",    "Validacion PLD",  "Viajes y gastos", 2000, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Arya Stark",         "Validacion PLD",  "Viajes y gastos", 2300, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Daenerys Targaryen", "Validacion PLD",  "Viajes y gastos", 1300, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Denise Melisandre",  "Activo",          "Viajes y gastos", 2500, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Ferrara Clifford",   "ACtivo",          "Viajes y gastos", 1500, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Rossini Frances",    "Validacion PLD",  "Viajes y gastos", 800,  "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Luis Suarez",        "Cancelado",       "Viajes y gastos", 1000, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Gerardo Ramirez",    "Cancelado",       "Viajes y gastos", 750, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Mike Cruz",          "Cancelado",       "Viajes y gastos", 3000, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Luis Mendoza",       "Activo",          "Viajes y gastos", 2100, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Ricardo Betancourt", "Activo",          "Viajes y gastos", 2700, "dd/mm/aa")));
      log.info("Preloading " + repository.save(new Employee("Daniela Alvarez",    "Activo",          "Viajes y gastos", 3300, "dd/mm/aa")));
    };
  }
}