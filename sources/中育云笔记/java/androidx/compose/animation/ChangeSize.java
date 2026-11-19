package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@Immutable
/* loaded from: classes.dex */
public final class ChangeSize {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final InterfaceC9540l size;

    public ChangeSize(Alignment alignment, InterfaceC9540l interfaceC9540l, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z10) {
        this.alignment = alignment;
        this.size = interfaceC9540l;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, InterfaceC9540l interfaceC9540l, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = changeSize.size;
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i10 & 8) != 0) {
            z10 = changeSize.clip;
        }
        return changeSize.copy(alignment, interfaceC9540l, finiteAnimationSpec, z10);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final InterfaceC9540l component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, InterfaceC9540l interfaceC9540l, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z10) {
        return new ChangeSize(alignment, interfaceC9540l, finiteAnimationSpec, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return AbstractC9979u.m20289b(this.alignment, changeSize.alignment) && AbstractC9979u.m20289b(this.size, changeSize.size) && AbstractC9979u.m20289b(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final InterfaceC9540l getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    public /* synthetic */ ChangeSize(Alignment alignment, InterfaceC9540l interfaceC9540l, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(alignment, (i10 & 2) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.animation.ChangeSize.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m33664boximpl(m26781invokemzRDjE0(((IntSize) obj).m33676unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m26781invokemzRDjE0(long j10) {
                long j11 = 0;
                return IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
            }
        } : interfaceC9540l, finiteAnimationSpec, (i10 & 8) != 0 ? true : z10);
    }
}
