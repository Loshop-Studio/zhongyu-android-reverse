package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class DialogSyncFileBindingImpl extends DialogSyncFileBinding {

    /* renamed from: q */
    public static final ViewDataBinding.IncludedLayouts f6354q = null;

    /* renamed from: r */
    public static final SparseIntArray f6355r;

    /* renamed from: o */
    public final ConstraintLayout f6356o;

    /* renamed from: p */
    public long f6357p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6355r = sparseIntArray;
        sparseIntArray.put(R$id.iv_close, 1);
        sparseIntArray.put(R$id.divider, 2);
        sparseIntArray.put(R$id.tv_sync_info, 3);
        sparseIntArray.put(R$id.tv_success_count, 4);
        sparseIntArray.put(R$id.tv_error_count, 5);
        sparseIntArray.put(R$id.tv_remain_count, 6);
        sparseIntArray.put(R$id.tv_sync_now, 7);
        sparseIntArray.put(R$id.header, 8);
        sparseIntArray.put(R$id.tv_filename, 9);
        sparseIntArray.put(R$id.tv_modify_time, 10);
        sparseIntArray.put(R$id.tv_status, 11);
        sparseIntArray.put(R$id.rv_List, 12);
    }

    public DialogSyncFileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f6354q, f6355r));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6357p = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6357p != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6357p = 1L;
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

    public DialogSyncFileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[2], (View) objArr[8], (ImageView) objArr[1], (RecyclerView) objArr[12], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[6], (TextView) objArr[11], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[7]);
        this.f6357p = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6356o = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
