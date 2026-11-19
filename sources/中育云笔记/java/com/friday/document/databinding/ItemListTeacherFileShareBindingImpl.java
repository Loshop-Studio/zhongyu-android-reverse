package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ItemListTeacherFileShareBindingImpl extends ItemListTeacherFileShareBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6481i = null;

    /* renamed from: j */
    public static final SparseIntArray f6482j;

    /* renamed from: h */
    public long f6483h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6482j = sparseIntArray;
        sparseIntArray.put(R$id.iv_icon, 1);
        sparseIntArray.put(R$id.tv_name, 2);
        sparseIntArray.put(R$id.tv_time, 3);
        sparseIntArray.put(R$id.tv_username, 4);
    }

    public ItemListTeacherFileShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f6481i, f6482j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6483h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6483h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6483h = 1L;
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

    public ItemListTeacherFileShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4]);
        this.f6483h = -1L;
        this.f6476c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
