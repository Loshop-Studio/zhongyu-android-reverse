package androidx.compose.material3;

import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissBoxDefaults INSTANCE = new SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    @Composable
    public final InterfaceC9540l getPositionalThreshold(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545861529, i10, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:261)");
        }
        composer.startReplaceGroup(-1853326336);
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.material3.SwipeToDismissBoxDefaults$positionalThreshold$1$1$1
                {
                    super(1);
                }

                public final Float invoke(float f10) {
                    return Float.valueOf(density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(56)));
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC9540l interfaceC9540l = (InterfaceC9540l) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9540l;
    }
}
