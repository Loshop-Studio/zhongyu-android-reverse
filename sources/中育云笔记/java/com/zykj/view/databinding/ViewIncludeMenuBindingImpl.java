package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewIncludeMenuBindingImpl extends ViewIncludeMenuBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f20678p = null;

    /* renamed from: q */
    public static final SparseIntArray f20679q;

    /* renamed from: n */
    public final LinearLayoutCompat f20680n;

    /* renamed from: o */
    public long f20681o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20679q = sparseIntArray;
        sparseIntArray.put(R$id.iv_withdraw, 1);
        sparseIntArray.put(R$id.iv_recover, 2);
        sparseIntArray.put(R$id.iv_select, 3);
        sparseIntArray.put(R$id.iv_touch, 4);
        sparseIntArray.put(R$id.iv_enlarge, 5);
        sparseIntArray.put(R$id.iv_reduce, 6);
        sparseIntArray.put(R$id.iv_pen, 7);
        sparseIntArray.put(R$id.iv_eraser, 8);
        sparseIntArray.put(R$id.iv_image_add, 9);
        sparseIntArray.put(R$id.iv_background_color, 10);
        sparseIntArray.put(R$id.iv_delete, 11);
    }

    public ViewIncludeMenuBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f20678p, f20679q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20681o = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20681o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20681o = 1L;
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

    public ViewIncludeMenuBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1]);
        this.f20681o = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f20680n = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
