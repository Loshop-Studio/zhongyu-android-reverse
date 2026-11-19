package androidx.compose.foundation;

import androidx.compose.p012ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a\f\u0010\f\u001a\u00020\u0006*\u00020\u0006H\u0007\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m13413d2 = {"LocalOverscrollFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollFactory;", "getLocalOverscrollFactory", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "overscroll", "Landroidx/compose/ui/Modifier;", "overscrollEffect", "withoutEventHandling", "withoutVisualEffect", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,397:1\n75#2:398\n1247#3,6:399\n*S KotlinDebug\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n*L\n346#1:398\n347#1:399,6\n*E\n"})
/* loaded from: classes.dex */
public final class OverscrollKt {
    private static final ProvidableCompositionLocal<OverscrollFactory> LocalOverscrollFactory = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new Function1<CompositionLocalAccessorScope, OverscrollFactory>() { // from class: androidx.compose.foundation.OverscrollKt$LocalOverscrollFactory$1
        @Override // kotlin.jvm.functions.Function1
        public final OverscrollFactory invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            return AndroidOverscroll_androidKt.defaultOverscrollFactory(compositionLocalAccessorScope);
        }
    });

    public static final ProvidableCompositionLocal<OverscrollFactory> getLocalOverscrollFactory() {
        return LocalOverscrollFactory;
    }

    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        Modifier overscrollModifierElement;
        if (overscrollEffect == null || (overscrollModifierElement = overscrollEffect.getEffectModifier()) == null) {
            overscrollModifierElement = Modifier.INSTANCE;
        }
        if (overscrollModifierElement == Modifier.INSTANCE) {
            overscrollModifierElement = new OverscrollModifierElement(overscrollEffect);
        }
        return modifier.then(overscrollModifierElement);
    }

    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i9) {
        composer.startReplaceGroup(282942128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282942128, i9, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
        }
        OverscrollFactory overscrollFactory = (OverscrollFactory) composer.consume(LocalOverscrollFactory);
        if (overscrollFactory == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        boolean zChanged = composer.changed(overscrollFactory);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = overscrollFactory.createOverscrollEffect();
            composer.updateRememberedValue(objRememberedValue);
        }
        OverscrollEffect overscrollEffect = (OverscrollEffect) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overscrollEffect;
    }

    @Stable
    public static final OverscrollEffect withoutEventHandling(OverscrollEffect overscrollEffect) {
        return new WrappedOverscrollEffect(true, false, overscrollEffect);
    }

    @Stable
    public static final OverscrollEffect withoutVisualEffect(OverscrollEffect overscrollEffect) {
        return new WrappedOverscrollEffect(false, true, overscrollEffect);
    }
}
