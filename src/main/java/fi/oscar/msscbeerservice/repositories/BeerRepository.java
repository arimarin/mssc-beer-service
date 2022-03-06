package fi.oscar.msscbeerservice.repositories;

import fi.oscar.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Ari on 06.03.2022
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
