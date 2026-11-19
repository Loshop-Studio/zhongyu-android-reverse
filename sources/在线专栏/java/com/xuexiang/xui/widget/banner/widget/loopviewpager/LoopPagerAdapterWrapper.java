package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0465n;
import androidx.fragment.app.AbstractC0468q;
import androidx.viewpager.widget.AbstractC0783a;

/* loaded from: classes.dex */
public class LoopPagerAdapterWrapper extends AbstractC0783a {
    private AbstractC0783a mAdapter;
    private boolean mBoundaryCaching;
    private SparseArray<ToDestroy> mToDestroy = new SparseArray<>();

    static class ToDestroy {
        ViewGroup container;
        Object object;
        int position;

        public ToDestroy(ViewGroup viewGroup, int i4, Object obj) {
            this.container = viewGroup;
            this.position = i4;
            this.object = obj;
        }
    }

    LoopPagerAdapterWrapper(AbstractC0783a abstractC0783a) {
        this.mAdapter = abstractC0783a;
    }

    private int getRealFirstPosition() {
        return 1;
    }

    private int getRealLastPosition() {
        return (getRealFirstPosition() + getRealCount()) - 1;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        int realFirstPosition = getRealFirstPosition();
        int realLastPosition = getRealLastPosition();
        AbstractC0783a abstractC0783a = this.mAdapter;
        int realPosition = ((abstractC0783a instanceof AbstractC0465n) || (abstractC0783a instanceof AbstractC0468q)) ? i4 : toRealPosition(i4);
        if (this.mBoundaryCaching && (i4 == realFirstPosition || i4 == realLastPosition)) {
            this.mToDestroy.put(i4, new ToDestroy(viewGroup, realPosition, obj));
        } else {
            this.mAdapter.destroyItem(viewGroup, realPosition, obj);
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void finishUpdate(ViewGroup viewGroup) {
        this.mAdapter.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public int getCount() {
        return this.mAdapter.getCount() + 2;
    }

    public AbstractC0783a getRealAdapter() {
        return this.mAdapter;
    }

    public int getRealCount() {
        return this.mAdapter.getCount();
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        ToDestroy toDestroy;
        AbstractC0783a abstractC0783a = this.mAdapter;
        int realPosition = ((abstractC0783a instanceof AbstractC0465n) || (abstractC0783a instanceof AbstractC0468q)) ? i4 : toRealPosition(i4);
        if (!this.mBoundaryCaching || (toDestroy = this.mToDestroy.get(i4)) == null) {
            return this.mAdapter.instantiateItem(viewGroup, realPosition);
        }
        this.mToDestroy.remove(i4);
        return toDestroy.object;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public boolean isViewFromObject(View view, Object obj) {
        return this.mAdapter.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void notifyDataSetChanged() {
        this.mToDestroy = new SparseArray<>();
        this.mAdapter.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.mAdapter.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Parcelable saveState() {
        return this.mAdapter.saveState();
    }

    void setBoundaryCaching(boolean z3) {
        this.mBoundaryCaching = z3;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void setPrimaryItem(ViewGroup viewGroup, int i4, Object obj) {
        this.mAdapter.setPrimaryItem(viewGroup, i4, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void startUpdate(ViewGroup viewGroup) {
        this.mAdapter.startUpdate(viewGroup);
    }

    public int toInnerPosition(int i4) {
        return i4 + 1;
    }

    int toRealPosition(int i4) {
        int realCount = getRealCount();
        if (realCount == 0) {
            return 0;
        }
        int i5 = (i4 - 1) % realCount;
        return i5 < 0 ? i5 + realCount : i5;
    }
}
