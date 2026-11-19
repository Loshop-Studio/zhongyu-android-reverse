package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.ExerciseType;
import com.zykj.study.bean.teach.SuperviseGroupMember;

/* loaded from: classes3.dex */
public class ItemStudentAchievementBindingImpl extends ItemStudentAchievementBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    @NonNull
    private final TextView mboundView3;

    @NonNull
    private final TextView mboundView4;

    @NonNull
    private final TextView mboundView5;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.linearLayout3, 7);
        sparseIntArray.put(R$id.view8, 8);
    }

    public ItemStudentAchievementBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        String string;
        String str;
        int score;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        SuperviseGroupMember superviseGroupMember = this.mEntity;
        long j12 = j10 & 3;
        String str3 = null;
        if (j12 != 0) {
            if (superviseGroupMember != null) {
                String groupName = superviseGroupMember.getGroupName();
                String userName = superviseGroupMember.getUserName();
                ExerciseType status = superviseGroupMember.getStatus();
                score = superviseGroupMember.getScore();
                str2 = groupName;
                str3 = status;
                str = userName;
            } else {
                str2 = null;
                str = null;
                score = 0;
            }
            ExerciseType exerciseType = ExerciseType.COMPLETED;
            z11 = str3 == exerciseType;
            boolean z13 = str3 != exerciseType;
            StringBuilder sb = new StringBuilder();
            sb.append(score);
            j11 = 0;
            sb.append("%");
            string = sb.toString();
            if (j12 != 0) {
                j10 |= z11 ? 40L : 20L;
            }
            z10 = z13;
            str3 = str2;
        } else {
            j11 = 0;
            string = null;
            str = null;
            score = 0;
            z10 = false;
            z11 = false;
        }
        boolean z14 = (j10 & 8) != j11 && score >= 60;
        boolean z15 = (j10 & 32) != j11 && score < 60;
        long j13 = j10 & 3;
        if (j13 != j11) {
            if (!z11) {
                z14 = false;
            }
            z12 = z11 ? z15 : false;
            z = z14;
        } else {
            z12 = false;
        }
        if (j13 != j11) {
            BindingAdaptersKt.visibleOrGone(this.ivDetail, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.mboundView1, str3);
            TextViewBindingAdapter.setText(this.mboundView2, str);
            TextViewBindingAdapter.setText(this.mboundView3, string);
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.mboundView4, string);
            BindingAdaptersKt.visibleOrGone(this.mboundView4, Boolean.valueOf(z12));
            BindingAdaptersKt.visibleOrGone(this.mboundView5, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.ItemStudentAchievementBinding
    public void setEntity(@Nullable SuperviseGroupMember superviseGroupMember) {
        this.mEntity = superviseGroupMember;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((SuperviseGroupMember) obj);
        return true;
    }

    private ItemStudentAchievementBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[6], (LinearLayout) objArr[7], (View) objArr[8]);
        this.mDirtyFlags = -1L;
        this.ivDetail.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[5];
        this.mboundView5 = textView5;
        textView5.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
