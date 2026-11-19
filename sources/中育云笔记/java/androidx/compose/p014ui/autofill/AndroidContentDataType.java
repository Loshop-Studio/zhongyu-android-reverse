package androidx.compose.p014ui.autofill;

/* loaded from: classes2.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i10) {
        this.androidAutofillType = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m30458boximpl(int i10) {
        return new AndroidContentDataType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30459constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30460equalsimpl(int i10, Object obj) {
        return (obj instanceof AndroidContentDataType) && i10 == ((AndroidContentDataType) obj).m30464unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30461equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30462hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30463toStringimpl(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m30460equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m30462hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m30463toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30464unboximpl() {
        return this.androidAutofillType;
    }
}
