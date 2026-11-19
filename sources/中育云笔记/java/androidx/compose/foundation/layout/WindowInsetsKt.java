package androidx.compose.foundation.layout;

import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;

/* loaded from: classes.dex */
public final class WindowInsetsKt {
    public static final WindowInsets WindowInsets(int i10, int i11, int i12, int i13) {
        return new FixedIntInsets(i10, i11, i12, i13);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return WindowInsets(i10, i11, i12, i13);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m27529WindowInsetsa9UjIt4(float f10, float f11, float f12, float f13) {
        return new FixedDpInsets(f10, f11, f12, f13, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m27530WindowInsetsa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3186Dp.m33501constructorimpl(0);
        }
        return m27529WindowInsetsa9UjIt4(f10, f11, f12, f13);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    @Composable
    @ReadOnlyComposable
    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m27531onlybOOhFvg(WindowInsets windowInsets, int i10) {
        return new LimitInsets(windowInsets, i10, null);
    }

    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }
}
