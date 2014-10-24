package gaea.framework.repositories;

import gaea.framework.specifications.Specification;

import java.util.List;

/**
 * Created by jorson on 14-10-23.
 */
public interface Repository {

    Specification createSpecification();

    public List findAll();
}
