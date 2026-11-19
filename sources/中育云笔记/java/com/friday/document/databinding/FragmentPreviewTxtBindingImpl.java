package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class FragmentPreviewTxtBindingImpl extends FragmentPreviewTxtBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6410g = null;

    /* renamed from: h */
    public static final SparseIntArray f6411h;

    /* renamed from: e */
    public final LinearLayoutCompat f6412e;

    /* renamed from: f */
    public long f6413f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6411h = sparseIntArray;
        sparseIntArray.put(R$id.scrollView, 1);
        sparseIntArray.put(R$id.tv_content, 2);
    }

    public FragmentPreviewTxtBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6410g, f6411h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6413f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6413f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6413f = 1L;
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

    public FragmentPreviewTxtBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NestedScrollView) objArr[1], (TextView) objArr[2]);
        this.f6413f = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6412e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
