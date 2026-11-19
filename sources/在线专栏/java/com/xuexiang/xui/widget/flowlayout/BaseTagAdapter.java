package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import com.xuexiang.xui.adapter.listview.BaseListAdapter;
import com.xuexiang.xui.widget.flowlayout.FlowTagLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseTagAdapter<T, H> extends BaseListAdapter<T, H> implements FlowTagLayout.OnInitSelectedPosition {
    private List<Integer> mPositions;
    private List<Integer> mSelectedIndexs;

    public BaseTagAdapter(Context context) {
        super(context);
        this.mPositions = new ArrayList();
    }

    public void addTag(T t3) {
        addData((BaseTagAdapter<T, H>) t3);
    }

    public void addTags(List<T> list) {
        addData((List) list);
    }

    public void clearAndAddTags(List<T> list) {
        clearNotNotify();
        addTags(list);
    }

    public BaseTagAdapter clearSelection() {
        this.mPositions.clear();
        notifyDataSetChanged();
        return this;
    }

    public List<Integer> getInitSelectedPositions() {
        return this.mPositions;
    }

    public int getSelectedIndex() {
        List<Integer> selectedIndexs = getSelectedIndexs();
        if (selectedIndexs == null || selectedIndexs.size() <= 0) {
            return -1;
        }
        return selectedIndexs.get(0).intValue();
    }

    public List<Integer> getSelectedIndexs() {
        List<Integer> list = this.mSelectedIndexs;
        return list != null ? list : getInitSelectedPositions();
    }

    public T getSelectedItem() {
        return getItem(getSelectedIndex());
    }

    @Override // com.xuexiang.xui.widget.flowlayout.FlowTagLayout.OnInitSelectedPosition
    public boolean isSelectedPosition(int i4) {
        for (int i5 = 0; i5 < this.mPositions.size(); i5++) {
            if (this.mPositions.get(i5).intValue() == i4) {
                return true;
            }
        }
        return false;
    }

    public BaseTagAdapter setSelectedIndexs(List<Integer> list) {
        this.mSelectedIndexs = list;
        return this;
    }

    public BaseTagAdapter setSelectedPosition(Integer num) {
        this.mPositions.clear();
        this.mPositions.add(num);
        notifyDataSetChanged();
        return this;
    }

    public BaseTagAdapter setSelectedPositions(Integer... numArr) {
        if (numArr != null && numArr.length > 0) {
            this.mPositions.clear();
            this.mPositions.addAll(Arrays.asList(numArr));
            notifyDataSetChanged();
        }
        return this;
    }

    public void addTags(T[] tArr) {
        addData((Object[]) tArr);
    }

    public BaseTagAdapter(Context context, List<T> list) {
        super(context, list);
        this.mPositions = new ArrayList();
    }

    public void clearAndAddTags(T[] tArr) {
        clearNotNotify();
        addTags(tArr);
    }

    public BaseTagAdapter(Context context, T[] tArr) {
        super(context, tArr);
        this.mPositions = new ArrayList();
    }

    public BaseTagAdapter setSelectedPositions(List<Integer> list) {
        if (list != null && list.size() > 0) {
            this.mPositions.clear();
            this.mPositions.addAll(list);
            notifyDataSetChanged();
        }
        return this;
    }

    public BaseTagAdapter setSelectedPositions(int[] iArr) {
        this.mPositions.clear();
        for (int i4 : iArr) {
            this.mPositions.add(Integer.valueOf(i4));
        }
        notifyDataSetChanged();
        return this;
    }
}
