package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint previous, LoadType loadType) {
        AbstractC9979u.m20294g(generationalViewportHint, "<this>");
        AbstractC9979u.m20294g(previous, "previous");
        AbstractC9979u.m20294g(loadType, "loadType");
        if (generationalViewportHint.getGenerationId() > previous.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < previous.getGenerationId()) {
            return false;
        }
        return HintHandlerKt.shouldPrioritizeOver(generationalViewportHint.getHint(), previous.getHint(), loadType);
    }
}
