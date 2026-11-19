package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import p181m7.AbstractC9026c;

/* loaded from: classes5.dex */
public class ViewIncludeEvaluationPenProxyBindingImpl extends ViewIncludeEvaluationPenProxyBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f12720g = null;

    /* renamed from: h */
    public static final SparseIntArray f12721h;

    /* renamed from: e */
    public final LinearLayoutCompat f12722e;

    /* renamed from: f */
    public long f12723f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12721h = sparseIntArray;
        sparseIntArray.put(R$id.rg_pen_color_proxy, 4);
    }

    public ViewIncludeEvaluationPenProxyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f12720g, f12721h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j9;
        synchronized (this) {
            j9 = this.f12723f;
            this.f12723f = 0L;
        }
        if ((j9 & 1) != 0) {
            AbstractC9026c.m14389b(this.f12716a, "#000000");
            AbstractC9026c.m14389b(this.f12717b, "#007DFE");
            AbstractC9026c.m14389b(this.f12718c, "#FE3720");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12723f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12723f = 1L;
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

    public ViewIncludeEvaluationPenProxyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[1], (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (RadioGroup) objArr[4]);
        this.f12723f = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f12722e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.f12716a.setTag("#000000");
        this.f12717b.setTag("#007DFE");
        this.f12718c.setTag("#FE3720");
        setRootTag(view);
        invalidateAll();
    }
}
