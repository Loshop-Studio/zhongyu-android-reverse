package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0007¨\u0006\u001c"}, m13558d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntPair {

    @JvmField
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m16969boximpl(long j10) {
        return new IntIntPair(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m16970component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m16971component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m16973constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m16974equalsimpl(long j10, Object obj) {
        return (obj instanceof IntIntPair) && j10 == ((IntIntPair) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16975equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m16976getFirstimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m16977getSecondimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16978hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m16979toStringimpl(long j10) {
        return '(' + m16976getFirstimpl(j10) + ", " + m16977getSecondimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m16974equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m16978hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m16979toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m16972constructorimpl(int i10, int i11) {
        return m16973constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }
}
