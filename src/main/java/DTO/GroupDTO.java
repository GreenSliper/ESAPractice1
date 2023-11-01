package DTO;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class GroupDTO {
    UUID id;
    String name;

    List<StudentDTO> students;
}
