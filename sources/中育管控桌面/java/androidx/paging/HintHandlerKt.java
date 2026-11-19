package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.ViewportHint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m7880d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/ViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class HintHandlerKt {
    public static final boolean shouldPrioritizeOver(ViewportHint viewportHint, ViewportHint viewportHint2, LoadType loadType) {
        Intrinsics.checkNotNullParameter(viewportHint, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (viewportHint2 == null) {
            return true;
        }
        if ((viewportHint2 instanceof ViewportHint.Initial) && (viewportHint instanceof ViewportHint.Access)) {
            return true;
        }
        if ((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) {
            return false;
        }
        return (viewportHint.getOriginalPageOffsetFirst() == viewportHint2.getOriginalPageOffsetFirst() && viewportHint.getOriginalPageOffsetLast() == viewportHint2.getOriginalPageOffsetLast() && viewportHint2.presentedItemsBeyondAnchor$paging_common_release(loadType) <= viewportHint.presentedItemsBeyondAnchor$paging_common_release(loadType)) ? false : true;
    }
}
