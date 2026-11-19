package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m32126getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo32237getSizeYbymL2g() : IntSize.Companion.m33677getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo32127onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10);

    public final void setAttached$ui_release(boolean z10) {
        this.isAttached = z10;
    }

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
