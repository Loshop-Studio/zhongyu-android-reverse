package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1197xa44377db extends FunctionReferenceImpl implements Function1<CacheDrawScope, DrawResult> {
    public C1197xa44377db(Object obj) {
        super(1, obj, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        return ((CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }
}
