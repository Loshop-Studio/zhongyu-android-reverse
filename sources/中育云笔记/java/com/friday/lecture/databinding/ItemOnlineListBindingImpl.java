package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class ItemOnlineListBindingImpl extends ItemOnlineListBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f8519i = null;

    /* renamed from: j */
    public static final SparseIntArray f8520j;

    /* renamed from: h */
    public long f8521h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8520j = sparseIntArray;
        sparseIntArray.put(R$id.iv_role, 1);
        sparseIntArray.put(R$id.tv_name, 2);
        sparseIntArray.put(R$id.random_selected, 3);
        sparseIntArray.put(R$id.iv_flag_in_demo, 4);
    }

    public ItemOnlineListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f8519i, f8520j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8521h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8521h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8521h = 1L;
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

    public ItemOnlineListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[4], (ImageView) objArr[1], (View) objArr[3], (TextView) objArr[2]);
        this.f8521h = -1L;
        this.f8514c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
