package androidx.compose.p013ui.autofill;

/* loaded from: classes2.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i10) {
        this.androidAutofillType = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m23856boximpl(int i10) {
        return new AndroidContentDataType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23857constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23858equalsimpl(int i10, Object obj) {
        return (obj instanceof AndroidContentDataType) && i10 == ((AndroidContentDataType) obj).m23862unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23859equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23860hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23861toStringimpl(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m23858equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m23860hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m23861toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m23862unboximpl() {
        return this.androidAutofillType;
    }
}
