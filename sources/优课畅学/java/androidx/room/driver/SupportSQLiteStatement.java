package androidx.room.driver;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteProgram;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class SupportSQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);

    /* renamed from: db */
    private final SupportSQLiteDatabase f1903db;
    private boolean isClosed;
    private final String sql;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final int getStatementPrefixIndex(String str) {
            String str2;
            int i10;
            int length = str.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = str.charAt(i11);
                if (AbstractC9133u.m16135i(cCharAt, 32) <= 0) {
                    i11++;
                } else {
                    if (cCharAt != '-') {
                        str2 = str;
                        if (cCharAt == '/') {
                            int iM13990e0 = i11 + 1;
                            if (str2.charAt(iM13990e0) == '*') {
                                do {
                                    String str3 = str2;
                                    iM13990e0 = AbstractC8661c0.m13990e0(str3, '*', iM13990e0 + 1, false, 4, null);
                                    str2 = str3;
                                    if (iM13990e0 >= 0) {
                                        i10 = iM13990e0 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        return -1;
                                    }
                                } while (str2.charAt(i10) != '/');
                                i11 = iM13990e0 + 2;
                                str = str2;
                            }
                        }
                        return i11;
                    }
                    if (str.charAt(i11 + 1) != '-') {
                        return i11;
                    }
                    str2 = str;
                    int iM13990e02 = AbstractC8661c0.m13990e0(str2, '\n', i11 + 2, false, 4, null);
                    if (iM13990e02 < 0) {
                        return -1;
                    }
                    i11 = iM13990e02 + 1;
                    str = str2;
                }
            }
            return -1;
        }

        private final boolean isRowStatement(String str) {
            int iHashCode = str.hashCode();
            return iHashCode != 79487 ? iHashCode != 81978 ? iHashCode == 85954 && str.equals("WIT") : str.equals("SEL") : str.equals("PRA");
        }

        public final SupportSQLiteStatement create(SupportSQLiteDatabase db, String sql) {
            AbstractC9133u.m16133g(db, "db");
            AbstractC9133u.m16133g(sql, "sql");
            String upperCase = AbstractC8661c0.m13982W0(sql).toString().toUpperCase(Locale.ROOT);
            AbstractC9133u.m16132f(upperCase, "toUpperCase(...)");
            String statementPrefix$room_runtime_release = getStatementPrefix$room_runtime_release(upperCase);
            return statementPrefix$room_runtime_release == null ? new SupportOtherAndroidSQLiteStatement(db, sql) : isRowStatement(statementPrefix$room_runtime_release) ? new SupportAndroidSQLiteStatement(db, sql) : new SupportOtherAndroidSQLiteStatement(db, sql);
        }

        @VisibleForTesting
        public final String getStatementPrefix$room_runtime_release(String sql) {
            AbstractC9133u.m16133g(sql, "sql");
            int statementPrefixIndex = getStatementPrefixIndex(sql);
            if (statementPrefixIndex < 0 || statementPrefixIndex > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(statementPrefixIndex, Math.min(statementPrefixIndex + 3, sql.length()));
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            return strSubstring;
        }

        private Companion() {
        }
    }

    public static final class SupportAndroidSQLiteStatement extends SupportSQLiteStatement {
        public static final Companion Companion = new Companion(null);
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private Cursor cursor;
        private double[] doubleBindings;
        private long[] longBindings;
        private String[] stringBindings;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
        public SupportAndroidSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql, null);
            AbstractC9133u.m16133g(db, "db");
            AbstractC9133u.m16133g(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void ensureCapacity(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    AbstractC9133u.m16132f(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
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
                AbstractC9133u.m16132f(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().query(new SupportSQLiteQuery() { // from class: androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
                    public void bindTo(SupportSQLiteProgram statement) {
                        AbstractC9133u.m16133g(statement, "statement");
                        int length = this.this$0.bindingTypes.length;
                        for (int i10 = 1; i10 < length; i10++) {
                            int i11 = this.this$0.bindingTypes[i10];
                            if (i11 == 1) {
                                statement.bindLong(i10, this.this$0.longBindings[i10]);
                            } else if (i11 == 2) {
                                statement.bindDouble(i10, this.this$0.doubleBindings[i10]);
                            } else if (i11 == 3) {
                                String str = this.this$0.stringBindings[i10];
                                AbstractC9133u.m16130d(str);
                                statement.bindString(i10, str);
                            } else if (i11 == 4) {
                                byte[] bArr = this.this$0.blobBindings[i10];
                                AbstractC9133u.m16130d(bArr);
                                statement.bindBlob(i10, bArr);
                            } else if (i11 == 5) {
                                statement.bindNull(i10);
                            }
                        }
                    }

                    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
                    public int getArgCount() {
                        return this.this$0.bindingTypes.length;
                    }

                    @Override // androidx.sqlite.p018db.SupportSQLiteQuery
                    public String getSql() {
                        return this.this$0.getSql();
                    }
                });
            }
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
        public void mo27220bindBlob(int i10, byte[] value) {
            AbstractC9133u.m16133g(value, "value");
            throwIfClosed();
            ensureCapacity(4, i10);
            this.bindingTypes[i10] = 4;
            this.blobBindings[i10] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo27221bindDouble(int i10, double d10) {
            throwIfClosed();
            ensureCapacity(2, i10);
            this.bindingTypes[i10] = 2;
            this.doubleBindings[i10] = d10;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo27222bindLong(int i10, long j10) {
            throwIfClosed();
            ensureCapacity(1, i10);
            this.bindingTypes[i10] = 1;
            this.longBindings[i10] = j10;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo27223bindNull(int i10) {
            throwIfClosed();
            ensureCapacity(5, i10);
            this.bindingTypes[i10] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo27224bindText(int i10, String value) {
            AbstractC9133u.m16133g(value, "value");
            throwIfClosed();
            ensureCapacity(3, i10);
            this.bindingTypes[i10] = 3;
            this.stringBindings[i10] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo27225clearBindings() {
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
                mo27225clearBindings();
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
            AbstractC9133u.m16132f(blob, "getBlob(...)");
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
            AbstractC9133u.m16132f(columnName, "getColumnName(...)");
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
            AbstractC9133u.m16132f(string, "getString(...)");
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

    public static final class SupportOtherAndroidSQLiteStatement extends SupportSQLiteStatement {
        private final androidx.sqlite.p018db.SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportOtherAndroidSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql, null);
            AbstractC9133u.m16133g(db, "db");
            AbstractC9133u.m16133g(sql, "sql");
            this.delegate = db.compileStatement(sql);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo27220bindBlob(int i10, byte[] value) {
            AbstractC9133u.m16133g(value, "value");
            throwIfClosed();
            this.delegate.bindBlob(i10, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo27221bindDouble(int i10, double d10) {
            throwIfClosed();
            this.delegate.bindDouble(i10, d10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo27222bindLong(int i10, long j10) {
            throwIfClosed();
            this.delegate.bindLong(i10, j10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo27223bindNull(int i10) {
            throwIfClosed();
            this.delegate.bindNull(i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo27224bindText(int i10, String value) {
            AbstractC9133u.m16133g(value, "value");
            throwIfClosed();
            this.delegate.bindString(i10, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo27225clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() throws IOException {
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

    public /* synthetic */ SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, AbstractC9126n abstractC9126n) {
        this(supportSQLiteDatabase, str);
    }

    public final SupportSQLiteDatabase getDb() {
        return this.f1903db;
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

    private SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.f1903db = supportSQLiteDatabase;
        this.sql = str;
    }
}
