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
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public class ItemCourseTitleBindingImpl extends ItemCourseTitleBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    public ItemCourseTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String strM12081m;
        int periodId;
        int subjectId;
        int gradeId;
        String strM12077i;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseBean courseBean = this.mEntity;
        DictViewModel dictViewModel = this.mDictViewModel;
        long j11 = 7 & j10;
        String title = null;
        if (j11 != 0) {
            if (courseBean != null) {
                periodId = courseBean.getPeriodId();
                subjectId = courseBean.getSubjectId();
                gradeId = courseBean.getGradeId();
            } else {
                periodId = 0;
                subjectId = 0;
                gradeId = 0;
            }
            if (dictViewModel != null) {
                strM12081m = dictViewModel.m12081m(subjectId);
                strM12077i = dictViewModel.m12077i(periodId, gradeId);
            } else {
                strM12077i = null;
                strM12081m = null;
            }
            z = !(strM12077i != null ? strM12077i.isEmpty() : false);
            if ((j10 & 5) != 0 && courseBean != null) {
                title = courseBean.getTitle();
            }
            str = title;
            title = strM12077i;
        } else {
            str = null;
            strM12081m = null;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.divider, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.grade, title);
            BindingAdaptersKt.visibleOrGone(this.grade, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.tvSubject, strM12081m);
        }
        if ((j10 & 5) != 0) {
            TextViewBindingAdapter.setText(this.title, str);
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

    @Override // com.zykj.study.databinding.ItemCourseTitleBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseTitleBinding
    public void setEntity(@Nullable CourseBean courseBean) {
        this.mEntity = courseBean;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((CourseBean) obj);
            return true;
        }
        if (11 != i10) {
            return false;
        }
        setDictViewModel((DictViewModel) obj);
        return true;
    }

    private ItemCourseTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[3], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.divider.setTag(null);
        this.grade.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        this.title.setTag(null);
        this.tvSubject.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
