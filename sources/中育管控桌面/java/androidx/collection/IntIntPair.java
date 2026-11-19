package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0007¨\u0006\u001c"}, m7880d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntPair {

    @JvmField
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j6) {
        this.packedValue = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m9892boximpl(long j6) {
        return new IntIntPair(j6);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m9893component1impl(long j6) {
        return (int) (j6 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m9894component2impl(long j6) {
        return (int) (j6 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9896constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9897equalsimpl(long j6, Object obj) {
        return (obj instanceof IntIntPair) && j6 == ((IntIntPair) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9898equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m9899getFirstimpl(long j6) {
        return (int) (j6 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m9900getSecondimpl(long j6) {
        return (int) (j6 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9901hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9902toStringimpl(long j6) {
        return '(' + m9899getFirstimpl(j6) + ", " + m9900getSecondimpl(j6) + ')';
    }

    public boolean equals(Object obj) {
        return m9897equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m9901hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m9902toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9895constructorimpl(int i6, int i7) {
        return m9896constructorimpl((i7 & 4294967295L) | (i6 << 32));
    }
}
