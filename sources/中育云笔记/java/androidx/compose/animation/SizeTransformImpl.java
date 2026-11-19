package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final InterfaceC9544p sizeAnimationSpec;

    public SizeTransformImpl(boolean z10, InterfaceC9544p interfaceC9544p) {
        this.clip = z10;
        this.sizeAnimationSpec = interfaceC9544p;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo26832createAnimationSpecTemP2vQ(long j10, long j11) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m33664boximpl(j10), IntSize.m33664boximpl(j11));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final InterfaceC9544p getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z10, InterfaceC9544p interfaceC9544p, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10, interfaceC9544p);
    }
}
