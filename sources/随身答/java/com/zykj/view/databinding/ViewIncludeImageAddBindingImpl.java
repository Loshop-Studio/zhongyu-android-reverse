package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewIncludeImageAddBindingImpl extends ViewIncludeImageAddBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f12730i = null;

    /* renamed from: j */
    public static final SparseIntArray f12731j;

    /* renamed from: g */
    public final LinearLayoutCompat f12732g;

    /* renamed from: h */
    public long f12733h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12731j = sparseIntArray;
        sparseIntArray.put(R$id.iv_image_gallery, 1);
        sparseIntArray.put(R$id.iv_image_camera, 2);
        sparseIntArray.put(R$id.iv_text, 3);
        sparseIntArray.put(R$id.iv_rectangle, 4);
        sparseIntArray.put(R$id.iv_oval, 5);
        sparseIntArray.put(R$id.iv_triangle, 6);
    }

    public ViewIncludeImageAddBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f12730i, f12731j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12733h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12733h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12733h = 1L;
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

    public ViewIncludeImageAddBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[3], (ImageView) objArr[6]);
        this.f12733h = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f12732g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
