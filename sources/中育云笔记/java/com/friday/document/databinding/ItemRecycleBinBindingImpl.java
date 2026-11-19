package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ItemRecycleBinBindingImpl extends ItemRecycleBinBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6509i = null;

    /* renamed from: j */
    public static final SparseIntArray f6510j;

    /* renamed from: h */
    public long f6511h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6510j = sparseIntArray;
        sparseIntArray.put(R$id.iv_icon, 1);
        sparseIntArray.put(R$id.tv_name, 2);
        sparseIntArray.put(R$id.tv_time, 3);
        sparseIntArray.put(R$id.iv_option, 4);
    }

    public ItemRecycleBinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f6509i, f6510j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6511h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6511h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6511h = 1L;
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

    public ItemRecycleBinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (ImageView) objArr[4], (TextView) objArr[2], (TextView) objArr[3]);
        this.f6511h = -1L;
        this.f6504c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
