package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayoutState {
    public static final int $stable = 8;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final MutableState coreNodeCoordinates$delegate;
    private final MutableState decoratorNodeCoordinates$delegate;
    private TextFieldLayoutStateCache layoutCache;
    private final TextFieldLayoutStateCache layoutResult$delegate;
    private final MutableState minHeightForSingleLineField$delegate;
    private InterfaceC9544p onTextLayout;
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C3186Dp.m33499boximpl(C3186Dp.m33501constructorimpl(0)), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m28065getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return textLayoutState.m28068getOffsetForPosition3MmeM6k(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m28066coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.getDecoratorNodeCoordinates()
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p014ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L20
        L1a:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L20:
            if (r2 != 0) goto L28
        L22:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L28:
            long r6 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m28072coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.m28066coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long):long");
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m28067getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C3186Dp) this.minHeightForSingleLineField$delegate.getValue()).m33515unboximpl();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m28068getOffsetForPosition3MmeM6k(long j10, boolean z10) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z10) {
            j10 = m28066coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j10);
        }
        return layoutResult.m32936getOffsetForPositionk4lQ0M(TextLayoutStateKt.m28073fromDecorationToTextLayoutUv8p0NA(this, j10));
    }

    public final InterfaceC9544p getOnTextLayout() {
        return this.onTextLayout;
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m28069isPositionOnTextk4lQ0M(long j10) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long jM28073fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m28073fromDecorationToTextLayoutUv8p0NA(this, m28066coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j10));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & jM28073fromDecorationToTextLayoutUv8p0NA)));
        int i10 = (int) (jM28073fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i10) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i10) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m28070layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        TextLayoutResult textLayoutResultM28059layoutWithNewMeasureInputshBUhpc = this.layoutCache.m28059layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j10);
        InterfaceC9544p interfaceC9544p = this.onTextLayout;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(density, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final TextLayoutResult invoke() {
                    return this.this$0.layoutCache.getValue();
                }
            });
        }
        return textLayoutResultM28059layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m28071setMinHeightForSingleLineField0680j_4(float f10) {
        this.minHeightForSingleLineField$delegate.setValue(C3186Dp.m33499boximpl(f10));
    }

    public final void setOnTextLayout(InterfaceC9544p interfaceC9544p) {
        this.onTextLayout = interfaceC9544p;
    }

    public final void setTextLayoutNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, boolean z11, KeyboardOptions keyboardOptions) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z10, z11, keyboardOptions);
    }
}
