package androidx.room;

import java.util.Set;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p379vd.InterfaceC11594c;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    @InterfaceC10770a
    public static final InterfaceC11594c invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z10) {
        return RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    public static final <R> Object useReaderConnection(RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(roomDatabase, interfaceC9544p, interfaceC11588c);
    }

    public static final <R> Object useWriterConnection(RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(roomDatabase, interfaceC9544p, interfaceC11588c);
    }

    public static final void validateAutoMigrations(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(roomDatabase, databaseConfiguration);
    }

    public static final void validateMigrationsNotRequired(Set<Integer> set, Set<Integer> set2) {
        RoomDatabaseKt__RoomDatabaseKt.validateMigrationsNotRequired(set, set2);
    }

    public static final void validateTypeConverters(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateTypeConverters(roomDatabase, databaseConfiguration);
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(roomDatabase, interfaceC9540l, interfaceC11588c);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(roomDatabase, interfaceC9540l, interfaceC11588c);
    }
}
