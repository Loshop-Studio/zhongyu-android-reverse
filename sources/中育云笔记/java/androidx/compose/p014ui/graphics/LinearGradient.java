package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j10, long j11, int i10, AbstractC9972n abstractC9972n) {
        this(list, list2, j10, j11, i10);
    }

    @Override // androidx.compose.p014ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo30847createShaderuvyYCjk(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.start & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m31193LinearGradientShaderVjE6UOU(Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return AbstractC9979u.m20289b(this.colors, linearGradient.colors) && AbstractC9979u.m20289b(this.stops, linearGradient.stops) && Offset.m30634equalsimpl0(this.start, linearGradient.start) && Offset.m30634equalsimpl0(this.end, linearGradient.end) && TileMode.m31247equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // androidx.compose.p014ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo30826getIntrinsicSizeNHjbRc() {
        /*
            r8 = this;
            long r0 = r8.start
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.end
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.start
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r8.end
            long r4 = r4 >> r2
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            goto L43
        L42:
            r0 = r3
        L43:
            long r4 = r8.start
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r4 = r8.end
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r3 = r8.start
            long r3 = r3 & r6
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r3 = r8.end
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r1 = r1 - r3
            float r3 = java.lang.Math.abs(r1)
        L85:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r0 = r0 << r2
            long r2 = r3 & r6
            long r0 = r0 | r2
            long r0 = androidx.compose.p014ui.geometry.Size.m30697constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.LinearGradient.mo30826getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m30639hashCodeimpl(this.start)) * 31) + Offset.m30639hashCodeimpl(this.end)) * 31) + TileMode.m31248hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m30645toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & InlineClassHelperKt.DualFloatInfinityBase)) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m30645toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m31249toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j10, long j11, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? TileMode.Companion.m31251getClamp3opZhB0() : i10, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j10, long j11, int i10) {
        this.colors = list;
        this.stops = list2;
        this.start = j10;
        this.end = j11;
        this.tileMode = i10;
    }
}
