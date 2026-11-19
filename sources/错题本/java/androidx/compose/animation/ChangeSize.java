package androidx.compose.animation;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Immutable
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R2\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006+"}, m5110d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "alignment", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "fullSize", "size", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "", "clip", "<init>", "(Landroidx/compose/ui/Alignment;Lr6/c;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "component1", "()Landroidx/compose/ui/Alignment;", "component2", "()Lr6/c;", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component4", "()Z", "copy", "(Landroidx/compose/ui/Alignment;Lr6/c;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/ChangeSize;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/Alignment;", "getAlignment", "Lr6/c;", "getSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "Z", "getClip", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ChangeSize {
    public static final int $stable = 0;

    @NotNull
    private final Alignment alignment;

    @NotNull
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;

    @NotNull
    private final InterfaceC6471c size;

    public ChangeSize(@NotNull Alignment alignment, @NotNull InterfaceC6471c interfaceC6471c, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z8) {
        this.alignment = alignment;
        this.size = interfaceC6471c;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, InterfaceC6471c interfaceC6471c, FiniteAnimationSpec finiteAnimationSpec, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = changeSize.size;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i & 8) != 0) {
            z8 = changeSize.clip;
        }
        return changeSize.copy(alignment, interfaceC6471c, finiteAnimationSpec, z8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6471c getSize() {
        return this.size;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final ChangeSize copy(@NotNull Alignment alignment, @NotNull InterfaceC6471c size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean clip) {
        return new ChangeSize(alignment, size, animationSpec, clip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return AbstractC5830k.m5325b(this.alignment, changeSize.alignment) && AbstractC5830k.m5325b(this.size, changeSize.size) && AbstractC5830k.m5325b(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final InterfaceC6471c getSize() {
        return this.size;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clip) + ((this.animationSpec.hashCode() + ((this.size.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.alignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", clip=");
        return AbstractC0037f.m93r(sb, this.clip, ')');
    }

    public /* synthetic */ ChangeSize(Alignment alignment, InterfaceC6471c interfaceC6471c, FiniteAnimationSpec finiteAnimationSpec, boolean z8, int i, AbstractC5824e abstractC5824e) {
        this(alignment, (i & 2) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.animation.ChangeSize.1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m13468boximpl(m6585invokemzRDjE0(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m6585invokemzRDjE0(long j7) {
                long j8 = 0;
                return IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
            }
        } : interfaceC6471c, finiteAnimationSpec, (i & 8) != 0 ? true : z8);
    }
}
