package androidx.sqlite.p019db;

import androidx.compose.material3.MenuKt;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class SupportSQLiteQueryBuilder {
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private Object[] bindArgs;
    private String[] columns;
    private boolean distinct;
    private String groupBy;
    private String having;
    private String limit;
    private String orderBy;
    private String selection;
    private final String table;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final SupportSQLiteQueryBuilder builder(String tableName) {
            AbstractC9979u.m20294g(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, AbstractC9972n abstractC9972n) {
        this(str);
    }

    private final void appendClause(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    private final void appendColumns(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    public static final SupportSQLiteQueryBuilder builder(String str) {
        return Companion.builder(str);
    }

    public final SupportSQLiteQueryBuilder columns(String[] strArr) {
        this.columns = strArr;
        return this;
    }

    public final SupportSQLiteQuery create() {
        String str;
        String str2 = this.groupBy;
        if ((str2 == null || str2.length() == 0) && (str = this.having) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb2 = new StringBuilder(MenuKt.InTransitionDuration);
        sb2.append("SELECT ");
        if (this.distinct) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.columns;
        if (strArr == null || strArr.length == 0) {
            sb2.append("* ");
        } else {
            AbstractC9979u.m20291d(strArr);
            appendColumns(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.table);
        appendClause(sb2, " WHERE ", this.selection);
        appendClause(sb2, " GROUP BY ", this.groupBy);
        appendClause(sb2, " HAVING ", this.having);
        appendClause(sb2, " ORDER BY ", this.orderBy);
        appendClause(sb2, " LIMIT ", this.limit);
        return new SimpleSQLiteQuery(sb2.toString(), this.bindArgs);
    }

    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    public final SupportSQLiteQueryBuilder groupBy(String str) {
        this.groupBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder having(String str) {
        this.having = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder limit(String limit) {
        AbstractC9979u.m20294g(limit, "limit");
        boolean zMatches = limitPattern.matcher(limit).matches();
        if (limit.length() == 0 || zMatches) {
            this.limit = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    public final SupportSQLiteQueryBuilder orderBy(String str) {
        this.orderBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder selection(String str, Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }
}
