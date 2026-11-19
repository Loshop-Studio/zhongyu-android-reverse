package androidx.compose.p009ui.unit;

import androidx.compose.p009ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R \u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR \u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m7880d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n53#2,3:453\n53#2,3:457\n53#2,3:461\n53#2,3:465\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n363#4:468\n52#5:444\n49#5:448\n68#5:452\n66#5:456\n60#5:460\n58#5:464\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:435\n301#1:438\n307#1:441,3\n312#1:445,3\n317#1:449,3\n325#1:453,3\n329#1:457,3\n333#1:461,3\n337#1:465,3\n296#1:436\n301#1:439\n296#1:437\n301#1:440\n341#1:468\n312#1:444\n317#1:448\n325#1:452\n329#1:456\n333#1:460\n337#1:464\n*E\n"})
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m16573constructorimpl(0);
    private static final long Unspecified = m16573constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m7880d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m16591getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m16592getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j6) {
        this.packedValue = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m16570boximpl(long j6) {
        return new DpSize(j6);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m16571component1D9Ej5fM(long j6) {
        return m16582getWidthD9Ej5fM(j6);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m16572component2D9Ej5fM(long j6) {
        return m16580getHeightD9Ej5fM(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m16573constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m16574copyDwJknco(long j6, float f6, float f7) {
        return m16573constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m16575copyDwJknco$default(long j6, float f6, float f7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = m16582getWidthD9Ej5fM(j6);
        }
        if ((i6 & 2) != 0) {
            f7 = m16580getHeightD9Ej5fM(j6);
        }
        return m16574copyDwJknco(j6, f6, f7);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m16577divGh9hcWk(long j6, int i6) {
        float f6 = i6;
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) / f6);
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) / f6);
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (Float.floatToRawIntBits(fM16484constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m16578equalsimpl(long j6, Object obj) {
        return (obj instanceof DpSize) && j6 == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16579equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m16580getHeightD9Ej5fM(long j6) {
        return C2452Dp.m16484constructorimpl(Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m16581getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m16582getWidthD9Ej5fM(long j6) {
        return C2452Dp.m16484constructorimpl(Float.intBitsToFloat((int) (j6 >> 32)));
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m16583getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16584hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m16585minuse_xh8Ic(long j6, long j7) {
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) - m16582getWidthD9Ej5fM(j7));
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) - m16580getHeightD9Ej5fM(j7));
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM16484constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m16586pluse_xh8Ic(long j6, long j7) {
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) + m16582getWidthD9Ej5fM(j7));
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) + m16580getHeightD9Ej5fM(j7));
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM16484constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m16588timesGh9hcWk(long j6, int i6) {
        float f6 = i6;
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) * f6);
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) * f6);
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (Float.floatToRawIntBits(fM16484constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m16589toStringimpl(long j6) {
        if (j6 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) C2452Dp.m16495toStringimpl(m16582getWidthD9Ej5fM(j6))) + " x " + ((Object) C2452Dp.m16495toStringimpl(m16580getHeightD9Ej5fM(j6)));
    }

    public boolean equals(Object obj) {
        return m16578equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m16584hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m16589toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m16576divGh9hcWk(long j6, float f6) {
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) / f6);
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) / f6);
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (Float.floatToRawIntBits(fM16484constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m16587timesGh9hcWk(long j6, float f6) {
        float fM16484constructorimpl = C2452Dp.m16484constructorimpl(m16582getWidthD9Ej5fM(j6) * f6);
        float fM16484constructorimpl2 = C2452Dp.m16484constructorimpl(m16580getHeightD9Ej5fM(j6) * f6);
        return m16573constructorimpl((Float.floatToRawIntBits(fM16484constructorimpl) << 32) | (Float.floatToRawIntBits(fM16484constructorimpl2) & 4294967295L));
    }
}
