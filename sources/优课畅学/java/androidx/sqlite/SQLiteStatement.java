package androidx.sqlite;

import androidx.annotation.IntRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface SQLiteStatement extends AutoCloseable {
    /* renamed from: bindBlob */
    void mo27220bindBlob(@IntRange(from = 1) int i10, byte[] bArr);

    default void bindBoolean(@IntRange(from = 1) int i10, boolean z10) {
        mo27222bindLong(i10, z10 ? 1L : 0L);
    }

    /* renamed from: bindDouble */
    void mo27221bindDouble(@IntRange(from = 1) int i10, double d10);

    default void bindFloat(@IntRange(from = 1) int i10, float f10) {
        mo27221bindDouble(i10, f10);
    }

    default void bindInt(@IntRange(from = 1) int i10, int i11) {
        mo27222bindLong(i10, i11);
    }

    /* renamed from: bindLong */
    void mo27222bindLong(@IntRange(from = 1) int i10, long j10);

    /* renamed from: bindNull */
    void mo27223bindNull(@IntRange(from = 1) int i10);

    /* renamed from: bindText */
    void mo27224bindText(@IntRange(from = 1) int i10, String str);

    /* renamed from: clearBindings */
    void mo27225clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(@IntRange(from = 0) int i10);

    default boolean getBoolean(@IntRange(from = 0) int i10) {
        return getLong(i10) != 0;
    }

    int getColumnCount();

    String getColumnName(@IntRange(from = 0) int i10);

    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(getColumnName(i10));
        }
        return arrayList;
    }

    int getColumnType(@IntRange(from = 0) int i10);

    double getDouble(@IntRange(from = 0) int i10);

    default float getFloat(@IntRange(from = 0) int i10) {
        return (float) getDouble(i10);
    }

    default int getInt(@IntRange(from = 0) int i10) {
        return (int) getLong(i10);
    }

    long getLong(@IntRange(from = 0) int i10);

    String getText(@IntRange(from = 0) int i10);

    boolean isNull(@IntRange(from = 0) int i10);

    void reset();

    boolean step();
}
