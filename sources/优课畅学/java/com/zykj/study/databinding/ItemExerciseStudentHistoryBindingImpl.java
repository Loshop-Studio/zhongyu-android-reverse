package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.view.MultipleChoiceAnimationView;
import com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public class ItemExerciseStudentHistoryBindingImpl extends ItemExerciseStudentHistoryBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @Nullable
    private final LayoutBindViewModelBinding mboundView01;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    @NonNull
    private final LinearLayout mboundView3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{6}, new int[]{R$layout.layout_bind_view_model});
        includedLayouts.setIncludes(3, new String[]{"layout_exercise_subject", "layout_exercise_answer_history"}, new int[]{4, 5}, new int[]{R$layout.layout_exercise_subject, R$layout.layout_exercise_answer_history});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.multiple_choice_view, 7);
    }

    public ItemExerciseStudentHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityExerciseBeanLiveData(MutableLiveData<ExerciseBean> mutableLiveData, int i10) {
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
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeEntityToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeExerciseAnswer(LayoutExerciseAnswerHistoryBinding layoutExerciseAnswerHistoryBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
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
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.databinding.ViewDataBinding, com.zykj.study.databinding.ItemExerciseStudentHistoryBinding, com.zykj.study.databinding.ItemExerciseStudentHistoryBindingImpl] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.ItemExerciseStudentHistoryBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl.smali:646
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.exerciseSubject.hasPendingBindings() || this.exerciseAnswer.hasPendingBindings() || this.mboundView01.hasPendingBindings();
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
        this.exerciseSubject.invalidateAll();
        this.exerciseAnswer.invalidateAll();
        this.mboundView01.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeExerciseSubject((LayoutExerciseSubjectBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeExerciseAnswer((LayoutExerciseAnswerHistoryBinding) obj, i11);
        }
        if (i10 == 2) {
            return onChangeEntityIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeEntityToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return onChangeEntityExerciseBeanLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.ItemExerciseStudentHistoryBinding
    public void setEntity(@Nullable ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel) {
        this.mEntity = exerciseStudentHistoryViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemExerciseStudentHistoryBinding
    public void setIsTeacher(boolean z10) {
        this.mIsTeacher = z10;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.exerciseSubject.setLifecycleOwner(lifecycleOwner);
        this.exerciseAnswer.setLifecycleOwner(lifecycleOwner);
        this.mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (29 == i10) {
            setIsTeacher(((Boolean) obj).booleanValue());
            return true;
        }
        if (15 == i10) {
            setEntity((ExerciseStudentHistoryViewModel) obj);
            return true;
        }
        if (60 != i10) {
            return false;
        }
        setWebViewControlViewModel((WebViewControlViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.ItemExerciseStudentHistoryBinding
    public void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel) {
        this.mWebViewControlViewModel = webViewControlViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(60);
        super.requestRebind();
    }

    private ItemExerciseStudentHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (LayoutExerciseAnswerHistoryBinding) objArr[5], (LayoutExerciseSubjectBinding) objArr[4], (MultipleChoiceAnimationView) objArr[7]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.exerciseAnswer);
        setContainedBinding(this.exerciseSubject);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[6];
        this.mboundView01 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.mboundView3 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
