package gaea.query;

import org.objectquery.QueryEngine;
import org.objectquery.SelectQuery;

/**
 * Created by Administrator on 14-10-24.
 */
public class QueryTest {

    public void selectTest() {
        QueryEngine<?> engine = null;
        SelectQuery<Person> query = engine.newSelect(Person.class);
        Person toSearch = query.target();
        query.eq(toSearch.getHome().getAddress(), "demo");
        query.eq(toSearch.getMum().getName(), "test");
        query.order(toSearch.getName());
    }
}
