package androidx.room.support;

import androidx.sqlite.p018db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i11) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i11, obj);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] value) {
        AbstractC9133u.m16133g(value, "value");
        saveArgsToCache(i10, value);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        saveArgsToCache(i10, Double.valueOf(d10));
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        saveArgsToCache(i10, Long.valueOf(j10));
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindNull(int i10) {
        saveArgsToCache(i10, null);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindString(int i10, String value) {
        AbstractC9133u.m16133g(value, "value");
        saveArgsToCache(i10, value);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }
}
