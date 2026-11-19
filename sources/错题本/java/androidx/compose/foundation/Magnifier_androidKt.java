package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.DpSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0094\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¬\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0010*\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010!\"&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "Ld6/s;", "onSizeChanged", "", "zoom", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Lr6/c;FJFFZ)Landroidx/compose/ui/Modifier;", "magnifier", "useTextDefault", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Lr6/c;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "isPlatformMagnifierSupported", "(I)Z", "other", "equalsIncludingNaN", "(FF)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Magnifier_androidKt {

    @NotNull
    private static final SemanticsPropertyKey<InterfaceC6469a> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f, float f7) {
        return (Float.isNaN(f) && Float.isNaN(f7)) || f == f7;
    }

    @NotNull
    public static final SemanticsPropertyKey<InterfaceC6469a> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }

    @NotNull
    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m6826magnifierUpNRX3w(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, float f, long j7, float f7, float f8, boolean z8) {
        return m6829magnifierjPUL71Q$default(modifier, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, f, false, j7, f7, f8, z8, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m6827magnifierUpNRX3w$default(Modifier modifier, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, float f, long j7, float f7, float f8, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c3 = null;
        }
        if ((i & 8) != 0) {
            f = Float.NaN;
        }
        if ((i & 16) != 0) {
            j7 = DpSize.INSTANCE.m13412getUnspecifiedMYxV2XQ();
        }
        if ((i & 32) != 0) {
            f7 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 64) != 0) {
            f8 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 128) != 0) {
            z8 = true;
        }
        return m6826magnifierUpNRX3w(modifier, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, f, j7, f7, f8, z8);
    }

    @NotNull
    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m6828magnifierjPUL71Q(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, float f, boolean z8, long j7, float f7, float f8, boolean z9, @Nullable PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(interfaceC6471c, interfaceC6471c2, interfaceC6471c3, f, z8, j7, f7, f8, z9, platformMagnifierFactory == null ? PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m6829magnifierjPUL71Q$default(Modifier modifier, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, float f, boolean z8, long j7, float f7, float f8, boolean z9, PlatformMagnifierFactory platformMagnifierFactory, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c3 = null;
        }
        if ((i & 8) != 0) {
            f = Float.NaN;
        }
        if ((i & 16) != 0) {
            z8 = false;
        }
        if ((i & 32) != 0) {
            j7 = DpSize.INSTANCE.m13412getUnspecifiedMYxV2XQ();
        }
        if ((i & 64) != 0) {
            f7 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 128) != 0) {
            f8 = C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM();
        }
        if ((i & 256) != 0) {
            z9 = true;
        }
        if ((i & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return m6828magnifierjPUL71Q(modifier, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, f, z8, j7, f7, f8, z9, platformMagnifierFactory);
    }
}
