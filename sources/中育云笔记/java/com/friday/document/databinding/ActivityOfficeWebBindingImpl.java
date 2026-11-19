package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ActivityOfficeWebBindingImpl extends ActivityOfficeWebBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6300g = null;

    /* renamed from: h */
    public static final SparseIntArray f6301h;

    /* renamed from: f */
    public long f6302f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6301h = sparseIntArray;
        sparseIntArray.put(R$id.fragment_container, 1);
        sparseIntArray.put(R$id.iv_finish, 2);
    }

    public ActivityOfficeWebBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6300g, f6301h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6302f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6302f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6302f = 1L;
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

    public ActivityOfficeWebBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (FragmentContainerView) objArr[1], (ImageView) objArr[2]);
        this.f6302f = -1L;
        this.f6297c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
