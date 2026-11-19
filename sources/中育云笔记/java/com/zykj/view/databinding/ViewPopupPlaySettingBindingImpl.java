package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewPopupPlaySettingBindingImpl extends ViewPopupPlaySettingBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f20729f = null;

    /* renamed from: g */
    public static final SparseIntArray f20730g;

    /* renamed from: d */
    public final ConstraintLayout f20731d;

    /* renamed from: e */
    public long f20732e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20730g = sparseIntArray;
        sparseIntArray.put(R$id.recycler_view, 1);
    }

    public ViewPopupPlaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f20729f, f20730g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20732e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20732e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20732e = 1L;
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

    public ViewPopupPlaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.f20732e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20731d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
