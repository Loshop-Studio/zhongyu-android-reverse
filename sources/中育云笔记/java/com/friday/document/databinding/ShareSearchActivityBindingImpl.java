package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ShareSearchActivityBindingImpl extends ShareSearchActivityBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f6637j = null;

    /* renamed from: k */
    public static final SparseIntArray f6638k;

    /* renamed from: h */
    public final LinearLayoutCompat f6639h;

    /* renamed from: i */
    public long f6640i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6638k = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 1);
        sparseIntArray.put(R$id.tv_back, 2);
        sparseIntArray.put(R$id.searchView, 3);
        sparseIntArray.put(R$id.rv_search, 4);
        sparseIntArray.put(R$id.tv_empty, 5);
    }

    public ShareSearchActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f6637j, f6638k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6640i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6640i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6640i = 1L;
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

    public ShareSearchActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[4], (SearchView) objArr[3], (Toolbar) objArr[1], (ImageView) objArr[2], (TextView) objArr[5]);
        this.f6640i = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6639h = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
