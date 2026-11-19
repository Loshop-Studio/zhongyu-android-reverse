package androidx.compose.foundation.text;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m27920coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p014ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m27926access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m27920coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResultProxy.getLineEnd(i10, z10);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m27921getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return textLayoutResultProxy.m27922getOffsetForPosition3MmeM6k(j10, z10);
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i10, boolean z10) {
        return this.value.getLineEnd(i10, z10);
    }

    public final int getLineForVerticalPosition(float f10) {
        return this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m27920coercedInVisibleBoundsOfInputTextMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)))) & 4294967295L)));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m27922getOffsetForPosition3MmeM6k(long j10, boolean z10) {
        if (z10) {
            j10 = m27920coercedInVisibleBoundsOfInputTextMKHz9U(j10);
        }
        return this.value.m32936getOffsetForPositionk4lQ0M(m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j10));
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m27923isPositionOnTextk4lQ0M(long j10) {
        long jM27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m27920coercedInVisibleBoundsOfInputTextMKHz9U(j10));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & jM27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release)));
        int i10 = (int) (jM27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release >> 32);
        return Float.intBitsToFloat(i10) >= this.value.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i10) <= this.value.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j10) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j10;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j10;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j10 : layoutCoordinates2.mo32238localPositionOfR5De75A(layoutCoordinates3, j10);
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j10) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j10;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j10;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j10 : layoutCoordinates3.mo32238localPositionOfR5De75A(layoutCoordinates2, j10);
    }

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i10, AbstractC9972n abstractC9972n) {
        this(textLayoutResult, (i10 & 2) != 0 ? null : layoutCoordinates, (i10 & 4) != 0 ? null : layoutCoordinates2);
    }
}
