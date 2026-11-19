package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"DefaultBoundedRipple", "Landroidx/compose/material3/RippleNodeFactory;", "DefaultUnboundedRipple", "LocalRippleConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/RippleConfiguration;", "getLocalRippleConfiguration$annotations", "()V", "getLocalRippleConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUseFallbackRippleImplementation", "", "getLocalUseFallbackRippleImplementation$annotations", "getLocalUseFallbackRippleImplementation", "ripple", "Landroidx/compose/foundation/IndicationNodeFactory;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "bounded", "radius", "Landroidx/compose/ui/unit/Dp;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/ui/graphics/Color;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "rippleOrFallbackImplementation", "Landroidx/compose/foundation/Indication;", "rippleOrFallbackImplementation-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,370:1\n77#2:371\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n*L\n232#1:371\n*E\n"})
/* loaded from: classes.dex */
public final class RippleKt {

    @NotNull
    private static final RippleNodeFactory DefaultBoundedRipple;

    @NotNull
    private static final RippleNodeFactory DefaultUnboundedRipple;

    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalUseFallbackRippleImplementation = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC6469a() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    @NotNull
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC6469a() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        @Override // p152r6.InterfaceC6469a
        @Nullable
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    static {
        C2331Dp.Companion companion = C2331Dp.INSTANCE;
        float fM13325getUnspecifiedD9Ej5fM = companion.m13325getUnspecifiedD9Ej5fM();
        Color.Companion companion2 = Color.INSTANCE;
        DefaultBoundedRipple = new RippleNodeFactory(true, fM13325getUnspecifiedD9Ej5fM, companion2.m10718getUnspecified0d7_KjU(), (AbstractC5824e) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, companion.m13325getUnspecifiedD9Ej5fM(), companion2.m10718getUnspecified0d7_KjU(), (AbstractC5824e) null);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalRippleConfiguration$annotations() {
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalUseFallbackRippleImplementation() {
        return LocalUseFallbackRippleImplementation;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalUseFallbackRippleImplementation$annotations() {
    }

    @Stable
    @NotNull
    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m8809rippleH2RKhps(boolean z8, float f, long j7) {
        return (C2331Dp.m13310equalsimpl0(f, C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM()) && Color.m10683equalsimpl0(j7, Color.INSTANCE.m10718getUnspecified0d7_KjU())) ? z8 ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(z8, f, j7, (AbstractC5824e) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m8810rippleH2RKhps$default(boolean z8, float f, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if ((i & 2) != 0) {
            f = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        return m8809rippleH2RKhps(z8, f, j7);
    }

    @Stable
    @NotNull
    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m8811ripplewH6b6FI(@NotNull ColorProducer colorProducer, boolean z8, float f) {
        return new RippleNodeFactory(z8, f, colorProducer, (AbstractC5824e) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m8812ripplewH6b6FI$default(ColorProducer colorProducer, boolean z8, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = true;
        }
        if ((i & 4) != 0) {
            f = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        return m8811ripplewH6b6FI(colorProducer, z8, f);
    }

    @Composable
    @NotNull
    /* renamed from: rippleOrFallbackImplementation-9IZ8Weo, reason: not valid java name */
    public static final Indication m8813rippleOrFallbackImplementation9IZ8Weo(boolean z8, float f, long j7, @Nullable Composer composer, int i, int i8) {
        Composer composer2;
        Indication indicationM8809rippleH2RKhps;
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        boolean z9 = z8;
        if ((i8 & 2) != 0) {
            f = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        float f7 = f;
        if ((i8 & 4) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        long j8 = j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315814667, i, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer.startReplaceGroup(-1280632857);
        if (((Boolean) composer.consume(LocalUseFallbackRippleImplementation)).booleanValue()) {
            composer2 = composer;
            indicationM8809rippleH2RKhps = androidx.compose.material.ripple.RippleKt.m8129rememberRipple9IZ8Weo(z9, f7, j8, composer2, i & 1022, 0);
        } else {
            composer2 = composer;
            indicationM8809rippleH2RKhps = m8809rippleH2RKhps(z9, f7, j8);
        }
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return indicationM8809rippleH2RKhps;
    }
}
