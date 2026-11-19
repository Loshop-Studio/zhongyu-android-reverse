package androidx.compose.foundation.layout;

import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m5110d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,707:1\n210#1:708\n213#1:709\n219#1:710\n216#1:711\n219#1:712\n210#1,10:713\n216#1,4:723\n210#1,4:727\n213#1:731\n219#1:732\n219#1:733\n213#1:734\n210#1:735\n213#1:736\n216#1:737\n219#1:738\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:708\n249#1:709\n250#1:710\n250#1:711\n251#1:712\n257#1:713,10\n259#1:723,4\n259#1:727,4\n265#1:731\n267#1:732\n273#1:733\n275#1:734\n279#1:735\n280#1:736\n281#1:737\n282#1:738\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j7) {
        this.value = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m7228boximpl(long j7) {
        return new OrientationIndependentConstraints(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m7230constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m7232copyyUG9Ft0(long j7, int i, int i8, int i9, int i10) {
        return m7229constructorimpl(i, i8, i9, i10);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m7233copyyUG9Ft0$default(long j7, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = Constraints.m13260getMinWidthimpl(j7);
        }
        int i12 = i;
        if ((i11 & 2) != 0) {
            i8 = Constraints.m13258getMaxWidthimpl(j7);
        }
        int i13 = i8;
        if ((i11 & 4) != 0) {
            i9 = Constraints.m13259getMinHeightimpl(j7);
        }
        int i14 = i9;
        if ((i11 & 8) != 0) {
            i10 = Constraints.m13257getMaxHeightimpl(j7);
        }
        return m7232copyyUG9Ft0(j7, i12, i13, i14, i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7234equalsimpl(long j7, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m13251equalsimpl0(j7, ((OrientationIndependentConstraints) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7235equalsimpl0(long j7, long j8) {
        return Constraints.m13251equalsimpl0(j7, j8);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m7236getCrossAxisMaximpl(long j7) {
        return Constraints.m13257getMaxHeightimpl(j7);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m7237getCrossAxisMinimpl(long j7) {
        return Constraints.m13259getMinHeightimpl(j7);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m7238getMainAxisMaximpl(long j7) {
        return Constraints.m13258getMaxWidthimpl(j7);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m7239getMainAxisMinimpl(long j7) {
        return Constraints.m13260getMinWidthimpl(j7);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7240hashCodeimpl(long j7) {
        return Constraints.m13261hashCodeimpl(j7);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m7241maxHeightimpl(long j7, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m13257getMaxHeightimpl(j7) : Constraints.m13258getMaxWidthimpl(j7);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m7242maxWidthimpl(long j7, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m13258getMaxWidthimpl(j7) : Constraints.m13257getMaxHeightimpl(j7);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m7243stretchCrossAxisq4ezo7Y(long j7) {
        return m7229constructorimpl(Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7), Constraints.m13257getMaxHeightimpl(j7) != Integer.MAX_VALUE ? Constraints.m13257getMaxHeightimpl(j7) : Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m7244toBoxConstraintsOenEA2s(long j7, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7)) : ConstraintsKt.Constraints(Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7), Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7245toStringimpl(long j7) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m13263toStringimpl(j7)) + ')';
    }

    public boolean equals(Object obj) {
        return m7234equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7240hashCodeimpl(this.value);
    }

    public String toString() {
        return m7245toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7229constructorimpl(int i, int i8, int i9, int i10) {
        return m7230constructorimpl(ConstraintsKt.Constraints(i, i8, i9, i10));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7231constructorimpl(long j7, @NotNull LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m7229constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m13260getMinWidthimpl(j7) : Constraints.m13259getMinHeightimpl(j7), layoutOrientation == layoutOrientation2 ? Constraints.m13258getMaxWidthimpl(j7) : Constraints.m13257getMaxHeightimpl(j7), layoutOrientation == layoutOrientation2 ? Constraints.m13259getMinHeightimpl(j7) : Constraints.m13260getMinWidthimpl(j7), layoutOrientation == layoutOrientation2 ? Constraints.m13257getMaxHeightimpl(j7) : Constraints.m13258getMaxWidthimpl(j7));
    }
}
