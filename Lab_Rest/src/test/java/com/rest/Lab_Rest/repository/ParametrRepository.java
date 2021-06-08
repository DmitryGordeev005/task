package com.rest.Lab_Rest.repository;
        import com.rest.Lab_Rest.model.Parametr;
        import com.rest.Lab_Rest.model.Task;
        import org.junit.jupiter.api.Test;
        import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
        import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
        import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
        import org.springframework.test.annotation.Rollback;

        import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class ParametrRepository {

    @Autowired
    private ParametrRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateParametr() {
        Parametr parametr = new Parametr();

        parametr.setName("Name");
        parametr.setInformation("Some info");

        Parametr savedParametr = repo.save(parametr);

        Parametr existParametr = entityManager.find(Parametr.class, savedParametr.getIdparametr());
        assertEquals(existParametr.getName(), savedParametr.getName());
    }
}