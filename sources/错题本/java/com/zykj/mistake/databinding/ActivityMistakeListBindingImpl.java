package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ActivityMistakeListBindingImpl extends ActivityMistakeListBinding {

    /* renamed from: t */
    public static final ViewDataBinding.IncludedLayouts f6084t;

    /* renamed from: u */
    public static final SparseIntArray f6085u;

    /* renamed from: s */
    public long f6086s;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        f6084t = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"include_mistake_detail_end"}, new int[]{1}, new int[]{R.layout.include_mistake_detail_end});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6085u = sparseIntArray;
        sparseIntArray.put(R.id.rl_title, 2);
        sparseIntArray.put(R.id.iv_back, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_filter, 5);
        sparseIntArray.put(R.id.tv_manage, 6);
        sparseIntArray.put(R.id.tv_practice, 7);
        sparseIntArray.put(R.id.ll_buttons, 8);
        sparseIntArray.put(R.id.ll_batch_delete, 9);
        sparseIntArray.put(R.id.iv_batch_delete, 10);
        sparseIntArray.put(R.id.tv_batch_delete, 11);
        sparseIntArray.put(R.id.ll_batch_tag, 12);
        sparseIntArray.put(R.id.iv_batch_tag, 13);
        sparseIntArray.put(R.id.tv_batch_tag, 14);
        sparseIntArray.put(R.id.ll_cancel, 15);
        sparseIntArray.put(R.id.swipe_refresh, 16);
        sparseIntArray.put(R.id.recycler_view, 17);
        sparseIntArray.put(R.id.ll_empty, 18);
        sparseIntArray.put(R.id.tv_empty, 19);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6086s = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6067b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6086s != 0) {
                    return true;
                }
                return this.f6067b.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6086s = 2L;
        }
        this.f6067b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean onFieldChange(int i, Object obj, int i8) {
        if (i != 0) {
            return false;
        }
        if (i8 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6086s |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6067b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean setVariable(int i, Object obj) {
        return true;
    }
}
