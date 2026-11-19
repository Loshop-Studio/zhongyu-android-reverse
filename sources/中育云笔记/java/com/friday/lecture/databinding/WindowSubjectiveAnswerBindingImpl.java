package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.friday.lecture.R$layout;
import p004a3.AbstractC0047a;

/* loaded from: classes4.dex */
public class WindowSubjectiveAnswerBindingImpl extends WindowSubjectiveAnswerBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f8663j;

    /* renamed from: k */
    public static final SparseIntArray f8664k;

    /* renamed from: h */
    public final FrameLayout f8665h;

    /* renamed from: i */
    public long f8666i;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f8663j = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_random", "layout_subjective_list", "layout_subjective_detail", "layout_confirm_time_up", "layout_confirm_end_class"}, new int[]{1, 2, 3, 4, 5}, new int[]{R$layout.layout_random, R$layout.layout_subjective_list, R$layout.layout_subjective_detail, R$layout.layout_confirm_time_up, R$layout.layout_confirm_end_class});
        f8664k = null;
    }

    public WindowSubjectiveAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f8663j, f8664k));
    }

    /* renamed from: k */
    private boolean m6505k(LayoutRandomBinding layoutRandomBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8666i |= 8;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m6506a(LayoutSubjectiveDetailBinding layoutSubjectiveDetailBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8666i |= 1;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m6507c(LayoutConfirmEndClassBinding layoutConfirmEndClassBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8666i |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8666i = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f8661f);
        ViewDataBinding.executeBindingsOn(this.f8660e);
        ViewDataBinding.executeBindingsOn(this.f8658c);
        ViewDataBinding.executeBindingsOn(this.f8662g);
        ViewDataBinding.executeBindingsOn(this.f8659d);
    }

    /* renamed from: g */
    public final boolean m6508g(LayoutSubjectiveListBinding layoutSubjectiveListBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8666i |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f8666i != 0) {
                    return true;
                }
                return this.f8661f.hasPendingBindings() || this.f8660e.hasPendingBindings() || this.f8658c.hasPendingBindings() || this.f8662g.hasPendingBindings() || this.f8659d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8666i = 32L;
        }
        this.f8661f.invalidateAll();
        this.f8660e.invalidateAll();
        this.f8658c.invalidateAll();
        this.f8662g.invalidateAll();
        this.f8659d.invalidateAll();
        requestRebind();
    }

    /* renamed from: m */
    public final boolean m6509m(LayoutConfirmTimeUpBinding layoutConfirmTimeUpBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8666i |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m6506a((LayoutSubjectiveDetailBinding) obj, i11);
        }
        if (i10 == 1) {
            return m6508g((LayoutSubjectiveListBinding) obj, i11);
        }
        if (i10 == 2) {
            return m6507c((LayoutConfirmEndClassBinding) obj, i11);
        }
        if (i10 == 3) {
            return m6505k((LayoutRandomBinding) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return m6509m((LayoutConfirmTimeUpBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f8661f.setLifecycleOwner(lifecycleOwner);
        this.f8660e.setLifecycleOwner(lifecycleOwner);
        this.f8658c.setLifecycleOwner(lifecycleOwner);
        this.f8662g.setLifecycleOwner(lifecycleOwner);
        this.f8659d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public WindowSubjectiveAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (LayoutSubjectiveDetailBinding) objArr[3], (LayoutConfirmEndClassBinding) objArr[5], (LayoutSubjectiveListBinding) objArr[2], (LayoutRandomBinding) objArr[1], (LayoutConfirmTimeUpBinding) objArr[4]);
        this.f8666i = -1L;
        setContainedBinding(this.f8658c);
        setContainedBinding(this.f8659d);
        setContainedBinding(this.f8660e);
        setContainedBinding(this.f8661f);
        setContainedBinding(this.f8662g);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f8665h = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
