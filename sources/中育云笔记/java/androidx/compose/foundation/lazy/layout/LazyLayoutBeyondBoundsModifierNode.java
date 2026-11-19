package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.BeyondBoundsLayout;
import androidx.compose.p014ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.modifier.ModifierLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private Orientation orientation;
    private boolean reverseLayout;
    private LazyLayoutBeyondBoundsState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final C1576xa5ff65d1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
    private final LazyLayoutBeyondBoundsInfo.Interval m27610addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i10) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m27612isForward4vf7U8o(i10)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m27611hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i10) {
        if (m27613isOppositeToOrientation4vf7U8o(i10)) {
            return false;
        }
        return m27612isForward4vf7U8o(i10) ? interval.getEnd() < this.state.getItemCount() - 1 : interval.getStart() > 0;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m27612isForward4vf7U8o(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32217getBeforehoxUOeE())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32216getAfterhoxUOeE())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32215getAbovehoxUOeE())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32218getBelowhoxUOeE())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32219getLefthoxUOeE())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
            if (i11 == 1) {
                return this.reverseLayout;
            }
            if (i11 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32220getRighthoxUOeE())) {
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
    private final boolean m27613isOppositeToOrientation4vf7U8o(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32215getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32218getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32219getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32220getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32217getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m32211equalsimpl0(i10, companion.m32216getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC10776g.m22975a(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout(), this));
    }

    @Override // androidx.compose.p014ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo27614layouto7g1Pn8(final int i10, InterfaceC9540l interfaceC9540l) {
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems() || !isAttached()) {
            return (T) interfaceC9540l.invoke(emptyBeyondBoundsScope);
        }
        int lastPlacedIndex = m27612isForward4vf7U8o(i10) ? this.state.getLastPlacedIndex() : this.state.getFirstPlacedIndex();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = this.beyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        int iM21756i = AbstractC10410o.m21756i(this.state.itemsPerViewport() * 2, this.state.getItemCount());
        T t10 = null;
        int i11 = 0;
        while (t10 == null && m27611hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f23402c, i10) && i11 < iM21756i) {
            LazyLayoutBeyondBoundsInfo.Interval intervalM27610addNextIntervalFR3nfPY = m27610addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f23402c, i10);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f23402c);
            ref$ObjectRef.f23402c = intervalM27610addNextIntervalFR3nfPY;
            i11++;
            LayoutModifierNodeKt.remeasureSync(this);
            t10 = (T) interfaceC9540l.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m27611hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f23402c, i10);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ref$ObjectRef.f23402c);
        LayoutModifierNodeKt.remeasureSync(this);
        return t10;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
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
