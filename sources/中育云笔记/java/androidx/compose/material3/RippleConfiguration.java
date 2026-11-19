package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, AbstractC9972n abstractC9972n) {
        this(j10, rippleAlpha);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m30879equalsimpl0(this.color, rippleConfiguration.color) && AbstractC9979u.m20289b(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m29004getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        int iM30885hashCodeimpl = Color.m30885hashCodeimpl(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return iM30885hashCodeimpl + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m30886toStringimpl(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    private RippleConfiguration(long j10, RippleAlpha rippleAlpha) {
        this.color = j10;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10, (i10 & 2) != 0 ? null : rippleAlpha, null);
    }
}
