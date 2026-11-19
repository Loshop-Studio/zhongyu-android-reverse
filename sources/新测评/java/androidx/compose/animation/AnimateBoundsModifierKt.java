package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LookaheadScope;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\f"}, m13558d2 = {"DefaultBoundsTransform", "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "()V", "animateBounds", "Landroidx/compose/ui/Modifier;", "lookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "modifier", "boundsTransform", "animateMotionFrameOfReference", "", "animation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
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
        return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE));
    }

    @ExperimentalSharedTransitionApi
    public static final Modifier animateBounds(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z9) {
        return modifier.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new Function2<IntSize, Constraints, Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt.animateBounds.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
                return Constraints.m23501boximpl(m16984invoke2pbfIzA(intSize.m23736unboximpl(), constraints.getValue()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m16984invoke2pbfIzA(long j10, long j11) {
                return j11;
            }
        }, z9)).then(modifier2).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, new Function2<IntSize, Constraints, Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt.animateBounds.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
                return Constraints.m23501boximpl(m16985invoke2pbfIzA(intSize.m23736unboximpl(), constraints.getValue()));
            }

            /* renamed from: invoke-2pbfIzA, reason: not valid java name */
            public final long m16985invoke2pbfIzA(long j10, long j11) {
                return Constraints.INSTANCE.m23524fixedJhjzzOo((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }, z9));
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            modifier2 = Modifier.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            boundsTransform = DefaultBoundsTransform;
        }
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z9);
    }

    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }
}
