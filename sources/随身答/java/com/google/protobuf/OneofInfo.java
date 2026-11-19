package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes4.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id */
    private final int f5109id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i9, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f5109id = i9;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f5109id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
