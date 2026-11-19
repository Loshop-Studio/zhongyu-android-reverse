package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.geometry.Rect;

/* renamed from: androidx.compose.animation.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0676a implements BoundsTransform {

    /* renamed from: a */
    public final /* synthetic */ int f717a;

    public /* synthetic */ C0676a(int i) {
        this.f717a = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec transform(Rect rect, Rect rect2) {
        switch (this.f717a) {
            case 0:
                return AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
            default:
                return SharedTransitionScopeKt.DefaultBoundsTransform$lambda$0(rect, rect2);
        }
    }
}
