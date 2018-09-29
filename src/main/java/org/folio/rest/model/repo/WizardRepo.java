package org.folio.rest.model.repo;

import java.util.UUID;

import org.folio.rest.model.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WizardRepo extends JpaRepository<Wizard, UUID> {

}
