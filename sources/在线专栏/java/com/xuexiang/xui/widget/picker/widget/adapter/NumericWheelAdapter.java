package com.xuexiang.xui.widget.picker.widget.adapter;

import com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter;

/* loaded from: classes.dex */
public class NumericWheelAdapter implements WheelAdapter {
    private int mMaxValue;
    private int mMinValue;

    public NumericWheelAdapter(int i4, int i5) {
        this.mMinValue = i4;
        this.mMaxValue = i5;
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public Object getItem(int i4) {
        if (i4 < 0 || i4 >= getItemsCount()) {
            return 0;
        }
        return Integer.valueOf(this.mMinValue + i4);
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public int getItemsCount() {
        return (this.mMaxValue - this.mMinValue) + 1;
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public int indexOf(Object obj) {
        try {
            return ((Integer) obj).intValue() - this.mMinValue;
        } catch (Exception unused) {
            return -1;
        }
    }
}
