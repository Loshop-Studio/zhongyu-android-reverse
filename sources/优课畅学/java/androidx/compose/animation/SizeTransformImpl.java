package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final InterfaceC10574p sizeAnimationSpec;

    public SizeTransformImpl(boolean z10, InterfaceC10574p interfaceC10574p) {
        this.clip = z10;
        this.sizeAnimationSpec = interfaceC10574p;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo20230createAnimationSpecTemP2vQ(long j10, long j11) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m27062boximpl(j10), IntSize.m27062boximpl(j11));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final InterfaceC10574p getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z10, InterfaceC10574p interfaceC10574p, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? true : z10, interfaceC10574p);
    }
}
