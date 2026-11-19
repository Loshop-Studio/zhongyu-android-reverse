package com.xuexiang.xui.widget.spinner.materialspinner;

import android.content.Context;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class MaterialSpinnerAdapterWrapper extends MaterialSpinnerBaseAdapter {
    private final ListAdapter listAdapter;

    public MaterialSpinnerAdapterWrapper(Context context, ListAdapter listAdapter) {
        super(context);
        this.listAdapter = listAdapter;
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter
    public Object get(int i4) {
        return this.listAdapter.getItem(i4);
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter, android.widget.Adapter
    public int getCount() {
        return this.listAdapter.getCount() - 1;
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter, android.widget.Adapter
    public Object getItem(int i4) {
        return i4 >= getSelectedIndex() ? this.listAdapter.getItem(i4 + 1) : this.listAdapter.getItem(i4);
    }

    @Override // com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter
    public List<Object> getItems() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getCount(); i4++) {
            arrayList.add(getItem(i4));
        }
        return arrayList;
    }
}
