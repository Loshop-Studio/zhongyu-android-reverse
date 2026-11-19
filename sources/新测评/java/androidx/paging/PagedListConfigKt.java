package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¨\u0006\t"}, m13558d2 = {"Config", "Landroidx/paging/PagedList$Config;", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "paging-common_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class PagedListConfigKt {
    public static final /* synthetic */ PagedList.Config Config(int i10, int i11, boolean z9, int i12, int i13) {
        return new PagedList.Config.Builder().setPageSize(i10).setPrefetchDistance(i11).setEnablePlaceholders(z9).setInitialLoadSizeHint(i12).setMaxSize(i13).build();
    }

    public static /* synthetic */ PagedList.Config Config$default(int i10, int i11, boolean z9, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = i10;
        }
        if ((i14 & 4) != 0) {
            z9 = true;
        }
        if ((i14 & 8) != 0) {
            i12 = i10 * 3;
        }
        if ((i14 & 16) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Config(i10, i11, z9, i12, i13);
    }
}
