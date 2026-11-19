package com.xuexiang.xui.adapter.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class XListAdapter<T> extends BaseAdapter {
    private Context mContext;
    private final List<T> mData = new ArrayList();
    protected int mSelectPosition = -1;

    public XListAdapter(Context context) {
        this.mContext = context;
    }

    private boolean checkPosition(int i4) {
        return i4 >= 0 && i4 <= this.mData.size() - 1;
    }

    public void addData(List<T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mData.addAll(list);
        notifyDataSetChanged();
    }

    public void addElement(T t3) {
        if (t3 != null) {
            this.mData.add(t3);
            notifyDataSetChanged();
        }
    }

    public void clearData() {
        this.mData.clear();
        this.mSelectPosition = -1;
        notifyDataSetChanged();
    }

    public void clearNotNotify() {
        this.mData.clear();
        this.mSelectPosition = -1;
    }

    protected int getColor(int i4) {
        return this.mContext.getResources().getColor(i4);
    }

    public Context getContext() {
        return this.mContext;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mData.size();
    }

    protected Drawable getDrawable(int i4) {
        return this.mContext.getResources().getDrawable(i4);
    }

    @Override // android.widget.Adapter
    public T getItem(int i4) {
        if (checkPosition(i4)) {
            return this.mData.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public List<T> getItems() {
        return this.mData;
    }

    public T getSelectItem() {
        return getItem(this.mSelectPosition);
    }

    public int getSelectPosition() {
        return this.mSelectPosition;
    }

    public int getSize() {
        return this.mData.size();
    }

    protected String getString(int i4) {
        return this.mContext.getResources().getString(i4);
    }

    @Override // android.widget.Adapter
    public abstract View getView(int i4, View view, ViewGroup viewGroup);

    protected void gone(boolean z3, View view) {
        if (z3) {
            view.setVisibility(8);
        }
    }

    protected void inVisible(View view) {
        view.setVisibility(4);
    }

    public void removeElement(T t3) {
        if (this.mData.contains(t3)) {
            this.mData.remove(t3);
            notifyDataSetChanged();
        }
    }

    public void removeElements(List<T> list) {
        if (list == null || list.size() <= 0 || this.mData.size() < list.size()) {
            return;
        }
        for (T t3 : list) {
            if (this.mData.contains(t3)) {
                this.mData.remove(t3);
            }
        }
        notifyDataSetChanged();
    }

    public void setData(Collection<T> collection) {
        if (collection != null) {
            this.mData.clear();
            this.mData.addAll(collection);
            this.mSelectPosition = -1;
            notifyDataSetChanged();
        }
    }

    public XListAdapter setSelectPosition(int i4) {
        this.mSelectPosition = i4;
        notifyDataSetChanged();
        return this;
    }

    public void updateElement(T t3, int i4) {
        if (checkPosition(i4)) {
            this.mData.set(i4, t3);
            notifyDataSetChanged();
        }
    }

    protected void visible(boolean z3, View view) {
        if (z3) {
            view.setVisibility(0);
        }
    }

    public void addData(T[] tArr) {
        addData((List) Arrays.asList(tArr));
    }

    public void removeElement(int i4) {
        if (this.mData.size() > i4) {
            this.mData.remove(i4);
            notifyDataSetChanged();
        }
    }

    public XListAdapter(Context context, Collection<T> collection) {
        this.mContext = context;
        setData(collection);
    }

    public void addData(T t3) {
        if (t3 != null) {
            this.mData.add(t3);
            notifyDataSetChanged();
        }
    }

    public void setData(T[] tArr) {
        if (tArr == null || tArr.length <= 0) {
            return;
        }
        setData(Arrays.asList(tArr));
    }

    public void removeElements(T[] tArr) {
        if (tArr == null || tArr.length <= 0) {
            return;
        }
        removeElements(Arrays.asList(tArr));
    }

    public XListAdapter(Context context, T[] tArr) {
        this.mContext = context;
        setData(tArr);
    }
}
