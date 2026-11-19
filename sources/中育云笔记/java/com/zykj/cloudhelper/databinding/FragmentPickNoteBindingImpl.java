package com.zykj.cloudhelper.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.cloudhelper.R$id;

/* loaded from: classes6.dex */
public class FragmentPickNoteBindingImpl extends FragmentPickNoteBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f19468h = null;

    /* renamed from: i */
    public static final SparseIntArray f19469i;

    /* renamed from: f */
    public final LinearLayout f19470f;

    /* renamed from: g */
    public long f19471g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19469i = sparseIntArray;
        sparseIntArray.put(R$id.tv_cancel, 1);
        sparseIntArray.put(R$id.tv_ensure, 2);
        sparseIntArray.put(R$id.rv_file, 3);
    }

    public FragmentPickNoteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f19468h, f19469i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f19471g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f19471g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19471g = 1L;
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

    public FragmentPickNoteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f19471g = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f19470f = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
