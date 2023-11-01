package DTO.Mapping;

import DTO.GroupCreateDTO;
import DTO.GroupDTO;
import DTO.GroupUpdateDTO;
import Entities.Group;

import java.util.stream.Collectors;

public class GroupMapper
{
    public static GroupDTO ToDTO(Group group)
    {
        GroupDTO dto = new GroupDTO();
        dto.setId(group.getId());
        dto.setName(group.getName());
        dto.setStudents(group.getStudents()
                .stream()
                .map(StudentMapper::ToDTO)
                .collect(Collectors.toList()));
        return dto;
    }

    public static Group FromDTO(GroupDTO dto)
    {
        Group result = new Group();
        result.setId(dto.getId());
        result.setName(dto.getName());
        result.setStudents(dto.getStudents()
                .stream()
                .map(StudentMapper::FromDTO)
                .collect(Collectors.toSet()));
        return result;
    }

    public static Group FromDTO(GroupCreateDTO dto)
    {
        Group result = new Group();
        result.setId(dto.getGroupId());
        result.setName(dto.getName());
        return result;
    }
}
