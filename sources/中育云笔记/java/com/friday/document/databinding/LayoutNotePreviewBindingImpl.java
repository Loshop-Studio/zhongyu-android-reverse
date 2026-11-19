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
public class LayoutNotePreviewBindingImpl extends LayoutNotePreviewBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f6576m = null;

    /* renamed from: n */
    public static final SparseIntArray f6577n;

    /* renamed from: k */
    public final ConstraintLayout f6578k;

    /* renamed from: l */
    public long f6579l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6577n = sparseIntArray;
        sparseIntArray.put(R$id.tv_note_name, 1);
        sparseIntArray.put(R$id.iv_full_screen, 2);
        sparseIntArray.put(R$id.iv_note_info, 3);
        sparseIntArray.put(R$id.refreshImage, 4);
        sparseIntArray.put(R$id.rv_note, 5);
        sparseIntArray.put(R$id.scrollView, 6);
        sparseIntArray.put(R$id.tv_content, 7);
        sparseIntArray.put(R$id.fab_edit, 8);
    }

    public LayoutNotePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f6576m, f6577n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6579l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6579l != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6579l = 1L;
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

    public LayoutNotePreviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FloatingActionButton) objArr[8], (ImageView) objArr[2], (ImageView) objArr[3], (SwipeRefreshLayout) objArr[4], (RecyclerView) objArr[5], (NestedScrollView) objArr[6], (TextView) objArr[7], (TextView) objArr[1]);
        this.f6579l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6578k = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
