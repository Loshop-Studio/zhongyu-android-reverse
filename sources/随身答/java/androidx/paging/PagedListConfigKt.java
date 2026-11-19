package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagedList;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¨\u0006\t"}, m13413d2 = {"Config", "Landroidx/paging/PagedList$Config;", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "paging-common_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PagedListConfigKt {
    public static final /* synthetic */ PagedList.Config Config(int i9, int i10, boolean z9, int i11, int i12) {
        return new PagedList.Config.Builder().setPageSize(i9).setPrefetchDistance(i10).setEnablePlaceholders(z9).setInitialLoadSizeHint(i11).setMaxSize(i12).build();
    }

    public static /* synthetic */ PagedList.Config Config$default(int i9, int i10, boolean z9, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = i9;
        }
        if ((i13 & 4) != 0) {
            z9 = true;
        }
        if ((i13 & 8) != 0) {
            i11 = i9 * 3;
        }
        if ((i13 & 16) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return Config(i9, i10, z9, i11, i12);
    }
}
