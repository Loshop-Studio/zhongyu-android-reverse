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

/* loaded from: classes5.dex */
public class ViewActivityEzyCropBindingImpl extends ViewActivityEzyCropBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f11317i = null;

    /* renamed from: j */
    public static final SparseIntArray f11318j;

    /* renamed from: g */
    public final ConstraintLayout f11319g;

    /* renamed from: h */
    public long f11320h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11318j = sparseIntArray;
        sparseIntArray.put(R$id.cropImageView, 1);
        sparseIntArray.put(R$id.confirm_crop, 2);
        sparseIntArray.put(R$id.cancel, 3);
        sparseIntArray.put(R$id.rotate, 4);
        sparseIntArray.put(R$id.iv_tip, 5);
        sparseIntArray.put(R$id.tv_tip, 6);
    }

    public ViewActivityEzyCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f11317i, f11318j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11320h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11320h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11320h = 1L;
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
        this.f11320h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f11319g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
