package androidx.room.support;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.room.DelegatingOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import androidx.sqlite.p019db.SupportSQLiteProgram;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes3.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final SupportSQLiteOpenHelper delegate;

    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            AbstractC9979u.m20294g(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _set_pageSize_$lambda$3(long j10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.setPageSize(j10);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q _set_version_$lambda$1(int i10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.setVersion(i10);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int delete$lambda$5(String str, String str2, Object[] objArr, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            return db2.delete(str, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q execSQL$lambda$7(String str, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.execSQL(str);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q execSQL$lambda$8(String str, Object[] objArr, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.execSQL(str, objArr);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long insert$lambda$4(String str, int i10, ContentValues contentValues, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            return db2.insert(str, i10, contentValues);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean needUpgrade$lambda$9(int i10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            return db2.needUpgrade(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object pokeOpen$lambda$0(SupportSQLiteDatabase it) {
            AbstractC9979u.m20294g(it, "it");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q setForeignKeyConstraintsEnabled$lambda$12(boolean z10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.setForeignKeyConstraintsEnabled(z10);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q setLocale$lambda$10(Locale locale, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.setLocale(locale);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q setMaxSqlCacheSize$lambda$11(int i10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            db2.setMaxSqlCacheSize(i10);
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long setMaximumSize$lambda$2(long j10, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            return db2.setMaximumSize(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int update$lambda$6(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            return db2.update(str, i10, contentValues, str2, objArr);
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
            AbstractC9979u.m20294g(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
            AbstractC9979u.m20294g(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public SupportSQLiteStatement compileStatement(String sql) {
            AbstractC9979u.m20294g(sql, "sql");
            return new AutoClosingSupportSQLiteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public int delete(final String table, final String str, final Object[] objArr) {
            AbstractC9979u.m20294g(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.d
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.delete$lambda$5(table, str, objArr, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void endTransaction() {
            try {
                SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
                AbstractC9979u.m20291d(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void execSQL(final String sql) {
            AbstractC9979u.m20294g(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.h
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$7(sql, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C4544x5693171d.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public long insert(final String table, final int i10, final ContentValues values) {
            AbstractC9979u.m20294g(table, "table");
            AbstractC9979u.m20294g(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.insert$lambda$4(table, i10, values, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                return delegateDatabase$room_runtime_release.isOpen();
            }
            return false;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // p280od.InterfaceC10480n
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean needUpgrade(final int i10) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.m
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade$lambda$9(i10, (SupportSQLiteDatabase) obj));
                }
            })).booleanValue();
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.j
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen$lambda$0((SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public Cursor query(String query) {
            AbstractC9979u.m20294g(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean z10) {
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.n
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled$lambda$12(z10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setLocale(final Locale locale) {
            AbstractC9979u.m20294g(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.c
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setLocale$lambda$10(locale, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int i10) {
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.b
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize$lambda$11(i10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public long setMaximumSize(final long j10) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaximumSize$lambda$2(j10, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setPageSize(final long j10) {
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.l
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_pageSize_$lambda$3(j10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            AbstractC9979u.m20291d(delegateDatabase$room_runtime_release);
            delegateDatabase$room_runtime_release.setTransactionSuccessful();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void setVersion(final int i10) {
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(i10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public int update(final String table, final int i10, final ContentValues values, final String str, final Object[] objArr) {
            AbstractC9979u.m20294g(table, "table");
            AbstractC9979u.m20294g(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.g
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.update$lambda$6(table, i10, values, str, objArr, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C4553x2da6dfee.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public void execSQL(final String sql, final Object[] bindArgs) {
            AbstractC9979u.m20294g(sql, "sql");
            AbstractC9979u.m20294g(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.i
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$8(sql, bindArgs, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j10) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(C4554x2da6dfef.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public Cursor query(String query, Object[] bindArgs) {
            AbstractC9979u.m20294g(query, "query");
            AbstractC9979u.m20294g(bindArgs, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query) {
            AbstractC9979u.m20294g(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
            AbstractC9979u.m20294g(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    public static final class AutoClosingSupportSQLiteStatement implements SupportSQLiteStatement {
        private static final int COLUMN_TYPE_BLOB = 4;
        private static final int COLUMN_TYPE_DOUBLE = 2;
        private static final int COLUMN_TYPE_LONG = 1;
        private static final int COLUMN_TYPE_NULL = 5;
        private static final int COLUMN_TYPE_STRING = 3;
        public static final Companion Companion = new Companion(null);
        private final AutoCloser autoCloser;
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private double[] doubleBindings;
        private long[] longBindings;
        private final String sql;
        private String[] stringBindings;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            private Companion() {
            }
        }

        public AutoClosingSupportSQLiteStatement(String sql, AutoCloser autoCloser) {
            AbstractC9979u.m20294g(sql, "sql");
            AbstractC9979u.m20294g(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    supportSQLiteProgram.bindLong(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    supportSQLiteProgram.bindDouble(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    String str = this.stringBindings[i10];
                    AbstractC9979u.m20291d(str);
                    supportSQLiteProgram.bindString(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.blobBindings[i10];
                    AbstractC9979u.m20291d(bArr);
                    supportSQLiteProgram.bindBlob(i10, bArr);
                } else if (i11 == 5) {
                    supportSQLiteProgram.bindNull(i10);
                }
            }
        }

        private final void ensureCapacity(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    AbstractC9979u.m20293f(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                AbstractC9979u.m20293f(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q execute$lambda$0(SupportSQLiteStatement statement) {
            AbstractC9979u.m20294g(statement, "statement");
            statement.execute();
            return C10786q.f26013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long executeInsert$lambda$2(SupportSQLiteStatement obj) {
            AbstractC9979u.m20294g(obj, "obj");
            return obj.executeInsert();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int executeUpdateDelete$lambda$1(SupportSQLiteStatement obj) {
            AbstractC9979u.m20294g(obj, "obj");
            return obj.executeUpdateDelete();
        }

        private final <T> T executeWithRefCount(final InterfaceC9540l interfaceC9540l) {
            return (T) this.autoCloser.executeRefCountingFunction(new InterfaceC9540l() { // from class: androidx.room.support.r
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeWithRefCount$lambda$5(this.f2059c, interfaceC9540l, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object executeWithRefCount$lambda$5(AutoClosingSupportSQLiteStatement autoClosingSupportSQLiteStatement, InterfaceC9540l interfaceC9540l, SupportSQLiteDatabase db2) {
            AbstractC9979u.m20294g(db2, "db");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = db2.compileStatement(autoClosingSupportSQLiteStatement.sql);
            autoClosingSupportSQLiteStatement.bindTo(supportSQLiteStatementCompileStatement);
            return interfaceC9540l.invoke(supportSQLiteStatementCompileStatement);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long simpleQueryForLong$lambda$3(SupportSQLiteStatement obj) {
            AbstractC9979u.m20294g(obj, "obj");
            return obj.simpleQueryForLong();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String simpleQueryForString$lambda$4(SupportSQLiteStatement obj) {
            AbstractC9979u.m20294g(obj, "obj");
            return obj.simpleQueryForString();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void bindBlob(int i10, byte[] value) {
            AbstractC9979u.m20294g(value, "value");
            ensureCapacity(4, i10);
            this.bindingTypes[i10] = 4;
            this.blobBindings[i10] = value;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void bindDouble(int i10, double d10) {
            ensureCapacity(2, i10);
            this.bindingTypes[i10] = 2;
            this.doubleBindings[i10] = d10;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void bindLong(int i10, long j10) {
            ensureCapacity(1, i10);
            this.bindingTypes[i10] = 1;
            this.longBindings[i10] = j10;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void bindNull(int i10) {
            ensureCapacity(5, i10);
            this.bindingTypes[i10] = 5;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void bindString(int i10, String value) {
            AbstractC9979u.m20294g(value, "value");
            ensureCapacity(3, i10);
            this.bindingTypes[i10] = 3;
            this.stringBindings[i10] = value;
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteProgram
        public void clearBindings() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            clearBindings();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteStatement
        public void execute() {
            executeWithRefCount(new InterfaceC9540l() { // from class: androidx.room.support.t
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.execute$lambda$0((SupportSQLiteStatement) obj);
                }
            });
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) executeWithRefCount(new InterfaceC9540l() { // from class: androidx.room.support.s
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeInsert$lambda$2((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) executeWithRefCount(new InterfaceC9540l() { // from class: androidx.room.support.q
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeUpdateDelete$lambda$1((SupportSQLiteStatement) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) executeWithRefCount(new InterfaceC9540l() { // from class: androidx.room.support.o
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForLong$lambda$3((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p019db.SupportSQLiteStatement
        public String simpleQueryForString() {
            return (String) executeWithRefCount(new InterfaceC9540l() { // from class: androidx.room.support.p
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForString$lambda$4((SupportSQLiteStatement) obj);
                }
            });
        }
    }

    public static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        public KeepAliveCursor(Cursor delegate, AutoCloser autoCloser) {
            AbstractC9979u.m20294g(delegate, "delegate");
            AbstractC9979u.m20294g(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @InterfaceC10770a
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.delegate.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.delegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.delegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.delegate.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.delegate.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.delegate.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.delegate.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.delegate.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.delegate.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.delegate.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.delegate.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.delegate.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.delegate.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.delegate.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @InterfaceC10770a
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.delegate.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            this.delegate.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(SupportSQLiteOpenHelper delegate, AutoCloser autoCloser) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
        autoCloser.initOpenHelper(getDelegate());
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    public final AutoCloser getAutoCloser$room_runtime_release() {
        return this.autoCloser;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.delegate.setWriteAheadLoggingEnabled(z10);
    }
}
