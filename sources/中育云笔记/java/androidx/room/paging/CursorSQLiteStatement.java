package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CursorSQLiteStatement implements SQLiteStatement {
    public static final Companion Companion = new Companion(null);
    private final Cursor cursor;

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

    public CursorSQLiteStatement(Cursor cursor) {
        AbstractC9979u.m20294g(cursor, "cursor");
        this.cursor = cursor;
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i10) {
        byte[] blob = this.cursor.getBlob(i10);
        AbstractC9979u.m20293f(blob, "getBlob(...)");
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i10) {
        String columnName = this.cursor.getColumnName(i10);
        AbstractC9979u.m20293f(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i10) {
        return Companion.getDataType(this.cursor, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i10) {
        return this.cursor.getDouble(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i10) {
        return this.cursor.getLong(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i10) {
        String string = this.cursor.getString(i10);
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i10) {
        return this.cursor.isNull(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.cursor.moveToPosition(-1);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.cursor.moveToNext();
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public Void mo33815bindBlob(int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public Void mo33816bindDouble(int i10, double d10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public Void mo33817bindLong(int i10, long j10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public Void mo33818bindNull(int i10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public Void mo33819bindText(int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public Void mo33820clearBindings() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }
}
