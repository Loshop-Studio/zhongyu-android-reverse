package com.lljjcoder.style.citypickerview.widget.wheel.adapters;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public class ArrayWheelAdapter<T> extends AbstractWheelTextAdapter {
    private List<T> items;

    public ArrayWheelAdapter(Context context, List<T> list) {
        super(context);
        this.items = list;
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.AbstractWheelTextAdapter
    public CharSequence getItemText(int i6) {
        if (i6 < 0 || i6 >= this.items.size()) {
            return null;
        }
        T t6 = this.items.get(i6);
        return t6 instanceof CharSequence ? (CharSequence) t6 : t6.toString();
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.items.size();
    }
}
