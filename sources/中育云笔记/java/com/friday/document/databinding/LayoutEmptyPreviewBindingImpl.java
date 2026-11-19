package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.FridayDrawableTextView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class LayoutEmptyPreviewBindingImpl extends LayoutEmptyPreviewBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6528g = null;

    /* renamed from: h */
    public static final SparseIntArray f6529h;

    /* renamed from: e */
    public final ConstraintLayout f6530e;

    /* renamed from: f */
    public long f6531f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6529h = sparseIntArray;
        sparseIntArray.put(R$id.tv_empty, 1);
        sparseIntArray.put(R$id.iv_fbi_warning, 2);
    }

    public LayoutEmptyPreviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6528g, f6529h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6531f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6531f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6531f = 1L;
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

    public LayoutEmptyPreviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (FridayDrawableTextView) objArr[1]);
        this.f6531f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6530e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
