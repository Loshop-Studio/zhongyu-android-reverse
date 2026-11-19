package com.xuexiang.xui.adapter.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class BaseListAdapter<T, H> extends XListAdapter<T> {
    public BaseListAdapter(Context context) {
        super(context);
    }

    protected abstract void convert(H h4, T t3, int i4);

    protected abstract int getLayoutId();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xuexiang.xui.adapter.listview.XListAdapter, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        Object tag;
        if (view == null) {
            view = View.inflate(getContext(), getLayoutId(), null);
            tag = newViewHolder(view);
            view.setTag(tag);
        } else {
            tag = view.getTag();
        }
        Object item = getItem(i4);
        if (item != null) {
            convert(tag, item, i4);
        }
        return view;
    }

    protected abstract H newViewHolder(View view);

    public BaseListAdapter(Context context, Collection<T> collection) {
        super(context, collection);
    }

    public BaseListAdapter(Context context, T[] tArr) {
        super(context, tArr);
    }
}
