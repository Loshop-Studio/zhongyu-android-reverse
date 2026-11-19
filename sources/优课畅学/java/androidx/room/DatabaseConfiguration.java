package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationForAllTables;
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final InterfaceC9100d queryCoroutineContext;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final SQLiteDriver sqliteDriver;
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z13, SQLiteDriver sQLiteDriver, InterfaceC9100d interfaceC9100d) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z13;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = interfaceC9100d;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
    }

    public static /* synthetic */ DatabaseConfiguration copy$default(DatabaseConfiguration databaseConfiguration, Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List list2, List list3, boolean z13, SQLiteDriver sQLiteDriver, InterfaceC9100d interfaceC9100d, int i10, Object obj) {
        InterfaceC9100d interfaceC9100d2;
        SQLiteDriver sQLiteDriver2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? databaseConfiguration.context : context;
        String str3 = (i10 & 2) != 0 ? databaseConfiguration.name : str;
        SupportSQLiteOpenHelper.Factory factory2 = (i10 & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory;
        RoomDatabase.MigrationContainer migrationContainer2 = (i10 & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer;
        List list4 = (i10 & 16) != 0 ? databaseConfiguration.callbacks : list;
        boolean z14 = (i10 & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z10;
        RoomDatabase.JournalMode journalMode2 = (i10 & 64) != 0 ? databaseConfiguration.journalMode : journalMode;
        Executor executor3 = (i10 & 128) != 0 ? databaseConfiguration.queryExecutor : executor;
        Executor executor4 = (i10 & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2;
        Intent intent2 = (i10 & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent;
        boolean z15 = (i10 & 1024) != 0 ? databaseConfiguration.requireMigration : z11;
        boolean z16 = (i10 & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z12;
        Set set2 = (i10 & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set;
        String str4 = (i10 & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? databaseConfiguration.copyFromFile : file;
        Callable callable2 = (i10 & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable;
        RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2 = (i10 & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback;
        List list5 = (i10 & 131072) != 0 ? databaseConfiguration.typeConverters : list2;
        List list6 = (i10 & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3;
        boolean z17 = (i10 & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z13;
        SQLiteDriver sQLiteDriver3 = (i10 & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver;
        if ((i10 & 2097152) != 0) {
            sQLiteDriver2 = sQLiteDriver3;
            interfaceC9100d2 = databaseConfiguration.queryCoroutineContext;
        } else {
            interfaceC9100d2 = interfaceC9100d;
            sQLiteDriver2 = sQLiteDriver3;
        }
        return databaseConfiguration.copy(context3, str3, factory2, migrationContainer2, list4, z14, journalMode2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable2, prepackagedDatabaseCallback2, list5, list6, z17, sQLiteDriver2, interfaceC9100d2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DatabaseConfiguration copy(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z13, SQLiteDriver sQLiteDriver, InterfaceC9100d interfaceC9100d) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
        return new DatabaseConfiguration(context, str, factory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, z13, sQLiteDriver, interfaceC9100d);
    }

    public final Set<Integer> getMigrationNotRequiredFrom$room_runtime_release() {
        return this.migrationNotRequiredFrom;
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public boolean isMigrationRequired(int i10, int i11) {
        return MigrationUtil.isMigrationRequired(this, i10, i11);
    }

    @InterfaceC8721a
    public boolean isMigrationRequiredFrom(int i10) {
        return isMigrationRequired(i10, i10 + 1);
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, boolean z11, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, null, z11, false, set, null, null, null, null, AbstractC8809v.m14771n(), AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, null, null, null, null, AbstractC8809v.m14771n(), AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, null, null, AbstractC8809v.m14771n(), AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, AbstractC8809v.m14771n(), AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, AbstractC8809v.m14771n(), AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, AbstractC8809v.m14771n(), false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z13) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, z13, null, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC9133u.m16133g(migrationContainer, "migrationContainer");
        AbstractC9133u.m16133g(journalMode, "journalMode");
        AbstractC9133u.m16133g(queryExecutor, "queryExecutor");
        AbstractC9133u.m16133g(transactionExecutor, "transactionExecutor");
        AbstractC9133u.m16133g(typeConverters, "typeConverters");
        AbstractC9133u.m16133g(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
