package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class FragmentRecycleBinBindingImpl extends FragmentRecycleBinBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f6427m = null;

    /* renamed from: n */
    public static final SparseIntArray f6428n;

    /* renamed from: k */
    public final ConstraintLayout f6429k;

    /* renamed from: l */
    public long f6430l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6428n = sparseIntArray;
        sparseIntArray.put(R$id.ll_left, 1);
        sparseIntArray.put(R$id.iv_back, 2);
        sparseIntArray.put(R$id.tv_folder_name, 3);
        sparseIntArray.put(R$id.iv_clean, 4);
        sparseIntArray.put(R$id.refreshLayout, 5);
        sparseIntArray.put(R$id.recycler_view, 6);
        sparseIntArray.put(R$id.empty_view, 7);
        sparseIntArray.put(R$id.preview_container, 8);
    }

    public FragmentRecycleBinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f6427m, f6428n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6430l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6430l != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6430l = 1L;
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

    public FragmentRecycleBinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[7], (ImageView) objArr[2], (ImageView) objArr[4], (LinearLayoutCompat) objArr[1], (FrameLayout) objArr[8], (RecyclerView) objArr[6], (SwipeRefreshLayout) objArr[5], (TextView) objArr[3]);
        this.f6430l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6429k = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
