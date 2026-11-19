package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m13558d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "()V", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n254#4:452\n52#5:444\n49#5:448\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n210#1:435\n215#1:438\n218#1:441,3\n223#1:445,3\n228#1:449,3\n210#1:436\n215#1:439\n210#1:437\n215#1:440\n232#1:452\n223#1:444\n228#1:448\n*E\n"})
/* loaded from: classes2.dex */
public final class DpOffset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m23617constructorimpl(0);
    private static final long Unspecified = m23617constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m13558d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m23631getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m23632getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m23616boximpl(long j10) {
        return new DpOffset(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23617constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m23618copytPigGR8(long j10, float f10, float f11) {
        return m23617constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m23619copytPigGR8$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m23622getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m23624getYD9Ej5fM(j10);
        }
        return m23618copytPigGR8(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23620equalsimpl(long j10, Object obj) {
        return (obj instanceof DpOffset) && j10 == ((DpOffset) obj).m23630unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23621equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m23622getXD9Ej5fM(long j10) {
        return C3127Dp.m23561constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m23623getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m23624getYD9Ej5fM(long j10) {
        return C3127Dp.m23561constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m23625getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23626hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m23627minusCBMgk4(long j10, long j11) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23622getXD9Ej5fM(j10) - m23622getXD9Ej5fM(j11));
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23624getYD9Ej5fM(j10) - m23624getYD9Ej5fM(j11));
        return m23617constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23561constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m23628plusCBMgk4(long j10, long j11) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(m23622getXD9Ej5fM(j10) + m23622getXD9Ej5fM(j11));
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(m23624getYD9Ej5fM(j10) + m23624getYD9Ej5fM(j11));
        return m23617constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(fM23561constructorimpl2)));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23629toStringimpl(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) C3127Dp.m23572toStringimpl(m23622getXD9Ej5fM(j10))) + ", " + ((Object) C3127Dp.m23572toStringimpl(m23624getYD9Ej5fM(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m23620equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m23626hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m23629toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m23630unboximpl() {
        return this.packedValue;
    }
}
