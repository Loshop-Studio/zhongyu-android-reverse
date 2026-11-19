package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class IncludeMistakeDetailEndBindingImpl extends IncludeMistakeDetailEndBinding {

    /* renamed from: l */
    public static final SparseIntArray f6161l;

    /* renamed from: k */
    public long f6162k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6161l = sparseIntArray;
        sparseIntArray.put(R.id.tv_title_right, 1);
        sparseIntArray.put(R.id.sl_tags_right, 2);
        sparseIntArray.put(R.id.tv_complex, 3);
        sparseIntArray.put(R.id.tv_facility, 4);
        sparseIntArray.put(R.id.tv_grasp, 5);
        sparseIntArray.put(R.id.tv_reason, 6);
        sparseIntArray.put(R.id.tv_custom_tag, 7);
        sparseIntArray.put(R.id.tv_custom_tag_tip, 8);
        sparseIntArray.put(R.id.flow_layout_complex, 9);
        sparseIntArray.put(R.id.flow_layout_facility, 10);
        sparseIntArray.put(R.id.flow_layout_reason, 11);
        sparseIntArray.put(R.id.flow_layout_grasp, 12);
        sparseIntArray.put(R.id.flow_layout_custom_tag, 13);
        sparseIntArray.put(R.id.guide_line_right, 14);
        sparseIntArray.put(R.id.btn_end_cancel, 15);
        sparseIntArray.put(R.id.btn_end_confirm, 16);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6162k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6162k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6162k = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean setVariable(int i, Object obj) {
        return true;
    }
}
