package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes3.dex */
public class ItemFragmentShareByTeacherBindingImpl extends ItemFragmentShareByTeacherBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6472i = null;

    /* renamed from: j */
    public static final SparseIntArray f6473j;

    /* renamed from: g */
    public final ConstraintLayout f6474g;

    /* renamed from: h */
    public long f6475h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6473j = sparseIntArray;
        sparseIntArray.put(R$id.img_head, 1);
        sparseIntArray.put(R$id.linearlayout, 2);
        sparseIntArray.put(R$id.tv_tch_name, 3);
        sparseIntArray.put(R$id.tv_update_time, 4);
    }

    public ItemFragmentShareByTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f6472i, f6473j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6475h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6475h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6475h = 1L;
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

    public ItemFragmentShareByTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShapeableImageView) objArr[1], (LinearLayout) objArr[2], (TextView) objArr[3], (TextView) objArr[4]);
        this.f6475h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6474g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
