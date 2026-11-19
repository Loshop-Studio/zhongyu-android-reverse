package androidx.compose.foundation.layout;

import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m13413d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,707:1\n210#1:708\n213#1:709\n219#1:710\n216#1:711\n219#1:712\n210#1,10:713\n216#1,4:723\n210#1,4:727\n213#1:731\n219#1:732\n219#1:733\n213#1:734\n210#1:735\n213#1:736\n216#1:737\n219#1:738\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:708\n249#1:709\n250#1:710\n250#1:711\n251#1:712\n257#1:713,10\n259#1:723,4\n259#1:727,4\n265#1:731\n267#1:732\n273#1:733\n275#1:734\n279#1:735\n280#1:736\n281#1:737\n282#1:738\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j9) {
        this.value = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m18080boximpl(long j9) {
        return new OrientationIndependentConstraints(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m18082constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m18084copyyUG9Ft0(long j9, int i9, int i10, int i11, int i12) {
        return m18081constructorimpl(i9, i10, i11, i12);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m18085copyyUG9Ft0$default(long j9, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = Constraints.m23949getMinWidthimpl(j9);
        }
        int i14 = i9;
        if ((i13 & 2) != 0) {
            i10 = Constraints.m23947getMaxWidthimpl(j9);
        }
        int i15 = i10;
        if ((i13 & 4) != 0) {
            i11 = Constraints.m23948getMinHeightimpl(j9);
        }
        int i16 = i11;
        if ((i13 & 8) != 0) {
            i12 = Constraints.m23946getMaxHeightimpl(j9);
        }
        return m18084copyyUG9Ft0(j9, i14, i15, i16, i12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18086equalsimpl(long j9, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m23940equalsimpl0(j9, ((OrientationIndependentConstraints) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18087equalsimpl0(long j9, long j10) {
        return Constraints.m23940equalsimpl0(j9, j10);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m18088getCrossAxisMaximpl(long j9) {
        return Constraints.m23946getMaxHeightimpl(j9);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m18089getCrossAxisMinimpl(long j9) {
        return Constraints.m23948getMinHeightimpl(j9);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m18090getMainAxisMaximpl(long j9) {
        return Constraints.m23947getMaxWidthimpl(j9);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m18091getMainAxisMinimpl(long j9) {
        return Constraints.m23949getMinWidthimpl(j9);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18092hashCodeimpl(long j9) {
        return Constraints.m23950hashCodeimpl(j9);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m18093maxHeightimpl(long j9, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m23946getMaxHeightimpl(j9) : Constraints.m23947getMaxWidthimpl(j9);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m18094maxWidthimpl(long j9, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m23947getMaxWidthimpl(j9) : Constraints.m23946getMaxHeightimpl(j9);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m18095stretchCrossAxisq4ezo7Y(long j9) {
        return m18081constructorimpl(Constraints.m23949getMinWidthimpl(j9), Constraints.m23947getMaxWidthimpl(j9), Constraints.m23946getMaxHeightimpl(j9) != Integer.MAX_VALUE ? Constraints.m23946getMaxHeightimpl(j9) : Constraints.m23948getMinHeightimpl(j9), Constraints.m23946getMaxHeightimpl(j9));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m18096toBoxConstraintsOenEA2s(long j9, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m23949getMinWidthimpl(j9), Constraints.m23947getMaxWidthimpl(j9), Constraints.m23948getMinHeightimpl(j9), Constraints.m23946getMaxHeightimpl(j9)) : ConstraintsKt.Constraints(Constraints.m23948getMinHeightimpl(j9), Constraints.m23946getMaxHeightimpl(j9), Constraints.m23949getMinWidthimpl(j9), Constraints.m23947getMaxWidthimpl(j9));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18097toStringimpl(long j9) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m23952toStringimpl(j9)) + ')';
    }

    public boolean equals(Object obj) {
        return m18086equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m18092hashCodeimpl(this.value);
    }

    public String toString() {
        return m18097toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18081constructorimpl(int i9, int i10, int i11, int i12) {
        return m18082constructorimpl(ConstraintsKt.Constraints(i9, i10, i11, i12));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18083constructorimpl(long j9, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m18081constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m23949getMinWidthimpl(j9) : Constraints.m23948getMinHeightimpl(j9), layoutOrientation == layoutOrientation2 ? Constraints.m23947getMaxWidthimpl(j9) : Constraints.m23946getMaxHeightimpl(j9), layoutOrientation == layoutOrientation2 ? Constraints.m23948getMinHeightimpl(j9) : Constraints.m23949getMinWidthimpl(j9), layoutOrientation == layoutOrientation2 ? Constraints.m23946getMaxHeightimpl(j9) : Constraints.m23947getMaxWidthimpl(j9));
    }
}
