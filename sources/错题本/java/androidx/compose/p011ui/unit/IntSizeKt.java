package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\f\u001a\u00020\u0002*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u001f\u0010\u000f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u0017\u001a\u00020\u0002*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006\u001a\u0016\u0010\u0019\u001a\u00020\r*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m5110d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "roundToIntSize", "Landroidx/compose/ui/geometry/Size;", "roundToIntSize-uvyYCjk", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntSize", "toIntSize-uvyYCjk", "toSize", "toSize-ozmzZPI", "ui-unit_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,122:1\n80#2:123\n85#2:125\n90#2:127\n53#2,3:129\n60#2:133\n70#2,11:136\n60#2:148\n70#2,11:155\n54#3:124\n59#3:126\n33#4:128\n57#5:132\n61#5:135\n57#5:147\n61#5:154\n22#6:134\n22#6,5:149\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n30#1:123\n107#1:125\n107#1:127\n107#1:129,3\n113#1:133\n113#1:136,11\n121#1:148\n121#1:155,11\n107#1:124\n107#1:126\n107#1:128\n113#1:132\n113#1:135\n121#1:147\n121#1:154\n113#1:134\n121#1:149,5\n*E\n"})
/* loaded from: classes2.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i, int i8) {
        return IntSize.m13471constructorimpl((i8 & 4294967295L) | (i << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m13482getCenterozmzZPI(long j7) {
        return IntOffset.m13427constructorimpl((((j7 << 32) >> 33) & 4294967295L) | ((j7 >> 33) << 32));
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m13483getCenterozmzZPI$annotations(long j7) {
    }

    @Stable
    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m13484roundToIntSizeuvyYCjk(long j7) {
        return IntSize.m13471constructorimpl((Math.round(Float.intBitsToFloat((int) (j7 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j7 >> 32))) << 32));
    }

    @Stable
    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m13485timesO0kMr_c(int i, long j7) {
        return IntSize.m13478timesYEO4UFw(j7, i);
    }

    @Stable
    @NotNull
    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m13486toIntRectozmzZPI(long j7) {
        return IntRectKt.m13466IntRectVbeCjmY(IntOffset.INSTANCE.m13444getZeronOccac(), j7);
    }

    @Stable
    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m13487toIntSizeuvyYCjk(long j7) {
        return IntSize.m13471constructorimpl((((int) Float.intBitsToFloat((int) (j7 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j7 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m13488toSizeozmzZPI(long j7) {
        return Size.m10501constructorimpl((Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
    }
}
