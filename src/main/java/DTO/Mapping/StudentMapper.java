package DTO.Mapping;

import DTO.StudentDTO;
import Entities.Student;

public class StudentMapper {
    public static Student FromDTO(StudentDTO dto)
    {
        Student result = new Student();
        result.setGroup_id(dto.getGroup_id());
        result.setId(dto.getId());
        result.setName(dto.getName());
        return result;
    }

    public static StudentDTO ToDTO(Student student)
    {
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setGroup_id(student.getGroup_id());
        return dto;
    }
}
