package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0007¨\u0006\u001e"}, m5110d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", "second", "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,84:1\n51#1:92\n55#1:94\n22#2,3:85\n22#3:88\n22#3:89\n22#3:90\n22#3:91\n22#3:93\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n82#1:92\n82#1:94\n47#1:85,3\n51#1:88\n55#1:89\n67#1:90\n80#1:91\n82#1:93\n*E\n"})
/* loaded from: classes.dex */
public final class FloatFloatPair {

    @JvmField
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m6514boximpl(long j7) {
        return new FloatFloatPair(j7);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m6515component1impl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m6516component2impl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6518constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6519equalsimpl(long j7, Object obj) {
        return (obj instanceof FloatFloatPair) && j7 == ((FloatFloatPair) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6520equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m6521getFirstimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m6522getSecondimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6523hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6524toStringimpl(long j7) {
        return "(" + Float.intBitsToFloat((int) (j7 >> 32)) + ", " + Float.intBitsToFloat((int) (j7 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m6519equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6523hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m6524toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6517constructorimpl(float f, float f7) {
        return m6518constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
