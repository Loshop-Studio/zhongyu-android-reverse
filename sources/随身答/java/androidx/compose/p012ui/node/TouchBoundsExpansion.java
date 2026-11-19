package androidx.compose.p012ui.node;

import androidx.compose.p012ui.internal.InlineClassHelperKt;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\tJ\u0010\u0010!\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006&"}, m13413d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "packedValue", "", "constructor-impl", "(J)J", "bottom", "", "getBottom-impl", "(J)I", "end", "getEnd-impl", "isLayoutDirectionAware", "", "isLayoutDirectionAware-impl", "(J)Z", "start", "getStart-impl", "top", "getTop-impl", "computeLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "computeLeft-impl$ui_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "computeRight", "computeRight-impl$ui_release", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    @Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m13413d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "()V", "IS_LAYOUT_DIRECTION_AWARE", "", "MASK", "", "MAX_VALUE", "None", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getNone-RZrCHBk", "()J", "J", "SHIFT", "Absolute", "left", "top", "right", "bottom", "Absolute-vsh68fg", "(IIII)J", "pack", "start", "end", "isLayoutDirectionAware", "", "pack$ui_release", "trimAndShift", "int", RequestParameters.POSITION, "unpack", "packedValue", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n*L\n49#1:249,5\n52#1:254,5\n55#1:259,5\n58#1:264,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m23112Absolutevsh68fg$default(Companion companion, int i9, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i9 = 0;
            }
            if ((i13 & 2) != 0) {
                i10 = 0;
            }
            if ((i13 & 4) != 0) {
                i11 = 0;
            }
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            return companion.m23113Absolutevsh68fg(i9, i10, i11, i12);
        }

        private final long trimAndShift(int i9, int position) {
            return (i9 & 32767) << (position * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & 32767;
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m23113Absolutevsh68fg(int left, int top2, int right, int bottom) {
            if (!(left >= 0 && left < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (!(top2 >= 0 && top2 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (!(right >= 0 && right < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (!(bottom >= 0 && bottom < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m23101constructorimpl(pack$ui_release(left, top2, right, bottom, false));
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m23114getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui_release(int start, int top2, int end, int bottom, boolean isLayoutDirectionAware) {
            return trimAndShift(top2, 1) | trimAndShift(start, 0) | trimAndShift(end, 2) | trimAndShift(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m23098boximpl(long j9) {
        return new TouchBoundsExpansion(j9);
    }

    /* renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m23099computeLeftimpl$ui_release(long j9, LayoutDirection layoutDirection) {
        return (!m23109isLayoutDirectionAwareimpl(j9) || layoutDirection == LayoutDirection.Ltr) ? m23106getStartimpl(j9) : m23105getEndimpl(j9);
    }

    /* renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m23100computeRightimpl$ui_release(long j9, LayoutDirection layoutDirection) {
        return (!m23109isLayoutDirectionAwareimpl(j9) || layoutDirection == LayoutDirection.Ltr) ? m23105getEndimpl(j9) : m23106getStartimpl(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23101constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23102equalsimpl(long j9, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j9 == ((TouchBoundsExpansion) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23103equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m23104getBottomimpl(long j9) {
        return INSTANCE.unpack(j9, 3);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m23105getEndimpl(long j9) {
        return INSTANCE.unpack(j9, 2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m23106getStartimpl(long j9) {
        return INSTANCE.unpack(j9, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m23107getTopimpl(long j9) {
        return INSTANCE.unpack(j9, 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23108hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m23109isLayoutDirectionAwareimpl(long j9) {
        return (j9 & Long.MIN_VALUE) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23110toStringimpl(long j9) {
        return "TouchBoundsExpansion(packedValue=" + j9 + ')';
    }

    public boolean equals(Object obj) {
        return m23102equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23108hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m23110toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
