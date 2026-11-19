package com.xuexiang.xui.widget.picker.widget.adapter;

import com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter;
import java.util.List;

/* loaded from: classes.dex */
public class ArrayWheelAdapter<T> implements WheelAdapter {
    private List<T> mItems;

    public ArrayWheelAdapter(List<T> list) {
        this.mItems = list;
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public Object getItem(int i4) {
        return (i4 < 0 || i4 >= this.mItems.size()) ? "" : this.mItems.get(i4);
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public int getItemsCount() {
        return this.mItems.size();
    }

    @Override // com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter
    public int indexOf(Object obj) {
        return this.mItems.indexOf(obj);
    }
}
