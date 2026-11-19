package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public class DataBufferRef {

    /* renamed from: a */
    public final DataHolder f11489a;

    /* renamed from: b */
    public int f11490b;

    /* renamed from: c */
    public int f11491c;

    public DataBufferRef(DataHolder dataHolder, int i10) {
        Preconditions.checkNotNull(dataHolder, "dataHolder cannot be null");
        this.f11489a = dataHolder;
        m8447a(i10);
    }

    /* renamed from: a */
    public final void m8447a(int i10) {
        Preconditions.checkArgument(i10 >= 0 && i10 < this.f11489a.getCount(), "rowNum is out of index");
        this.f11490b = i10;
        this.f11491c = this.f11489a.getWindowIndex(i10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (dataBufferRef.f11490b == this.f11490b && dataBufferRef.f11491c == this.f11491c && dataBufferRef.f11489a == this.f11489a) {
                return true;
            }
        }
        return false;
    }

    public boolean hasColumn(String str) {
        return this.f11489a.hasColumn(str);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f11490b), Integer.valueOf(this.f11491c), this.f11489a);
    }

    public boolean isDataValid() {
        return !this.f11489a.isClosed();
    }
}
