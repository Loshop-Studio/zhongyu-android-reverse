package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j10, List list, List list2, AbstractC9972n abstractC9972n) {
        this(j10, list, list2);
    }

    @Override // androidx.compose.p014ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo30847createShaderuvyYCjk(long j10) {
        long jM30629constructorimpl;
        long j11 = this.center;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM30629constructorimpl = SizeKt.m30716getCenteruvyYCjk(j10);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                j10 = this.center;
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        }
        return ShaderKt.m31197SweepGradientShader9KIMszo(jM30629constructorimpl, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m30634equalsimpl0(this.center, sweepGradient.center) && AbstractC9979u.m20289b(this.colors, sweepGradient.colors) && AbstractC9979u.m20289b(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int iM30639hashCodeimpl = ((Offset.m30639hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iM30639hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if ((this.center & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m30645toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    public /* synthetic */ SweepGradient(long j10, List list, List list2, int i10, AbstractC9972n abstractC9972n) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j10, List<Color> list, List<Float> list2) {
        this.center = j10;
        this.colors = list;
        this.stops = list2;
    }
}
