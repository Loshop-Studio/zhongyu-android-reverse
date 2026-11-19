package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewItemSketchRecordBindingImpl extends ViewItemSketchRecordBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f20724f = null;

    /* renamed from: g */
    public static final SparseIntArray f20725g;

    /* renamed from: d */
    public final LinearLayout f20726d;

    /* renamed from: e */
    public long f20727e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20725g = sparseIntArray;
        sparseIntArray.put(R$id.tv_commit, 1);
    }

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f20724f, f20725g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20727e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20727e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20727e = 1L;
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

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f20727e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20726d = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
