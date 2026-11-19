package androidx.room.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import java.io.File;
import kotlin.coroutines.InterfaceC9100d;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class DBUtil {
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final CancellationSignal createCancellationSignal() {
        return DBUtil__DBUtil_androidKt.createCancellationSignal();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SQLiteConnection sQLiteConnection) {
        DBUtil__DBUtilKt.dropFtsSyncTriggers(sQLiteConnection);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SQLiteConnection sQLiteConnection, String str) {
        DBUtil__DBUtilKt.foreignKeyCheck(sQLiteConnection, str);
    }

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z10, InterfaceC9324c<? super InterfaceC9100d> interfaceC9324c) {
        return DBUtil__DBUtil_androidKt.getCoroutineContext(roomDatabase, z10, interfaceC9324c);
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return DBUtil__DBUtilKt.internalPerform(roomDatabase, z10, z11, interfaceC10574p, interfaceC9324c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l) {
        return (R) DBUtil__DBUtil_androidKt.performBlocking(roomDatabase, z10, z11, interfaceC10570l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return DBUtil__DBUtil_androidKt.performInTransactionSuspending(roomDatabase, interfaceC10570l, interfaceC9324c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performSuspending(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return DBUtil__DBUtil_androidKt.performSuspending(roomDatabase, z10, z11, interfaceC10570l, interfaceC9324c);
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z10) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(File file) {
        return DBUtil__DBUtil_androidKt.readVersion(file);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final SQLiteConnection toSQLiteConnection(SupportSQLiteDatabase supportSQLiteDatabase) {
        return DBUtil__DBUtil_androidKt.toSQLiteConnection(supportSQLiteDatabase);
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        DBUtil__DBUtil_androidKt.dropFtsSyncTriggers(supportSQLiteDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        DBUtil__DBUtil_androidKt.foreignKeyCheck(supportSQLiteDatabase, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z10, cancellationSignal);
    }
}
