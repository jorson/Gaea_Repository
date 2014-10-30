package gaea.framework;

import gaea.framework.expressions.ConditionBuilder;
import gaea.framework.expressions.EqualCondition;
import gaea.framework.repositories.Repository;
import gaea.framework.specifications.Specification;

/**
 * Created by jorson on 14-10-23.
 */
public class InternalQueryBuilder {

    public void test() {
        Repository repository = null;
        Specification spec = repository.createSpecification();
        spec.getCriteriaExpression()
                .and(ConditionBuilder.eq(1, 1))
                .and(ConditionBuilder.eq(2, 2))
                .or(ConditionBuilder.eq(3, 2));
        repository.findAll(spec);
    }
}
