package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class FragmentFileListBindingImpl extends FragmentFileListBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f6377h = null;

    /* renamed from: i */
    public static final SparseIntArray f6378i;

    /* renamed from: f */
    public final LinearLayoutCompat f6379f;

    /* renamed from: g */
    public long f6380g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6378i = sparseIntArray;
        sparseIntArray.put(R$id.refreshLayout, 1);
        sparseIntArray.put(R$id.recycler_view, 2);
        sparseIntArray.put(R$id.empty_view, 3);
    }

    public FragmentFileListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f6377h, f6378i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6380g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6380g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6380g = 1L;
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

    public FragmentFileListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (RecyclerView) objArr[2], (SwipeRefreshLayout) objArr[1]);
        this.f6380g = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6379f = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
