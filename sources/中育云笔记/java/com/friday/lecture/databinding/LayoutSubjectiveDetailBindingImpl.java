package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;
import com.friday.lecture.floatwindow.canvas.NonSlidableViewPager;

/* loaded from: classes4.dex */
public class LayoutSubjectiveDetailBindingImpl extends LayoutSubjectiveDetailBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f8577i = null;

    /* renamed from: j */
    public static final SparseIntArray f8578j;

    /* renamed from: g */
    public final FrameLayout f8579g;

    /* renamed from: h */
    public long f8580h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8578j = sparseIntArray;
        sparseIntArray.put(R$id.view_pager, 1);
        sparseIntArray.put(R$id.iv_prev, 2);
        sparseIntArray.put(R$id.tv_name, 3);
        sparseIntArray.put(R$id.iv_next, 4);
    }

    public LayoutSubjectiveDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f8577i, f8578j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8580h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8580h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8580h = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public LayoutSubjectiveDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ImageView) objArr[2], (TextView) objArr[3], (NonSlidableViewPager) objArr[1]);
        this.f8580h = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f8579g = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
