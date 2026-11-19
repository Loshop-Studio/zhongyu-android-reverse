package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.Converters;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.image.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.viewmodels.DictViewModel;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemStudyBindingImpl extends ItemStudyBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    @NonNull
    private final RelativeLayout mboundView2;

    @NonNull
    private final RelativeLayout mboundView5;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(2, new String[]{"item_course_title"}, new int[]{7}, new int[]{R$layout.item_course_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.container, 8);
    }

    public ItemStudyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    private boolean onChangeItemCourseTitle(ItemCourseTitleBinding itemCourseTitleBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        int colorFromResource;
        long j11;
        long j12;
        long j13;
        int colorFromResource2;
        CourseType courseType;
        String string;
        String str;
        int i10;
        String cover;
        RelativeLayout relativeLayout;
        int i11;
        RelativeLayout relativeLayout2;
        int i12;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsSelected;
        CourseStudyEntity courseStudyEntity = this.mEntity;
        DictViewModel dictViewModel = this.mDictViewModel;
        View.OnClickListener onClickListener = this.mClickListener;
        long j14 = j10 & 34;
        if (j14 != 0) {
            if (j14 != 0) {
                j10 |= z10 ? 512L : 256L;
            }
            if (z10) {
                relativeLayout2 = this.mboundView0;
                i12 = R$color.bg_card;
            } else {
                relativeLayout2 = this.mboundView0;
                i12 = R$color.white;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(relativeLayout2, i12);
        } else {
            colorFromResource = 0;
        }
        long j15 = j10 & 36;
        String userName = null;
        if (j15 != 0) {
            if (courseStudyEntity != null) {
                userName = courseStudyEntity.getUserName();
                CourseType status = courseStudyEntity.getStatus();
                int progress = courseStudyEntity.getProgress();
                cover = courseStudyEntity.getCover();
                courseType = status;
                i10 = progress;
                j11 = 0;
            } else {
                j11 = 0;
                i10 = 0;
                courseType = null;
                cover = null;
            }
            j12 = 34;
            String string2 = this.tvTeacherName.getResources().getString(R$string.author, userName);
            boolean z11 = courseType == CourseType.DELETE;
            z = courseType != CourseType.GROUNDING;
            j13 = 36;
            string = this.tvProgress.getResources().getString(R$string.complete_progress, Integer.valueOf(i10));
            if (j15 != 0) {
                j10 |= z11 ? 128L : 64L;
            }
            if (z11) {
                relativeLayout = this.mboundView5;
                i11 = R$color.warn;
            } else {
                relativeLayout = this.mboundView5;
                i11 = R$color.icon;
            }
            colorFromResource2 = ViewDataBinding.getColorFromResource(relativeLayout, i11);
            str = string2;
            userName = cover;
        } else {
            j11 = 0;
            j12 = 34;
            j13 = 36;
            colorFromResource2 = 0;
            courseType = null;
            string = null;
            str = null;
        }
        long j16 = 40 & j10;
        long j17 = 48 & j10;
        if ((j10 & j13) != j11) {
            BindingAdaptersKt.netUrl(this.imageView2, userName);
            this.itemCourseTitle.setEntity(courseStudyEntity);
            BindingAdaptersKt.visibleOrGone(this.mboundView5, Boolean.valueOf(z));
            AbstractC8354c.m13609l(this.textView26, courseType);
            TextViewBindingAdapter.setText(this.tvProgress, string);
            TextViewBindingAdapter.setText(this.tvTeacherName, str);
            if (ViewDataBinding.getBuildSdkInt() >= 21) {
                this.mboundView5.setBackgroundTintList(Converters.convertColorToColorStateList(colorFromResource2));
            }
        }
        if (j16 != j11) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j17 != j11) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if ((j10 & j12) != j11) {
            ViewBindingAdapter.setBackground(this.mboundView0, Converters.convertColorToDrawable(colorFromResource));
        }
        if ((j10 & 32) != j11 && ViewDataBinding.getBuildSdkInt() >= 11) {
            RelativeLayout relativeLayout3 = this.mboundView5;
            relativeLayout3.setTranslationY(-relativeLayout3.getResources().getDimension(R$dimen.view_15));
        }
        ViewDataBinding.executeBindingsOn(this.itemCourseTitle);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.itemCourseTitle.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32L;
        }
        this.itemCourseTitle.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeItemCourseTitle((ItemCourseTitleBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.ItemStudyBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemStudyBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemStudyBinding
    public void setEntity(@Nullable CourseStudyEntity courseStudyEntity) {
        this.mEntity = courseStudyEntity;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemStudyBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.itemCourseTitle.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected(((Boolean) obj).booleanValue());
            return true;
        }
        if (15 == i10) {
            setEntity((CourseStudyEntity) obj);
            return true;
        }
        if (11 == i10) {
            setDictViewModel((DictViewModel) obj);
            return true;
        }
        if (5 != i10) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    private ItemStudyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[8], (ImageView) objArr[1], (ItemCourseTitleBinding) objArr[7], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.imageView2.setTag(null);
        setContainedBinding(this.itemCourseTitle);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.mboundView2 = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[5];
        this.mboundView5 = relativeLayout3;
        relativeLayout3.setTag(null);
        this.textView26.setTag(null);
        this.tvProgress.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
