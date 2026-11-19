package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.canhub.cropper.CropImageView;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewActivityEzyCropBindingImpl extends ViewActivityEzyCropBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f20526k = null;

    /* renamed from: l */
    public static final SparseIntArray f20527l;

    /* renamed from: i */
    public final ConstraintLayout f20528i;

    /* renamed from: j */
    public long f20529j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20527l = sparseIntArray;
        sparseIntArray.put(R$id.cropImageView, 1);
        sparseIntArray.put(R$id.confirm_crop, 2);
        sparseIntArray.put(R$id.cancel, 3);
        sparseIntArray.put(R$id.rotate, 4);
        sparseIntArray.put(R$id.iv_tip, 5);
        sparseIntArray.put(R$id.tv_tip, 6);
    }

    public ViewActivityEzyCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f20526k, f20527l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20529j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20529j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20529j = 1L;
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

    public ViewActivityEzyCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[2], (CropImageView) objArr[1], (ImageView) objArr[5], (ImageView) objArr[4], (TextView) objArr[6]);
        this.f20529j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20528i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
