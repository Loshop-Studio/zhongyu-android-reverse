package androidx.room.util;

import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8798p0;

/* loaded from: classes3.dex */
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {
    private final Map<String, Integer> columnNameToIndexMap;
    private final String[] columnNames;
    private final SQLiteStatement delegate;
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(SQLiteStatement delegate, String[] columnNames, int[] mapping) {
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(columnNames, "columnNames");
        AbstractC9133u.m16133g(mapping, "mapping");
        this.delegate = delegate;
        this.columnNames = columnNames;
        this.mapping = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map mapM14661c = AbstractC8798p0.m14661c();
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            mapM14661c.put(columnNames[i10], Integer.valueOf(this.mapping[i11]));
            i10++;
            i11++;
        }
        int columnCount = getColumnCount();
        for (int i12 = 0; i12 < columnCount; i12++) {
            if (!mapM14661c.containsKey(getColumnName(i12))) {
                mapM14661c.put(getColumnName(i12), Integer.valueOf(i12));
            }
        }
        this.columnNameToIndexMap = AbstractC8798p0.m14660b(mapM14661c);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo27220bindBlob(@IntRange(from = 1) int i10, byte[] value) {
        AbstractC9133u.m16133g(value, "value");
        this.delegate.mo27220bindBlob(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int i10, boolean z10) {
        this.delegate.bindBoolean(i10, z10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo27221bindDouble(@IntRange(from = 1) int i10, double d10) {
        this.delegate.mo27221bindDouble(i10, d10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@IntRange(from = 1) int i10, float f10) {
        this.delegate.bindFloat(i10, f10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@IntRange(from = 1) int i10, int i11) {
        this.delegate.bindInt(i10, i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo27222bindLong(@IntRange(from = 1) int i10, long j10) {
        this.delegate.mo27222bindLong(i10, j10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo27223bindNull(@IntRange(from = 1) int i10) {
        this.delegate.mo27223bindNull(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo27224bindText(@IntRange(from = 1) int i10, String value) {
        AbstractC9133u.m16133g(value, "value");
        this.delegate.mo27224bindText(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo27225clearBindings() {
        this.delegate.mo27225clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(@IntRange(from = 0) int i10) {
        return this.delegate.getBlob(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@IntRange(from = 0) int i10) {
        return this.delegate.getBoolean(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    public final int getColumnIndex(String name) {
        AbstractC9133u.m16133g(name, "name");
        Integer num = this.columnNameToIndexMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(@IntRange(from = 0) int i10) {
        return this.delegate.getColumnName(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(@IntRange(from = 0) int i10) {
        return this.delegate.getColumnType(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(@IntRange(from = 0) int i10) {
        return this.delegate.getDouble(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@IntRange(from = 0) int i10) {
        return this.delegate.getFloat(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@IntRange(from = 0) int i10) {
        return this.delegate.getInt(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(@IntRange(from = 0) int i10) {
        return this.delegate.getLong(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(@IntRange(from = 0) int i10) {
        return this.delegate.getText(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(@IntRange(from = 0) int i10) {
        return this.delegate.isNull(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.delegate.step();
    }
}
