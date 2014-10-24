package gaea.framework;

import gaea.framework.expressions.QueryCondition;
import gaea.framework.expressions.QueryExpression;
import gaea.framework.expressions.impl.EqualCondition;
import gaea.framework.repositories.Repository;
import gaea.framework.specifications.Specification;
import gaea.framework.specifications.SpecificationProvider;

/**
 * Created by jorson on 14-10-23.
 */
public class InternalQueryBuilder {

    public void test() {
        Repository repository = null;
        Specification spec = repository.createSpecification();
        spec.getCriteriaExpression()
                .and(new EqualCondition())
                .and(new EqualCondition());

        repository.findAll()
    }
}
