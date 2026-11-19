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
    public static final ViewDataBinding.IncludedLayouts f12775h = null;

    /* renamed from: i */
    public static final SparseIntArray f12776i;

    /* renamed from: f */
    public final LinearLayoutCompat f12777f;

    /* renamed from: g */
    public long f12778g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12776i = sparseIntArray;
        sparseIntArray.put(R$id.iv_select_pen, 1);
        sparseIntArray.put(R$id.iv_select_highlighter, 2);
        sparseIntArray.put(R$id.iv_select_image, 3);
        sparseIntArray.put(R$id.iv_select_text, 4);
        sparseIntArray.put(R$id.iv_select_geometry, 5);
    }

    public ViewIncludeSelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f12775h, f12776i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12778g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12778g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12778g = 1L;
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

    public ViewIncludeSelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4]);
        this.f12778g = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f12777f = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
