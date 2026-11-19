package com.xuexiang.xui.widget.picker.widget.configure;

/* loaded from: classes.dex */
public enum TimePickerType {
    DEFAULT(new boolean[]{true, true, true, false, false, false}),
    ALL(new boolean[]{true, true, true, true, true, true}),
    TIME(new boolean[]{false, false, false, true, true, true}),
    DATE(new boolean[]{true, true, true, true, true, false});

    private final boolean[] mType;

    TimePickerType(boolean[] zArr) {
        this.mType = zArr;
    }

    public boolean[] getType() {
        return this.mType;
    }
}
