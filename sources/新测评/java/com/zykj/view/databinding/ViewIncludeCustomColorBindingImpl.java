package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.customColor.CustomColorLayout;
import com.zykj.view.widget.customColor.LatestColorLayout;

/* loaded from: classes5.dex */
public class ViewIncludeCustomColorBindingImpl extends ViewIncludeCustomColorBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f11452f = null;

    /* renamed from: g */
    public static final SparseIntArray f11453g;

    /* renamed from: d */
    public final LinearLayoutCompat f11454d;

    /* renamed from: e */
    public long f11455e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11453g = sparseIntArray;
        sparseIntArray.put(R$id.customColor, 1);
        sparseIntArray.put(R$id.tvLatest, 2);
        sparseIntArray.put(R$id.latestColor, 3);
    }

    public ViewIncludeCustomColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f11452f, f11453g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11455e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11455e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11455e = 1L;
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

    public ViewIncludeCustomColorBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomColorLayout) objArr[1], (LatestColorLayout) objArr[3], (TextView) objArr[2]);
        this.f11455e = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11454d = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
