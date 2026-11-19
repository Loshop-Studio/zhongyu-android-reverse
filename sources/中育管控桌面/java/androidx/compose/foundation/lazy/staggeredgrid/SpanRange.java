package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\n\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0088\u0001\u0007¨\u0006\u001e"}, m7880d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "lane", "", "span", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "end", "getEnd-impl", "(J)I", "getPackedValue", "()J", "size", "getSize-impl", "start", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n1132#1:1479\n1129#1:1481\n80#2:1476\n85#2:1477\n90#2:1478\n90#2:1480\n85#2:1482\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1135#1:1479\n1135#1:1481\n1126#1:1476\n1129#1:1477\n1132#1:1478\n1135#1:1480\n1135#1:1482\n*E\n"})
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j6) {
        this.packedValue = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m10831boximpl(long j6) {
        return new SpanRange(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m10833constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10834equalsimpl(long j6, Object obj) {
        return (obj instanceof SpanRange) && j6 == ((SpanRange) obj).m10841unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10835equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m10836getEndimpl(long j6) {
        return (int) (j6 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m10837getSizeimpl(long j6) {
        return ((int) (4294967295L & j6)) - ((int) (j6 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m10838getStartimpl(long j6) {
        return (int) (j6 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10839hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10840toStringimpl(long j6) {
        return "SpanRange(packedValue=" + j6 + ')';
    }

    public boolean equals(Object obj) {
        return m10834equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m10839hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10840toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10841unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10832constructorimpl(int i6, int i7) {
        return m10833constructorimpl(((i7 + i6) & 4294967295L) | (i6 << 32));
    }
}
