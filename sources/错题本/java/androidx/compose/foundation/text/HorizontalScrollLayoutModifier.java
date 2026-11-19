package androidx.compose.foundation.text;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.layout.LayoutModifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0015\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, m5110d2 = {"Landroidx/compose/foundation/text/HorizontalScrollLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "", "cursorOffset", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "<init>", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/TransformedText;Lr6/a;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "component1", "()Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "component2", "()I", "component3", "()Landroidx/compose/ui/text/input/TransformedText;", "component4", "()Lr6/a;", "copy", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/TransformedText;Lr6/a;)Landroidx/compose/foundation/text/HorizontalScrollLayoutModifier;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getScrollerPosition", "I", "getCursorOffset", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "Lr6/a;", "getTextLayoutResultProvider", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class HorizontalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;

    @NotNull
    private final TextFieldScrollerPosition scrollerPosition;

    @NotNull
    private final InterfaceC6469a textLayoutResultProvider;

    @NotNull
    private final TransformedText transformedText;

    public HorizontalScrollLayoutModifier(@NotNull TextFieldScrollerPosition textFieldScrollerPosition, int i, @NotNull TransformedText transformedText, @NotNull InterfaceC6469a interfaceC6469a) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = interfaceC6469a;
    }

    public static /* synthetic */ HorizontalScrollLayoutModifier copy$default(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, InterfaceC6469a interfaceC6469a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            textFieldScrollerPosition = horizontalScrollLayoutModifier.scrollerPosition;
        }
        if ((i8 & 2) != 0) {
            i = horizontalScrollLayoutModifier.cursorOffset;
        }
        if ((i8 & 4) != 0) {
            transformedText = horizontalScrollLayoutModifier.transformedText;
        }
        if ((i8 & 8) != 0) {
            interfaceC6469a = horizontalScrollLayoutModifier.textLayoutResultProvider;
        }
        return horizontalScrollLayoutModifier.copy(textFieldScrollerPosition, i, transformedText, interfaceC6469a);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InterfaceC6469a getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    @NotNull
    public final HorizontalScrollLayoutModifier copy(@NotNull TextFieldScrollerPosition scrollerPosition, int cursorOffset, @NotNull TransformedText transformedText, @NotNull InterfaceC6469a textLayoutResultProvider) {
        return new HorizontalScrollLayoutModifier(scrollerPosition, cursorOffset, transformedText, textLayoutResultProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) other;
        return AbstractC5830k.m5325b(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && AbstractC5830k.m5325b(this.transformedText, horizontalScrollLayoutModifier.transformedText) && AbstractC5830k.m5325b(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @NotNull
    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    @NotNull
    public final InterfaceC6469a getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    @NotNull
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return this.textLayoutResultProvider.hashCode() + ((this.transformedText.hashCode() + AbstractC0584a.m902c(this.cursorOffset, this.scrollerPosition.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.p011ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7182measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        long j8;
        if (measurable.maxIntrinsicWidth(Constraints.m13257getMaxHeightimpl(j7)) < Constraints.m13258getMaxWidthimpl(j7)) {
            j8 = j7;
        } else {
            j8 = j7;
            j7 = Constraints.m13248copyZbe2FdA$default(j8, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        final int iMin = Math.min(placeableMo12033measureBRTryo0.getWidth(), Constraints.m13258getMaxWidthimpl(j8));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                MeasureScope measureScope2 = measureScope;
                int cursorOffset = this.getCursorOffset();
                TransformedText transformedText = this.getTransformedText();
                TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.getTextLayoutResultProvider().invoke();
                this.getScrollerPosition().update(Orientation.Horizontal, TextFieldScrollKt.getCursorRectInScroller(measureScope2, cursorOffset, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, measureScope.getLayoutDirection() == LayoutDirection.Rtl, placeableMo12033measureBRTryo0.getWidth()), iMin, placeableMo12033measureBRTryo0.getWidth());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, Math.round(-this.getScrollerPosition().getOffset()), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @NotNull
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
