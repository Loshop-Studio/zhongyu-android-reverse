package androidx.sqlite.p019db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p019db.SupportSQLiteProgram;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    private final SQLiteProgram delegate;

    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        this.delegate.bindBlob(i10, value);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        this.delegate.bindDouble(i10, d10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        this.delegate.bindLong(i10, j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindNull(int i10) {
        this.delegate.bindNull(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindString(int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        this.delegate.bindString(i10, value);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
