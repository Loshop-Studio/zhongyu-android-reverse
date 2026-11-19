package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewIncludeBackgroundColorBindingImpl extends ViewIncludeBackgroundColorBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f15434j = null;

    /* renamed from: k */
    public static final SparseIntArray f15435k;

    /* renamed from: h */
    public final LinearLayoutCompat f15436h;

    /* renamed from: i */
    public long f15437i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15435k = sparseIntArray;
        sparseIntArray.put(R$id.rg_background_color, 1);
        sparseIntArray.put(R$id.rb_background_white, 2);
        sparseIntArray.put(R$id.rb_background_black, 3);
        sparseIntArray.put(R$id.rb_background_blue, 4);
        sparseIntArray.put(R$id.rb_background_green, 5);
        sparseIntArray.put(R$id.rb_background_interweave, 6);
        sparseIntArray.put(R$id.rb_background_line, 7);
    }

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f15434j, f15435k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15437i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f15437i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15437i = 1L;
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
        this.f15437i = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f15436h = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
