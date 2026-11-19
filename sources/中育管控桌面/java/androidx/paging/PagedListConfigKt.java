package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¨\u0006\t"}, m7880d2 = {"Config", "Landroidx/paging/PagedList$Config;", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "paging-common_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class PagedListConfigKt {
    public static final /* synthetic */ PagedList.Config Config(int i6, int i7, boolean z6, int i8, int i9) {
        return new PagedList.Config.Builder().setPageSize(i6).setPrefetchDistance(i7).setEnablePlaceholders(z6).setInitialLoadSizeHint(i8).setMaxSize(i9).build();
    }

    public static /* synthetic */ PagedList.Config Config$default(int i6, int i7, boolean z6, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = i6;
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 8) != 0) {
            i8 = i6 * 3;
        }
        if ((i10 & 16) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return Config(i6, i7, z6, i8, i9);
    }
}
