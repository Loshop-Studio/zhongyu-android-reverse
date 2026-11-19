package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import p231r4.ViewOnClickListenerC9912a;

/* loaded from: classes3.dex */
public class FragmentExerciseStatisticsBindingImpl extends FragmentExerciseStatisticsBinding implements ViewOnClickListenerC9912a.a {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;

    @Nullable
    private final View.OnClickListener mCallback7;

    @Nullable
    private final View.OnClickListener mCallback8;
    private long mDirtyFlags;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{6}, new int[]{R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 7);
        sparseIntArray.put(R$id.linearLayout, 8);
        sparseIntArray.put(R$id.f10712rv, 9);
        sparseIntArray.put(R$id.view2, 10);
        sparseIntArray.put(R$id.multiple_status_view, 11);
        sparseIntArray.put(R$id.viewPager, 12);
    }

    public FragmentExerciseStatisticsBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeInclude(LayoutBindViewModelBinding layoutBindViewModelBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelCurrentSuperviseGroupLiveData(MutableLiveData<SuperviseGroup> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelIsMenuPopupShow(MutableLiveData<Boolean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    @Override // p231r4.ViewOnClickListenerC9912a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        ExerciseStatisticsViewModel exerciseStatisticsViewModel;
        if (i10 != 1) {
            if (i10 == 2 && (exerciseStatisticsViewModel = this.mViewModel) != null) {
                exerciseStatisticsViewModel.m12113d(1);
                return;
            }
            return;
        }
        ExerciseStatisticsViewModel exerciseStatisticsViewModel2 = this.mViewModel;
        if (exerciseStatisticsViewModel2 != null) {
            exerciseStatisticsViewModel2.m12113d(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentExerciseStatisticsBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl.smali:778
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.include.hasPendingBindings();
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
        this.include.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeInclude((LayoutBindViewModelBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeViewModelIsMenuPopupShow((MutableLiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return onChangeViewModelCurrentSuperviseGroupLiveData((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.include.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((ExerciseStatisticsViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentExerciseStatisticsBinding
    public void setViewModel(@Nullable ExerciseStatisticsViewModel exerciseStatisticsViewModel) {
        this.mViewModel = exerciseStatisticsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentExerciseStatisticsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ConstraintLayout) objArr[0], (LayoutBindViewModelBinding) objArr[6], (ImageView) objArr[2], (ImageView) objArr[3], (LinearLayout) objArr[8], (MultipleStatusView) objArr[11], (RecyclerView) objArr[9], (TitleBar) objArr[7], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[5], (View) objArr[10], (ViewPager2) objArr[12]);
        this.mDirtyFlags = -1L;
        this.fragmentTeachDetails.setTag(null);
        setContainedBinding(this.include);
        this.ivDown.setTag(null);
        this.ivUp.setTag(null);
        this.tvAllCondition.setTag(null);
        this.tvCourseGroupName.setTag(null);
        this.tvDoProblem.setTag(null);
        setRootTag(view);
        this.mCallback8 = new ViewOnClickListenerC9912a(this, 2);
        this.mCallback7 = new ViewOnClickListenerC9912a(this, 1);
        invalidateAll();
    }
}
