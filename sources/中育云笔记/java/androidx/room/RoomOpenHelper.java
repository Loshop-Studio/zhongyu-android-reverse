package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.sqlite.p019db.SimpleSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import cd.AbstractC5423b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10770a;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10976v;

@InterfaceC10770a
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public static final Companion Companion = new Companion(null);
    private final List<RoomDatabase.Callback> callbacks;
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final void dropAllTables$room_runtime_release(SupportSQLiteDatabase db2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(db2, "db");
            Cursor cursorQuery = db2.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listM24124c = AbstractC10976v.m24124c();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    AbstractC9979u.m20291d(string);
                    if (!AbstractC10819z.m23242O(string, "sqlite_", false, 2, null) && !AbstractC9979u.m20289b(string, "android_metadata")) {
                        listM24124c.add(AbstractC10776g.m22975a(string, Boolean.valueOf(AbstractC9979u.m20289b(cursorQuery.getString(1), "view"))));
                    }
                }
                List<Pair> listM24122a = AbstractC10976v.m24122a(listM24124c);
                AbstractC5423b.m2902a(cursorQuery, null);
                for (Pair pair : listM24122a) {
                    String str = (String) pair.m20048a();
                    if (((Boolean) pair.m20049c()).booleanValue()) {
                        db2.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase db2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(db2, "db");
            Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                AbstractC5423b.m2902a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase db2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(db2, "db");
            Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                AbstractC5423b.m2902a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        private Companion() {
        }
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {
        public final int version;

        public Delegate(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public void onPreMigrate(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            validateMigration(db2);
            return new ValidationResult(true, null);
        }

        @InterfaceC10770a
        public void validateMigration(SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z10, String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(identityHash, "identityHash");
        AbstractC9979u.m20294g(legacyHash, "legacyHash");
        this.callbacks = configuration.callbacks;
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (!Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(supportSQLiteDatabase);
                updateIdentity(supportSQLiteDatabase);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorQuery = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            AbstractC5423b.m2902a(cursorQuery, null);
            if (AbstractC9979u.m20289b(this.identityHash, string) || AbstractC9979u.m20289b(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5423b.m2902a(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        super.onConfigure(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase db2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(db2, "db");
        boolean zHasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db2);
        this.delegate.createAllTables(db2);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db2);
        this.delegate.onCreate(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(db2);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase db2, int i10, int i11) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(db2, "db");
        onUpgrade(db2, i10, i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase db2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(db2, "db");
        super.onOpen(db2);
        checkIdentity(db2);
        this.delegate.onOpen(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(db2);
            }
        }
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase db2, int i10, int i11) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        List<Migration> listFindMigrationPath;
        AbstractC9979u.m20294g(db2, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i10, i11)) != null) {
            this.delegate.onPreMigrate(db2);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(db2));
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                updateIdentity(db2);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 == null || databaseConfiguration2.isMigrationRequired(i10, i11)) {
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
            Companion.dropAllTables$room_runtime_release(db2);
        } else {
            this.delegate.dropAllTables(db2);
        }
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(db2);
            }
        }
        this.delegate.createAllTables(db2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(legacyHash, "legacyHash");
    }
}
