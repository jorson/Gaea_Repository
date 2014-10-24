package gaea.framework.specifications;

import gaea.framework.expressions.Expression;
import gaea.framework.expressions.QueryExpression;

/**
 * Created by jorson on 14-10-23.
 */
public interface Specification {

    public QueryExpression getCriteriaExpression();

    public SpecificationProvider getProvider();
}
