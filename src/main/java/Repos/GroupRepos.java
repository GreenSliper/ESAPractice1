package Repos;

import Entities.Group;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SuppressWarnings("JpaQlInspection")
@Stateless
public class GroupRepos implements IGroupRepos
{
    private final EntityManager entityManager = HibernateFactoryUtil.entityManager;

    public GroupRepos(){}
    @Override
    public Group save(Group group) {
        entityManager.persist(group);
        entityManager.flush();
        return group;
    }

    @Override
    public void delete(UUID id) {
        entityManager.remove(entityManager.find(Group.class, id));
    }

    @Override
    public Group update(Group group) {
        return entityManager.merge(group);
    }

    @Override
    public Optional<Group> get(UUID id) {
        return Optional.ofNullable(entityManager.find(Group.class, id));
    }

    @Override
    public List<Group> getAll() {
        return (List<Group>) entityManager.createQuery("from GROUPS").getResultList();
    }
}
