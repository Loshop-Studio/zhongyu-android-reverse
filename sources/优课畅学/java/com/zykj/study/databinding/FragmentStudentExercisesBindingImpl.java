package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.StudentExercisesViewModel;

/* loaded from: classes3.dex */
public class FragmentStudentExercisesBindingImpl extends FragmentStudentExercisesBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    @NonNull
    private final ImageView mboundView3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{8}, new int[]{R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 9);
        sparseIntArray.put(R$id.tv_user_name, 10);
        sparseIntArray.put(R$id.multiple_status_view, 11);
        sparseIntArray.put(R$id.fragment_student_exercise, 12);
    }

    public FragmentStudentExercisesBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelCurrentStatisticsGroupLiveData(MutableLiveData<ExerciseBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelIsShowLiveData(MutableLiveData<Boolean> mutableLiveData, int i10) {
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
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentStudentExercisesBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentStudentExercisesBindingImpl.smali:626
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.mboundView0.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
        }
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 1) {
            return onChangeViewModelIsShowLiveData((MutableLiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return onChangeViewModelCurrentStatisticsGroupLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentStudentExercisesBinding
    public void setEnable(boolean z10) {
        this.mEnable = z10;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentStudentExercisesBinding
    public void setExamClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mExamClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(17);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentStudentExercisesBinding
    public void setFromScore(boolean z10) {
        this.mFromScore = z10;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (20 == i10) {
            setFromScore(((Boolean) obj).booleanValue());
            return true;
        }
        if (13 == i10) {
            setEnable(((Boolean) obj).booleanValue());
            return true;
        }
        if (17 == i10) {
            setExamClickListener((View.OnClickListener) obj);
            return true;
        }
        if (59 != i10) {
            return false;
        }
        setViewModel((StudentExercisesViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentStudentExercisesBinding
    public void setViewModel(@Nullable StudentExercisesViewModel studentExercisesViewModel) {
        this.mViewModel = studentExercisesViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentStudentExercisesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (FragmentContainerView) objArr[12], (ConstraintLayout) objArr[0], (ImageView) objArr[4], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[7], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (MultipleStatusView) objArr[11], (TitleBar) objArr[9], (TextView) objArr[2], (AppCompatTextView) objArr[10]);
        this.mDirtyFlags = -1L;
        this.fragmentStudentExercises.setTag(null);
        this.imageView17.setTag(null);
        this.ivLast.setTag(null);
        this.ivNext.setTag(null);
        this.llGroupSelect.setTag(null);
        this.llUserSelect.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[8];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        ImageView imageView = (ImageView) objArr[3];
        this.mboundView3 = imageView;
        imageView.setTag(null);
        this.tvCourseProgress.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
