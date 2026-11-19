package com.xuexiang.xui.widget.spinner.editspinner;

import android.widget.BaseAdapter;
import com.xuexiang.xui.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseEditSpinnerAdapter<T> extends BaseAdapter {
    protected final List<T> mDataSource;
    protected List<String> mDisplayData;
    protected final int[] mIndexs;

    public BaseEditSpinnerAdapter(List<T> list) {
        this.mDataSource = list;
        this.mDisplayData = new ArrayList();
        initDisplayData(list);
        this.mIndexs = new int[list.size()];
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return CollectionUtils.getSize(this.mDisplayData);
    }

    protected String getDataSourceString(int i4) {
        Object listItem = CollectionUtils.getListItem(this.mDataSource, i4);
        return listItem != null ? listItem.toString() : "";
    }

    public abstract EditSpinnerFilter getEditSpinnerFilter();

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    protected String getItemString(int i4) {
        return this.mDataSource.get(this.mIndexs[i4]).toString();
    }

    protected void initDisplayData(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.mDisplayData.add(list.get(i4).toString());
        }
    }

    public void recycle() {
        CollectionUtils.clear(this.mDataSource);
        CollectionUtils.clear(this.mDisplayData);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public String getItem(int i4) {
        return (String) CollectionUtils.getListItem(this.mDisplayData, i4);
    }

    public BaseEditSpinnerAdapter(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        this.mDataSource = arrayList;
        arrayList.addAll(Arrays.asList(tArr));
        this.mDisplayData = new ArrayList();
        initDisplayData(arrayList);
        this.mIndexs = new int[arrayList.size()];
    }
}
