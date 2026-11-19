package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class OverscrollKt {
    private static final ProvidableCompositionLocal<OverscrollFactory> LocalOverscrollFactory = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new InterfaceC9540l() { // from class: androidx.compose.foundation.OverscrollKt$LocalOverscrollFactory$1
        @Override // p181hd.InterfaceC9540l
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
            overscrollModifierElement = Modifier.Companion;
        }
        if (overscrollModifierElement == Modifier.Companion) {
            overscrollModifierElement = new OverscrollModifierElement(overscrollEffect);
        }
        return modifier.then(overscrollModifierElement);
    }

    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i10) {
        composer.startReplaceGroup(282942128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282942128, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
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
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
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
