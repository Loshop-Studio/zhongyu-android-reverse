package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m13558d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,707:1\n210#1:708\n213#1:709\n219#1:710\n216#1:711\n219#1:712\n210#1,10:713\n216#1,4:723\n210#1,4:727\n213#1:731\n219#1:732\n219#1:733\n213#1:734\n210#1:735\n213#1:736\n216#1:737\n219#1:738\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:708\n249#1:709\n250#1:710\n250#1:711\n251#1:712\n257#1:713,10\n259#1:723,4\n259#1:727,4\n265#1:731\n267#1:732\n273#1:733\n275#1:734\n279#1:735\n280#1:736\n281#1:737\n282#1:738\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m17647boximpl(long j10) {
        return new OrientationIndependentConstraints(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m17649constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m17651copyyUG9Ft0(long j10, int i10, int i11, int i12, int i13) {
        return m17648constructorimpl(i10, i11, i12, i13);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m17652copyyUG9Ft0$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = Constraints.m23516getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = Constraints.m23514getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = Constraints.m23515getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = Constraints.m23513getMaxHeightimpl(j10);
        }
        return m17651copyyUG9Ft0(j10, i15, i16, i17, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m17653equalsimpl(long j10, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m23507equalsimpl0(j10, ((OrientationIndependentConstraints) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m17654equalsimpl0(long j10, long j11) {
        return Constraints.m23507equalsimpl0(j10, j11);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m17655getCrossAxisMaximpl(long j10) {
        return Constraints.m23513getMaxHeightimpl(j10);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m17656getCrossAxisMinimpl(long j10) {
        return Constraints.m23515getMinHeightimpl(j10);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m17657getMainAxisMaximpl(long j10) {
        return Constraints.m23514getMaxWidthimpl(j10);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m17658getMainAxisMinimpl(long j10) {
        return Constraints.m23516getMinWidthimpl(j10);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m17659hashCodeimpl(long j10) {
        return Constraints.m23517hashCodeimpl(j10);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m17660maxHeightimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m23513getMaxHeightimpl(j10) : Constraints.m23514getMaxWidthimpl(j10);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m17661maxWidthimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m23514getMaxWidthimpl(j10) : Constraints.m23513getMaxHeightimpl(j10);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m17662stretchCrossAxisq4ezo7Y(long j10) {
        return m17648constructorimpl(Constraints.m23516getMinWidthimpl(j10), Constraints.m23514getMaxWidthimpl(j10), Constraints.m23513getMaxHeightimpl(j10) != Integer.MAX_VALUE ? Constraints.m23513getMaxHeightimpl(j10) : Constraints.m23515getMinHeightimpl(j10), Constraints.m23513getMaxHeightimpl(j10));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m17663toBoxConstraintsOenEA2s(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m23516getMinWidthimpl(j10), Constraints.m23514getMaxWidthimpl(j10), Constraints.m23515getMinHeightimpl(j10), Constraints.m23513getMaxHeightimpl(j10)) : ConstraintsKt.Constraints(Constraints.m23515getMinHeightimpl(j10), Constraints.m23513getMaxHeightimpl(j10), Constraints.m23516getMinWidthimpl(j10), Constraints.m23514getMaxWidthimpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m17664toStringimpl(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m23519toStringimpl(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return m17653equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m17659hashCodeimpl(this.value);
    }

    public String toString() {
        return m17664toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m17648constructorimpl(int i10, int i11, int i12, int i13) {
        return m17649constructorimpl(ConstraintsKt.Constraints(i10, i11, i12, i13));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m17650constructorimpl(long j10, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m17648constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m23516getMinWidthimpl(j10) : Constraints.m23515getMinHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m23514getMaxWidthimpl(j10) : Constraints.m23513getMaxHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m23515getMinHeightimpl(j10) : Constraints.m23516getMinWidthimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m23513getMaxHeightimpl(j10) : Constraints.m23514getMaxWidthimpl(j10));
    }
}
