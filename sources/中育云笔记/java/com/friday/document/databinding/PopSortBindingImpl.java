package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class PopSortBindingImpl extends PopSortBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f6608h = null;

    /* renamed from: i */
    public static final SparseIntArray f6609i;

    /* renamed from: f */
    public final CardView f6610f;

    /* renamed from: g */
    public long f6611g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6609i = sparseIntArray;
        sparseIntArray.put(R$id.rg_order, 1);
        sparseIntArray.put(R$id.rb_modify_time, 2);
        sparseIntArray.put(R$id.rb_name, 3);
    }

    public PopSortBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f6608h, f6609i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6611g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6611g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6611g = 1L;
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

    public PopSortBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RadioButton) objArr[2], (RadioButton) objArr[3], (RadioGroup) objArr[1]);
        this.f6611g = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f6610f = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
