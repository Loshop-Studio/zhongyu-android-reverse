package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.sqlite.p018db.SimpleSQLiteQuery;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8807u;
import p256t7.AbstractC10117b;

@InterfaceC8721a
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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final void dropAllTables$room_runtime_release(SupportSQLiteDatabase db) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(db, "db");
            Cursor cursorQuery = db.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listM14753c = AbstractC8807u.m14753c();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    AbstractC9133u.m16130d(string);
                    if (!AbstractC8687z.m14105M(string, "sqlite_", false, 2, null) && !AbstractC9133u.m16128b(string, "android_metadata")) {
                        listM14753c.add(AbstractC8726f.m14230a(string, Boolean.valueOf(AbstractC9133u.m16128b(cursorQuery.getString(1), "view"))));
                    }
                }
                List<Pair> listM14751a = AbstractC8807u.m14751a(listM14753c);
                AbstractC10117b.m18861a(cursorQuery, null);
                for (Pair pair : listM14751a) {
                    String str = (String) pair.m15903a();
                    if (((Boolean) pair.m15904b()).booleanValue()) {
                        db.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        db.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase db) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(db, "db");
            Cursor cursorQuery = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                AbstractC10117b.m18861a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase db) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(db, "db");
            Cursor cursorQuery = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                AbstractC10117b.m18861a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        private Companion() {
        }
    }

    @InterfaceC8721a
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

        public void onPostMigrate(SupportSQLiteDatabase db) {
            AbstractC9133u.m16133g(db, "db");
        }

        public void onPreMigrate(SupportSQLiteDatabase db) {
            AbstractC9133u.m16133g(db, "db");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase db) {
            AbstractC9133u.m16133g(db, "db");
            validateMigration(db);
            return new ValidationResult(true, null);
        }

        @InterfaceC8721a
        public void validateMigration(SupportSQLiteDatabase db) {
            AbstractC9133u.m16133g(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @InterfaceC8721a
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
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(identityHash, "identityHash");
        AbstractC9133u.m16133g(legacyHash, "legacyHash");
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
            AbstractC10117b.m18861a(cursorQuery, null);
            if (AbstractC9133u.m16128b(this.identityHash, string) || AbstractC9133u.m16128b(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC10117b.m18861a(cursorQuery, th);
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
    public void onConfigure(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        super.onConfigure(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase db) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(db, "db");
        boolean zHasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db);
        this.delegate.createAllTables(db);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db);
        this.delegate.onCreate(db);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(db);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase db, int i10, int i11) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(db, "db");
        onUpgrade(db, i10, i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase db) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(db, "db");
        super.onOpen(db);
        checkIdentity(db);
        this.delegate.onOpen(db);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(db);
            }
        }
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase db, int i10, int i11) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        List<Migration> listFindMigrationPath;
        AbstractC9133u.m16133g(db, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i10, i11)) != null) {
            this.delegate.onPreMigrate(db);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(db));
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db);
                updateIdentity(db);
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
            Companion.dropAllTables$room_runtime_release(db);
        } else {
            this.delegate.dropAllTables(db);
        }
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(db);
            }
        }
        this.delegate.createAllTables(db);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(legacyHash, "legacyHash");
    }
}
