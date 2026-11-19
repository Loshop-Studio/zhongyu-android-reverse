package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class FragmentPreviewMicroClassBindingImpl extends FragmentPreviewMicroClassBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6388g = null;

    /* renamed from: h */
    public static final SparseIntArray f6389h;

    /* renamed from: e */
    public final ConstraintLayout f6390e;

    /* renamed from: f */
    public long f6391f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6389h = sparseIntArray;
        sparseIntArray.put(R$id.iv_cover, 1);
        sparseIntArray.put(R$id.iv_cover_icon, 2);
    }

    public FragmentPreviewMicroClassBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6388g, f6389h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6391f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6391f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6391f = 1L;
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

    public FragmentPreviewMicroClassBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[2]);
        this.f6391f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6390e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
