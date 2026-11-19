package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class RippleKt {
    private static final RippleNodeFactory DefaultBoundedRipple;
    private static final RippleNodeFactory DefaultUnboundedRipple;
    private static final ProvidableCompositionLocal<Boolean> LocalUseFallbackRippleImplementation = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        @Override // p181hd.InterfaceC9529a
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    static {
        C3186Dp.Companion companion = C3186Dp.Companion;
        float fM33521getUnspecifiedD9Ej5fM = companion.m33521getUnspecifiedD9Ej5fM();
        Color.Companion companion2 = Color.Companion;
        DefaultBoundedRipple = new RippleNodeFactory(true, fM33521getUnspecifiedD9Ej5fM, companion2.m30914getUnspecified0d7_KjU(), (AbstractC9972n) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, companion.m33521getUnspecifiedD9Ej5fM(), companion2.m30914getUnspecified0d7_KjU(), (AbstractC9972n) null);
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
    public static final IndicationNodeFactory m29005rippleH2RKhps(boolean z10, float f10, long j10) {
        return (C3186Dp.m33506equalsimpl0(f10, C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM()) && Color.m30879equalsimpl0(j10, Color.Companion.m30914getUnspecified0d7_KjU())) ? z10 ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(z10, f10, j10, (AbstractC9972n) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m29006rippleH2RKhps$default(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        return m29005rippleH2RKhps(z10, f10, j10);
    }

    @Stable
    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m29007ripplewH6b6FI(ColorProducer colorProducer, boolean z10, float f10) {
        return new RippleNodeFactory(z10, f10, colorProducer, (AbstractC9972n) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m29008ripplewH6b6FI$default(ColorProducer colorProducer, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            f10 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        return m29007ripplewH6b6FI(colorProducer, z10, f10);
    }

    @Composable
    /* renamed from: rippleOrFallbackImplementation-9IZ8Weo, reason: not valid java name */
    public static final Indication m29009rippleOrFallbackImplementation9IZ8Weo(boolean z10, float f10, long j10, Composer composer, int i10, int i11) {
        Composer composer2;
        Indication indicationM29005rippleH2RKhps;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            f10 = C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        long j11 = j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315814667, i10, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer.startReplaceGroup(-1280632857);
        if (((Boolean) composer.consume(LocalUseFallbackRippleImplementation)).booleanValue()) {
            composer2 = composer;
            indicationM29005rippleH2RKhps = androidx.compose.material.ripple.RippleKt.m28325rememberRipple9IZ8Weo(z11, f11, j11, composer2, i10 & 1022, 0);
        } else {
            composer2 = composer;
            indicationM29005rippleH2RKhps = m29005rippleH2RKhps(z11, f11, j11);
        }
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return indicationM29005rippleH2RKhps;
    }
}
