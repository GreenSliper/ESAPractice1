package Services;

import java.util.List;
import java.util.UUID;

public interface ICrudService<DataT, CreateDtoT, UpdateDtoT>
{
    DataT get(UUID id);
    List<DataT> getAll();
    DataT save(CreateDtoT dto);
    DataT update(UpdateDtoT dto);
    void delete(UUID id);
}