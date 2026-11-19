package androidx.compose.p006ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i4) {
        this.packedValue = i4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m10528boximpl(int i4) {
        return new PointerKeyboardModifiers(i4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10529constructorimpl(int i4) {
        return i4;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10530equalsimpl(int i4, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i4 == ((PointerKeyboardModifiers) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10531equalsimpl0(int i4, int i5) {
        return i4 == i5;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10532hashCodeimpl(int i4) {
        return i4;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10533toStringimpl(int i4) {
        return "PointerKeyboardModifiers(packedValue=" + i4 + ')';
    }

    public boolean equals(Object obj) {
        return m10530equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m10532hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10533toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }
}
