package gaea.framework.expressions;

/**
 * Created by jorson on 14-10-23.
 */
public interface QueryCondition {

    <C, T extends C> QueryCondition eq(C target, T value);

    <C, T extends C> QueryCondition gt(C target, T value);
}
