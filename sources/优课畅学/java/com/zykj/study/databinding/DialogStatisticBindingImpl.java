package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.GroupStatistic;

/* loaded from: classes3.dex */
public class DialogStatisticBindingImpl extends DialogStatisticBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.imageView18, 5);
        sparseIntArray.put(R$id.textView38, 6);
        sparseIntArray.put(R$id.guideline3, 7);
        sparseIntArray.put(R$id.textView41, 8);
        sparseIntArray.put(R$id.recycler, 9);
    }

    public DialogStatisticBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        long j11;
        long j12;
        String str2;
        String string;
        String title;
        double avg;
        int completed;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        GroupStatistic groupStatistic = this.mEntity;
        ExerciseBean exerciseBean = this.mExerciseBean;
        if ((j10 & 5) != 0) {
            str = "/" + (groupStatistic != null ? groupStatistic.getMembers() : 0L);
        } else {
            str = null;
        }
        long j13 = j10 & 6;
        if (j13 != 0) {
            if (exerciseBean != null) {
                title = exerciseBean.getTitle();
                completed = exerciseBean.getCompleted();
                j11 = 0;
                avg = exerciseBean.getAvg();
            } else {
                j11 = 0;
                avg = 0.0d;
                title = null;
                completed = 0;
            }
            z = title == null;
            StringBuilder sb = new StringBuilder();
            j12 = 5;
            sb.append("");
            sb.append(completed);
            string = sb.toString();
            String str3 = "" + avg;
            if (j13 != 0) {
                j10 |= z ? 16L : 8L;
            }
            str2 = str3 + "%";
        } else {
            j11 = 0;
            j12 = 5;
            str2 = null;
            string = null;
            title = null;
        }
        long j14 = j10 & 6;
        String str4 = j14 != j11 ? z ? "" : title : null;
        if (j14 != j11) {
            TextViewBindingAdapter.setText(this.textView36, str4);
            TextViewBindingAdapter.setText(this.textView39, str2);
            TextViewBindingAdapter.setText(this.textView40, string);
        }
        if ((j10 & j12) != j11) {
            TextViewBindingAdapter.setText(this.textView37, str);
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.DialogStatisticBinding
    public void setEntity(@Nullable GroupStatistic groupStatistic) {
        this.mEntity = groupStatistic;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.DialogStatisticBinding
    public void setExerciseBean(@Nullable ExerciseBean exerciseBean) {
        this.mExerciseBean = exerciseBean;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((GroupStatistic) obj);
            return true;
        }
        if (18 != i10) {
            return false;
        }
        setExerciseBean((ExerciseBean) obj);
        return true;
    }

    private DialogStatisticBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (Guideline) objArr[7], (ImageView) objArr[5], (RecyclerView) objArr[9], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[8]);
        this.mDirtyFlags = -1L;
        this.dialogStatistic.setTag(null);
        this.textView36.setTag(null);
        this.textView37.setTag(null);
        this.textView39.setTag(null);
        this.textView40.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
