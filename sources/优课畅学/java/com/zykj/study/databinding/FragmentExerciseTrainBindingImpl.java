package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public class FragmentExerciseTrainBindingImpl extends FragmentExerciseTrainBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{5}, new int[]{R$layout.layout_bind_view_model});
        includedLayouts.setIncludes(3, new String[]{"layout_exercise_subject"}, new int[]{4}, new int[]{R$layout.layout_exercise_subject});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.rl_title, 6);
        sparseIntArray.put(R$id.toolbar, 7);
        sparseIntArray.put(R$id.multiple_status_view, 8);
        sparseIntArray.put(R$id.nav_answer_fragment, 9);
        sparseIntArray.put(R$id.frame_layout, 10);
        sparseIntArray.put(R$id.tv_page_moving_progress, 11);
    }

    public FragmentExerciseTrainBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityCurrentIndexLiveData(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeEntityIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeEntityToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeEntityTotalSize(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeExerciseSubject(LayoutExerciseSubjectBinding layoutExerciseSubjectBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentExerciseTrainBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentExerciseTrainBindingImpl.smali:726
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.exerciseSubject.hasPendingBindings() || this.mboundView0.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
        }
        this.exerciseSubject.invalidateAll();
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeExerciseSubject((LayoutExerciseSubjectBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeEntityIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeEntityToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeEntityTotalSize((MutableLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return onChangeEntityCurrentIndexLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseTrainBinding
    public void setEntity(@Nullable ExerciseTrainViewModel exerciseTrainViewModel) {
        this.mEntity = exerciseTrainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.exerciseSubject.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((ExerciseTrainViewModel) obj);
            return true;
        }
        if (60 != i10) {
            return false;
        }
        setWebViewControlViewModel((WebViewControlViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentExerciseTrainBinding
    public void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel) {
        this.mWebViewControlViewModel = webViewControlViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(60);
        super.requestRebind();
    }

    private FragmentExerciseTrainBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (LinearLayout) objArr[3], (LayoutExerciseSubjectBinding) objArr[4], (ConstraintLayout) objArr[0], (FrameLayout) objArr[10], (MultipleStatusView) objArr[8], (FragmentContainerView) objArr[9], (RelativeLayout) objArr[6], (TitleBar) objArr[7], (TextView) objArr[11]);
        this.mDirtyFlags = -1L;
        this.container.setTag(null);
        setContainedBinding(this.exerciseSubject);
        this.fragmentTrain.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[5];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
