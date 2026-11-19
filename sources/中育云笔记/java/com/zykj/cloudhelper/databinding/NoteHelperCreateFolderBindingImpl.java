package com.zykj.cloudhelper.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.cloudhelper.R$id;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes6.dex */
public class NoteHelperCreateFolderBindingImpl extends NoteHelperCreateFolderBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f19493i = null;

    /* renamed from: j */
    public static final SparseIntArray f19494j;

    /* renamed from: g */
    public final ConstraintLayout f19495g;

    /* renamed from: h */
    public long f19496h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19494j = sparseIntArray;
        sparseIntArray.put(R$id.tv_cancel, 1);
        sparseIntArray.put(R$id.tv_complete, 2);
        sparseIntArray.put(R$id.et_file_name, 3);
        sparseIntArray.put(R$id.ll_file_tip, 4);
    }

    public NoteHelperCreateFolderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f19493i, f19494j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f19496h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f19496h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19496h = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public NoteHelperCreateFolderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LimitEditText) objArr[3], (LinearLayout) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f19496h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19495g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
