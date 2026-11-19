package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes5.dex */
public class DialogueAnswerTabLayoutBindingImpl extends DialogueAnswerTabLayoutBinding {

    /* renamed from: c */
    public static final ViewDataBinding.IncludedLayouts f10373c = null;

    /* renamed from: d */
    public static final SparseIntArray f10374d = null;

    /* renamed from: b */
    public long f10375b;

    public DialogueAnswerTabLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f10373c, f10374d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10375b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10375b != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10375b = 1L;
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

    public DialogueAnswerTabLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[0]);
        this.f10375b = -1L;
        this.f10372a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
