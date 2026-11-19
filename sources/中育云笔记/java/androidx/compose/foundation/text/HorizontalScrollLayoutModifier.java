package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class HorizontalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final InterfaceC9529a textLayoutResultProvider;
    private final TransformedText transformedText;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i10;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = interfaceC9529a;
    }

    public static /* synthetic */ HorizontalScrollLayoutModifier copy$default(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textFieldScrollerPosition = horizontalScrollLayoutModifier.scrollerPosition;
        }
        if ((i11 & 2) != 0) {
            i10 = horizontalScrollLayoutModifier.cursorOffset;
        }
        if ((i11 & 4) != 0) {
            transformedText = horizontalScrollLayoutModifier.transformedText;
        }
        if ((i11 & 8) != 0) {
            interfaceC9529a = horizontalScrollLayoutModifier.textLayoutResultProvider;
        }
        return horizontalScrollLayoutModifier.copy(textFieldScrollerPosition, i10, transformedText, interfaceC9529a);
    }

    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    public final TransformedText component3() {
        return this.transformedText;
    }

    public final InterfaceC9529a component4() {
        return this.textLayoutResultProvider;
    }

    public final HorizontalScrollLayoutModifier copy(TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a) {
        return new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i10, transformedText, interfaceC9529a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return AbstractC9979u.m20289b(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && AbstractC9979u.m20289b(this.transformedText, horizontalScrollLayoutModifier.transformedText) && AbstractC9979u.m20289b(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final InterfaceC9529a getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    @Override // androidx.compose.p014ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo27378measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        long j11;
        if (measurable.maxIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)) < Constraints.m33454getMaxWidthimpl(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = Constraints.m33444copyZbe2FdA$default(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        final int iMin = Math.min(placeableMo32229measureBRTryo0.getWidth(), Constraints.m33454getMaxWidthimpl(j11));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                MeasureScope measureScope2 = measureScope;
                int cursorOffset = this.getCursorOffset();
                TransformedText transformedText = this.getTransformedText();
                TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.getTextLayoutResultProvider().invoke();
                this.getScrollerPosition().update(Orientation.Horizontal, TextFieldScrollKt.getCursorRectInScroller(measureScope2, cursorOffset, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, measureScope.getLayoutDirection() == LayoutDirection.Rtl, placeableMo32229measureBRTryo0.getWidth()), iMin, placeableMo32229measureBRTryo0.getWidth());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, Math.round(-this.getScrollerPosition().getOffset()), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
