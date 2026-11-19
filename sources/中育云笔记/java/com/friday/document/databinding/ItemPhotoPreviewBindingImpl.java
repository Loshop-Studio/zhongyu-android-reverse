package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.luck.picture.lib.photoview.PhotoView;

/* loaded from: classes3.dex */
public class ItemPhotoPreviewBindingImpl extends ItemPhotoPreviewBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6500f = null;

    /* renamed from: g */
    public static final SparseIntArray f6501g;

    /* renamed from: d */
    public final FrameLayout f6502d;

    /* renamed from: e */
    public long f6503e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6501g = sparseIntArray;
        sparseIntArray.put(R$id.iv_photo, 1);
    }

    public ItemPhotoPreviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6500f, f6501g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6503e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6503e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6503e = 1L;
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

    public ItemPhotoPreviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (PhotoView) objArr[1]);
        this.f6503e = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6502d = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
