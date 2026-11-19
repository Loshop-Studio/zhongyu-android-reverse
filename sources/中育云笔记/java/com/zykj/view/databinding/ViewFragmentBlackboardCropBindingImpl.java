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

/* loaded from: classes6.dex */
public class ViewFragmentBlackboardCropBindingImpl extends ViewFragmentBlackboardCropBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f20553k = null;

    /* renamed from: l */
    public static final SparseIntArray f20554l;

    /* renamed from: i */
    public final ConstraintLayout f20555i;

    /* renamed from: j */
    public long f20556j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20554l = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 1);
        sparseIntArray.put(R$id.iv_back, 2);
        sparseIntArray.put(R$id.iv_record, 3);
        sparseIntArray.put(R$id.tv_time, 4);
        sparseIntArray.put(R$id.seek_bar, 5);
        sparseIntArray.put(R$id.tv_confirm, 6);
    }

    public ViewFragmentBlackboardCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f20553k, f20554l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20556j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20556j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20556j = 1L;
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
        this.f20556j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20555i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
