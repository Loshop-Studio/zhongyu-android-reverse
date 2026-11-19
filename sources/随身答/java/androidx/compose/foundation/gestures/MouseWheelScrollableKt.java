package androidx.compose.foundation.gestures;

import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m13413d2 = {"AnimationSpeed", "Landroidx/compose/ui/unit/Dp;", "F", "AnimationThreshold", "MaxAnimationDuration", "", "ScrollProgressTimeout", "", "isLowScrollingDelta", "", "", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollableKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,363:1\n113#2:364\n113#2:365\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollableKt\n*L\n359#1:364\n360#1:365\n*E\n"})
/* loaded from: classes.dex */
public final class MouseWheelScrollableKt {
    private static final int MaxAnimationDuration = 100;
    private static final long ScrollProgressTimeout = 50;
    private static final float AnimationThreshold = C3115Dp.m23994constructorimpl(6);
    private static final float AnimationSpeed = C3115Dp.m23994constructorimpl(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowScrollingDelta(float f10) {
        return Float.isNaN(f10) || Math.abs(f10) < 0.5f;
    }
}
