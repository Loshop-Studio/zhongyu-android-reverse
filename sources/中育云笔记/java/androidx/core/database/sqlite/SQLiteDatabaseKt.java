package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t10 = (T) interfaceC9540l.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t10;
        } finally {
            AbstractC9977s.m20286b(1);
            sQLiteDatabase.endTransaction();
            AbstractC9977s.m20285a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = interfaceC9540l.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            AbstractC9977s.m20286b(1);
            sQLiteDatabase.endTransaction();
            AbstractC9977s.m20285a(1);
        }
    }
}
