package androidx.room;

import java.util.Set;
import p123h7.InterfaceC8721a;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    @InterfaceC8721a
    public static final InterfaceC9266c invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z10) {
        return RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    public static final <R> Object useReaderConnection(RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(roomDatabase, interfaceC10574p, interfaceC9324c);
    }

    public static final <R> Object useWriterConnection(RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(roomDatabase, interfaceC10574p, interfaceC9324c);
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

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(roomDatabase, interfaceC10570l, interfaceC9324c);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(roomDatabase, interfaceC10570l, interfaceC9324c);
    }
}
