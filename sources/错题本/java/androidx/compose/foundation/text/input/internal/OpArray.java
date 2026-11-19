package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0083@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ-\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0018H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010)\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010$\u0088\u0001\u0007\u0092\u0001\u00020\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/OpArray;", "", "", "size", "constructor-impl", "(I)[I", "", "values", "([I)[I", "index", TypedValues.CycleType.S_WAVE_OFFSET, "srcLen", "destLen", "Ld6/s;", "set-impl", "([IIIII)V", "set", "newSize", "copyOf-pSmdads", "([II)[I", "copyOf", "max", "", "reversed", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "block", "forEach-impl", "([IIZLr6/f;)V", "forEach", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "hashCode-impl", "([I)I", "hashCode", "other", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "[I", "getSize-impl", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
final class OpArray {

    @NotNull
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m7828boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m7830constructorimpl(int[] iArr) {
        return iArr;
    }

    @NotNull
    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m7831copyOfpSmdads(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i * 3);
        AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
        return m7830constructorimpl(iArrCopyOf);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7832equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && AbstractC5830k.m5325b(iArr, ((OpArray) obj).getValues());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7833equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC5830k.m5325b(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m7834forEachimpl(int[] iArr, int i, boolean z8, @NotNull InterfaceC6474f interfaceC6474f) {
        if (i < 0) {
            return;
        }
        if (!z8) {
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 * 3;
                interfaceC6474f.invoke(Integer.valueOf(iArr[i9]), Integer.valueOf(iArr[i9 + 1]), Integer.valueOf(iArr[i9 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i10 = i * 3;
            interfaceC6474f.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr[i10 + 1]), Integer.valueOf(iArr[i10 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m7835forEachimpl$default(int[] iArr, int i, boolean z8, InterfaceC6474f interfaceC6474f, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if (i < 0) {
            return;
        }
        if (!z8) {
            for (int i9 = 0; i9 < i; i9++) {
                int i10 = i9 * 3;
                interfaceC6474f.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr[i10 + 1]), Integer.valueOf(iArr[i10 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i11 = i * 3;
            interfaceC6474f.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iArr[i11 + 1]), Integer.valueOf(iArr[i11 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m7836getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7837hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m7838setimpl(int[] iArr, int i, int i8, int i9, int i10) {
        int i11 = i * 3;
        iArr[i11] = i8;
        iArr[i11 + 1] = i9;
        iArr[i11 + 2] = i10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7839toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m7832equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m7837hashCodeimpl(this.values);
    }

    public String toString() {
        return m7839toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getValues() {
        return this.values;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7829constructorimpl(int i) {
        return m7830constructorimpl(new int[i * 3]);
    }
}
