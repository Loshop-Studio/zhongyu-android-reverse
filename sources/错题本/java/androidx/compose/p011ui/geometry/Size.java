package androidx.compose.p011ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u001a\u0010\u000bJ'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020#H\u0007¢\u0006\u0004\b,\u0010-J\u001e\u0010.\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010!J\u000f\u00100\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u001b\u0010\u0006\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, m5110d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue", "()J", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,199:1\n57#1:204\n61#1:207\n57#1:235\n61#1:238\n60#2:200\n70#2:202\n60#2:205\n70#2:208\n53#2,3:210\n60#2:213\n70#2:215\n60#2:216\n70#2:218\n53#2,3:219\n60#2:222\n70#2:224\n53#2,3:225\n65#2:228\n75#2:230\n65#2:231\n75#2:233\n60#2:236\n70#2:239\n22#3:201\n22#3:203\n22#3:206\n22#3:209\n22#3:214\n22#3:217\n22#3:223\n22#3:229\n22#3:232\n22#3:237\n148#4:234\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n63#1:204\n65#1:207\n137#1:235\n137#1:238\n57#1:200\n61#1:202\n63#1:205\n65#1:208\n69#1:210,3\n68#1:213\n68#1:215\n113#1:216\n113#1:218\n113#1:219,3\n123#1:222\n123#1:224\n123#1:225,3\n128#1:228\n128#1:230\n133#1:231\n133#1:233\n137#1:236\n137#1:239\n57#1:201\n61#1:203\n63#1:206\n65#1:209\n68#1:214\n113#1:217\n123#1:223\n128#1:229\n133#1:232\n137#1:237\n136#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m10501constructorimpl(0);
    private static final long Unspecified = m10501constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m5110d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10516getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10517getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m10518getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m10519getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Size(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m10498boximpl(long j7) {
        return new Size(j7);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m10499component1impl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m10500component2impl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10501constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m10502copyxjbvk4A(long j7, float f, float f7) {
        return m10501constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m10503copyxjbvk4A$default(long j7, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (4294967295L & j7));
        }
        return m10502copyxjbvk4A(j7, f, f7);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m10504div7Ah8Wj8(long j7, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / f;
        return m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10505equalsimpl(long j7, Object obj) {
        return (obj instanceof Size) && j7 == ((Size) obj).m10515unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10506equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m10507getHeightimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m10508getMaxDimensionimpl(long j7) {
        return Math.max(Float.intBitsToFloat((int) ((j7 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j7 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m10509getMinDimensionimpl(long j7) {
        return Math.min(Float.intBitsToFloat((int) ((j7 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j7 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m10510getWidthimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10511hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m10512isEmptyimpl(long j7) {
        long j8 = (~((((-9223372034707292160L) & j7) >>> 31) * (-1))) & j7;
        return (((j8 & 4294967295L) & (j8 >>> 32)) == 0) | (j7 == InlineClassHelperKt.UnspecifiedPackedFloats);
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m10513times7Ah8Wj8(long j7, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f;
        return m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10514toStringimpl(long j7) {
        if (j7 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j7 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j7 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m10505equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m10511hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m10514toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10515unboximpl() {
        return this.packedValue;
    }
}
