package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewIncludeEraserBindingImpl extends ViewIncludeEraserBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f20653i = null;

    /* renamed from: j */
    public static final SparseIntArray f20654j;

    /* renamed from: g */
    public final LinearLayoutCompat f20655g;

    /* renamed from: h */
    public long f20656h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20654j = sparseIntArray;
        sparseIntArray.put(R$id.rg_eraser_size, 1);
        sparseIntArray.put(R$id.rb_eraser_size_little, 2);
        sparseIntArray.put(R$id.rb_eraser_size_medium, 3);
        sparseIntArray.put(R$id.rb_eraser_size_big, 4);
    }

    public ViewIncludeEraserBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f20653i, f20654j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20656h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20656h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20656h = 1L;
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
        this.f20656h = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f20655g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
