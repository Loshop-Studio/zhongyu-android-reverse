package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m13558d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,658:1\n139#2:659\n139#2:684\n33#3:660\n53#4,3:661\n60#4:666\n70#4:669\n60#4:672\n70#4:676\n53#4,3:680\n278#5:664\n30#5:679\n273#5:683\n65#6:665\n69#6:668\n65#6:671\n69#6:675\n22#7:667\n22#7:670\n22#7:673\n22#7:677\n57#8:674\n61#8:678\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n*L\n510#1:659\n561#1:684\n511#1:660\n511#1:661,3\n521#1:666\n522#1:669\n524#1:672\n525#1:676\n531#1:680,3\n519#1:664\n531#1:679\n560#1:683\n521#1:665\n522#1:668\n524#1:671\n525#1:675\n521#1:667\n522#1:670\n524#1:673\n525#1:677\n524#1:674\n525#1:678\n*E\n"})
/* loaded from: classes2.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.p013ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo20945createShaderuvyYCjk(long size) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j10 = this.center;
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM20814getCenteruvyYCjk = SizeKt.m20814getCenteruvyYCjk(size);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM20814getCenteruvyYCjk >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM20814getCenteruvyYCjk & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j10 >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)));
        float fM20803getMinDimensionimpl = this.radius;
        if (fM20803getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM20803getMinDimensionimpl = Size.m20803getMinDimensionimpl(size) / 2;
        }
        return ShaderKt.m21293RadialGradientShader8uybcMk(jM20727constructorimpl, fM20803getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        return Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m20732equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m21345equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.INSTANCE.m20812getUnspecifiedNHjbRc();
        }
        float f10 = this.radius;
        float f11 = 2;
        float f12 = f10 * f11;
        float f13 = f10 * f11;
        return Size.m20795constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m20737hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m21346hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m20743toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m21347toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? TileMode.INSTANCE.m21349getClamp3opZhB0() : i10, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }
}
