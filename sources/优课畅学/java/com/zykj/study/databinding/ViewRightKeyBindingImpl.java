package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.image.R$dimen;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.view.CustomX5WebView;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ViewRightKeyBindingImpl extends ViewRightKeyBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_right_key_dismiss_or_show, 3);
        sparseIntArray.put(R$id.iv_label_icon, 4);
        sparseIntArray.put(R$id.tv_right_key_label, 5);
        sparseIntArray.put(R$id.ll_analysis, 6);
    }

    public ViewRightKeyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        String str = this.mAnswerStandard;
        if ((6 & j10) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str);
            AbstractC8354c.m13612o(this.wbRightKey, str);
        }
        if ((j10 & 4) != 0) {
            CustomX5WebView customX5WebView = this.wbRightKey;
            AbstractC8354c.m13613p(customX5WebView, customX5WebView.getResources().getDimension(R$dimen.view_150));
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ViewRightKeyBinding
    public void setAnswerStandard(@Nullable String str) {
        this.mAnswerStandard = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ViewRightKeyBinding
    public void setQuestionType(@Nullable QuestionType questionType) {
        this.mQuestionType = questionType;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (42 == i10) {
            setQuestionType((QuestionType) obj);
            return true;
        }
        if (3 != i10) {
            return false;
        }
        setAnswerStandard((String) obj);
        return true;
    }

    private ViewRightKeyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ImageView) objArr[3], (RelativeLayout) objArr[6], (TextView) objArr[5], (CustomX5WebView) objArr[2]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        this.wbRightKey.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
