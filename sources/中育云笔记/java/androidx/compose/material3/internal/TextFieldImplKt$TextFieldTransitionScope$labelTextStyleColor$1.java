package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 extends Lambda implements InterfaceC9545q {
    public static final TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 INSTANCE = new TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1();

    public TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1() {
        super(3);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer, int i10) {
        composer.startReplaceGroup(1528582156);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1528582156, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
        }
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween$default;
    }
}
