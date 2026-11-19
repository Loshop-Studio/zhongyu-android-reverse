package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.DBUtil;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.p019db.SimpleSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import androidx.sqlite.p019db.framework.FrameworkSQLiteOpenHelperFactory;
import gd.AbstractC9293a;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC9924b;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import org.android.agoo.common.AgooConstants;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p280od.InterfaceC10469c;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p325rc.AbstractC10983y0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p425yc.InterfaceC11943a;
import sd.AbstractC11106e0;
import sd.AbstractC11108e2;
import sd.AbstractC11115g1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private RoomConnectionManager connectionManager;
    private InterfaceC11122i0 coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private InterfaceC9945d transactionContext;
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<InterfaceC10469c, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private final List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SQLiteDriver driver;
        private final InterfaceC9529a factory;
        private boolean inMemoryTrackingTableMode;
        private JournalMode journalMode;
        private final InterfaceC10469c klass;
        private final MigrationContainer migrationContainer;
        private final Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private InterfaceC9945d queryCallbackCoroutineContext;
        private Executor queryCallbackExecutor;
        private InterfaceC9945d queryCoroutineContext;
        private Executor queryExecutor;
        private boolean requireMigration;
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder(InterfaceC10469c klass, String str, InterfaceC9529a interfaceC9529a, Context context) {
            AbstractC9979u.m20294g(klass, "klass");
            AbstractC9979u.m20294g(context, "context");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = klass;
            this.context = context;
            this.name = str;
            this.factory = interfaceC9529a;
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec autoMigrationSpec) {
            AbstractC9979u.m20294g(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            AbstractC9979u.m20294g(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public Builder<T> addMigrations(Migration... migrations) {
            AbstractC9979u.m20294g(migrations, "migrations");
            for (Migration migration : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public Builder<T> addTypeConverter(Object typeConverter) {
            AbstractC9979u.m20294g(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T build() {
            SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            T t10;
            InterfaceC9945d interfaceC9945dM24721b;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else if (sQLiteDriver == null) {
                queryInterceptorOpenHelperFactory = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                queryInterceptorOpenHelperFactory = null;
            }
            boolean z10 = this.autoCloseTimeout > 0;
            boolean z11 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z12 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z10) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z12) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if ((executor2 == null || (interfaceC9945dM24721b = AbstractC11115g1.m24721b(executor2)) == null) && (interfaceC9945dM24721b = this.queryCallbackCoroutineContext) == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    InterfaceC11122i0 interfaceC11122i0M20744a = AbstractC10006d.m20744a(interfaceC9945dM24721b);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, interfaceC11122i0M20744a, queryCallback);
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
                if (z12) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z13 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z13, journalModeResolve$room_runtime_release, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.setUseTempTrackingTable$room_runtime_release(this.inMemoryTrackingTableMode);
            InterfaceC9529a interfaceC9529a = this.factory;
            if (interfaceC9529a == null || (t10 = (T) interfaceC9529a.invoke()) == null) {
                t10 = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(AbstractC9293a.m18324a(this.klass), null, 2, null);
            }
            t10.init(databaseConfiguration);
            return t10;
        }

        public Builder<T> createFromAsset(String databaseFilePath) {
            AbstractC9979u.m20294g(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public Builder<T> createFromFile(File databaseFile) {
            AbstractC9979u.m20294g(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable) {
            AbstractC9979u.m20294g(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @InterfaceC10770a
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @InterfaceC10770a
        public Builder<T> fallbackToDestructiveMigrationFrom(int... startVersions) {
            AbstractC9979u.m20294g(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            return this;
        }

        @InterfaceC10770a
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long j10, TimeUnit autoCloseTimeUnit) {
            AbstractC9979u.m20294g(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j10 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = j10;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        public final Builder<T> setDriver(SQLiteDriver driver) {
            AbstractC9979u.m20294g(driver, "driver");
            this.driver = driver;
            return this;
        }

        @ExperimentalRoomApi
        public final Builder<T> setInMemoryTrackingMode(boolean z10) {
            this.inMemoryTrackingTableMode = z10;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            AbstractC9979u.m20294g(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent invalidationServiceIntent) {
            AbstractC9979u.m20294g(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback queryCallback, Executor executor) {
            AbstractC9979u.m20294g(queryCallback, "queryCallback");
            AbstractC9979u.m20294g(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        public final Builder<T> setQueryCoroutineContext(InterfaceC9945d context) {
            AbstractC9979u.m20294g(context, "context");
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            }
            if (context.get(InterfaceC9944c.f23354a0) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
            }
            this.queryCoroutineContext = context;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            AbstractC9979u.m20294g(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            AbstractC9979u.m20294g(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromAsset(String databaseFilePath, PrepackagedDatabaseCallback callback) {
            AbstractC9979u.m20294g(databaseFilePath, "databaseFilePath");
            AbstractC9979u.m20294g(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public Builder<T> createFromFile(File databaseFile, PrepackagedDatabaseCallback callback) {
            AbstractC9979u.m20294g(databaseFile, "databaseFile");
            AbstractC9979u.m20294g(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable, PrepackagedDatabaseCallback callback) {
            AbstractC9979u.m20294g(inputStreamCallable, "inputStreamCallable");
            AbstractC9979u.m20294g(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigration(boolean z10) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z10;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(boolean z10, int... startVersions) {
            AbstractC9979u.m20294g(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            this.allowDestructiveMigrationForAllTables = z10;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean z10) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z10;
            return this;
        }

        public final Builder<T> setQueryCallback(InterfaceC9945d context, QueryCallback queryCallback) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(queryCallback, "queryCallback");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = context;
            return this;
        }

        public Builder(Context context, Class<T> klass, String str) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = AbstractC9293a.m18326c(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }
    }

    public static abstract class Callback {
        public void onCreate(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public void onOpen(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public void onCreate(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onDestructiveMigration(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onOpen(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) connection).getDb());
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JournalMode {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC = new JournalMode("AUTOMATIC", 0);
        public static final JournalMode TRUNCATE = new JournalMode("TRUNCATE", 1);
        public static final JournalMode WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] $values() {
            return new JournalMode[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            JournalMode[] journalModeArr$values = $values();
            $VALUES = journalModeArr$values;
            $ENTRIES = AbstractC9953a.m20230a(journalModeArr$values);
        }

        private JournalMode(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            AbstractC9979u.m20294g(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }
    }

    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    @InterfaceC11829d(m26210c = "androidx.room.RoomDatabase$performClear$1", m26211f = "RoomDatabase.android.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_Y}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabase$performClear$1 */
    public static final class C44721 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        int label;

        @InterfaceC11829d(m26210c = "androidx.room.RoomDatabase$performClear$1$1", m26211f = "RoomDatabase.android.kt", m26212l = {TypedValues.PositionType.TYPE_CURVE_FIT, 509, 511, 517, 518, 519}, m26213m = "invokeSuspend")
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RoomDatabase this$0;

            @InterfaceC11829d(m26210c = "androidx.room.RoomDatabase$performClear$1$1$1", m26211f = "RoomDatabase.android.kt", m26212l = {InputDeviceCompat.SOURCE_DPAD, 515}, m26213m = "invokeSuspend")
            /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120921 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ boolean $hasForeignKeys;
                final /* synthetic */ String[] $tableNames;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120921(boolean z10, String[] strArr, InterfaceC11588c<? super C120921> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$hasForeignKeys = z10;
                    this.$tableNames = strArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C120921 c120921 = new C120921(this.$hasForeignKeys, this.$tableNames, interfaceC11588c);
                    c120921.L$0 = obj;
                    return c120921;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(TransactionScope<C10786q> transactionScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120921) create(transactionScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r3) goto L26
                        if (r1 != r2) goto L1e
                        int r1 = r9.I$1
                        int r4 = r9.I$0
                        java.lang.Object r5 = r9.L$1
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r9.L$0
                        androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                        kotlin.AbstractC9924b.m20071b(r10)
                        goto L7a
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r1 = r9.L$0
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        kotlin.AbstractC9924b.m20071b(r10)
                        goto L47
                    L2e:
                        kotlin.AbstractC9924b.m20071b(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        boolean r10 = r9.$hasForeignKeys
                        if (r10 == 0) goto L47
                        r9.L$0 = r1
                        r9.label = r3
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r1, r10, r9)
                        if (r10 != r0) goto L47
                        goto L79
                    L47:
                        java.lang.String[] r10 = r9.$tableNames
                        int r4 = r10.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r10
                    L4f:
                        if (r4 >= r1) goto L7c
                        r10 = r5[r4]
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "DELETE FROM `"
                        r7.append(r8)
                        r7.append(r10)
                        r10 = 96
                        r7.append(r10)
                        java.lang.String r10 = r7.toString()
                        r9.L$0 = r6
                        r9.L$1 = r5
                        r9.I$0 = r4
                        r9.I$1 = r1
                        r9.label = r2
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r6, r10, r9)
                        if (r10 != r0) goto L7a
                    L79:
                        return r0
                    L7a:
                        int r4 = r4 + r3
                        goto L4f
                    L7c:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.C44721.AnonymousClass1.C120921.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, boolean z10, String[] strArr, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = roomDatabase;
                this.$hasForeignKeys = z10;
                this.$tableNames = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$hasForeignKeys, this.$tableNames, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Transactor transactor, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r7) != r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r1
              0x0071: PHI (r1v7 androidx.room.Transactor) = (r1v4 androidx.room.Transactor), (r1v4 androidx.room.Transactor), (r1v9 androidx.room.Transactor) binds: [B:17:0x005d, B:19:0x006e, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[PHI: r1
              0x0088: PHI (r1v10 androidx.room.Transactor) = (r1v7 androidx.room.Transactor), (r1v12 androidx.room.Transactor) binds: [B:22:0x0085, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r8
              0x0094: PHI (r1v13 androidx.room.Transactor) = (r1v10 androidx.room.Transactor), (r1v15 androidx.room.Transactor) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x0094: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r7.label
                    r2 = 0
                    switch(r1) {
                        case 0: goto L41;
                        case 1: goto L39;
                        case 2: goto L31;
                        case 3: goto L29;
                        case 4: goto L20;
                        case 5: goto L17;
                        case 6: goto L12;
                        default: goto La;
                    }
                La:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L12:
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto Lb8
                L17:
                    java.lang.Object r1 = r7.L$0
                    androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto Laa
                L20:
                    java.lang.Object r1 = r7.L$0
                    androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L94
                L29:
                    java.lang.Object r1 = r7.L$0
                    androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L88
                L31:
                    java.lang.Object r1 = r7.L$0
                    androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L71
                L39:
                    java.lang.Object r1 = r7.L$0
                    androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L57
                L41:
                    kotlin.AbstractC9924b.m20071b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.room.Transactor r8 = (androidx.room.Transactor) r8
                    r7.L$0 = r8
                    r1 = 1
                    r7.label = r1
                    java.lang.Object r1 = r8.inTransaction(r7)
                    if (r1 != r0) goto L54
                    goto Lb7
                L54:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L57:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L71
                    androidx.room.RoomDatabase r8 = r7.this$0
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    r7.L$0 = r1
                    r3 = 2
                    r7.label = r3
                    java.lang.Object r8 = r8.sync$room_runtime_release(r7)
                    if (r8 != r0) goto L71
                    goto Lb7
                L71:
                    androidx.room.Transactor$SQLiteTransactionType r8 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
                    androidx.room.RoomDatabase$performClear$1$1$1 r3 = new androidx.room.RoomDatabase$performClear$1$1$1
                    boolean r4 = r7.$hasForeignKeys
                    java.lang.String[] r5 = r7.$tableNames
                    r3.<init>(r4, r5, r2)
                    r7.L$0 = r1
                    r4 = 3
                    r7.label = r4
                    java.lang.Object r8 = r1.withTransaction(r8, r3, r7)
                    if (r8 != r0) goto L88
                    goto Lb7
                L88:
                    r7.L$0 = r1
                    r8 = 4
                    r7.label = r8
                    java.lang.Object r8 = r1.inTransaction(r7)
                    if (r8 != r0) goto L94
                    goto Lb7
                L94:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto Lc1
                    r7.L$0 = r1
                    r8 = 5
                    r7.label = r8
                    java.lang.String r8 = "PRAGMA wal_checkpoint(FULL)"
                    java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                    if (r8 != r0) goto Laa
                    goto Lb7
                Laa:
                    r7.L$0 = r2
                    r8 = 6
                    r7.label = r8
                    java.lang.String r8 = "VACUUM"
                    java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                    if (r8 != r0) goto Lb8
                Lb7:
                    return r0
                Lb8:
                    androidx.room.RoomDatabase r8 = r7.this$0
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    r8.refreshAsync()
                Lc1:
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.C44721.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44721(boolean z10, String[] strArr, InterfaceC11588c<? super C44721> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$hasForeignKeys = z10;
            this.$tableNames = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return RoomDatabase.this.new C44721(this.$hasForeignKeys, this.$tableNames, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                RoomConnectionManager roomConnectionManager = RoomDatabase.this.connectionManager;
                if (roomConnectionManager == null) {
                    AbstractC9979u.m20312y("connectionManager");
                    roomConnectionManager = null;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RoomDatabase.this, this.$hasForeignKeys, this.$tableNames, null);
                this.label = 1;
                if (roomConnectionManager.useConnection(false, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44721) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q beginTransaction$lambda$8(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        AbstractC9979u.m20294g(it, "it");
        roomDatabase.internalBeginTransaction();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper createConnectionManager$lambda$1(RoomDatabase roomDatabase, DatabaseConfiguration config) {
        AbstractC9979u.m20294g(config, "config");
        return roomDatabase.createOpenHelper(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q endTransaction$lambda$9(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        AbstractC9979u.m20294g(it, "it");
        roomDatabase.internalEndTransaction();
        return C10786q.f26013a;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @InterfaceC10770a
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime_release();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (interfaceC11122i0 == null) {
            AbstractC9979u.m20312y("coroutineScope");
            interfaceC11122i0 = null;
        }
        AbstractC10006d.m20747d(interfaceC11122i0, null, 1, null);
        getInvalidationTracker().stop$room_runtime_release();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            AbstractC9979u.m20312y("connectionManager");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.close();
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(InterfaceC9529a interfaceC9529a, SQLiteConnection it) {
        AbstractC9979u.m20294g(it, "it");
        return interfaceC9529a.invoke();
    }

    private final /* synthetic */ <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (supportSQLiteOpenHelper == null) {
            return null;
        }
        while (true) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (supportSQLiteOpenHelper != null) {
                return (T) supportSQLiteOpenHelper;
            }
            if (!(supportSQLiteOpenHelper instanceof DelegatingOpenHelper)) {
                return null;
            }
            supportSQLiteOpenHelper = (T) ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate();
        }
    }

    public final void addTypeConverter$room_runtime_release(InterfaceC10469c kclass, Object converter) {
        AbstractC9979u.m20294g(kclass, "kclass");
        AbstractC9979u.m20294g(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC10770a
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.o
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return RoomDatabase.beginTransaction$lambda$8(this.f2028c, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.close$room_runtime_release();
    }

    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC9979u.m20294g(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public List<Migration> createAutoMigrations(Map<InterfaceC10469c, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        AbstractC9979u.m20294g(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10967q0.m24038e(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(AbstractC9293a.m18324a((InterfaceC10469c) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final RoomConnectionManager createConnectionManager$room_runtime_release(DatabaseConfiguration configuration) {
        RoomOpenDelegate roomOpenDelegate;
        AbstractC9979u.m20294g(configuration, "configuration");
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCreateOpenDelegate = createOpenDelegate();
            AbstractC9979u.m20292e(roomOpenDelegateMarkerCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCreateOpenDelegate;
        } catch (NotImplementedError unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(configuration, new InterfaceC9540l() { // from class: androidx.room.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomDatabase.createConnectionManager$lambda$1(this.f2027c, (DatabaseConfiguration) obj);
            }
        }) : new RoomConnectionManager(configuration, roomOpenDelegate);
    }

    public abstract InvalidationTracker createInvalidationTracker();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public RoomOpenDelegateMarker createOpenDelegate() {
        throw new NotImplementedError(null, 1, null);
    }

    @InterfaceC10770a
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        AbstractC9979u.m20294g(config, "config");
        throw new NotImplementedError(null, 1, null);
    }

    @InterfaceC10770a
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return RoomDatabase.endTransaction$lambda$9(this.f2024c, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        AbstractC9979u.m20294g(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC10978w.m24136n();
    }

    public final CloseBarrier getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InterfaceC11122i0 getCoroutineScope() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 != null) {
            return interfaceC11122i0;
        }
        AbstractC9979u.m20312y("coroutineScope");
        return null;
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        AbstractC9979u.m20312y("internalTracker");
        return null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InterfaceC9945d getQueryContext() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 == null) {
            AbstractC9979u.m20312y("coroutineScope");
            interfaceC11122i0 = null;
        }
        return interfaceC11122i0.getCoroutineContext();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        AbstractC9979u.m20312y("internalQueryExecutor");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Set<InterfaceC10469c> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9293a.m18326c((Class) it.next()));
        }
        return AbstractC10947g0.m23929c1(arrayList);
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return AbstractC10983y0.m24160f();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Map<InterfaceC10469c, List<InterfaceC10469c>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10410o.m21752e(AbstractC10967q0.m24038e(AbstractC10980x.m24153x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            InterfaceC10469c interfaceC10469cM18326c = AbstractC9293a.m18326c(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(AbstractC9293a.m18326c((Class) it2.next()));
            }
            Pair pairM22975a = AbstractC10776g.m22975a(interfaceC10469cM18326c, arrayList);
            linkedHashMap.put(pairM22975a.m20051f(), pairM22975a.m20052g());
        }
        return linkedHashMap;
    }

    public final Map<InterfaceC10469c, List<InterfaceC10469c>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return AbstractC9925a.m20088h();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final InterfaceC9945d getTransactionContext$room_runtime_release() {
        InterfaceC9945d interfaceC9945d = this.transactionContext;
        if (interfaceC9945d != null) {
            return interfaceC9945d;
        }
        AbstractC9979u.m20312y("transactionContext");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        AbstractC9979u.m20312y("internalTransactionExecutor");
        return null;
    }

    @InterfaceC10770a
    public <T> T getTypeConverter(Class<T> klass) {
        AbstractC9979u.m20294g(klass, "klass");
        return (T) this.typeConverters.get(AbstractC9293a.m18326c(klass));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.getSupportOpenHelper$room_runtime_release() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(DatabaseConfiguration configuration) {
        InterfaceC9945d coroutineContext;
        AbstractC9979u.m20294g(configuration, "configuration");
        this.useTempTrackingTable = configuration.getUseTempTrackingTable$room_runtime_release();
        this.connectionManager = createConnectionManager$room_runtime_release(configuration);
        this.internalTracker = createInvalidationTracker();
        RoomDatabaseKt.validateAutoMigrations(this, configuration);
        RoomDatabaseKt.validateTypeConverters(this, configuration);
        InterfaceC9945d interfaceC9945d = configuration.queryCoroutineContext;
        InterfaceC11122i0 interfaceC11122i0 = null;
        if (interfaceC9945d != null) {
            InterfaceC9945d.b bVar = interfaceC9945d.get(InterfaceC9944c.f23354a0);
            AbstractC9979u.m20292e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            AbstractC11106e0 abstractC11106e0 = (AbstractC11106e0) bVar;
            Executor executorM24720a = AbstractC11115g1.m24720a(abstractC11106e0);
            this.internalQueryExecutor = executorM24720a;
            if (executorM24720a == null) {
                AbstractC9979u.m20312y("internalQueryExecutor");
                executorM24720a = null;
            }
            this.internalTransactionExecutor = new TransactionExecutor(executorM24720a);
            this.coroutineScope = AbstractC10006d.m20744a(configuration.queryCoroutineContext.plus(AbstractC11108e2.m24700a((InterfaceC10045g) configuration.queryCoroutineContext.get(InterfaceC10045g.f23976b0))));
            if (inCompatibilityMode$room_runtime_release()) {
                InterfaceC11122i0 interfaceC11122i02 = this.coroutineScope;
                if (interfaceC11122i02 == null) {
                    AbstractC9979u.m20312y("coroutineScope");
                    interfaceC11122i02 = null;
                }
                coroutineContext = interfaceC11122i02.getCoroutineContext().plus(abstractC11106e0.limitedParallelism(1));
            } else {
                InterfaceC11122i0 interfaceC11122i03 = this.coroutineScope;
                if (interfaceC11122i03 == null) {
                    AbstractC9979u.m20312y("coroutineScope");
                    interfaceC11122i03 = null;
                }
                coroutineContext = interfaceC11122i03.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                AbstractC9979u.m20312y("internalQueryExecutor");
                executor = null;
            }
            InterfaceC11122i0 interfaceC11122i0M20744a = AbstractC10006d.m20744a(AbstractC11115g1.m24721b(executor).plus(AbstractC11108e2.m24701b(null, 1, null)));
            this.coroutineScope = interfaceC11122i0M20744a;
            if (interfaceC11122i0M20744a == null) {
                AbstractC9979u.m20312y("coroutineScope");
                interfaceC11122i0M20744a = null;
            }
            InterfaceC9945d coroutineContext2 = interfaceC11122i0M20744a.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                AbstractC9979u.m20312y("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext2.plus(AbstractC11115g1.m24721b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            while (!(supportOpenHelper$room_runtime_release instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release = null;
                    break;
                }
                supportOpenHelper$room_runtime_release = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportOpenHelper$room_runtime_release;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.setDatabaseConfiguration(configuration);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager2 = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release2 = roomConnectionManager2.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release2 != null) {
            while (!(supportOpenHelper$room_runtime_release2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release2 instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release2 = null;
                    break;
                }
                supportOpenHelper$room_runtime_release2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportOpenHelper$room_runtime_release2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release();
            AutoCloser autoCloser$room_runtime_release = autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release();
            InterfaceC11122i0 interfaceC11122i04 = this.coroutineScope;
            if (interfaceC11122i04 == null) {
                AbstractC9979u.m20312y("coroutineScope");
            } else {
                interfaceC11122i0 = interfaceC11122i04;
            }
            autoCloser$room_runtime_release.initCoroutineScope(interfaceC11122i0);
            getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().initMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    @InterfaceC10770a
    public void internalInitInvalidationTracker(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        internalInitInvalidationTracker(new SupportSQLiteConnection(db2));
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void performClear(boolean z10, String... tableNames) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C44721(z10, tableNames, null));
    }

    public final Cursor query(SupportSQLiteQuery query) {
        AbstractC9979u.m20294g(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(final Runnable body) {
        AbstractC9979u.m20294g(body, "body");
        runInTransaction(new InterfaceC9529a() { // from class: androidx.room.j
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return RoomDatabase.runInTransaction$lambda$10(body);
            }
        });
    }

    @InterfaceC10770a
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            AbstractC9979u.m20312y("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.useConnection(z10, interfaceC9544p, interfaceC11588c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> T getTypeConverter(InterfaceC10469c klass) {
        AbstractC9979u.m20294g(klass, "klass");
        T t10 = (T) this.typeConverters.get(klass);
        AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void internalInitInvalidationTracker(SQLiteConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        getInvalidationTracker().internalInit$room_runtime_release(connection);
    }

    public Cursor query(String query, Object[] objArr) {
        AbstractC9979u.m20294g(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    public <V> V runInTransaction(final Callable<V> body) {
        AbstractC9979u.m20294g(body, "body");
        return (V) runInTransaction(new InterfaceC9529a() { // from class: androidx.room.l
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return body.call();
            }
        });
    }

    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void addMigration(Migration migration) {
            AbstractC9979u.m20294g(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void addMigrations(List<? extends Migration> migrations) {
            AbstractC9979u.m20294g(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i10, int i11) {
            return MigrationUtil.contains(this, i10, i11);
        }

        public List<Migration> findMigrationPath(int i10, int i11) {
            return MigrationUtil.findMigrationPath(this, i10, i11);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedDescendingNodes$room_runtime_release(int i10) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return AbstractC10776g.m22975a(treeMap, treeMap.descendingKeySet());
        }

        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedNodes$room_runtime_release(int i10) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return AbstractC10776g.m22975a(treeMap, treeMap.keySet());
        }

        public void addMigrations(Migration... migrations) {
            AbstractC9979u.m20294g(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    private final <T> T runInTransaction(final InterfaceC9529a interfaceC9529a) {
        if (inCompatibilityMode$room_runtime_release()) {
            beginTransaction();
            try {
                T t10 = (T) interfaceC9529a.invoke();
                setTransactionSuccessful();
                return t10;
            } finally {
                endTransaction();
            }
        }
        return (T) DBUtil.performBlocking(this, false, true, new InterfaceC9540l() { // from class: androidx.room.m
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomDatabase.runInTransaction$lambda$12(interfaceC9529a, (SQLiteConnection) obj);
            }
        });
    }

    public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC9979u.m20294g(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }
}
