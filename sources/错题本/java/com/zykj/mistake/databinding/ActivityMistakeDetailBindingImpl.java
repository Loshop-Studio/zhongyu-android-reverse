package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ActivityMistakeDetailBindingImpl extends ActivityMistakeDetailBinding {

    /* renamed from: s */
    public static final ViewDataBinding.IncludedLayouts f6063s;

    /* renamed from: t */
    public static final SparseIntArray f6064t;

    /* renamed from: r */
    public long f6065r;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(24);
        f6063s = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"include_mistake_detail_end"}, new int[]{1}, new int[]{R.layout.include_mistake_detail_end});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6064t = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.iv_more, 4);
        sparseIntArray.put(R.id.ll_left, 5);
        sparseIntArray.put(R.id.rl_left_bar, 6);
        sparseIntArray.put(R.id.flow_layout_tag, 7);
        sparseIntArray.put(R.id.iv_edit_tag, 8);
        sparseIntArray.put(R.id.sv_image, 9);
        sparseIntArray.put(R.id.ll_image_content, 10);
        sparseIntArray.put(R.id.wv_web, 11);
        sparseIntArray.put(R.id.ll_right, 12);
        sparseIntArray.put(R.id.ll_content, 13);
        sparseIntArray.put(R.id.tab_layout, 14);
        sparseIntArray.put(R.id.view_pager, 15);
        sparseIntArray.put(R.id.rl_cover, 16);
        sparseIntArray.put(R.id.iv_practice, 17);
        sparseIntArray.put(R.id.tv_show_answer, 18);
        sparseIntArray.put(R.id.tv_practice_tip, 19);
        sparseIntArray.put(R.id.v_line, 20);
        sparseIntArray.put(R.id.ll_switch, 21);
        sparseIntArray.put(R.id.tv_last, 22);
        sparseIntArray.put(R.id.tv_next, 23);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6065r = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6048c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6065r != 0) {
                    return true;
                }
                return this.f6048c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6065r = 2L;
        }
        this.f6048c.invalidateAll();
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
            this.f6065r |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6048c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean setVariable(int i, Object obj) {
        return true;
    }
}
