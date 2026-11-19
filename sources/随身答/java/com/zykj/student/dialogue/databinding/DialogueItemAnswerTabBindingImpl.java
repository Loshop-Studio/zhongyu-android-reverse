package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueItemAnswerTabBindingImpl extends DialogueItemAnswerTabBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f10492g = null;

    /* renamed from: h */
    public static final SparseIntArray f10493h;

    /* renamed from: f */
    public long f10494f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10493h = sparseIntArray;
        sparseIntArray.put(R.id.tv_name, 1);
        sparseIntArray.put(R.id.chip_public, 2);
        sparseIntArray.put(R.id.chip_question, 3);
        sparseIntArray.put(R.id.tv_time, 4);
    }

    public DialogueItemAnswerTabBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10492g, f10493h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10494f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10494f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10494f = 1L;
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

    public DialogueItemAnswerTabBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[3], (ConstraintLayout) objArr[0], (TextView) objArr[1], (TextView) objArr[4]);
        this.f10494f = -1L;
        this.f10489c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
