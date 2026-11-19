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
import androidx.lifecycle.LifecycleOwner;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$layout;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemCourseTeachAddBindingImpl extends ItemCourseTeachAddBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final TextView mboundView2;

    @NonNull
    private final ImageView mboundView3;

    @NonNull
    private final LinearLayout mboundView4;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(4, new String[]{"item_course_title", "item_course_status"}, new int[]{5, 6}, new int[]{R$layout.item_course_title, R$layout.item_course_status});
        sViewsWithIds = null;
    }

    public ItemCourseTeachAddBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeItemCourseStatus(ItemCourseStatusBinding itemCourseStatusBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeItemCourseTitle(ItemCourseTitleBinding itemCourseTitleBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zIsSuperviser;
        String cover;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsSelected;
        View.OnClickListener onClickListener = this.mClickListener;
        MyCourseEntity myCourseEntity = this.mEntity;
        DictViewModel dictViewModel = this.mDictViewModel;
        long j11 = 68 & j10;
        long j12 = 72 & j10;
        long j13 = 80 & j10;
        if (j13 == 0 || myCourseEntity == null) {
            zIsSuperviser = false;
            cover = null;
        } else {
            zIsSuperviser = myCourseEntity.isSuperviser();
            cover = myCourseEntity.getCover();
        }
        long j14 = j10 & 96;
        if (j13 != 0) {
            this.itemCourseStatus.setEntity(myCourseEntity);
            this.itemCourseTitle.setEntity(myCourseEntity);
            BindingAdaptersKt.netUrl(this.ivCover, cover);
            AbstractC8354c.m13617t(this.mboundView2, Boolean.valueOf(zIsSuperviser));
        }
        if (j14 != 0) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j12 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if (j11 != 0) {
            AbstractC8354c.m13617t(this.mboundView3, Boolean.valueOf(z10));
        }
        ViewDataBinding.executeBindingsOn(this.itemCourseTitle);
        ViewDataBinding.executeBindingsOn(this.itemCourseStatus);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.itemCourseTitle.hasPendingBindings() || this.itemCourseStatus.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64L;
        }
        this.itemCourseTitle.invalidateAll();
        this.itemCourseStatus.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeItemCourseStatus((ItemCourseStatusBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeItemCourseTitle((ItemCourseTitleBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.ItemCourseTeachAddBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseTeachAddBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseTeachAddBinding
    public void setEntity(@Nullable MyCourseEntity myCourseEntity) {
        this.mEntity = myCourseEntity;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseTeachAddBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.itemCourseTitle.setLifecycleOwner(lifecycleOwner);
        this.itemCourseStatus.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected(((Boolean) obj).booleanValue());
            return true;
        }
        if (5 == i10) {
            setClickListener((View.OnClickListener) obj);
            return true;
        }
        if (15 == i10) {
            setEntity((MyCourseEntity) obj);
            return true;
        }
        if (11 != i10) {
            return false;
        }
        setDictViewModel((DictViewModel) obj);
        return true;
    }

    private ItemCourseTeachAddBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ItemCourseStatusBinding) objArr[6], (ItemCourseTitleBinding) objArr[5], (ImageView) objArr[1]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.itemCourseStatus);
        setContainedBinding(this.itemCourseTitle);
        this.ivCover.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.mboundView2 = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.mboundView3 = imageView;
        imageView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.mboundView4 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
