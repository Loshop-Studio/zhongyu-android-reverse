package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.ScaleImageView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ItemNoteThumbnailBindingImpl extends ItemNoteThumbnailBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6496f = null;

    /* renamed from: g */
    public static final SparseIntArray f6497g;

    /* renamed from: e */
    public long f6498e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6497g = sparseIntArray;
        sparseIntArray.put(R$id.sdv_thumbnail, 1);
    }

    public ItemNoteThumbnailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6496f, f6497g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6498e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6498e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6498e = 1L;
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

    public ItemNoteThumbnailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (ScaleImageView) objArr[1]);
        this.f6498e = -1L;
        this.f6494c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
