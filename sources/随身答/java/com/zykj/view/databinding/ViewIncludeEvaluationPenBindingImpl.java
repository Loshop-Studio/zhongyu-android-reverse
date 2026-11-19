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
public class ViewIncludeEvaluationPenBindingImpl extends ViewIncludeEvaluationPenBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f12712g = null;

    /* renamed from: h */
    public static final SparseIntArray f12713h;

    /* renamed from: e */
    public final LinearLayoutCompat f12714e;

    /* renamed from: f */
    public long f12715f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12713h = sparseIntArray;
        sparseIntArray.put(R$id.rg_pen_color, 4);
    }

    public ViewIncludeEvaluationPenBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f12712g, f12713h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j9;
        synchronized (this) {
            j9 = this.f12715f;
            this.f12715f = 0L;
        }
        if ((j9 & 1) != 0) {
            AbstractC9026c.m14389b(this.f12708a, "#000000");
            AbstractC9026c.m14389b(this.f12709b, "#007DFE");
            AbstractC9026c.m14389b(this.f12710c, "#FE3720");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12715f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12715f = 1L;
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

    public ViewIncludeEvaluationPenBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[1], (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (RadioGroup) objArr[4]);
        this.f12715f = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f12714e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.f12708a.setTag("#000000");
        this.f12709b.setTag("#007DFE");
        this.f12710c.setTag("#FE3720");
        setRootTag(view);
        invalidateAll();
    }
}
