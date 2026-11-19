package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z10, final InterfaceC9540l interfaceC9540l, final Density density, final boolean z11) {
            return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // p181hd.InterfaceC9544p
                public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final SheetState invoke(SheetValue sheetValue) {
                    return new SheetState(z10, density, sheetValue, interfaceC9540l, z11);
                }
            });
        }

        private Companion() {
        }
    }

    public SheetState(boolean z10, final Density density, SheetValue sheetValue, InterfaceC9540l interfaceC9540l, boolean z11) {
        this.skipPartiallyExpanded = z10;
        this.skipHiddenState = z11;
        if (z10 && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z11 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new InterfaceC9540l() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float invoke(float f10) {
                return Float.valueOf(density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(56)));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(125)));
            }
        }, SheetDefaultsKt.BottomSheetAnimationSpec, interfaceC9540l);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f10, interfaceC11588c);
    }

    public final Object animateTo$material3_release(SheetValue sheetValue, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f10, interfaceC11588c);
        return objAnimateTo == AbstractC11725a.m25952f() ? objAnimateTo : C10786q.f26013a;
    }

    public final Object expand(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.skipHiddenState;
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.skipPartiallyExpanded;
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final Object hide(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$material3_release$default == AbstractC11725a.m25952f() ? objAnimateTo$material3_release$default : C10786q.f26013a;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final Object partialExpand(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$material3_release$default == AbstractC11725a.m25952f() ? objAnimateTo$material3_release$default : C10786q.f26013a;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableState$material3_release(AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final Object settle$material3_release(float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object obj = this.anchoredDraggableState.settle(f10, interfaceC11588c);
        return obj == AbstractC11725a.m25952f() ? obj : C10786q.f26013a;
    }

    public final Object show(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, interfaceC11588c, 2, null);
        return objAnimateTo$material3_release$default == AbstractC11725a.m25952f() ? objAnimateTo$material3_release$default : C10786q.f26013a;
    }

    public final Object snapTo$material3_release(SheetValue sheetValue, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, interfaceC11588c);
        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
    }

    public /* synthetic */ SheetState(boolean z10, Density density, SheetValue sheetValue, InterfaceC9540l interfaceC9540l, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this(z10, density, (i10 & 4) != 0 ? SheetValue.Hidden : sheetValue, (i10 & 8) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.material3.SheetState.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC9540l, (i10 & 16) != 0 ? false : z11);
    }
}
