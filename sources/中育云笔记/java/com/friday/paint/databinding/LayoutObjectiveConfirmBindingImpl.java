package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.paint.R$id;

/* loaded from: classes4.dex */
public class LayoutObjectiveConfirmBindingImpl extends LayoutObjectiveConfirmBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f9822g = null;

    /* renamed from: h */
    public static final SparseIntArray f9823h;

    /* renamed from: e */
    public final LinearLayout f9824e;

    /* renamed from: f */
    public long f9825f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9823h = sparseIntArray;
        sparseIntArray.put(R$id.cv_cancel, 1);
        sparseIntArray.put(R$id.cv_confirm_submit, 2);
    }

    public LayoutObjectiveConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f9822g, f9823h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9825f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9825f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9825f = 1L;
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

    public LayoutObjectiveConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (CardView) objArr[2]);
        this.f9825f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f9824e = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
