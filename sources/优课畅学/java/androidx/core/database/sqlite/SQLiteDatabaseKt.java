package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z10, InterfaceC10570l interfaceC10570l) {
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t10 = (T) interfaceC10570l.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t10;
        } finally {
            AbstractC9131s.m16125b(1);
            sQLiteDatabase.endTransaction();
            AbstractC9131s.m16124a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = interfaceC10570l.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            AbstractC9131s.m16125b(1);
            sQLiteDatabase.endTransaction();
            AbstractC9131s.m16124a(1);
        }
    }
}
