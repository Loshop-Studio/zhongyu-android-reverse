package androidx.compose.p011ui.graphics;

import android.graphics.Shader;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0014\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010%\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m5110d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "J", "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,658:1\n65#2:659\n69#2:662\n65#2:669\n69#2:673\n65#2:677\n69#2:681\n60#3:660\n70#3:663\n53#3,3:666\n60#3:670\n70#3:674\n60#3:678\n70#3:682\n53#3,3:686\n53#3,3:690\n22#4:661\n22#4:664\n22#4:671\n22#4:675\n22#4:679\n22#4:683\n33#5:665\n57#6:672\n61#6:676\n57#6:680\n61#6:684\n30#7:685\n30#7:689\n266#7,2:693\n266#7,2:695\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n*L\n446#1:659\n447#1:662\n451#1:669\n452#1:673\n453#1:677\n454#1:681\n446#1:660\n447#1:663\n445#1:666,3\n451#1:670\n452#1:674\n453#1:678\n454#1:682\n458#1:686,3\n459#1:690,3\n446#1:661\n447#1:664\n451#1:671\n452#1:675\n453#1:679\n454#1:683\n445#1:665\n451#1:672\n452#1:676\n453#1:680\n454#1:684\n458#1:685\n459#1:689\n487#1:693,2\n488#1:695,2\n*E\n"})
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {

    @NotNull
    private final List<Color> colors;
    private final long end;
    private final long start;

    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j7, long j8, int i, AbstractC5824e abstractC5824e) {
        this(list, list2, j7, j8, i);
    }

    @Override // androidx.compose.p011ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo10651createShaderuvyYCjk(long size) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.start & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m10997LinearGradientShaderVjE6UOU(Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) other;
        return AbstractC5830k.m5325b(this.colors, linearGradient.colors) && AbstractC5830k.m5325b(this.stops, linearGradient.stops) && Offset.m10438equalsimpl0(this.start, linearGradient.start) && Offset.m10438equalsimpl0(this.end, linearGradient.end) && TileMode.m11051equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // androidx.compose.p011ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getIntrinsicSize() {
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
            long r0 = androidx.compose.p011ui.geometry.Size.m10501constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.LinearGradient.getIntrinsicSize():long");
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return TileMode.m11052hashCodeimpl(this.tileMode) + ((Offset.m10443hashCodeimpl(this.end) + ((Offset.m10443hashCodeimpl(this.start) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m10449toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & InlineClassHelperKt.DualFloatInfinityBase)) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m10449toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m11053toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j7, long j8, int i, int i8, AbstractC5824e abstractC5824e) {
        this(list, (i8 & 2) != 0 ? null : list2, j7, j8, (i8 & 16) != 0 ? TileMode.INSTANCE.m11055getClamp3opZhB0() : i, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j7, long j8, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j7;
        this.end = j8;
        this.tileMode = i;
    }
}
