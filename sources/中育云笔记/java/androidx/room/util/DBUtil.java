package androidx.room.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import java.io.File;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class DBUtil {
    @InterfaceC10770a
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

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z10, InterfaceC11588c<? super InterfaceC9945d> interfaceC11588c) {
        return DBUtil__DBUtil_androidKt.getCoroutineContext(roomDatabase, z10, interfaceC11588c);
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return DBUtil__DBUtilKt.internalPerform(roomDatabase, z10, z11, interfaceC9544p, interfaceC11588c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        return (R) DBUtil__DBUtil_androidKt.performBlocking(roomDatabase, z10, z11, interfaceC9540l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return DBUtil__DBUtil_androidKt.performInTransactionSuspending(roomDatabase, interfaceC9540l, interfaceC11588c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performSuspending(RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return DBUtil__DBUtil_androidKt.performSuspending(roomDatabase, z10, z11, interfaceC9540l, interfaceC11588c);
    }

    @InterfaceC10770a
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

    @InterfaceC10770a
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
