package com.zykj.image.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.imageview.crop.CropImageView;
import com.zykj.image.R$id;

/* loaded from: classes4.dex */
public class FragmentImageCropBindingImpl extends FragmentImageCropBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f9814g = null;

    /* renamed from: h */
    public static final SparseIntArray f9815h;

    /* renamed from: e */
    public final ConstraintLayout f9816e;

    /* renamed from: f */
    public long f9817f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9815h = sparseIntArray;
        sparseIntArray.put(R$id.progressBar, 1);
        sparseIntArray.put(R$id.view_crop, 2);
        sparseIntArray.put(R$id.capture, 3);
        sparseIntArray.put(R$id.cancel, 4);
    }

    public FragmentImageCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9814g, f9815h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9817f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9817f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9817f = 1L;
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

    public FragmentImageCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ImageView) objArr[3], (ProgressBar) objArr[1], (CropImageView) objArr[2]);
        this.f9817f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9816e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
