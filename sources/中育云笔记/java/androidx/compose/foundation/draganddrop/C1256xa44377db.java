package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1256xa44377db extends FunctionReferenceImpl implements InterfaceC9540l {
    public C1256xa44377db(Object obj) {
        super(1, obj, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        return ((CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }
}
