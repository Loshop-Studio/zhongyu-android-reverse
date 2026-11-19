package androidx.compose.foundation.shape;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.platform.InspectableValue;
import androidx.compose.p014ui.unit.Density;

/* loaded from: classes.dex */
final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = MotionTokens.DurationShort2) float f10) {
        this.percent = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f10);
    }

    public final PercentCornerSize copy(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = MotionTokens.DurationShort2) float f10) {
        return new PercentCornerSize(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo27746toPxTmRCtEA(long j10, Density density) {
        return Size.m30705getMinDimensionimpl(j10) * (this.percent / 100.0f);
    }

    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public String getValueOverride() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.percent);
        sb2.append('%');
        return sb2.toString();
    }
}
