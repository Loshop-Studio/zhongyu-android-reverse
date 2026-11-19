package androidx.compose.p013ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class TransferParameters {

    /* renamed from: a */
    private final double f1226a;

    /* renamed from: b */
    private final double f1227b;

    /* renamed from: c */
    private final double f1228c;

    /* renamed from: d */
    private final double f1229d;

    /* renamed from: e */
    private final double f1230e;

    /* renamed from: f */
    private final double f1231f;
    private final double gamma;

    public TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.gamma = d10;
        this.f1226a = d11;
        this.f1227b = d12;
        this.f1228c = d13;
        this.f1229d = d14;
        this.f1230e = d15;
        this.f1231f = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (TransferParametersKt.isSpecialG(d10)) {
            return;
        }
        if (d14 < AudioStats.AUDIO_AMPLITUDE_NONE || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE && (d11 == AudioStats.AUDIO_AMPLITUDE_NONE || d10 == AudioStats.AUDIO_AMPLITUDE_NONE)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == AudioStats.AUDIO_AMPLITUDE_NONE || d10 == AudioStats.AUDIO_AMPLITUDE_NONE) && d13 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < AudioStats.AUDIO_AMPLITUDE_NONE || d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f1226a;
    }

    public final double component3() {
        return this.f1227b;
    }

    public final double component4() {
        return this.f1228c;
    }

    public final double component5() {
        return this.f1229d;
    }

    public final double component6() {
        return this.f1230e;
    }

    public final double component7() {
        return this.f1231f;
    }

    public final TransferParameters copy(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new TransferParameters(d10, d11, d12, d13, d14, d15, d16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f1226a, transferParameters.f1226a) == 0 && Double.compare(this.f1227b, transferParameters.f1227b) == 0 && Double.compare(this.f1228c, transferParameters.f1228c) == 0 && Double.compare(this.f1229d, transferParameters.f1229d) == 0 && Double.compare(this.f1230e, transferParameters.f1230e) == 0 && Double.compare(this.f1231f, transferParameters.f1231f) == 0;
    }

    public final double getA() {
        return this.f1226a;
    }

    public final double getB() {
        return this.f1227b;
    }

    public final double getC() {
        return this.f1228c;
    }

    public final double getD() {
        return this.f1229d;
    }

    public final double getE() {
        return this.f1230e;
    }

    public final double getF() {
        return this.f1231f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f1226a)) * 31) + Double.hashCode(this.f1227b)) * 31) + Double.hashCode(this.f1228c)) * 31) + Double.hashCode(this.f1229d)) * 31) + Double.hashCode(this.f1230e)) * 31) + Double.hashCode(this.f1231f);
    }

    public final boolean isHLGish$ui_graphics_release() {
        return this.gamma == -3.0d;
    }

    public final boolean isPQish$ui_graphics_release() {
        return this.gamma == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f1226a + ", b=" + this.f1227b + ", c=" + this.f1228c + ", d=" + this.f1229d + ", e=" + this.f1230e + ", f=" + this.f1231f + ')';
    }

    public /* synthetic */ TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, AbstractC9126n abstractC9126n) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
