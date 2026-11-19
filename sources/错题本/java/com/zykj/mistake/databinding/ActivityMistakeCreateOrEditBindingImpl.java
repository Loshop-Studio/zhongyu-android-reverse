package com.zykj.mistake.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class ActivityMistakeCreateOrEditBindingImpl extends ActivityMistakeCreateOrEditBinding {

    /* renamed from: A */
    public static final ViewDataBinding.IncludedLayouts f6043A;

    /* renamed from: B */
    public static final SparseIntArray f6044B;

    /* renamed from: z */
    public long f6045z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(39);
        f6043A = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"include_mistake_detail_end"}, new int[]{1}, new int[]{R.layout.include_mistake_detail_end});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6044B = sparseIntArray;
        sparseIntArray.put(R.id.view, 2);
        sparseIntArray.put(R.id.ib_back, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.v_line, 5);
        sparseIntArray.put(R.id.scrollView2, 6);
        sparseIntArray.put(R.id.tv_star1, 7);
        sparseIntArray.put(R.id.tv_mistake_subject, 8);
        sparseIntArray.put(R.id.nice_spinner, 9);
        sparseIntArray.put(R.id.view_fixed_content_width_anchor, 10);
        sparseIntArray.put(R.id.tv_topic_diff_tip, 11);
        sparseIntArray.put(R.id.tv_star2, 12);
        sparseIntArray.put(R.id.tv_mistake_title, 13);
        sparseIntArray.put(R.id.et_mistake_title, 14);
        sparseIntArray.put(R.id.tv_star3, 15);
        sparseIntArray.put(R.id.tv_mistake_stem, 16);
        sparseIntArray.put(R.id.iv_first_stem_background, 17);
        sparseIntArray.put(R.id.iv_first_stem, 18);
        sparseIntArray.put(R.id.iv_first_stem_delete, 19);
        sparseIntArray.put(R.id.iv_second_stem_background, 20);
        sparseIntArray.put(R.id.iv_second_stem, 21);
        sparseIntArray.put(R.id.iv_second_stem_delete, 22);
        sparseIntArray.put(R.id.group_answer, 23);
        sparseIntArray.put(R.id.tv_mistake_answer, 24);
        sparseIntArray.put(R.id.iv_first_answer_background, 25);
        sparseIntArray.put(R.id.iv_first_answer, 26);
        sparseIntArray.put(R.id.iv_first_answer_delete, 27);
        sparseIntArray.put(R.id.iv_second_answer_background, 28);
        sparseIntArray.put(R.id.iv_second_answer, 29);
        sparseIntArray.put(R.id.iv_second_answer_delete, 30);
        sparseIntArray.put(R.id.group_photo_tip, 31);
        sparseIntArray.put(R.id.iv_image_tip, 32);
        sparseIntArray.put(R.id.tv_image_tip, 33);
        sparseIntArray.put(R.id.tv_mistake_tag, 34);
        sparseIntArray.put(R.id.flow_layout, 35);
        sparseIntArray.put(R.id.guide_line_mistake_create_main, 36);
        sparseIntArray.put(R.id.btn_main_cancel, 37);
        sparseIntArray.put(R.id.btn_main_confirm, 38);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void executeBindings() {
        synchronized (this) {
            this.f6045z = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6026i);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6045z != 0) {
                    return true;
                }
                return this.f6026i.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void invalidateAll() {
        synchronized (this) {
            this.f6045z = 2L;
        }
        this.f6026i.invalidateAll();
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
            this.f6045z |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6026i.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean setVariable(int i, Object obj) {
        return true;
    }
}
