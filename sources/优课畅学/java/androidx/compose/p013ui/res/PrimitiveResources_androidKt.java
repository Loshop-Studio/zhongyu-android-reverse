package androidx.compose.p013ui.res;

import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;

/* loaded from: classes2.dex */
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean booleanResource(@BoolRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432394447, i11, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:59)");
        }
        boolean z10 = Resources_androidKt.resources(composer, 0).getBoolean(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z10;
    }

    @Composable
    @ReadOnlyComposable
    public static final float dimensionResource(@DimenRes int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i11, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:71)");
        }
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(Resources_androidKt.resources(composer, 0).getDimension(i10) / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM26899constructorimpl;
    }

    @Composable
    @ReadOnlyComposable
    public static final int[] integerArrayResource(@ArrayRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i11, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:47)");
        }
        int[] intArray = Resources_androidKt.resources(composer, 0).getIntArray(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    @Composable
    @ReadOnlyComposable
    public static final int integerResource(@IntegerRes int i10, Composer composer, int i11) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, i11, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:35)");
        }
        int integer = Resources_androidKt.resources(composer, 0).getInteger(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return integer;
    }
}
