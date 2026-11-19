package androidx.room;

import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.driver.SupportSQLiteDriver;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteDriver;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RoomConnectionManager extends BaseRoomConnectionManager {
    private final List<RoomDatabase.Callback> callbacks;
    private final DatabaseConfiguration configuration;
    private final ConnectionPool connectionPool;
    private final RoomOpenDelegate openDelegate;
    private SupportSQLiteDatabase supportDatabase;

    public static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
            AbstractC9979u.m20294g(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i10) {
            super(i10);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(db2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(SupportSQLiteDatabase db2, int i10, int i11) {
            AbstractC9979u.m20294g(db2, "db");
            onUpgrade(db2, i10, i11);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(db2));
            RoomConnectionManager.this.supportDatabase = db2;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(SupportSQLiteDatabase db2, int i10, int i11) {
            AbstractC9979u.m20294g(db2, "db");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(db2), i10, i11);
        }
    }

    public RoomConnectionManager(DatabaseConfiguration config, RoomOpenDelegate openDelegate) {
        ConnectionPool connectionPoolNewSingleConnectionPool;
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? AbstractC10978w.m24136n() : list;
        SQLiteDriver sQLiteDriver = config.sqliteDriver;
        if (sQLiteDriver != null) {
            if (sQLiteDriver instanceof AndroidSQLiteDriver) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver);
                String str = config.name;
                connectionPoolNewSingleConnectionPool = new AndroidSQLiteDriverConnectionPool(driverWrapper, str != null ? str : ":memory:");
            } else {
                connectionPoolNewSingleConnectionPool = config.name == null ? ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), ":memory:") : ConnectionPoolKt.newConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), config.name, getMaxNumberOfReaders(config.journalMode), getMaxNumberOfWriters(config.journalMode));
            }
            this.connectionPool = connectionPoolNewSingleConnectionPool;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(config.context).name(config.name).callback(new SupportOpenHelperCallback(openDelegate.getVersion())).build())));
        }
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        roomConnectionManager.supportDatabase = db2;
        return C10786q.f26013a;
    }

    private final void init() {
        boolean z10 = getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z10);
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final InterfaceC9540l interfaceC9540l) {
        List<RoomDatabase.Callback> listM24136n = databaseConfiguration.callbacks;
        if (listM24136n == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, AbstractC10947g0.m23907I0(listM24136n, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                interfaceC9540l.invoke(db2);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void close() {
        this.connectionPool.close();
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
        SupportSQLiteDriver supportDriver$room_runtime_release;
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool == null || (supportDriver$room_runtime_release = supportSQLiteConnectionPool.getSupportDriver$room_runtime_release()) == null) {
            return null;
        }
        return supportDriver$room_runtime_release.getOpenHelper();
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public String resolveFileName$room_runtime_release(String fileName) {
        AbstractC9979u.m20294g(fileName, "fileName");
        if (AbstractC9979u.m20289b(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        AbstractC9979u.m20291d(absolutePath);
        return absolutePath;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public <R> Object useConnection(boolean z10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return this.connectionPool.useConnection(z10, interfaceC9544p, interfaceC11588c);
    }

    public RoomConnectionManager(DatabaseConfiguration config, InterfaceC9540l supportOpenHelperFactory) {
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? AbstractC10978w.m24136n() : list;
        this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver((SupportSQLiteOpenHelper) supportOpenHelperFactory.invoke(installOnOpenCallback(config, new InterfaceC9540l() { // from class: androidx.room.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RoomConnectionManager._init_$lambda$1(this.f2022c, (SupportSQLiteDatabase) obj);
            }
        }))));
        init();
    }
}
