package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00102K\u0010\u0018\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\nJ-\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0006\u0092\u0001\u00020\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m13413d2 = {"Landroidx/compose/foundation/text/input/internal/OpArray;", "", "size", "", "constructor-impl", "(I)[I", "values", "", "([I)[I", "getSize-impl", "([I)I", "copyOf", "newSize", "copyOf-pSmdads", "([II)[I", "equals", "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "forEach", "", "max", "reversed", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.CycleType.S_WAVE_OFFSET, "srcLen", "destLen", "forEach-impl", "([IIZLkotlin/jvm/functions/Function3;)V", "hashCode", "hashCode-impl", "set", "index", "set-impl", "([IIIII)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
final class OpArray {
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m18652boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m18654constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m18655copyOfpSmdads(int[] iArr, int i9) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i9 * 3);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return m18654constructorimpl(iArrCopyOf);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18656equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && Intrinsics.areEqual(iArr, ((OpArray) obj).getValues());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18657equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m18658forEachimpl(int[] iArr, int i9, boolean z9, Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        if (i9 < 0) {
            return;
        }
        if (!z9) {
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i10 * 3;
                function3.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iArr[i11 + 1]), Integer.valueOf(iArr[i11 + 2]));
            }
            return;
        }
        while (true) {
            i9--;
            if (-1 >= i9) {
                return;
            }
            int i12 = i9 * 3;
            function3.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(iArr[i12 + 1]), Integer.valueOf(iArr[i12 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m18659forEachimpl$default(int[] iArr, int i9, boolean z9, Function3 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if (i9 < 0) {
            return;
        }
        if (!z9) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = i11 * 3;
                function3.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(iArr[i12 + 1]), Integer.valueOf(iArr[i12 + 2]));
            }
            return;
        }
        while (true) {
            i9--;
            if (-1 >= i9) {
                return;
            }
            int i13 = i9 * 3;
            function3.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m18660getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18661hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m18662setimpl(int[] iArr, int i9, int i10, int i11, int i12) {
        int i13 = i9 * 3;
        iArr[i13] = i10;
        iArr[i13 + 1] = i11;
        iArr[i13 + 2] = i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18663toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m18656equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m18661hashCodeimpl(this.values);
    }

    public String toString() {
        return m18663toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getValues() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m18653constructorimpl(int i9) {
        return m18654constructorimpl(new int[i9 * 3]);
    }
}
