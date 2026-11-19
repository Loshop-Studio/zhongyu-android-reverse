package androidx.compose.p014ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TransferParameters {

    /* renamed from: a */
    private final double f1156a;

    /* renamed from: b */
    private final double f1157b;

    /* renamed from: c */
    private final double f1158c;

    /* renamed from: d */
    private final double f1159d;

    /* renamed from: e */
    private final double f1160e;

    /* renamed from: f */
    private final double f1161f;
    private final double gamma;

    public TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.gamma = d10;
        this.f1156a = d11;
        this.f1157b = d12;
        this.f1158c = d13;
        this.f1159d = d14;
        this.f1160e = d15;
        this.f1161f = d16;
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
        return this.f1156a;
    }

    public final double component3() {
        return this.f1157b;
    }

    public final double component4() {
        return this.f1158c;
    }

    public final double component5() {
        return this.f1159d;
    }

    public final double component6() {
        return this.f1160e;
    }

    public final double component7() {
        return this.f1161f;
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
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f1156a, transferParameters.f1156a) == 0 && Double.compare(this.f1157b, transferParameters.f1157b) == 0 && Double.compare(this.f1158c, transferParameters.f1158c) == 0 && Double.compare(this.f1159d, transferParameters.f1159d) == 0 && Double.compare(this.f1160e, transferParameters.f1160e) == 0 && Double.compare(this.f1161f, transferParameters.f1161f) == 0;
    }

    public final double getA() {
        return this.f1156a;
    }

    public final double getB() {
        return this.f1157b;
    }

    public final double getC() {
        return this.f1158c;
    }

    public final double getD() {
        return this.f1159d;
    }

    public final double getE() {
        return this.f1160e;
    }

    public final double getF() {
        return this.f1161f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f1156a)) * 31) + Double.hashCode(this.f1157b)) * 31) + Double.hashCode(this.f1158c)) * 31) + Double.hashCode(this.f1159d)) * 31) + Double.hashCode(this.f1160e)) * 31) + Double.hashCode(this.f1161f);
    }

    public final boolean isHLGish$ui_graphics_release() {
        return this.gamma == -3.0d;
    }

    public final boolean isPQish$ui_graphics_release() {
        return this.gamma == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f1156a + ", b=" + this.f1157b + ", c=" + this.f1158c + ", d=" + this.f1159d + ", e=" + this.f1160e + ", f=" + this.f1161f + ')';
    }

    public /* synthetic */ TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, AbstractC9972n abstractC9972n) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
