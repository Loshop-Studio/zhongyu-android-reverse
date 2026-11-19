package com.friday.main.databinding;

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
import com.friday.main.R$id;
import com.friday.main.viewmodel.HomeViewModel;
import p316r3.AbstractC10837a;

/* loaded from: classes4.dex */
public class SearchActivityBindingImpl extends SearchActivityBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f9236k = null;

    /* renamed from: l */
    public static final SparseIntArray f9237l;

    /* renamed from: i */
    public final LinearLayoutCompat f9238i;

    /* renamed from: j */
    public long f9239j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9237l = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 1);
        sparseIntArray.put(R$id.tv_back, 2);
        sparseIntArray.put(R$id.searchView, 3);
        sparseIntArray.put(R$id.rv_search, 4);
        sparseIntArray.put(R$id.tv_empty, 5);
    }

    public SearchActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f9236k, f9237l));
    }

    /* renamed from: a */
    public void m6946a(HomeViewModel homeViewModel) {
        this.f9235h = homeViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9239j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9239j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9239j = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC10837a.f26146b != i10) {
            return false;
        }
        m6946a((HomeViewModel) obj);
        return true;
    }

    public SearchActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[4], (SearchView) objArr[3], (Toolbar) objArr[1], (ImageView) objArr[2], (TextView) objArr[5]);
        this.f9239j = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f9238i = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
