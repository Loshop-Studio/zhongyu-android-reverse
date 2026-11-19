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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.StudyStatus;
import com.zykj.study.view.KnowledgeProgressView;

/* loaded from: classes3.dex */
public class ItemChapterProgressBindingImpl extends ItemChapterProgressBinding {

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
    private final TextView mboundView3;

    public ItemChapterProgressBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        CatalogBean data;
        String strValueOf;
        String str;
        boolean z10;
        boolean zIsSelectModel;
        boolean z11;
        boolean zIsLeaf;
        boolean z12;
        boolean z13;
        String title;
        int progress;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        SelectModel<CatalogBean> selectModel = this.mEntity;
        long j12 = j10 & 3;
        boolean z14 = false;
        if (j12 != 0) {
            if (selectModel != null) {
                zIsSelectModel = selectModel.isSelectModel();
                data = selectModel.getData();
            } else {
                data = null;
                zIsSelectModel = false;
            }
            z11 = !zIsSelectModel;
            if (data != null) {
                zIsLeaf = data.isLeaf();
                title = data.getTitle();
                progress = data.getProgress();
                j11 = 0;
            } else {
                j11 = 0;
                title = null;
                progress = 0;
                zIsLeaf = false;
            }
            if (j12 != 0) {
                j10 = zIsLeaf ? j10 | 40 : j10 | 20;
            }
            z10 = !zIsLeaf;
            strValueOf = String.valueOf(progress + "%");
            str = title;
        } else {
            j11 = 0;
            data = null;
            strValueOf = null;
            str = null;
            z10 = false;
            zIsSelectModel = false;
            z11 = false;
            zIsLeaf = false;
        }
        if ((40 & j10) != j11) {
            StudyStatus status = data != null ? data.getStatus() : null;
            z13 = true;
            z12 = (8 & j10) != j11 && status == StudyStatus.NOT_COMPLETE;
            if ((j10 & 32) == j11 || status != StudyStatus.COMPLETE) {
                z13 = false;
            }
        } else {
            z12 = false;
            z13 = false;
        }
        long j13 = j10 & 3;
        if (j13 != j11) {
            if (!zIsLeaf) {
                z12 = false;
            }
            if (zIsLeaf) {
                z14 = z13;
            }
        } else {
            z12 = false;
        }
        if (j13 != j11) {
            BindingAdaptersKt.visibleOrGone(this.ivProgressComplete, Boolean.valueOf(z14));
            BindingAdaptersKt.visibleOrGone(this.ivProgressNotComplete, Boolean.valueOf(z12));
            BindingAdaptersKt.visibleOrGone(this.knowView, Boolean.valueOf(zIsSelectModel));
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(zIsSelectModel));
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.mboundView3, str);
            TextViewBindingAdapter.setText(this.tvProgress, strValueOf);
            BindingAdaptersKt.visibleOrGone(this.tvProgress, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.ItemChapterProgressBinding
    public void setEntity(@Nullable SelectModel<CatalogBean> selectModel) {
        this.mEntity = selectModel;
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
        setEntity((SelectModel) obj);
        return true;
    }

    private ItemChapterProgressBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[5], (ImageView) objArr[6], (KnowledgeProgressView) objArr[7], (TextView) objArr[4]);
        this.mDirtyFlags = -1L;
        this.ivProgressComplete.setTag(null);
        this.ivProgressNotComplete.setTag(null);
        this.knowView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.mboundView2 = imageView2;
        imageView2.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        this.tvProgress.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
