package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewPopupPlaySettingBindingImpl extends ViewPopupPlaySettingBinding {

    /* renamed from: d */
    public static final ViewDataBinding.IncludedLayouts f12809d = null;

    /* renamed from: e */
    public static final SparseIntArray f12810e;

    /* renamed from: b */
    public final ConstraintLayout f12811b;

    /* renamed from: c */
    public long f12812c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12810e = sparseIntArray;
        sparseIntArray.put(R$id.recycler_view, 1);
    }

    public ViewPopupPlaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f12809d, f12810e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12812c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12812c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12812c = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewPopupPlaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.f12812c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12811b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
