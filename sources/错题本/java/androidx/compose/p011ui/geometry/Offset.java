package androidx.compose.p011ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010\rJ\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b0\u0010.J\u001e\u00101\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u001bJ\u001e\u00103\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u001bJ\u000f\u00105\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, m5110d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,285:1\n65#1:290\n69#1:293\n65#1:343\n69#1:346\n60#2:286\n70#2:288\n60#2:291\n70#2:294\n53#2,3:296\n60#2:299\n70#2:301\n60#2:302\n70#2:304\n60#2:306\n70#2:308\n60#2:310\n70#2:312\n53#2,3:314\n60#2:317\n70#2:319\n53#2,3:321\n60#2:324\n70#2:326\n53#2,3:327\n60#2:330\n70#2:332\n53#2,3:333\n60#2:336\n70#2:338\n53#2,3:339\n60#2:344\n70#2:347\n22#3:287\n22#3:289\n22#3:292\n22#3:295\n22#3:300\n22#3:303\n22#3:305\n22#3:307\n22#3:309\n22#3:311\n22#3:313\n22#3:318\n22#3:320\n22#3:325\n22#3:331\n22#3:337\n22#3:345\n273#4:342\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n71#1:290\n73#1:293\n227#1:343\n227#1:346\n65#1:286\n69#1:288\n71#1:291\n73#1:294\n77#1:296,3\n76#1:299\n76#1:301\n123#1:302\n124#1:304\n135#1:306\n136#1:308\n164#1:310\n165#1:312\n163#1:314,3\n180#1:317\n181#1:319\n179#1:321,3\n195#1:324\n195#1:326\n195#1:327,3\n208#1:330\n208#1:332\n208#1:333,3\n221#1:336\n221#1:338\n221#1:339,3\n227#1:344\n227#1:347\n65#1:287\n69#1:289\n71#1:292\n73#1:295\n76#1:300\n123#1:303\n124#1:305\n135#1:307\n136#1:309\n164#1:311\n165#1:313\n180#1:318\n181#1:320\n195#1:325\n208#1:331\n221#1:337\n227#1:345\n226#1:342\n*E\n"})
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m10433constructorimpl(0);
    private static final long Infinite = m10433constructorimpl(InlineClassHelperKt.DualFloatInfinityBase);
    private static final long Unspecified = m10433constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m10452getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m10453getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m10454getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m10455getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m10456getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m10457getZeroF1C5BW0() {
            return Offset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Offset(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m10430boximpl(long j7) {
        return new Offset(j7);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m10431component1impl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m10432component2impl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10433constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m10434copydBAh8RU(long j7, float f, float f7) {
        return m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m10435copydBAh8RU$default(long j7, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (4294967295L & j7));
        }
        return m10434copydBAh8RU(j7, f, f7);
    }

    @Stable
    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m10436divtuRUvjQ(long j7, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / f;
        return m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10437equalsimpl(long j7, Object obj) {
        return (obj instanceof Offset) && j7 == ((Offset) obj).m10451unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10438equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    @Stable
    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m10439getDistanceimpl(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m10440getDistanceSquaredimpl(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m10441getXimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m10442getYimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10443hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @Stable
    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m10444isValidimpl(long j7) {
        return (((j7 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0;
    }

    @Stable
    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m10445minusMKHz9U(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m10446plusMKHz9U(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L));
        return m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m10447remtuRUvjQ(long j7, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) % f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) % f;
        return m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m10448timestuRUvjQ(long j7, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f;
        return m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10449toStringimpl(long j7) {
        if ((9223372034707292159L & j7) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j7 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j7 & 4294967295L)), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m10450unaryMinusF1C5BW0(long j7) {
        return m10433constructorimpl(j7 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m10437equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m10443hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m10449toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10451unboximpl() {
        return this.packedValue;
    }
}
