package androidx.compose.p012ui.autofill;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m13413d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "androidAutofillType", "", "constructor-impl", "(I)I", "getAndroidAutofillType", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i9) {
        this.androidAutofillType = i9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m20997boximpl(int i9) {
        return new AndroidContentDataType(i9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m20998constructorimpl(int i9) {
        return i9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20999equalsimpl(int i9, Object obj) {
        return (obj instanceof AndroidContentDataType) && i9 == ((AndroidContentDataType) obj).m21003unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21000equalsimpl0(int i9, int i10) {
        return i9 == i10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21001hashCodeimpl(int i9) {
        return Integer.hashCode(i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21002toStringimpl(int i9) {
        return "AndroidContentDataType(androidAutofillType=" + i9 + ')';
    }

    public boolean equals(Object obj) {
        return m20999equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m21001hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m21002toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m21003unboximpl() {
        return this.androidAutofillType;
    }
}
