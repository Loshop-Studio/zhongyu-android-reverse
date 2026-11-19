package androidx.compose.foundation.contextmenu;

import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long localPosition;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j10, AbstractC9972n abstractC9972n) {
        this(j10);
    }

    @Override // androidx.compose.p014ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        return IntOffset.m33623constructorimpl((ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(intRect.getLeft() + IntOffset.m33629getXimpl(this.localPosition), (int) (j11 >> 32), (int) (j10 >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (ContextMenuPopupPositionProvider_androidKt.alignPopupAxis$default(intRect.getTop() + IntOffset.m33630getYimpl(this.localPosition), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), false, 8, null) & 4294967295L));
    }

    private ContextMenuPopupPositionProvider(long j10) {
        this.localPosition = j10;
    }
}
