package androidx.room.support;

import android.content.Context;
import android.util.Log;
import androidx.room.DatabaseConfiguration;
import androidx.room.DelegatingOpenHelper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import androidx.sqlite.p019db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import cd.AbstractC5423b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class PrePackagedCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public PrePackagedCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i10, SupportSQLiteOpenHelper delegate) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File file, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        AbstractC9979u.m20291d(channel);
        FileUtil.copy(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC9979u.m20291d(fileCreateTempFile);
        dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, z10);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        try {
            final int version = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder builderName = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            final int iM21752e = AbstractC10410o.m21752e(version, 1);
            return frameworkSQLiteOpenHelperFactory.create(builderName.callback(new SupportSQLiteOpenHelper.Callback(iM21752e) { // from class: androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase db2) {
                    AbstractC9979u.m20294g(db2, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase db2) {
                    AbstractC9979u.m20294g(db2, "db");
                    int i10 = version;
                    if (i10 < 1) {
                        db2.setVersion(i10);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase db2, int i10, int i11) {
                    AbstractC9979u.m20294g(db2, "db");
                }
            }).build());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            AbstractC9979u.m20312y("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            SupportSQLiteDatabase writableDatabase = z10 ? supportSQLiteOpenHelperCreateFrameworkOpenHelper.getWritableDatabase() : supportSQLiteOpenHelperCreateFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                AbstractC9979u.m20312y("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            AbstractC9979u.m20291d(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            C10786q c10786q = C10786q.f26013a;
            AbstractC5423b.m2902a(supportSQLiteOpenHelperCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z10) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            AbstractC9979u.m20312y("databaseConfiguration");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    AbstractC9979u.m20291d(databasePath);
                    copyDatabaseFile(databasePath, z10);
                    processLock.unlock();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                AbstractC9979u.m20291d(databasePath);
                int version = DBUtil.readVersion(databasePath);
                if (version == this.databaseVersion) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    AbstractC9979u.m20312y("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                    processLock.unlock();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z10);
                        C10786q c10786q = C10786q.f26013a;
                    } catch (IOException e11) {
                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (IOException e12) {
                Log.w(Room.LOG_TAG, "Unable to read database version.", e12);
                processLock.unlock();
                return;
            }
        } catch (Throwable th) {
            processLock.unlock();
            throw th;
        }
        processLock.unlock();
        throw th;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() throws IOException {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() throws IOException {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        AbstractC9979u.m20294g(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        getDelegate().setWriteAheadLoggingEnabled(z10);
    }
}
