package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentDetailTabBindingImpl extends DialogueFragmentDetailTabBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f10454e = null;

    /* renamed from: f */
    public static final SparseIntArray f10455f;

    /* renamed from: c */
    public final FrameLayout f10456c;

    /* renamed from: d */
    public long f10457d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10455f = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 1);
        sparseIntArray.put(R.id.tv_empty, 2);
    }

    public DialogueFragmentDetailTabBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f10454e, f10455f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10457d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10457d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10457d = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueFragmentDetailTabBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1], (TextView) objArr[2]);
        this.f10457d = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f10456c = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
