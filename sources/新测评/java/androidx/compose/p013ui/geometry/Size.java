package androidx.compose.p013ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u001a\u0010\u000bJ'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020#H\u0007¢\u0006\u0004\b,\u0010-J\u001e\u0010.\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010!J\u000f\u00100\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u001b\u0010\u0006\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, m13558d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue", "()J", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,199:1\n57#1:204\n61#1:207\n57#1:235\n61#1:238\n60#2:200\n70#2:202\n60#2:205\n70#2:208\n53#2,3:210\n60#2:213\n70#2:215\n60#2:216\n70#2:218\n53#2,3:219\n60#2:222\n70#2:224\n53#2,3:225\n65#2:228\n75#2:230\n65#2:231\n75#2:233\n60#2:236\n70#2:239\n22#3:201\n22#3:203\n22#3:206\n22#3:209\n22#3:214\n22#3:217\n22#3:223\n22#3:229\n22#3:232\n22#3:237\n148#4:234\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n63#1:204\n65#1:207\n137#1:235\n137#1:238\n57#1:200\n61#1:202\n63#1:205\n65#1:208\n69#1:210,3\n68#1:213\n68#1:215\n113#1:216\n113#1:218\n113#1:219,3\n123#1:222\n123#1:224\n123#1:225,3\n128#1:228\n128#1:230\n133#1:231\n133#1:233\n137#1:236\n137#1:239\n57#1:201\n61#1:203\n63#1:206\n65#1:209\n68#1:214\n113#1:217\n123#1:223\n128#1:229\n133#1:232\n137#1:237\n136#1:234\n*E\n"})
/* loaded from: classes2.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m20795constructorimpl(0);
    private static final long Unspecified = m20795constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m13558d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m20810getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m20811getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m20812getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m20813getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Size(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m20792boximpl(long j10) {
        return new Size(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m20793component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m20794component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20795constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m20796copyxjbvk4A(long j10, float f10, float f11) {
        return m20795constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m20797copyxjbvk4A$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m20796copyxjbvk4A(j10, f10, f11);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m20798div7Ah8Wj8(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m20795constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20799equalsimpl(long j10, Object obj) {
        return (obj instanceof Size) && j10 == ((Size) obj).m20809unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20800equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m20801getHeightimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m20802getMaxDimensionimpl(long j10) {
        return Math.max(Float.intBitsToFloat((int) ((j10 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j10 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m20803getMinDimensionimpl(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j10 & SieveCacheKt.NodeLinkMask)));
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m20804getWidthimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20805hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m20806isEmptyimpl(long j10) {
        long j11 = (~((((-9223372034707292160L) & j10) >>> 31) * (-1))) & j10;
        return (((j11 & 4294967295L) & (j11 >>> 32)) == 0) | (j10 == InlineClassHelperKt.UnspecifiedPackedFloats);
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m20807times7Ah8Wj8(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m20795constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20808toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m20799equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m20805hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20808toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20809unboximpl() {
        return this.packedValue;
    }
}
