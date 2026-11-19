package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, AbstractC9126n abstractC9126n) {
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
        return Color.m24277equalsimpl0(this.color, rippleConfiguration.color) && AbstractC9133u.m16128b(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m22402getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        int iM24283hashCodeimpl = Color.m24283hashCodeimpl(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return iM24283hashCodeimpl + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m24284toStringimpl(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    private RippleConfiguration(long j10, RippleAlpha rippleAlpha) {
        this.color = j10;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10, (i10 & 2) != 0 ? null : rippleAlpha, null);
    }
}
