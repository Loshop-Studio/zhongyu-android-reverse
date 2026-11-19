package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class ViewInfo {
    public static final Companion Companion = new Companion(null);
    public final String name;
    public final String sql;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @InterfaceC10770a
        public final ViewInfo read(SupportSQLiteDatabase database, String viewName) {
            AbstractC9979u.m20294g(database, "database");
            AbstractC9979u.m20294g(viewName, "viewName");
            return read(new SupportSQLiteConnection(database), viewName);
        }

        private Companion() {
        }

        public final ViewInfo read(SQLiteConnection connection, String viewName) {
            AbstractC9979u.m20294g(connection, "connection");
            AbstractC9979u.m20294g(viewName, "viewName");
            return SchemaInfoUtilKt.readViewInfo(connection, viewName);
        }
    }

    public ViewInfo(String name, String str) {
        AbstractC9979u.m20294g(name, "name");
        this.name = name;
        this.sql = str;
    }

    public static final ViewInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(Object obj) {
        return ViewInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return ViewInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return ViewInfoKt.toStringCommon(this);
    }

    @InterfaceC10770a
    public static final ViewInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }
}
