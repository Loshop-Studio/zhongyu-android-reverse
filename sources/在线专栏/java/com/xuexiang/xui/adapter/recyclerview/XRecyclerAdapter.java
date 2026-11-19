package com.xuexiang.xui.adapter.recyclerview;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0557b0;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class XRecyclerAdapter<T, V extends RecyclerView.AbstractC0557b0> extends RecyclerView.AbstractC0562g<V> {
    private RecyclerViewHolder.OnItemClickListener<T> mClickListener;
    protected final List<T> mData;
    private RecyclerViewHolder.OnItemLongClickListener<T> mLongClickListener;
    protected int mSelectPosition;

    public XRecyclerAdapter() {
        this.mData = new ArrayList();
        this.mSelectPosition = -1;
    }

    private boolean checkPosition(int i4) {
        return i4 >= 0 && i4 < this.mData.size();
    }

    private Bundle getBundle(String str, Object obj) {
        Bundle bundle = new Bundle();
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Short) {
            bundle.putDouble(str, ((Short) obj).shortValue());
        } else if (obj instanceof Long) {
            bundle.putDouble(str, ((Long) obj).longValue());
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else {
            bundle.putString(str, obj.toString());
        }
        return bundle;
    }

    public XRecyclerAdapter add(int i4, T t3) {
        if (i4 >= 0 && i4 <= getItemCount()) {
            this.mData.add(i4, t3);
            notifyItemInserted(i4);
        }
        return this;
    }

    protected abstract void bindData(V v3, int i4, T t3);

    public void clear() {
        if (isEmpty()) {
            return;
        }
        this.mData.clear();
        this.mSelectPosition = -1;
        notifyDataSetChanged();
    }

    public XRecyclerAdapter delete(int i4) {
        if (checkPosition(i4)) {
            this.mData.remove(i4);
            notifyItemRemoved(i4);
        }
        return this;
    }

    public List<T> getData() {
        return this.mData;
    }

    public T getItem(int i4) {
        if (checkPosition(i4)) {
            return this.mData.get(i4);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public int getItemCount() {
        return this.mData.size();
    }

    public T getSelectItem() {
        return getItem(this.mSelectPosition);
    }

    public int getSelectPosition() {
        return this.mSelectPosition;
    }

    protected abstract V getViewHolder(ViewGroup viewGroup, int i4);

    protected View inflateView(ViewGroup viewGroup, int i4) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public XRecyclerAdapter load(T t3) {
        if (t3 != null) {
            this.mData.add(t3);
            notifyDataSetChanged();
        }
        return this;
    }

    public XRecyclerAdapter loadMore(Collection<T> collection) {
        if (collection != null) {
            this.mData.addAll(collection);
            notifyDataSetChanged();
        }
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public void onBindViewHolder(V v3, int i4) {
        bindData(v3, i4, this.mData.get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public V onCreateViewHolder(ViewGroup viewGroup, int i4) {
        final V v3 = (V) getViewHolder(viewGroup, i4);
        if (this.mClickListener != null) {
            v3.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RecyclerViewHolder.OnItemClickListener onItemClickListener = XRecyclerAdapter.this.mClickListener;
                    RecyclerView.AbstractC0557b0 abstractC0557b0 = v3;
                    onItemClickListener.onItemClick(abstractC0557b0.itemView, XRecyclerAdapter.this.getItem(abstractC0557b0.getLayoutPosition()), v3.getLayoutPosition());
                }
            });
        }
        if (this.mLongClickListener != null) {
            v3.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    RecyclerViewHolder.OnItemLongClickListener onItemLongClickListener = XRecyclerAdapter.this.mLongClickListener;
                    RecyclerView.AbstractC0557b0 abstractC0557b0 = v3;
                    onItemLongClickListener.onItemLongClick(abstractC0557b0.itemView, XRecyclerAdapter.this.getItem(abstractC0557b0.getLayoutPosition()), v3.getLayoutPosition());
                    return true;
                }
            });
        }
        return v3;
    }

    public XRecyclerAdapter refresh(int i4, T t3) {
        if (checkPosition(i4)) {
            this.mData.set(i4, t3);
            notifyItemChanged(i4);
        }
        return this;
    }

    public void refreshPartly(int i4, String str, Object obj) {
        notifyItemChanged(i4, getBundle(str, obj));
    }

    public XRecyclerAdapter resetDataSource(Collection<T> collection) {
        if (collection != null) {
            this.mData.clear();
            this.mData.addAll(collection);
        }
        return this;
    }

    public XRecyclerAdapter setOnItemClickListener(RecyclerViewHolder.OnItemClickListener<T> onItemClickListener) {
        this.mClickListener = onItemClickListener;
        return this;
    }

    public XRecyclerAdapter setOnItemLongClickListener(RecyclerViewHolder.OnItemLongClickListener<T> onItemLongClickListener) {
        this.mLongClickListener = onItemLongClickListener;
        return this;
    }

    public XRecyclerAdapter setSelectPosition(int i4) {
        this.mSelectPosition = i4;
        notifyDataSetChanged();
        return this;
    }

    public XRecyclerAdapter loadMore(T[] tArr) {
        if (tArr != null && tArr.length > 0) {
            this.mData.addAll(Arrays.asList(tArr));
            notifyDataSetChanged();
        }
        return this;
    }

    public XRecyclerAdapter(Collection<T> collection) {
        ArrayList arrayList = new ArrayList();
        this.mData = arrayList;
        this.mSelectPosition = -1;
        if (collection != null) {
            arrayList.addAll(collection);
        }
    }

    public XRecyclerAdapter add(T t3) {
        this.mData.add(t3);
        notifyItemInserted(this.mData.size() - 1);
        return this;
    }

    public XRecyclerAdapter refresh(Collection<T> collection) {
        if (collection != null) {
            this.mData.clear();
            this.mData.addAll(collection);
            this.mSelectPosition = -1;
            notifyDataSetChanged();
        }
        return this;
    }

    public XRecyclerAdapter(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        this.mData = arrayList;
        this.mSelectPosition = -1;
        if (tArr == null || tArr.length <= 0) {
            return;
        }
        arrayList.addAll(Arrays.asList(tArr));
    }

    public XRecyclerAdapter refresh(T[] tArr) {
        if (tArr != null && tArr.length > 0) {
            this.mData.clear();
            this.mData.addAll(Arrays.asList(tArr));
            this.mSelectPosition = -1;
            notifyDataSetChanged();
        }
        return this;
    }
}
