package androidx.paging;

import androidx.paging.PagedList;

/* loaded from: classes3.dex */
public final class PagedListConfigKt {
    public static final /* synthetic */ PagedList.Config Config(int i10, int i11, boolean z10, int i12, int i13) {
        return new PagedList.Config.Builder().setPageSize(i10).setPrefetchDistance(i11).setEnablePlaceholders(z10).setInitialLoadSizeHint(i12).setMaxSize(i13).build();
    }

    public static /* synthetic */ PagedList.Config Config$default(int i10, int i11, boolean z10, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = i10;
        }
        if ((i14 & 4) != 0) {
            z10 = true;
        }
        if ((i14 & 8) != 0) {
            i12 = i10 * 3;
        }
        if ((i14 & 16) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Config(i10, i11, z10, i12, i13);
    }
}
