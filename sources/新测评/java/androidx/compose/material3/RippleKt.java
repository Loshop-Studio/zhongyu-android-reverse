package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m13558d2 = {"DefaultBoundedRipple", "Landroidx/compose/material3/RippleNodeFactory;", "DefaultUnboundedRipple", "LocalRippleConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/RippleConfiguration;", "getLocalRippleConfiguration$annotations", "()V", "getLocalRippleConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUseFallbackRippleImplementation", "", "getLocalUseFallbackRippleImplementation$annotations", "getLocalUseFallbackRippleImplementation", "ripple", "Landroidx/compose/foundation/IndicationNodeFactory;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "bounded", "radius", "Landroidx/compose/ui/unit/Dp;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/ui/graphics/Color;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "rippleOrFallbackImplementation", "Landroidx/compose/foundation/Indication;", "rippleOrFallbackImplementation-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,370:1\n77#2:371\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n*L\n232#1:371\n*E\n"})
/* loaded from: classes2.dex */
public final class RippleKt {
    private static final RippleNodeFactory DefaultBoundedRipple;
    private static final RippleNodeFactory DefaultUnboundedRipple;
    private static final ProvidableCompositionLocal<Boolean> LocalUseFallbackRippleImplementation = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new Function0<RippleConfiguration>() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    static {
        C3127Dp.Companion companion = C3127Dp.INSTANCE;
        float fM23581getUnspecifiedD9Ej5fM = companion.m23581getUnspecifiedD9Ej5fM();
        Color.Companion companion2 = Color.INSTANCE;
        DefaultBoundedRipple = new RippleNodeFactory(true, fM23581getUnspecifiedD9Ej5fM, companion2.m21012getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, companion.m23581getUnspecifiedD9Ej5fM(), companion2.m21012getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);
    }

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalRippleConfiguration$annotations() {
    }

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<Boolean> getLocalUseFallbackRippleImplementation() {
        return LocalUseFallbackRippleImplementation;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalUseFallbackRippleImplementation$annotations() {
    }

    @Stable
    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m19140rippleH2RKhps(boolean z9, float f10, long j10) {
        return (C3127Dp.m23566equalsimpl0(f10, C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM()) && Color.m20977equalsimpl0(j10, Color.INSTANCE.m21012getUnspecified0d7_KjU())) ? z9 ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(z9, f10, j10, (DefaultConstructorMarker) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m19141rippleH2RKhps$default(boolean z9, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        return m19140rippleH2RKhps(z9, f10, j10);
    }

    @Stable
    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m19142ripplewH6b6FI(ColorProducer colorProducer, boolean z9, float f10) {
        return new RippleNodeFactory(z9, f10, colorProducer, (DefaultConstructorMarker) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m19143ripplewH6b6FI$default(ColorProducer colorProducer, boolean z9, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            f10 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        return m19142ripplewH6b6FI(colorProducer, z9, f10);
    }

    @Composable
    /* renamed from: rippleOrFallbackImplementation-9IZ8Weo, reason: not valid java name */
    public static final Indication m19144rippleOrFallbackImplementation9IZ8Weo(boolean z9, float f10, long j10, Composer composer, int i10, int i11) {
        Composer composer2;
        Indication indicationM19140rippleH2RKhps;
        if ((i11 & 1) != 0) {
            z9 = true;
        }
        boolean z10 = z9;
        if ((i11 & 2) != 0) {
            f10 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        long j11 = j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315814667, i10, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer.startReplaceGroup(-1280632857);
        if (((Boolean) composer.consume(LocalUseFallbackRippleImplementation)).booleanValue()) {
            composer2 = composer;
            indicationM19140rippleH2RKhps = androidx.compose.material.ripple.RippleKt.m18483rememberRipple9IZ8Weo(z10, f11, j11, composer2, i10 & 1022, 0);
        } else {
            composer2 = composer;
            indicationM19140rippleH2RKhps = m19140rippleH2RKhps(z10, f11, j11);
        }
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return indicationM19140rippleH2RKhps;
    }
}
