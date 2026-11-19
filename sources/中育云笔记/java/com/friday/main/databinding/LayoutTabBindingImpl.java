package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class LayoutTabBindingImpl extends LayoutTabBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f9206j = null;

    /* renamed from: k */
    public static final SparseIntArray f9207k;

    /* renamed from: h */
    public final ConstraintLayout f9208h;

    /* renamed from: i */
    public long f9209i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9207k = sparseIntArray;
        sparseIntArray.put(R$id.iv_me, 1);
        sparseIntArray.put(R$id.rv_tab, 2);
        sparseIntArray.put(R$id.cv_create, 3);
        sparseIntArray.put(R$id.iv_create, 4);
        sparseIntArray.put(R$id.cv_db, 5);
    }

    public LayoutTabBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f9206j, f9207k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9209i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9209i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9209i = 1L;
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

    public LayoutTabBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[3], (CardView) objArr[5], (ImageView) objArr[4], (ImageView) objArr[1], (RecyclerView) objArr[2]);
        this.f9209i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9208h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
