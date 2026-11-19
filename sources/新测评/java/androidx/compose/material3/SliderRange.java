package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\u0088\u0001\u0002¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/material3/SliderRange;", "", "packedValue", "", "constructor-impl", "(J)J", "endInclusive", "", "getEndInclusive$annotations", "()V", "getEndInclusive-impl", "(J)F", "getPackedValue", "()J", "start", "getStart$annotations", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2263:1\n1#2:2264\n72#3:2265\n86#3:2267\n22#4:2266\n22#4:2268\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n2195#1:2265\n2204#1:2267\n2195#1:2266\n2204#1:2268\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m13558d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "()V", "Unspecified", "Landroidx/compose/material3/SliderRange;", "getUnspecified-FYbKRX4$annotations", "getUnspecified-FYbKRX4", "()J", "J", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m19260getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m19261getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ SliderRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m19251boximpl(long j10) {
        return new SliderRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m19252constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m19253equalsimpl(long j10, Object obj) {
        return (obj instanceof SliderRange) && j10 == ((SliderRange) obj).m19259unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m19254equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m19255getEndInclusiveimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m19256getStartimpl(long j10) {
        if (j10 != Unspecified) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m19257hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m19258toStringimpl(long j10) {
        if (!SliderKt.m19242isSpecifiedIf1S1O4(j10)) {
            return "FloatRange.Unspecified";
        }
        return m19256getStartimpl(j10) + ".." + m19255getEndInclusiveimpl(j10);
    }

    public boolean equals(Object obj) {
        return m19253equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m19257hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m19258toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m19259unboximpl() {
        return this.packedValue;
    }
}
