package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.canhub.cropper.CropImageView;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class FragmentImageCropBindingImpl extends FragmentImageCropBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f5991i = null;

    /* renamed from: j */
    public static final SparseIntArray f5992j;

    /* renamed from: g */
    public final ConstraintLayout f5993g;

    /* renamed from: h */
    public long f5994h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5992j = sparseIntArray;
        sparseIntArray.put(R$id.progressBar, 1);
        sparseIntArray.put(R$id.view_crop, 2);
        sparseIntArray.put(R$id.capture, 3);
        sparseIntArray.put(R$id.cancel, 4);
    }

    public FragmentImageCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f5991i, f5992j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5994h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5994h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5994h = 1L;
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
        this.f5994h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f5993g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
