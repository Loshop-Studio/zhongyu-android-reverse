package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes2.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id */
    private final int f532id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i6, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f532id = i6;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f532id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
