package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$id;

/* loaded from: classes3.dex */
public class FragmentExerciseStatisticsSingleDetailBindingImpl extends FragmentExerciseStatisticsSingleDetailBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.tv_condition_tips, 1);
        sparseIntArray.put(R$id.linear_condition, 2);
        sparseIntArray.put(R$id.LinearLayout_finish_person, 3);
        sparseIntArray.put(R$id.tv_member_with_completed, 4);
        sparseIntArray.put(R$id.tv_avg_score, 5);
        sparseIntArray.put(R$id.tv_explain_tips, 6);
        sparseIntArray.put(R$id.view_right_content, 7);
        sparseIntArray.put(R$id.tv_correct_answer_legend, 8);
        sparseIntArray.put(R$id.view_wrong_content, 9);
        sparseIntArray.put(R$id.tv_wrong_answer_legend, 10);
        sparseIntArray.put(R$id.view_100, 11);
        sparseIntArray.put(R$id.view_80, 12);
        sparseIntArray.put(R$id.view_60, 13);
        sparseIntArray.put(R$id.view_40, 14);
        sparseIntArray.put(R$id.view_20, 15);
        sparseIntArray.put(R$id.view_0, 16);
        sparseIntArray.put(R$id.tv_100, 17);
        sparseIntArray.put(R$id.tv_80, 18);
        sparseIntArray.put(R$id.tv_60, 19);
        sparseIntArray.put(R$id.tv_40, 20);
        sparseIntArray.put(R$id.tv_20, 21);
        sparseIntArray.put(R$id.tv_0, 22);
        sparseIntArray.put(R$id.space_recycler_view_top, 23);
        sparseIntArray.put(R$id.space_recycler_view_bottom, 24);
        sparseIntArray.put(R$id.view_line, 25);
        sparseIntArray.put(R$id.recycler_view_chart, 26);
        sparseIntArray.put(R$id.linearLayout_detail_content, 27);
        sparseIntArray.put(R$id.tv_detail_title, 28);
        sparseIntArray.put(R$id.tv_detail_content, 29);
    }

    public FragmentExerciseStatisticsSingleDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        return true;
    }

    private FragmentExerciseStatisticsSingleDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[3], (LinearLayout) objArr[2], (LinearLayoutCompat) objArr[27], (RecyclerView) objArr[26], (Space) objArr[24], (Space) objArr[23], (TextView) objArr[22], (TextView) objArr[17], (TextView) objArr[21], (TextView) objArr[20], (TextView) objArr[19], (TextView) objArr[18], (TextView) objArr[5], (TextView) objArr[1], (TextView) objArr[8], (TextView) objArr[29], (TextView) objArr[28], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[10], (View) objArr[16], (View) objArr[11], (View) objArr[15], (View) objArr[14], (View) objArr[13], (View) objArr[12], (View) objArr[25], (View) objArr[7], (View) objArr[9]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
