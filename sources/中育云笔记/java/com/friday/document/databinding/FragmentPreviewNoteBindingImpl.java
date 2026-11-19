package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class FragmentPreviewNoteBindingImpl extends FragmentPreviewNoteBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6394g = null;

    /* renamed from: h */
    public static final SparseIntArray f6395h;

    /* renamed from: e */
    public final FrameLayout f6396e;

    /* renamed from: f */
    public long f6397f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6395h = sparseIntArray;
        sparseIntArray.put(R$id.refreshImage, 1);
        sparseIntArray.put(R$id.rv_note, 2);
    }

    public FragmentPreviewNoteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6394g, f6395h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6397f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6397f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6397f = 1L;
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

    public FragmentPreviewNoteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SwipeRefreshLayout) objArr[1], (RecyclerView) objArr[2]);
        this.f6397f = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6396e = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
