package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseDetailsBean;

/* loaded from: classes3.dex */
public class LayoutCourseDetailsCatalogBindingImpl extends LayoutCourseDetailsCatalogBinding {

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
        sparseIntArray.put(R$id.textView22, 3);
        sparseIntArray.put(R$id.multiple_status_view, 4);
        sparseIntArray.put(R$id.container, 5);
    }

    public LayoutCourseDetailsCatalogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseDetailsBean courseDetailsBean = this.mEntity;
        long j11 = j10 & 3;
        if (j11 != 0) {
            zIsLearning = courseDetailsBean != null ? courseDetailsBean.isLearning() : false;
            z10 = zIsLearning;
            zIsLearning = !zIsLearning;
        } else {
            z10 = false;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.recycle, Boolean.valueOf(zIsLearning));
            BindingAdaptersKt.visibleOrGone(this.recycleProgress, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.LayoutCourseDetailsCatalogBinding
    public void setEntity(@Nullable CourseDetailsBean courseDetailsBean) {
        this.mEntity = courseDetailsBean;
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
        setEntity((CourseDetailsBean) obj);
        return true;
    }

    private LayoutCourseDetailsCatalogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[5], (MultipleStatusView) objArr[4], (RecyclerView) objArr[1], (RecyclerView) objArr[2], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        this.recycle.setTag(null);
        this.recycleProgress.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
