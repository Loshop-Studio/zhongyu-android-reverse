package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.main.R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes4.dex */
public class FullScreenActivityBindingImpl extends FullScreenActivityBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f9182p = null;

    /* renamed from: q */
    public static final SparseIntArray f9183q;

    /* renamed from: o */
    public long f9184o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9183q = sparseIntArray;
        sparseIntArray.put(R$id.iv_finish, 1);
        sparseIntArray.put(R$id.tv_note_name, 2);
        sparseIntArray.put(R$id.iv_cancel_full_screen, 3);
        sparseIntArray.put(R$id.iv_note_rename, 4);
        sparseIntArray.put(R$id.iv_note_label, 5);
        sparseIntArray.put(R$id.iv_note_info, 6);
        sparseIntArray.put(R$id.rv_label, 7);
        sparseIntArray.put(R$id.refreshImage, 8);
        sparseIntArray.put(R$id.rv_note, 9);
        sparseIntArray.put(R$id.iv_ppt, 10);
        sparseIntArray.put(R$id.fab_edit, 11);
    }

    public FullScreenActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f9182p, f9183q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9184o = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9184o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9184o = 1L;
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

    public FullScreenActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (FloatingActionButton) objArr[11], (ImageView) objArr[3], (ImageView) objArr[1], (ImageView) objArr[6], (ImageView) objArr[5], (ImageView) objArr[4], (ImageView) objArr[10], (SwipeRefreshLayout) objArr[8], (RecyclerView) objArr[7], (RecyclerView) objArr[9], (TextView) objArr[2]);
        this.f9184o = -1L;
        this.f9170c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
