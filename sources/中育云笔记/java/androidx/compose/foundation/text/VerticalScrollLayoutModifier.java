package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.layout.LayoutModifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.unit.Constraints;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final InterfaceC9529a textLayoutResultProvider;
    private final TransformedText transformedText;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i10;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = interfaceC9529a;
    }

    public static /* synthetic */ VerticalScrollLayoutModifier copy$default(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i11 & 2) != 0) {
            i10 = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i11 & 4) != 0) {
            transformedText = verticalScrollLayoutModifier.transformedText;
        }
        if ((i11 & 8) != 0) {
            interfaceC9529a = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.copy(textFieldScrollerPosition, i10, transformedText, interfaceC9529a);
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

    public final VerticalScrollLayoutModifier copy(TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, InterfaceC9529a interfaceC9529a) {
        return new VerticalScrollLayoutModifier(textFieldScrollerPosition, i10, transformedText, interfaceC9529a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return AbstractC9979u.m20289b(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && AbstractC9979u.m20289b(this.transformedText, verticalScrollLayoutModifier.transformedText) && AbstractC9979u.m20289b(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
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
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo32229measureBRTryo0.getHeight(), Constraints.m33453getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), iMin, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
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
                this.getScrollerPosition().update(Orientation.Vertical, TextFieldScrollKt.getCursorRectInScroller(measureScope2, cursorOffset, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, false, placeableMo32229measureBRTryo0.getWidth()), iMin, placeableMo32229measureBRTryo0.getHeight());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, Math.round(-this.getScrollerPosition().getOffset()), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
