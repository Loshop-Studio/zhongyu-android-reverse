package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.DoubleSeekBar;

/* loaded from: classes5.dex */
public class ViewFragmentBlackboardCropBindingImpl extends ViewFragmentBlackboardCropBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f12588i = null;

    /* renamed from: j */
    public static final SparseIntArray f12589j;

    /* renamed from: g */
    public final ConstraintLayout f12590g;

    /* renamed from: h */
    public long f12591h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12589j = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 1);
        sparseIntArray.put(R$id.iv_back, 2);
        sparseIntArray.put(R$id.iv_record, 3);
        sparseIntArray.put(R$id.tv_time, 4);
        sparseIntArray.put(R$id.seek_bar, 5);
        sparseIntArray.put(R$id.tv_confirm, 6);
    }

    public ViewFragmentBlackboardCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f12588i, f12589j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12591h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12591h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12591h = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewFragmentBlackboardCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (DoubleSeekBar) objArr[5], (RelativeLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[4]);
        this.f12591h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12590g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
