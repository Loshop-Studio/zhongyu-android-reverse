package com.xuexiang.xui.widget.tabbar;

import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.C2042R;
import java.util.ArrayList;
import java.util.List;
import p011b0.C1023f;
import p011b0.InterfaceC1022e;

/* loaded from: classes.dex */
public abstract class XUIItemViewsAdapter<T, V extends View> {
    private InterfaceC1022e<V> mCachePool;
    private ViewGroup mParentView;
    private List<T> mItemData = new ArrayList();
    private List<V> mViews = new ArrayList();

    public XUIItemViewsAdapter(ViewGroup viewGroup) {
        this.mParentView = viewGroup;
    }

    private V getView() {
        InterfaceC1022e<V> interfaceC1022e = this.mCachePool;
        V vAcquire = interfaceC1022e != null ? interfaceC1022e.acquire() : null;
        return vAcquire == null ? (V) createView(this.mParentView) : vAcquire;
    }

    public XUIItemViewsAdapter<T, V> addItem(T t3) {
        this.mItemData.add(t3);
        return this;
    }

    protected abstract void bind(T t3, V v3, int i4);

    public void clear() {
        this.mItemData.clear();
        detach(this.mViews.size());
    }

    protected abstract V createView(ViewGroup viewGroup);

    public void detach(int i4) {
        int size = this.mViews.size();
        while (size > 0 && i4 > 0) {
            V vRemove = this.mViews.remove(size - 1);
            if (this.mCachePool == null) {
                this.mCachePool = new C1023f(12);
            }
            Object tag = vRemove.getTag(C2042R.id.xui_view_can_not_cache_tag);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                try {
                    this.mCachePool.release(vRemove);
                } catch (Exception unused) {
                }
            }
            this.mParentView.removeView(vRemove);
            size--;
            i4--;
        }
    }

    public T getItem(int i4) {
        List<T> list = this.mItemData;
        if (list != null && i4 >= 0 && i4 < list.size()) {
            return this.mItemData.get(i4);
        }
        return null;
    }

    public int getSize() {
        List<T> list = this.mItemData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<V> getViews() {
        return this.mViews;
    }

    public void replaceItem(int i4, T t3) throws IllegalAccessException {
        if (i4 >= this.mItemData.size() || i4 < 0) {
            throw new IllegalAccessException("替换数据不存在");
        }
        this.mItemData.set(i4, t3);
    }

    public void setup() {
        int size = this.mItemData.size();
        int size2 = this.mViews.size();
        if (size2 > size) {
            detach(size2 - size);
        } else if (size2 < size) {
            for (int i4 = 0; i4 < size - size2; i4++) {
                View view = getView();
                this.mParentView.addView(view);
                this.mViews.add(view);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            bind(this.mItemData.get(i5), this.mViews.get(i5), i5);
        }
        this.mParentView.invalidate();
        this.mParentView.requestLayout();
    }
}
