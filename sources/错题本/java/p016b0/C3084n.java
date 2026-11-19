package p016b0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: b0.n */
/* loaded from: classes2.dex */
public final class C3084n extends AbstractC3085o {
    @Override // p016b0.AbstractC3085o
    /* renamed from: a */
    public final boolean mo2048a() {
        return false;
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: b */
    public final boolean mo2049b() {
        return true;
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: c */
    public final boolean mo2050c(DataSource dataSource) {
        return false;
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: d */
    public final boolean mo2051d(boolean z8, DataSource dataSource, EncodeStrategy encodeStrategy) {
        return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
    }
}
