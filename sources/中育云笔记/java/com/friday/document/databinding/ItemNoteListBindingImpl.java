package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ItemNoteListBindingImpl extends ItemNoteListBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f6491k = null;

    /* renamed from: l */
    public static final SparseIntArray f6492l;

    /* renamed from: j */
    public long f6493j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6492l = sparseIntArray;
        sparseIntArray.put(R$id.iv_check, 1);
        sparseIntArray.put(R$id.iv_icon, 2);
        sparseIntArray.put(R$id.tv_name, 3);
        sparseIntArray.put(R$id.tv_time, 4);
        sparseIntArray.put(R$id.iv_status, 5);
        sparseIntArray.put(R$id.iv_option, 6);
    }

    public ItemNoteListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f6491k, f6492l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6493j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6493j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6493j = 1L;
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

    public ItemNoteListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[1], (ImageView) objArr[2], (ImageView) objArr[6], (ImageView) objArr[5], (TextView) objArr[3], (TextView) objArr[4]);
        this.f6493j = -1L;
        this.f6484c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
