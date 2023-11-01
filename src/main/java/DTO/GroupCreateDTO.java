package DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class GroupCreateDTO
{
    UUID groupId;
    String name;
}
