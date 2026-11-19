package androidx.room.util;

import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10967q0;

/* loaded from: classes3.dex */
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {
    private final Map<String, Integer> columnNameToIndexMap;
    private final String[] columnNames;
    private final SQLiteStatement delegate;
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(SQLiteStatement delegate, String[] columnNames, int[] mapping) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(columnNames, "columnNames");
        AbstractC9979u.m20294g(mapping, "mapping");
        this.delegate = delegate;
        this.columnNames = columnNames;
        this.mapping = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map mapM24036c = AbstractC10967q0.m24036c();
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            mapM24036c.put(columnNames[i10], Integer.valueOf(this.mapping[i11]));
            i10++;
            i11++;
        }
        int columnCount = getColumnCount();
        for (int i12 = 0; i12 < columnCount; i12++) {
            if (!mapM24036c.containsKey(getColumnName(i12))) {
                mapM24036c.put(getColumnName(i12), Integer.valueOf(i12));
            }
        }
        this.columnNameToIndexMap = AbstractC10967q0.m24035b(mapM24036c);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo33815bindBlob(@IntRange(from = 1) int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        this.delegate.mo33815bindBlob(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int i10, boolean z10) {
        this.delegate.bindBoolean(i10, z10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo33816bindDouble(@IntRange(from = 1) int i10, double d10) {
        this.delegate.mo33816bindDouble(i10, d10);
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
    public void mo33817bindLong(@IntRange(from = 1) int i10, long j10) {
        this.delegate.mo33817bindLong(i10, j10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo33818bindNull(@IntRange(from = 1) int i10) {
        this.delegate.mo33818bindNull(i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo33819bindText(@IntRange(from = 1) int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        this.delegate.mo33819bindText(i10, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo33820clearBindings() {
        this.delegate.mo33820clearBindings();
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
        AbstractC9979u.m20294g(name, "name");
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
