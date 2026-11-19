package androidx.sqlite.driver;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.AndroidSQLiteStatement;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* loaded from: classes3.dex */
public abstract class AndroidSQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);

    /* renamed from: db */
    private final SQLiteDatabase f2078db;
    private boolean isClosed;
    private final String sql;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private final boolean isRowStatement(String str) {
            String string = AbstractC10793c0.m23129e1(str).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            AbstractC9979u.m20293f(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        public final AndroidSQLiteStatement create(SQLiteDatabase db2, String sql) {
            AbstractC9979u.m20294g(db2, "db");
            AbstractC9979u.m20294g(sql, "sql");
            return isRowStatement(sql) ? new SelectAndroidSQLiteStatement(db2, sql) : new OtherAndroidSQLiteStatement(db2, sql);
        }

        private Companion() {
        }
    }

    public static final class OtherAndroidSQLiteStatement extends AndroidSQLiteStatement {
        private final android.database.sqlite.SQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherAndroidSQLiteStatement(SQLiteDatabase db2, String sql) throws SQLException {
            super(db2, sql, null);
            AbstractC9979u.m20294g(db2, "db");
            AbstractC9979u.m20294g(sql, "sql");
            android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = db2.compileStatement(sql);
            AbstractC9979u.m20293f(sQLiteStatementCompileStatement, "compileStatement(...)");
            this.delegate = sQLiteStatementCompileStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo33815bindBlob(int i10, byte[] value) {
            AbstractC9979u.m20294g(value, "value");
            throwIfClosed();
            this.delegate.bindBlob(i10, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo33816bindDouble(int i10, double d10) {
            throwIfClosed();
            this.delegate.bindDouble(i10, d10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo33817bindLong(int i10, long j10) {
            throwIfClosed();
            this.delegate.bindLong(i10, j10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo33818bindNull(int i10) {
            throwIfClosed();
            this.delegate.bindNull(i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo33819bindText(int i10, String value) {
            AbstractC9979u.m20294g(value, "value");
            throwIfClosed();
            this.delegate.bindString(i10, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo33820clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i10) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }
    }

    public static final class SelectAndroidSQLiteStatement extends AndroidSQLiteStatement {
        public static final Companion Companion = new Companion(null);
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private Cursor cursor;
        private double[] doubleBindings;
        private long[] longBindings;
        private String[] stringBindings;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int getDataType(Cursor cursor, int i10) {
                int type = cursor.getType(i10);
                int type2 = cursor.getType(i10);
                if (type2 == 0) {
                    return 5;
                }
                int i11 = 1;
                if (type2 != 1) {
                    i11 = 2;
                    if (type2 != 2) {
                        i11 = 3;
                        if (type2 != 3) {
                            if (type2 == 4) {
                                return 4;
                            }
                            throw new IllegalStateException(("Unknown field type: " + type).toString());
                        }
                    }
                }
                return i11;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectAndroidSQLiteStatement(SQLiteDatabase db2, String sql) {
            super(db2, sql, null);
            AbstractC9979u.m20294g(db2, "db");
            AbstractC9979u.m20294g(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void bindTo(SQLiteProgram sQLiteProgram) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    sQLiteProgram.bindLong(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    sQLiteProgram.bindDouble(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    sQLiteProgram.bindString(i10, this.stringBindings[i10]);
                } else if (i11 == 4) {
                    sQLiteProgram.bindBlob(i10, this.blobBindings[i10]);
                } else if (i11 == 5) {
                    sQLiteProgram.bindNull(i10);
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

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.driver.a
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return AndroidSQLiteStatement.SelectAndroidSQLiteStatement.ensureCursor$lambda$0(this.f2079a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, getSql(), new String[0], null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cursor ensureCursor$lambda$0(SelectAndroidSQLiteStatement selectAndroidSQLiteStatement, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            AbstractC9979u.m20291d(sQLiteQuery);
            selectAndroidSQLiteStatement.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private final void throwIfInvalidColumn(Cursor cursor, int i10) {
            if (i10 < 0 || i10 >= cursor.getColumnCount()) {
                SQLite.throwSQLiteException(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo33815bindBlob(int i10, byte[] value) {
            AbstractC9979u.m20294g(value, "value");
            throwIfClosed();
            ensureCapacity(4, i10);
            this.bindingTypes[i10] = 4;
            this.blobBindings[i10] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo33816bindDouble(int i10, double d10) {
            throwIfClosed();
            ensureCapacity(2, i10);
            this.bindingTypes[i10] = 2;
            this.doubleBindings[i10] = d10;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo33817bindLong(int i10, long j10) {
            throwIfClosed();
            ensureCapacity(1, i10);
            this.bindingTypes[i10] = 1;
            this.longBindings[i10] = j10;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo33818bindNull(int i10) {
            throwIfClosed();
            ensureCapacity(5, i10);
            this.bindingTypes[i10] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo33819bindText(int i10, String value) {
            AbstractC9979u.m20294g(value, "value");
            throwIfClosed();
            ensureCapacity(3, i10);
            this.bindingTypes[i10] = 3;
            this.stringBindings[i10] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo33820clearBindings() {
            throwIfClosed();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!isClosed()) {
                reset();
            }
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i10) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i10);
            byte[] blob = cursorThrowIfNoRow.getBlob(i10);
            AbstractC9979u.m20293f(blob, "getBlob(...)");
            return blob;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i10) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i10);
            String columnName = cursor.getColumnName(i10);
            AbstractC9979u.m20293f(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i10) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i10);
            return Companion.getDataType(cursor, i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i10) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i10);
            return cursorThrowIfNoRow.getDouble(i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i10) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i10);
            return cursorThrowIfNoRow.getLong(i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i10) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i10);
            String string = cursorThrowIfNoRow.getString(i10);
            AbstractC9979u.m20293f(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i10) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, i10);
            return cursorThrowIfNoRow.isNull(i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public /* synthetic */ AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, AbstractC9972n abstractC9972n) {
        this(sQLiteDatabase, str);
    }

    public final SQLiteDatabase getDb() {
        return this.f2078db;
    }

    public final String getSql() {
        return this.sql;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final void setClosed(boolean z10) {
        this.isClosed = z10;
    }

    public final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    private AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.f2078db = sQLiteDatabase;
        this.sql = str;
    }
}
