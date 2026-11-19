package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Stable
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 82\u00020\u0001:\u00018BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0012J\"\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b$\u0010#R(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0016\u00107\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, m5110d2 = {"Landroidx/compose/material3/SheetState;", "", "", "skipPartiallyExpanded", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/material3/SheetValue;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lr6/c;Z)V", "", "requireOffset", "()F", "Ld6/s;", "expand", "(Lh6/c;)Ljava/lang/Object;", "partialExpand", "show", "hide", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLh6/c;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lh6/c;)Ljava/lang/Object;", "snapTo", "settle$material3_release", "(FLh6/c;)Ljava/lang/Object;", "settle", "Z", "getSkipPartiallyExpanded$material3_release", "()Z", "getSkipHiddenState$material3_release", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SheetState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "<init>", "()V", "", "skipPartiallyExpanded", "Lkotlin/Function1;", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "Landroidx/compose/ui/unit/Density;", "density", "skipHiddenState", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Saver", "(ZLr6/c;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<SheetState, SheetValue> Saver(final boolean skipPartiallyExpanded, @NotNull final InterfaceC6471c confirmValueChange, @NotNull final Density density, final boolean skipHiddenState) {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final SheetValue invoke(@NotNull SaverScope saverScope, @NotNull SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                @Nullable
                public final SheetState invoke(@NotNull SheetValue sheetValue) {
                    return new SheetState(skipPartiallyExpanded, density, sheetValue, confirmValueChange, skipHiddenState);
                }
            });
        }

        private Companion() {
        }
    }

    public SheetState(boolean z8, @NotNull final Density density, @NotNull SheetValue sheetValue, @NotNull InterfaceC6471c interfaceC6471c, boolean z9) {
        this.skipPartiallyExpanded = z8;
        this.skipHiddenState = z9;
        if (z8 && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z9 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new InterfaceC6471c() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(density.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(56)));
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        }, new InterfaceC6469a() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Float invoke() {
                return Float.valueOf(density.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(125)));
            }
        }, SheetDefaultsKt.BottomSheetAnimationSpec, interfaceC6471c);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f, interfaceC5631c);
    }

    @Nullable
    public final Object animateTo$material3_release(@NotNull SheetValue sheetValue, float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f, interfaceC5631c);
        return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : C5443s.f8405a;
    }

    @Nullable
    public final Object expand(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, interfaceC5631c, 2, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
    }

    @NotNull
    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    /* renamed from: getSkipHiddenState$material3_release, reason: from getter */
    public final boolean getSkipHiddenState() {
        return this.skipHiddenState;
    }

    /* renamed from: getSkipPartiallyExpanded$material3_release, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    @NotNull
    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @Nullable
    public final Object hide(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, interfaceC5631c, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : C5443s.f8405a;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    @Nullable
    public final Object partialExpand(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, interfaceC5631c, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : C5443s.f8405a;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableState$material3_release(@NotNull AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    @Nullable
    public final Object settle$material3_release(float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object obj = this.anchoredDraggableState.settle(f, interfaceC5631c);
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : C5443s.f8405a;
    }

    @Nullable
    public final Object show(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, interfaceC5631c, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : C5443s.f8405a;
    }

    @Nullable
    public final Object snapTo$material3_release(@NotNull SheetValue sheetValue, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, interfaceC5631c);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : C5443s.f8405a;
    }

    public /* synthetic */ SheetState(boolean z8, Density density, SheetValue sheetValue, InterfaceC6471c interfaceC6471c, boolean z9, int i, AbstractC5824e abstractC5824e) {
        this(z8, density, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.material3.SheetState.1
            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(@NotNull SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC6471c, (i & 16) != 0 ? false : z9);
    }
}
