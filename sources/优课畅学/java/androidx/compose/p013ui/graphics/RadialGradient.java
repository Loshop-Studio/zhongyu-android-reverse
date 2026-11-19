package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, AbstractC9126n abstractC9126n) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.p013ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo24245createShaderuvyYCjk(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.center;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM24114getCenteruvyYCjk = SizeKt.m24114getCenteruvyYCjk(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM24114getCenteruvyYCjk >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM24114getCenteruvyYCjk & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.center >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)));
        float fM24103getMinDimensionimpl = this.radius;
        if (fM24103getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM24103getMinDimensionimpl = Size.m24103getMinDimensionimpl(j10) / 2;
        }
        return ShaderKt.m24593RadialGradientShader8uybcMk(jM24027constructorimpl, fM24103getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return AbstractC9133u.m16128b(this.colors, radialGradient.colors) && AbstractC9133u.m16128b(this.stops, radialGradient.stops) && Offset.m24032equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m24645equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo24224getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m24112getUnspecifiedNHjbRc();
        }
        float f10 = this.radius;
        float f11 = 2;
        float f12 = f10 * f11;
        float f13 = f10 * f11;
        return Size.m24095constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m24037hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m24646hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m24043toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m24647toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? TileMode.Companion.m24649getClamp3opZhB0() : i10, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }
}
