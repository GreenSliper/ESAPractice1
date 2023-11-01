package DTO;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class GroupUpdateDTO {
    UUID groupId;

    List<StudentDTO> students;
}
