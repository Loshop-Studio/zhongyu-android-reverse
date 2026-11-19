package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0094\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¬\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\" \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m13558d2 = {"MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "isPlatformMagnifierSupported", "", "sdkVersion", "", "equalsIncludingNaN", "", "other", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJFFZ)Landroidx/compose/ui/Modifier;", "useTextDefault", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i10);
    }

    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m17258magnifierUpNRX3w(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f10, long j10, float f11, float f12, boolean z9) {
        return m17261magnifierjPUL71Q$default(modifier, function1, function12, function13, f10, false, j10, f11, f12, z9, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17259magnifierUpNRX3w$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f10, long j10, float f11, float f12, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function13 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            j10 = DpSize.INSTANCE.m23668getUnspecifiedMYxV2XQ();
        }
        if ((i10 & 32) != 0) {
            f11 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 64) != 0) {
            f12 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 128) != 0) {
            z9 = true;
        }
        return m17258magnifierUpNRX3w(modifier, function1, function12, function13, f10, j10, f11, f12, z9);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m17260magnifierjPUL71Q(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f10, boolean z9, long j10, float f11, float f12, boolean z10, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(function1, function12, function13, f10, z9, j10, f11, f12, z10, platformMagnifierFactory == null ? PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17261magnifierjPUL71Q$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f10, boolean z9, long j10, float f11, float f12, boolean z10, PlatformMagnifierFactory platformMagnifierFactory, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function13 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z9 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = DpSize.INSTANCE.m23668getUnspecifiedMYxV2XQ();
        }
        if ((i10 & 64) != 0) {
            f11 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 128) != 0) {
            f12 = C3127Dp.INSTANCE.m23581getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        if ((i10 & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return m17260magnifierjPUL71Q(modifier, function1, function12, function13, f10, z9, j10, f11, f12, z10, platformMagnifierFactory);
    }
}
