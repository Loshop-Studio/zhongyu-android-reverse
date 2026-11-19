package io.objectbox.query;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class QueryCondition$PropertyCondition$Operation {
    public static final QueryCondition$PropertyCondition$Operation BETWEEN;
    public static final QueryCondition$PropertyCondition$Operation CONTAINS;
    public static final QueryCondition$PropertyCondition$Operation ENDS_WITH;
    public static final QueryCondition$PropertyCondition$Operation EQUALS;
    public static final QueryCondition$PropertyCondition$Operation GREATER_THAN;

    /* renamed from: IN */
    public static final QueryCondition$PropertyCondition$Operation f8980IN;
    public static final QueryCondition$PropertyCondition$Operation IS_NOT_NULL;
    public static final QueryCondition$PropertyCondition$Operation IS_NULL;
    public static final QueryCondition$PropertyCondition$Operation LESS_THAN;
    public static final QueryCondition$PropertyCondition$Operation NOT_EQUALS;
    public static final QueryCondition$PropertyCondition$Operation STARTS_WITH;

    /* renamed from: a */
    public static final /* synthetic */ QueryCondition$PropertyCondition$Operation[] f8981a;

    static {
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation = new QueryCondition$PropertyCondition$Operation("EQUALS", 0);
        EQUALS = queryCondition$PropertyCondition$Operation;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation2 = new QueryCondition$PropertyCondition$Operation("NOT_EQUALS", 1);
        NOT_EQUALS = queryCondition$PropertyCondition$Operation2;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation3 = new QueryCondition$PropertyCondition$Operation("BETWEEN", 2);
        BETWEEN = queryCondition$PropertyCondition$Operation3;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation4 = new QueryCondition$PropertyCondition$Operation("IN", 3);
        f8980IN = queryCondition$PropertyCondition$Operation4;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation5 = new QueryCondition$PropertyCondition$Operation("GREATER_THAN", 4);
        GREATER_THAN = queryCondition$PropertyCondition$Operation5;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation6 = new QueryCondition$PropertyCondition$Operation("LESS_THAN", 5);
        LESS_THAN = queryCondition$PropertyCondition$Operation6;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation7 = new QueryCondition$PropertyCondition$Operation("IS_NULL", 6);
        IS_NULL = queryCondition$PropertyCondition$Operation7;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation8 = new QueryCondition$PropertyCondition$Operation("IS_NOT_NULL", 7);
        IS_NOT_NULL = queryCondition$PropertyCondition$Operation8;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation9 = new QueryCondition$PropertyCondition$Operation("CONTAINS", 8);
        CONTAINS = queryCondition$PropertyCondition$Operation9;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation10 = new QueryCondition$PropertyCondition$Operation("STARTS_WITH", 9);
        STARTS_WITH = queryCondition$PropertyCondition$Operation10;
        QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation11 = new QueryCondition$PropertyCondition$Operation("ENDS_WITH", 10);
        ENDS_WITH = queryCondition$PropertyCondition$Operation11;
        f8981a = new QueryCondition$PropertyCondition$Operation[]{queryCondition$PropertyCondition$Operation, queryCondition$PropertyCondition$Operation2, queryCondition$PropertyCondition$Operation3, queryCondition$PropertyCondition$Operation4, queryCondition$PropertyCondition$Operation5, queryCondition$PropertyCondition$Operation6, queryCondition$PropertyCondition$Operation7, queryCondition$PropertyCondition$Operation8, queryCondition$PropertyCondition$Operation9, queryCondition$PropertyCondition$Operation10, queryCondition$PropertyCondition$Operation11};
    }

    public static QueryCondition$PropertyCondition$Operation valueOf(String str) {
        return (QueryCondition$PropertyCondition$Operation) Enum.valueOf(QueryCondition$PropertyCondition$Operation.class, str);
    }

    public static QueryCondition$PropertyCondition$Operation[] values() {
        return (QueryCondition$PropertyCondition$Operation[]) f8981a.clone();
    }
}
