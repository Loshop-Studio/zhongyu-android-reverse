package com.xuexiang.xui.widget.picker.widget.configure;

/* loaded from: classes4.dex */
public enum TimePickerType {
    DEFAULT(new boolean[]{true, true, true, false, false, false}),
    ALL(new boolean[]{true, true, true, true, true, true}),
    TIME(new boolean[]{false, false, false, true, true, true}),
    DATE(new boolean[]{true, true, true, true, true, false});


    /* renamed from: a */
    public final boolean[] f7838a;

    TimePickerType(boolean[] zArr) {
        this.f7838a = zArr;
    }

    /* renamed from: a */
    public boolean[] m6966a() {
        return this.f7838a;
    }
}
