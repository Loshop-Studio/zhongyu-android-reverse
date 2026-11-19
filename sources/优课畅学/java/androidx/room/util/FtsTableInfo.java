package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final FtsTableInfo read(SupportSQLiteDatabase database, String tableName) {
            AbstractC9133u.m16133g(database, "database");
            AbstractC9133u.m16133g(tableName, "tableName");
            return read(new SupportSQLiteConnection(database), tableName);
        }

        private Companion() {
        }

        public final FtsTableInfo read(SQLiteConnection connection, String tableName) {
            AbstractC9133u.m16133g(connection, "connection");
            AbstractC9133u.m16133g(tableName, "tableName");
            return new FtsTableInfo(tableName, SchemaInfoUtilKt.readFtsColumns(connection, tableName), SchemaInfoUtilKt.readFtsOptions(connection, tableName));
        }
    }

    public FtsTableInfo(String name, Set<String> columns, Set<String> options) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(columns, "columns");
        AbstractC9133u.m16133g(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    public static final FtsTableInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(Object obj) {
        return FtsTableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return FtsTableInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return FtsTableInfoKt.toStringCommon(this);
    }

    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String name, Set<String> columns, String createSql) {
        this(name, columns, SchemaInfoUtilKt.parseFtsOptions(createSql));
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(columns, "columns");
        AbstractC9133u.m16133g(createSql, "createSql");
    }
}
