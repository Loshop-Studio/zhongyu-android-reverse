package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public class LayoutShareNotePreviewBindingImpl extends LayoutShareNotePreviewBinding {

    /* renamed from: n */
    public static final ViewDataBinding.IncludedLayouts f6601n = null;

    /* renamed from: o */
    public static final SparseIntArray f6602o;

    /* renamed from: l */
    public final ConstraintLayout f6603l;

    /* renamed from: m */
    public long f6604m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6602o = sparseIntArray;
        sparseIntArray.put(R$id.iv_read_only, 1);
        sparseIntArray.put(R$id.tv_note_name, 2);
        sparseIntArray.put(R$id.iv_full_screen, 3);
        sparseIntArray.put(R$id.iv_note_info, 4);
        sparseIntArray.put(R$id.refreshImage, 5);
        sparseIntArray.put(R$id.rv_note, 6);
        sparseIntArray.put(R$id.scrollView, 7);
        sparseIntArray.put(R$id.tv_content, 8);
        sparseIntArray.put(R$id.fab_edit, 9);
    }

    public LayoutShareNotePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f6601n, f6602o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6604m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6604m != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6604m = 1L;
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

    public LayoutShareNotePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FloatingActionButton) objArr[9], (ImageView) objArr[3], (ImageView) objArr[4], (ImageView) objArr[1], (SwipeRefreshLayout) objArr[5], (RecyclerView) objArr[6], (NestedScrollView) objArr[7], (TextView) objArr[8], (TextView) objArr[2]);
        this.f6604m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6603l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
