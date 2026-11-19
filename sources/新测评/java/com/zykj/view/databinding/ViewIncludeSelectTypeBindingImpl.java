package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewIncludeSelectTypeBindingImpl extends ViewIncludeSelectTypeBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f11531h = null;

    /* renamed from: i */
    public static final SparseIntArray f11532i;

    /* renamed from: f */
    public final LinearLayoutCompat f11533f;

    /* renamed from: g */
    public long f11534g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11532i = sparseIntArray;
        sparseIntArray.put(R$id.iv_select_pen, 1);
        sparseIntArray.put(R$id.iv_select_highlighter, 2);
        sparseIntArray.put(R$id.iv_select_image, 3);
        sparseIntArray.put(R$id.iv_select_text, 4);
        sparseIntArray.put(R$id.iv_select_geometry, 5);
    }

    public ViewIncludeSelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f11531h, f11532i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11534g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11534g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11534g = 1L;
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

    public ViewIncludeSelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4]);
        this.f11534g = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11533f = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
