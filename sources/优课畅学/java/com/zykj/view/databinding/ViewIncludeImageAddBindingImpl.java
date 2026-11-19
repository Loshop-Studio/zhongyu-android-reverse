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
    public static final ViewDataBinding.IncludedLayouts f15452i = null;

    /* renamed from: j */
    public static final SparseIntArray f15453j;

    /* renamed from: g */
    public final LinearLayoutCompat f15454g;

    /* renamed from: h */
    public long f15455h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15453j = sparseIntArray;
        sparseIntArray.put(R$id.iv_image_gallery, 1);
        sparseIntArray.put(R$id.iv_image_camera, 2);
        sparseIntArray.put(R$id.iv_text, 3);
        sparseIntArray.put(R$id.iv_rectangle, 4);
        sparseIntArray.put(R$id.iv_oval, 5);
        sparseIntArray.put(R$id.iv_triangle, 6);
    }

    public ViewIncludeImageAddBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f15452i, f15453j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15455h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f15455h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15455h = 1L;
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

    public ViewIncludeImageAddBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[3], (ImageView) objArr[6]);
        this.f15455h = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f15454g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
