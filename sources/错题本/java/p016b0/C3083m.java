package p016b0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: b0.m */
/* loaded from: classes2.dex */
public final class C3083m extends AbstractC3085o {

    /* renamed from: e */
    public final /* synthetic */ int f1478e;

    @Override // p016b0.AbstractC3085o
    /* renamed from: a */
    public final boolean mo2048a() {
        switch (this.f1478e) {
        }
        return true;
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: b */
    public final boolean mo2049b() {
        switch (this.f1478e) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: c */
    public final boolean mo2050c(DataSource dataSource) {
        switch (this.f1478e) {
            case 0:
                if (dataSource == DataSource.REMOTE) {
                }
                break;
            case 1:
                break;
            case 2:
                if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            default:
                if (dataSource == DataSource.REMOTE) {
                }
                break;
        }
        return false;
    }

    @Override // p016b0.AbstractC3085o
    /* renamed from: d */
    public final boolean mo2051d(boolean z8, DataSource dataSource, EncodeStrategy encodeStrategy) {
        switch (this.f1478e) {
            case 0:
                if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                if (((!z8 || dataSource != DataSource.DATA_DISK_CACHE) && dataSource != DataSource.LOCAL) || encodeStrategy != EncodeStrategy.TRANSFORMED) {
                }
                break;
        }
        return false;
    }
}
