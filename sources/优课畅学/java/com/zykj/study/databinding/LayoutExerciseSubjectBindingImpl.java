package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.viewmodels.BaseExerciseViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import p169l8.InterfaceC9280q;

/* loaded from: classes3.dex */
public class LayoutExerciseSubjectBindingImpl extends LayoutExerciseSubjectBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    @NonNull
    private final LinearLayout mboundView2;

    @NonNull
    private final LinearLayout mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.webView, 7);
        sparseIntArray.put(R$id.webView_correct_answer, 8);
        sparseIntArray.put(R$id.tv_no_analysis, 9);
    }

    public LayoutExerciseSubjectBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityCurrentIndexLiveData(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeEntityCurrentQuestionLiveData(MutableLiveData<QuestionBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeWebViewControlViewModelWebViewControl(InterfaceC9280q interfaceC9280q, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.LayoutExerciseSubjectBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/LayoutExerciseSubjectBindingImpl.smali:459
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
            this.mDirtyFlags = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeWebViewControlViewModelWebViewControl((InterfaceC9280q) obj, i11);
        }
        if (i10 == 1) {
            return onChangeEntityCurrentQuestionLiveData((MutableLiveData) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return onChangeEntityCurrentIndexLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutExerciseSubjectBinding
    public void setEntity(@Nullable BaseExerciseViewModel baseExerciseViewModel) {
        this.mEntity = baseExerciseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((BaseExerciseViewModel) obj);
            return true;
        }
        if (60 != i10) {
            return false;
        }
        setWebViewControlViewModel((WebViewControlViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.LayoutExerciseSubjectBinding
    public void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel) {
        this.mWebViewControlViewModel = webViewControlViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(60);
        super.requestRebind();
    }

    private LayoutExerciseSubjectBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[9], (CustomWebView) objArr[7], (CustomWebView) objArr[4], (CustomWebView) objArr[8]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.mboundView2 = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[3];
        this.mboundView3 = linearLayout3;
        linearLayout3.setTag(null);
        this.roundButton.setTag(null);
        this.roundButton2.setTag(null);
        this.webViewAnalysis.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
