package androidx.compose.foundation.contextmenu;

import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long localPosition;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j10, AbstractC9126n abstractC9126n) {
        this(j10);
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo20465calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        return IntOffset.m27021constructorimpl((ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(intRect.getLeft() + IntOffset.m27027getXimpl(this.localPosition), (int) (j11 >> 32), (int) (j10 >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (ContextMenuPopupPositionProvider_androidKt.alignPopupAxis$default(intRect.getTop() + IntOffset.m27028getYimpl(this.localPosition), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), false, 8, null) & 4294967295L));
    }

    private ContextMenuPopupPositionProvider(long j10) {
        this.localPosition = j10;
    }
}
