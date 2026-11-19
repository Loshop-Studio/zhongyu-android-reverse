package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewPopupPlaySpeedRateBindingImpl extends ViewPopupPlaySpeedRateBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f20734f = null;

    /* renamed from: g */
    public static final SparseIntArray f20735g;

    /* renamed from: d */
    public final FrameLayout f20736d;

    /* renamed from: e */
    public long f20737e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20735g = sparseIntArray;
        sparseIntArray.put(R$id.recycler_view, 1);
    }

    public ViewPopupPlaySpeedRateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f20734f, f20735g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20737e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20737e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20737e = 1L;
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

    public ViewPopupPlaySpeedRateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.f20737e = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f20736d = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
