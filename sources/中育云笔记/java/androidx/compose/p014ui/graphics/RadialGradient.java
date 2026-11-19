package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, AbstractC9972n abstractC9972n) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.p014ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo30847createShaderuvyYCjk(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.center;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM30716getCenteruvyYCjk = SizeKt.m30716getCenteruvyYCjk(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.center >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)));
        float fM30705getMinDimensionimpl = this.radius;
        if (fM30705getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM30705getMinDimensionimpl = Size.m30705getMinDimensionimpl(j10) / 2;
        }
        return ShaderKt.m31195RadialGradientShader8uybcMk(jM30629constructorimpl, fM30705getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return AbstractC9979u.m20289b(this.colors, radialGradient.colors) && AbstractC9979u.m20289b(this.stops, radialGradient.stops) && Offset.m30634equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m31247equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.p014ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo30826getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m30714getUnspecifiedNHjbRc();
        }
        float f10 = this.radius;
        float f11 = 2;
        float f12 = f10 * f11;
        float f13 = f10 * f11;
        return Size.m30697constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m30639hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m31248hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m30645toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m31249toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? TileMode.Companion.m31251getClamp3opZhB0() : i10, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }
}
