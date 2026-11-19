package com.lljjcoder.style.citypickerview.widget.wheel.adapters;

import android.content.Context;

/* loaded from: classes3.dex */
public class NumericWheelAdapter extends AbstractWheelTextAdapter {
    public static final int DEFAULT_MAX_VALUE = 9;
    private static final int DEFAULT_MIN_VALUE = 0;
    private String format;
    private int maxValue;
    private int minValue;

    public NumericWheelAdapter(Context context) {
        this(context, 0, 9);
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.AbstractWheelTextAdapter
    public CharSequence getItemText(int i6) {
        if (i6 < 0 || i6 >= getItemsCount()) {
            return null;
        }
        int i7 = this.minValue + i6;
        String str = this.format;
        return str != null ? String.format(str, Integer.valueOf(i7)) : Integer.toString(i7);
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.WheelViewAdapter
    public int getItemsCount() {
        return (this.maxValue - this.minValue) + 1;
    }

    public NumericWheelAdapter(Context context, int i6, int i7) {
        this(context, i6, i7, null);
    }

    public NumericWheelAdapter(Context context, int i6, int i7, String str) {
        super(context);
        this.minValue = i6;
        this.maxValue = i7;
        this.format = str;
    }
}
