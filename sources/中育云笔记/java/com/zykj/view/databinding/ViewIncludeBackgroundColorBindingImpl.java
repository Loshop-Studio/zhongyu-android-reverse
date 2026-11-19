package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewIncludeBackgroundColorBindingImpl extends ViewIncludeBackgroundColorBinding {

    /* renamed from: l */
    public static final ViewDataBinding.IncludedLayouts f20645l = null;

    /* renamed from: m */
    public static final SparseIntArray f20646m;

    /* renamed from: j */
    public final LinearLayoutCompat f20647j;

    /* renamed from: k */
    public long f20648k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20646m = sparseIntArray;
        sparseIntArray.put(R$id.rg_background_color, 1);
        sparseIntArray.put(R$id.rb_background_white, 2);
        sparseIntArray.put(R$id.rb_background_black, 3);
        sparseIntArray.put(R$id.rb_background_blue, 4);
        sparseIntArray.put(R$id.rb_background_green, 5);
        sparseIntArray.put(R$id.rb_background_interweave, 6);
        sparseIntArray.put(R$id.rb_background_line, 7);
    }

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f20645l, f20646m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20648k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20648k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20648k = 1L;
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
        super(dataBindingComponent, view, 0, (RadioButton) objArr[3], (RadioButton) objArr[4], (RadioButton) objArr[5], (RadioButton) objArr[6], (RadioButton) objArr[7], (RadioButton) objArr[2], (RadioGroup) objArr[1]);
        this.f20648k = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f20647j = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
