package DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class StudentDTO {
    UUID id;
    UUID group_id;
    String name;
}
