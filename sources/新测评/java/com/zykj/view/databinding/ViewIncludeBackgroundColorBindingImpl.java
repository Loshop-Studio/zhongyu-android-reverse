package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import com.zykj.view.widget.radio.WithSelectedRadioButton;
import p027b8.AbstractC5046c;

/* loaded from: classes5.dex */
public class ViewIncludeBackgroundColorBindingImpl extends ViewIncludeBackgroundColorBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f11445j = null;

    /* renamed from: k */
    public static final SparseIntArray f11446k;

    /* renamed from: h */
    public final LinearLayoutCompat f11447h;

    /* renamed from: i */
    public long f11448i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11446k = sparseIntArray;
        sparseIntArray.put(R$id.rg_background_color, 5);
        sparseIntArray.put(R$id.rb_background_interweave, 6);
        sparseIntArray.put(R$id.rb_background_line, 7);
    }

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f11445j, f11446k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f11448i;
            this.f11448i = 0L;
        }
        if ((j10 & 1) != 0) {
            AbstractC5046c.m2526b(this.f11438a, "#1A1A1A");
            AbstractC5046c.m2526b(this.f11439b, "#435772");
            AbstractC5046c.m2526b(this.f11440c, "#4C7068");
            AbstractC5046c.m2526b(this.f11443f, "#EEEEEE");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11448i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11448i = 1L;
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

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (NormalColorRadioButton) objArr[4], (WithSelectedRadioButton) objArr[6], (WithSelectedRadioButton) objArr[7], (NormalColorRadioButton) objArr[1], (RadioGroup) objArr[5]);
        this.f11448i = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11447h = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.f11438a.setTag("#1A1A1A");
        this.f11439b.setTag("#435772");
        this.f11440c.setTag("#4C7068");
        this.f11443f.setTag("#FFFFFF");
        setRootTag(view);
        invalidateAll();
    }
}
