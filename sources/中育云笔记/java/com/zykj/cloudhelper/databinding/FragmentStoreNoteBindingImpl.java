package com.zykj.cloudhelper.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.cloudhelper.R$id;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes6.dex */
public class FragmentStoreNoteBindingImpl extends FragmentStoreNoteBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f19485r = null;

    /* renamed from: s */
    public static final SparseIntArray f19486s;

    /* renamed from: p */
    public final LinearLayout f19487p;

    /* renamed from: q */
    public long f19488q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19486s = sparseIntArray;
        sparseIntArray.put(R$id.tv_cancel, 1);
        sparseIntArray.put(R$id.tv_center, 2);
        sparseIntArray.put(R$id.ll_create, 3);
        sparseIntArray.put(R$id.tv_create_folder, 4);
        sparseIntArray.put(R$id.tv_ensure, 5);
        sparseIntArray.put(R$id.tv_next, 6);
        sparseIntArray.put(R$id.ll_before, 7);
        sparseIntArray.put(R$id.frameLayout, 8);
        sparseIntArray.put(R$id.et_file_name, 9);
        sparseIntArray.put(R$id.iv_clear, 10);
        sparseIntArray.put(R$id.ll_file_tip, 11);
        sparseIntArray.put(R$id.hs_after, 12);
        sparseIntArray.put(R$id.rv_file, 13);
    }

    public FragmentStoreNoteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f19485r, f19486s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f19488q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f19488q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19488q = 1L;
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

    public FragmentStoreNoteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LimitEditText) objArr[9], (FrameLayout) objArr[8], (HorizontalScrollView) objArr[12], (ImageView) objArr[10], (ConstraintLayout) objArr[7], (LinearLayout) objArr[3], (LinearLayout) objArr[11], (RecyclerView) objArr[13], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[6]);
        this.f19488q = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f19487p = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
