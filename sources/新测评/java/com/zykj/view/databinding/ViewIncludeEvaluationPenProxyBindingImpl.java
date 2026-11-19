package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import p027b8.AbstractC5046c;

/* loaded from: classes5.dex */
public class ViewIncludeEvaluationPenProxyBindingImpl extends ViewIncludeEvaluationPenProxyBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f11476g = null;

    /* renamed from: h */
    public static final SparseIntArray f11477h;

    /* renamed from: e */
    public final LinearLayoutCompat f11478e;

    /* renamed from: f */
    public long f11479f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11477h = sparseIntArray;
        sparseIntArray.put(R$id.rg_pen_color_proxy, 4);
    }

    public ViewIncludeEvaluationPenProxyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f11476g, f11477h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f11479f;
            this.f11479f = 0L;
        }
        if ((j10 & 1) != 0) {
            AbstractC5046c.m2526b(this.f11472a, "#000000");
            AbstractC5046c.m2526b(this.f11473b, "#007DFE");
            AbstractC5046c.m2526b(this.f11474c, "#FE3720");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11479f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11479f = 1L;
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

    public ViewIncludeEvaluationPenProxyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[1], (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (RadioGroup) objArr[4]);
        this.f11479f = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11478e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.f11472a.setTag("#000000");
        this.f11473b.setTag("#007DFE");
        this.f11474c.setTag("#FE3720");
        setRootTag(view);
        invalidateAll();
    }
}
