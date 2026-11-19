package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class DBInnerIter<O> implements Iterator<O> {

    /* renamed from: c */
    public final DataBuffer f11487c;

    /* renamed from: d */
    public int f11488d = -1;

    public DBInnerIter(DataBuffer<O> dataBuffer) {
        Preconditions.checkNotNull(dataBuffer, "dataBuffer cannot be null");
        this.f11487c = dataBuffer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11488d + 1 < this.f11487c.getCount();
    }

    @Override // java.util.Iterator
    public O next() {
        if (!hasNext()) {
            return null;
        }
        DataBuffer dataBuffer = this.f11487c;
        int i10 = this.f11488d + 1;
        this.f11488d = i10;
        return (O) dataBuffer.get(i10);
    }
}
