package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.unit.IntSize;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize;

    static {
        long j10 = Integer.MIN_VALUE;
        InvalidSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, InterfaceC10574p interfaceC10574p) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, Alignment.Companion.getTopStart(), interfaceC10574p));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m27062boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC10574p = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, interfaceC10574p);
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m20171isValidozmzZPI(long j10) {
        return !IntSize.m27068equalsimpl0(j10, InvalidSize);
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, InterfaceC10574p interfaceC10574p) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, alignment, interfaceC10574p));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m27062boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i10 & 4) != 0) {
            interfaceC10574p = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, alignment, interfaceC10574p);
    }
}
