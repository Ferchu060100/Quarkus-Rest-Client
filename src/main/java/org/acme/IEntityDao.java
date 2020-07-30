package org.acme;

import java.util.Set;

public interface IEntityDao<T> {
    public Set<T> getAll();
}
