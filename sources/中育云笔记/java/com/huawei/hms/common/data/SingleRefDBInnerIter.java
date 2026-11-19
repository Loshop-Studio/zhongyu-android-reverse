package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public class SingleRefDBInnerIter<T> extends DBInnerIter<T> {
    public SingleRefDBInnerIter(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.huawei.hms.common.data.DBInnerIter, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            return null;
        }
        int i10 = this.f11488d + 1;
        this.f11488d = i10;
        if (i10 == 0) {
            Preconditions.checkState(this.f11487c.get(0) instanceof DataBufferRef, "DataBuffer reference of type " + this.f11487c.get(0).getClass() + " is not movable");
            ((DataBufferRef) this.f11487c.get(0)).m8447a(this.f11488d);
        }
        return (T) this.f11487c.get(0);
    }
}
