package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.course.CourseType;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemCourseStatusBindingImpl extends ItemCourseStatusBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final ImageView mboundView2;

    @NonNull
    private final ImageView mboundView4;

    @NonNull
    private final TextView mboundView5;

    @NonNull
    private final ImageView mboundView6;

    @NonNull
    private final TextView mboundView7;

    public ItemCourseStatusBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zIsPublic;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseBean courseBean = this.mEntity;
        long j11 = j10 & 3;
        CourseType status = null;
        if (j11 != 0) {
            if (courseBean != null) {
                status = courseBean.getStatus();
                zIsPublic = courseBean.isPublic();
            } else {
                zIsPublic = false;
            }
            z10 = status == CourseType.UNDERCARRIAGE;
            z = status == CourseType.GROUNDING;
            z11 = !zIsPublic;
        } else {
            zIsPublic = false;
            z10 = false;
            z11 = false;
        }
        if (j11 != 0) {
            AbstractC8354c.m13610m(this.courseStatus, status);
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(z));
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.mboundView4, Boolean.valueOf(zIsPublic));
            BindingAdaptersKt.visibleOrGone(this.mboundView5, Boolean.valueOf(zIsPublic));
            BindingAdaptersKt.visibleOrGone(this.mboundView6, Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.mboundView7, Boolean.valueOf(z11));
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

    @Override // com.zykj.study.databinding.ItemCourseStatusBinding
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
        if (15 != i10) {
            return false;
        }
        setEntity((CourseBean) obj);
        return true;
    }

    private ItemCourseStatusBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.courseStatus.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.mboundView2 = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[4];
        this.mboundView4 = imageView3;
        imageView3.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.mboundView5 = textView;
        textView.setTag(null);
        ImageView imageView4 = (ImageView) objArr[6];
        this.mboundView6 = imageView4;
        imageView4.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.mboundView7 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
