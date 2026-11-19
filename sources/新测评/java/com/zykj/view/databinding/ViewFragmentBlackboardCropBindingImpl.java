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
    public static final ViewDataBinding.IncludedLayouts f11344i = null;

    /* renamed from: j */
    public static final SparseIntArray f11345j;

    /* renamed from: g */
    public final ConstraintLayout f11346g;

    /* renamed from: h */
    public long f11347h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11345j = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 1);
        sparseIntArray.put(R$id.iv_back, 2);
        sparseIntArray.put(R$id.iv_record, 3);
        sparseIntArray.put(R$id.tv_time, 4);
        sparseIntArray.put(R$id.seek_bar, 5);
        sparseIntArray.put(R$id.tv_confirm, 6);
    }

    public ViewFragmentBlackboardCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f11344i, f11345j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11347h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11347h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11347h = 1L;
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

    public ViewFragmentBlackboardCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (DoubleSeekBar) objArr[5], (RelativeLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[4]);
        this.f11347h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f11346g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
