package gaea.framework.expressions;

public interface QueryExpression extends Expression {

    QueryExpression and(QueryCondition condition);
    QueryExpression or(QueryCondition condition);
}
