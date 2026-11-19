package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LookaheadScope;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class AnimateBoundsModifierKt {
    private static final BoundsTransform DefaultBoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.a
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec transform(Rect rect, Rect rect2) {
            return AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect rect, Rect rect2) {
        return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion));
    }

    @ExperimentalSharedTransitionApi
    public static final Modifier animateBounds(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z10) {
        return modifier.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new InterfaceC10574p() { // from class: androidx.compose.animation.AnimateBoundsModifierKt.animateBounds.1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Constraints.m26839boximpl(m20135invoke2pbfIzA(((IntSize) obj).m27074unboximpl(), ((Constraints) obj2).m26858unboximpl()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m20135invoke2pbfIzA(long j10, long j11) {
                return j11;
            }
        }, z10)).then(modifier2).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new InterfaceC10574p() { // from class: androidx.compose.animation.AnimateBoundsModifierKt.animateBounds.2
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Constraints.m26839boximpl(m20136invoke2pbfIzA(((IntSize) obj).m27074unboximpl(), ((Constraints) obj2).m26858unboximpl()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m20136invoke2pbfIzA(long j10, long j11) {
                return Constraints.Companion.m26862fixedJhjzzOo((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }, z10));
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            modifier2 = Modifier.Companion;
        }
        if ((i10 & 4) != 0) {
            boundsTransform = DefaultBoundsTransform;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z10);
    }

    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }
}
