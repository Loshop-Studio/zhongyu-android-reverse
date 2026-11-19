package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import p400x3.AbstractC11790a;

/* loaded from: classes4.dex */
public class WindowObjectiveHomeworkBindingImpl extends WindowObjectiveHomeworkBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f9868h;

    /* renamed from: i */
    public static final SparseIntArray f9869i;

    /* renamed from: f */
    public final FrameLayout f9870f;

    /* renamed from: g */
    public long f9871g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f9868h = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_student_objective", "layout_objective_confirm"}, new int[]{1, 2}, new int[]{R$layout.layout_student_objective, R$layout.layout_objective_confirm});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9869i = sparseIntArray;
        sparseIntArray.put(R$id.iv_minimize, 3);
    }

    public WindowObjectiveHomeworkBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f9868h, f9869i));
    }

    /* renamed from: a */
    public final boolean m7307a(LayoutStudentObjectiveBinding layoutStudentObjectiveBinding, int i10) {
        if (i10 != AbstractC11790a.f27964a) {
            return false;
        }
        synchronized (this) {
            this.f9871g |= 1;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m7308c(LayoutObjectiveConfirmBinding layoutObjectiveConfirmBinding, int i10) {
        if (i10 != AbstractC11790a.f27964a) {
            return false;
        }
        synchronized (this) {
            this.f9871g |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9871g = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f9866d);
        ViewDataBinding.executeBindingsOn(this.f9867e);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f9871g != 0) {
                    return true;
                }
                return this.f9866d.hasPendingBindings() || this.f9867e.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9871g = 4L;
        }
        this.f9866d.invalidateAll();
        this.f9867e.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m7307a((LayoutStudentObjectiveBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return m7308c((LayoutObjectiveConfirmBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f9866d.setLifecycleOwner(lifecycleOwner);
        this.f9867e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public WindowObjectiveHomeworkBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[3], (LayoutStudentObjectiveBinding) objArr[1], (LayoutObjectiveConfirmBinding) objArr[2]);
        this.f9871g = -1L;
        setContainedBinding(this.f9866d);
        setContainedBinding(this.f9867e);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f9870f = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
