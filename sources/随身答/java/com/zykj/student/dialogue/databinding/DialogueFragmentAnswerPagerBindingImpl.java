package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentAnswerPagerBindingImpl extends DialogueFragmentAnswerPagerBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f10432k = null;

    /* renamed from: l */
    public static final SparseIntArray f10433l;

    /* renamed from: i */
    public final ConstraintLayout f10434i;

    /* renamed from: j */
    public long f10435j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10433l = sparseIntArray;
        sparseIntArray.put(R.id.fl_container, 1);
        sparseIntArray.put(R.id.photo_view, 2);
        sparseIntArray.put(R.id.iv_start, 3);
        sparseIntArray.put(R.id.iv_fullscreen, 4);
        sparseIntArray.put(R.id.ll_load_error, 5);
        sparseIntArray.put(R.id.iv_answer, 6);
        sparseIntArray.put(R.id.anchor_view, 7);
        sparseIntArray.put(R.id.view_tutorial_4, 8);
    }

    public DialogueFragmentAnswerPagerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f10432k, f10433l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10435j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10435j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10435j = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueFragmentAnswerPagerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[7], (FrameLayout) objArr[1], (ImageView) objArr[6], (ImageView) objArr[4], (ImageView) objArr[3], (LinearLayout) objArr[5], (PhotoView) objArr[2], (View) objArr[8]);
        this.f10435j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f10434i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
