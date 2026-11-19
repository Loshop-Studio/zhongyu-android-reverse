package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.DpSize;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<InterfaceC10559a> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    public static final SemanticsPropertyKey<InterfaceC10559a> getMagnifierPositionInRoot() {
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
    public static final Modifier m20420magnifierUpNRX3w(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, long j10, float f11, float f12, boolean z10) {
        return m20423magnifierjPUL71Q$default(modifier, interfaceC10570l, interfaceC10570l2, interfaceC10570l3, f10, false, j10, f11, f12, z10, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20421magnifierUpNRX3w$default(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, long j10, float f11, float f12, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            j10 = DpSize.Companion.m27006getUnspecifiedMYxV2XQ();
        }
        if ((i10 & 32) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 64) != 0) {
            f12 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 128) != 0) {
            z10 = true;
        }
        return m20420magnifierUpNRX3w(modifier, interfaceC10570l, interfaceC10570l2, interfaceC10570l3, f10, j10, f11, f12, z10);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m20422magnifierjPUL71Q(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(interfaceC10570l, interfaceC10570l2, interfaceC10570l3, f10, z10, j10, f11, f12, z11, platformMagnifierFactory == null ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20423magnifierjPUL71Q$default(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = DpSize.Companion.m27006getUnspecifiedMYxV2XQ();
        }
        if ((i10 & 64) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 128) != 0) {
            f12 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        if ((i10 & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return m20422magnifierjPUL71Q(modifier, interfaceC10570l, interfaceC10570l2, interfaceC10570l3, f10, z10, j10, f11, f12, z11, platformMagnifierFactory);
    }
}
