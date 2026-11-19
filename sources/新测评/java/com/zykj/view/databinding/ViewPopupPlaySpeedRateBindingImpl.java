package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewPopupPlaySpeedRateBindingImpl extends ViewPopupPlaySpeedRateBinding {

    /* renamed from: d */
    public static final ViewDataBinding.IncludedLayouts f11570d = null;

    /* renamed from: e */
    public static final SparseIntArray f11571e;

    /* renamed from: b */
    public final FrameLayout f11572b;

    /* renamed from: c */
    public long f11573c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11571e = sparseIntArray;
        sparseIntArray.put(R$id.recycler_view, 1);
    }

    public ViewPopupPlaySpeedRateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f11570d, f11571e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11573c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11573c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11573c = 1L;
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
        this.f11573c = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f11572b = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
