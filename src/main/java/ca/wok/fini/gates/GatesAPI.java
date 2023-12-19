package ca.wok.fini.gates;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

    @RepositoryRestResource(path = "gates", collectionResourceRel = "gates")
    public interface GatesAPI extends JpaRepository<Gates, Long> {}

