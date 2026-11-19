package com.xuexiang.xui.widget.spinner.materialspinner;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public class MaterialSpinnerAdapter<T> extends MaterialSpinnerBaseAdapter {
    private final List<T> mItems;

    public MaterialSpinnerAdapter(Context context, List<T> list) {
        super(context);
        this.mItems = list;
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter
    public T get(int i4) {
        if (this.mItems == null || i4 < 0 || i4 > r0.size() - 1) {
            return null;
        }
        return this.mItems.get(i4);
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter, android.widget.Adapter
    public int getCount() {
        if (this.mItems != null) {
            return r0.size() - 1;
        }
        return 0;
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter, android.widget.Adapter
    public T getItem(int i4) {
        return i4 >= getSelectedIndex() ? this.mItems.get(i4 + 1) : this.mItems.get(i4);
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter
    public List<T> getItems() {
        return this.mItems;
    }
}
