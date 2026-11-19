package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p012ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0016H\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m13413d2 = {"DefaultGlowColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultGlowPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "FlingDestretchFactor", "", "destretchMultiplier", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "destretchMultiplier-GyEprt8", "(I)F", "rememberPlatformOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "rememberPlatformOverscrollFactory", "Landroidx/compose/foundation/OverscrollFactory;", "glowColor", "glowDrawPadding", "rememberPlatformOverscrollFactory-3J-VO9M", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/OverscrollFactory;", "defaultOverscrollFactory", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1073:1\n75#2:1074\n75#2:1075\n75#2:1076\n75#2:1077\n75#2:1078\n1247#3,6:1079\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n87#1:1074\n88#1:1075\n109#1:1076\n110#1:1077\n111#1:1078\n115#1:1079,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final long DefaultGlowColor = ColorKt.Color(4284900966L);
    private static final PaddingValues DefaultGlowPaddingValues = PaddingKt.m18109PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
    private static final float FlingDestretchFactor = 4.0f;

    public static final OverscrollFactory defaultOverscrollFactory(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) compositionLocalAccessorScope.getCurrentValue(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) compositionLocalAccessorScope.getCurrentValue(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destretchMultiplier-GyEprt8, reason: not valid java name */
    public static final float m17620destretchMultiplierGyEprt8(int i9) {
        return NestedScrollSource.m22513equalsimpl0(i9, NestedScrollSource.INSTANCE.m22524getSideEffectWNlRxjI()) ? 4.0f : 1.0f;
    }

    @Composable
    public static final OverscrollEffect rememberPlatformOverscrollEffect(Composer composer, int i9) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569526143, i9, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            composer.startReplaceGroup(-461477086);
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = null;
        } else {
            composer.startReplaceGroup(-461444412);
            boolean zChanged = composer.changed(context) | composer.changed(density) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object androidEdgeEffectOverscrollEffect2 = new AndroidEdgeEffectOverscrollEffect(context, density, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
                composer.updateRememberedValue(androidEdgeEffectOverscrollEffect2);
                objRememberedValue = androidEdgeEffectOverscrollEffect2;
            }
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollEffect;
    }

    @Composable
    /* renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final OverscrollFactory m17621rememberPlatformOverscrollFactory3JVO9M(long j9, PaddingValues paddingValues, Composer composer, int i9, int i10) {
        if ((i10 & 1) != 0) {
            j9 = DefaultGlowColor;
        }
        long j10 = j9;
        if ((i10 & 2) != 0) {
            paddingValues = DefaultGlowPaddingValues;
        }
        PaddingValues paddingValues2 = paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2017030679, i9, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
        }
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = new AndroidEdgeEffectOverscrollFactory((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (Density) composer.consume(CompositionLocalsKt.getLocalDensity()), j10, paddingValues2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollFactory;
    }
}
