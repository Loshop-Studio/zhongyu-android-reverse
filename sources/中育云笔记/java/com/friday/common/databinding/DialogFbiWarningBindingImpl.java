package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class DialogFbiWarningBindingImpl extends DialogFbiWarningBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f5948f = null;

    /* renamed from: g */
    public static final SparseIntArray f5949g;

    /* renamed from: d */
    public final CardView f5950d;

    /* renamed from: e */
    public long f5951e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5949g = sparseIntArray;
        sparseIntArray.put(R$id.cv_got_it, 1);
    }

    public DialogFbiWarningBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f5948f, f5949g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5951e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5951e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5951e = 1L;
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

    public DialogFbiWarningBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1]);
        this.f5951e = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5950d = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
