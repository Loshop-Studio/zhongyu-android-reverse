package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewIncludeEraserBindingImpl extends ViewIncludeEraserBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f15442g = null;

    /* renamed from: h */
    public static final SparseIntArray f15443h;

    /* renamed from: e */
    public final LinearLayoutCompat f15444e;

    /* renamed from: f */
    public long f15445f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15443h = sparseIntArray;
        sparseIntArray.put(R$id.rg_eraser_size, 1);
        sparseIntArray.put(R$id.rb_eraser_size_little, 2);
        sparseIntArray.put(R$id.rb_eraser_size_medium, 3);
        sparseIntArray.put(R$id.rb_eraser_size_big, 4);
    }

    public ViewIncludeEraserBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f15442g, f15443h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15445f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f15445f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15445f = 1L;
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

    public ViewIncludeEraserBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RadioButton) objArr[4], (RadioButton) objArr[2], (RadioButton) objArr[3], (RadioGroup) objArr[1]);
        this.f15445f = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f15444e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
