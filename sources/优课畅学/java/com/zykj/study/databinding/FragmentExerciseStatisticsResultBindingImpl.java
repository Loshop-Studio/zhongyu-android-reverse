package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$color;
import com.zykj.study.R$id;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.view.MultipleStatusView;

/* loaded from: classes3.dex */
public class FragmentExerciseStatisticsResultBindingImpl extends FragmentExerciseStatisticsResultBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.linearLayout2, 3);
        sparseIntArray.put(R$id.multiple_status_view, 4);
        sparseIntArray.put(R$id.recycler, 5);
    }

    public FragmentExerciseStatisticsResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        int members;
        int avg;
        int completed;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        SuperviseGroup superviseGroup = this.mGroup;
        long j11 = j10 & 3;
        if (j11 != 0) {
            if (superviseGroup != null) {
                avg = superviseGroup.getAvg();
                completed = superviseGroup.getCompleted();
                members = superviseGroup.getMembers();
            } else {
                members = 0;
                avg = 0;
                completed = 0;
            }
            colorFromResource = avg >= 60 ? 1 : 0;
            String strValueOf = String.valueOf(avg);
            String str3 = completed + "/";
            if (j11 != 0) {
                j10 |= colorFromResource != 0 ? 8L : 4L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.tvAvgScore, colorFromResource != 0 ? R$color.auxiliaryGreen : R$color.warn);
            str = strValueOf + " %";
            str2 = str3 + members;
        } else {
            str = null;
            str2 = null;
        }
        if ((j10 & 3) != 0) {
            TextViewBindingAdapter.setText(this.tvAvgScore, str);
            this.tvAvgScore.setTextColor(colorFromResource);
            TextViewBindingAdapter.setText(this.tvMemberWithCompleted, str2);
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.FragmentExerciseStatisticsResultBinding
    public void setGroup(@Nullable SuperviseGroup superviseGroup) {
        this.mGroup = superviseGroup;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (21 != i10) {
            return false;
        }
        setGroup((SuperviseGroup) obj);
        return true;
    }

    private FragmentExerciseStatisticsResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[3], (MultipleStatusView) objArr[4], (RecyclerView) objArr[5], (TextView) objArr[2], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        this.tvAvgScore.setTag(null);
        this.tvMemberWithCompleted.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
