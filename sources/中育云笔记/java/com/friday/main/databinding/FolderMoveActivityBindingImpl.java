package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class FolderMoveActivityBindingImpl extends FolderMoveActivityBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f9166k = null;

    /* renamed from: l */
    public static final SparseIntArray f9167l;

    /* renamed from: i */
    public final LinearLayoutCompat f9168i;

    /* renamed from: j */
    public long f9169j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9167l = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 1);
        sparseIntArray.put(R$id.iv_back, 2);
        sparseIntArray.put(R$id.tv_title, 3);
        sparseIntArray.put(R$id.tv_confirm, 4);
        sparseIntArray.put(R$id.rv_path_name, 5);
        sparseIntArray.put(R$id.rv_folder, 6);
    }

    public FolderMoveActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f9166k, f9167l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9169j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9169j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9169j = 1L;
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

    public FolderMoveActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (RecyclerView) objArr[6], (RecyclerView) objArr[5], (Toolbar) objArr[1], (TextView) objArr[4], (TextView) objArr[3]);
        this.f9169j = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f9168i = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
