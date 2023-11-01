package Services;

import DTO.GroupCreateDTO;
import DTO.GroupDTO;
import DTO.GroupUpdateDTO;
import DTO.Mapping.GroupMapper;
import DTO.Mapping.StudentMapper;
import Entities.Group;
import Repos.IGroupRepos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Stateless
public class GroupService implements IGroupService
{
    private final IGroupRepos repos;

    @Inject
    public GroupService(IGroupRepos repos) {
        this.repos = repos;
    }

    @Override
    public GroupDTO get(UUID id) {
        var group = repos.get(id).orElseThrow();
        return GroupMapper.ToDTO(group);
    }

    @Override
    public List<GroupDTO> getAll() {
        return repos
                .getAll()
                .stream()
                .map(GroupMapper::ToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GroupDTO save(GroupCreateDTO dto) {
        Group group = GroupMapper.FromDTO(dto);
        group = repos.save(group);
        return GroupMapper.ToDTO(group);
    }

    @Override
    public GroupDTO update(GroupUpdateDTO dto) {
        var group = repos.get(dto.getGroupId()).orElseThrow();
        group.setStudents(dto.getStudents()
                .stream()
                .map(StudentMapper::FromDTO)
                .collect(Collectors.toSet()));
        group = repos.update(group);
        return GroupMapper.ToDTO(group);
    }

    @Override
    public void delete(UUID id) {
        repos.delete(id);
    }
}
