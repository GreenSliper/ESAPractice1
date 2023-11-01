package Repos;

import Entities.Group;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IGroupRepos {
    Group save(Group group);
    void delete(UUID id);
    Group update(Group group);
    Optional<Group> get(UUID id);
    List<Group> getAll();
}
