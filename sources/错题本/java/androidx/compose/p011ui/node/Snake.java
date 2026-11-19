package androidx.compose.p011ui.node;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001d\u001a\u00020\u00108Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0012\u0010\u001f\u001a\u00020\u00108Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0012\u0010!\u001a\u00020\u00108Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0012\u0010#\u001a\u00020\u00108Æ\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0012\u0010&\u001a\u00020\u00158Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010(\u001a\u00020\u00108Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R\u0014\u0010*\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0014\u0010,\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006-"}, m5110d2 = {"Landroidx/compose/ui/node/Snake;", "", "", "data", "constructor-impl", "([I)[I", "Landroidx/compose/ui/node/IntStack;", "diagonals", "Ld6/s;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "addDiagonalToStack", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "", "hashCode-impl", "([I)I", "hashCode", "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "[I", "getData", "()[I", "getStartX-impl", "startX", "getStartY-impl", "startY", "getEndX-impl", "endX", "getEndY-impl", "endY", "getReverse-impl", "([I)Z", "reverse", "getDiagonalSize-impl", "diagonalSize", "getHasAdditionOrRemoval-impl", "hasAdditionOrRemoval", "isAddition-impl", "isAddition", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n1#1,518:1\n318#1:519\n310#1:520\n322#1:521\n314#1:522\n322#1:523\n314#1,5:524\n310#1:529\n322#1:530\n314#1,5:531\n310#1:536\n310#1:537\n314#1:538\n329#1:539\n318#1:540\n310#1:541\n322#1:542\n314#1:543\n326#1:544\n326#1:546\n318#1:548\n310#1:549\n310#1,17:550\n375#2:545\n375#2:547\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n329#1:519\n329#1:520\n329#1:521\n329#1:522\n332#1:523\n332#1:524,5\n332#1:529\n335#1:530\n335#1:531,5\n335#1:536\n360#1:537\n361#1:538\n363#1:539\n363#1:540\n363#1:541\n363#1:542\n363#1:543\n364#1:544\n365#1:546\n367#1:548\n367#1:549\n372#1:550,17\n364#1:545\n365#1:547\n*E\n"})
/* loaded from: classes2.dex */
final class Snake {

    @NotNull
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m12377addDiagonalToStackimpl(int[] iArr, @NotNull IntStack intStack) {
        int iMin;
        int i = iArr[0];
        int i8 = iArr[1];
        if (m12385getHasAdditionOrRemovalimpl(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i += ((iArr[4] != 0 ? 1 : 0) | (m12390isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i8 += ((!m12390isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i, i8, iMin);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m12378boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m12379constructorimpl(@NotNull int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12380equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && AbstractC5830k.m5325b(iArr, ((Snake) obj).m12392unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12381equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC5830k.m5325b(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m12382getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m12383getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m12384getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m12385getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m12386getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m12387getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m12388getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12389hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m12390isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12391toStringimpl(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        return AbstractC0037f.m93r(sb, iArr[4] != 0, ')');
    }

    public boolean equals(Object obj) {
        return m12380equalsimpl(this.data, obj);
    }

    @NotNull
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m12389hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m12391toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m12392unboximpl() {
        return this.data;
    }
}
