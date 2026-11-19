package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0007¨\u0006\u001c"}, m5110d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntPair {

    @JvmField
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m6526boximpl(long j7) {
        return new IntIntPair(j7);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m6527component1impl(long j7) {
        return (int) (j7 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m6528component2impl(long j7) {
        return (int) (j7 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6530constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6531equalsimpl(long j7, Object obj) {
        return (obj instanceof IntIntPair) && j7 == ((IntIntPair) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6532equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m6533getFirstimpl(long j7) {
        return (int) (j7 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m6534getSecondimpl(long j7) {
        return (int) (j7 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6535hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6536toStringimpl(long j7) {
        return "(" + m6533getFirstimpl(j7) + ", " + m6534getSecondimpl(j7) + ')';
    }

    public boolean equals(Object obj) {
        return m6531equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6535hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m6536toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6529constructorimpl(int i, int i8) {
        return m6530constructorimpl((i8 & 4294967295L) | (i << 32));
    }
}
