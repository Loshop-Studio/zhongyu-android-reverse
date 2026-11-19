package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.BeyondBoundsLayout;
import androidx.compose.p013ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.modifier.ModifierLocalMap;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p077d8.AbstractC8323h;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private Orientation orientation;
    private boolean reverseLayout;
    private LazyLayoutBeyondBoundsState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final C1546xa5ff65d1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierNode(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z10, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z10;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m21008addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i10) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m21010isForward4vf7U8o(i10)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m21009hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i10) {
        if (m21011isOppositeToOrientation4vf7U8o(i10)) {
            return false;
        }
        return m21010isForward4vf7U8o(i10) ? interval.getEnd() < this.state.getItemCount() - 1 : interval.getStart() > 0;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m21010isForward4vf7U8o(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25615getBeforehoxUOeE())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25614getAfterhoxUOeE())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25613getAbovehoxUOeE())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25616getBelowhoxUOeE())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25617getLefthoxUOeE())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
            if (i11 == 1) {
                return this.reverseLayout;
            }
            if (i11 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25618getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new KotlinNothingValueException();
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        if (i12 == 1) {
            return !this.reverseLayout;
        }
        if (i12 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m21011isOppositeToOrientation4vf7U8o(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25613getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25616getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25617getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25618getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25615getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m25609equalsimpl0(i10, companion.m25614getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC8726f.m14230a(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout(), this));
    }

    @Override // androidx.compose.p013ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo21012layouto7g1Pn8(final int i10, InterfaceC10570l interfaceC10570l) {
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems() || !isAttached()) {
            return (T) interfaceC10570l.invoke(emptyBeyondBoundsScope);
        }
        int lastPlacedIndex = m21010isForward4vf7U8o(i10) ? this.state.getLastPlacedIndex() : this.state.getFirstPlacedIndex();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = this.beyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        int iM13513h = AbstractC8323h.m13513h(this.state.itemsPerViewport() * 2, this.state.getItemCount());
        T t10 = null;
        int i11 = 0;
        while (t10 == null && m21009hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f17473a, i10) && i11 < iM13513h) {
            LazyLayoutBeyondBoundsInfo.Interval intervalM21008addNextIntervalFR3nfPY = m21008addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f17473a, i10);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f17473a);
            ref$ObjectRef.f17473a = intervalM21008addNextIntervalFR3nfPY;
            i11++;
            LayoutModifierNodeKt.remeasureSync(this);
            t10 = (T) interfaceC10570l.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m21009hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f17473a, i10);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f17473a);
        LayoutModifierNodeKt.remeasureSync(this);
        return t10;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void update(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z10, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z10;
        this.orientation = orientation;
    }
}
