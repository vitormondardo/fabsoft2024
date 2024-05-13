package br.univille.projfso2024b.service;

import java.util.List;
import br.univille.projfso2024b.entity.Work;

public interface WorkService {
    void save(Work cliente);
    Work getById(long id);
    List<Work> getAll();
    Work delete(long id);
}
