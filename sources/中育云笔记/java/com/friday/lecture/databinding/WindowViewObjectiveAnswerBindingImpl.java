package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import p004a3.AbstractC0047a;

/* loaded from: classes4.dex */
public class WindowViewObjectiveAnswerBindingImpl extends WindowViewObjectiveAnswerBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f8672j;

    /* renamed from: k */
    public static final SparseIntArray f8673k;

    /* renamed from: h */
    public final ConstraintLayout f8674h;

    /* renamed from: i */
    public long f8675i;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f8672j = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_before_stop_answer", "layout_confirm_time_up", "layout_confirm_end_class"}, new int[]{2, 3, 4}, new int[]{R$layout.layout_before_stop_answer, R$layout.layout_confirm_time_up, R$layout.layout_confirm_end_class});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8673k = sparseIntArray;
        sparseIntArray.put(R$id.statistics, 1);
        sparseIntArray.put(R$id.iv_close, 5);
    }

    public WindowViewObjectiveAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f8672j, f8673k));
    }

    /* renamed from: k */
    private boolean m6512k(LayoutConfirmEndClassBinding layoutConfirmEndClassBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8675i |= 1;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m6513m(LayoutConfirmTimeUpBinding layoutConfirmTimeUpBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8675i |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8675i = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f8667c);
        ViewDataBinding.executeBindingsOn(this.f8670f);
        ViewDataBinding.executeBindingsOn(this.f8669e);
    }

    /* renamed from: g */
    public final boolean m6514g(LayoutBeforeStopAnswerBinding layoutBeforeStopAnswerBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8675i |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f8675i != 0) {
                    return true;
                }
                return this.f8667c.hasPendingBindings() || this.f8670f.hasPendingBindings() || this.f8669e.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8675i = 8L;
        }
        this.f8667c.invalidateAll();
        this.f8670f.invalidateAll();
        this.f8669e.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m6512k((LayoutConfirmEndClassBinding) obj, i11);
        }
        if (i10 == 1) {
            return m6514g((LayoutBeforeStopAnswerBinding) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return m6513m((LayoutConfirmTimeUpBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f8667c.setLifecycleOwner(lifecycleOwner);
        this.f8670f.setLifecycleOwner(lifecycleOwner);
        this.f8669e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public WindowViewObjectiveAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (LayoutBeforeStopAnswerBinding) objArr[2], (ImageView) objArr[5], (LayoutConfirmEndClassBinding) objArr[4], (LayoutConfirmTimeUpBinding) objArr[3], (View) objArr[1]);
        this.f8675i = -1L;
        setContainedBinding(this.f8667c);
        setContainedBinding(this.f8669e);
        setContainedBinding(this.f8670f);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8674h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
