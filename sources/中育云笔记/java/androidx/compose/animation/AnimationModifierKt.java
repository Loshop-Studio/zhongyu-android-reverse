package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize;

    static {
        long j10 = Integer.MIN_VALUE;
        InvalidSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, InterfaceC9544p interfaceC9544p) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, Alignment.Companion.getTopStart(), interfaceC9544p));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, interfaceC9544p);
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m26773isValidozmzZPI(long j10) {
        return !IntSize.m33670equalsimpl0(j10, InvalidSize);
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, alignment, interfaceC9544p));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, alignment, interfaceC9544p);
    }
}
