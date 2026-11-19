package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import p004a3.AbstractC0047a;

/* loaded from: classes4.dex */
public class WindowStudentDemoListBindingImpl extends WindowStudentDemoListBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f8654r;

    /* renamed from: s */
    public static final SparseIntArray f8655s;

    /* renamed from: p */
    public final ConstraintLayout f8656p;

    /* renamed from: q */
    public long f8657q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f8654r = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_random"}, new int[]{1}, new int[]{R$layout.layout_random});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8655s = sparseIntArray;
        sparseIntArray.put(R$id.cl_online, 2);
        sparseIntArray.put(R$id.tv_online_count, 3);
        sparseIntArray.put(R$id.tv_teacher_count, 4);
        sparseIntArray.put(R$id.tv_student_count, 5);
        sparseIntArray.put(R$id.rv_student_list, 6);
        sparseIntArray.put(R$id.cv_update_demo, 7);
        sparseIntArray.put(R$id.tv_student_demo, 8);
        sparseIntArray.put(R$id.tv_tips, 9);
        sparseIntArray.put(R$id.cl_in_demo, 10);
        sparseIntArray.put(R$id.tv_in_demo_count, 11);
        sparseIntArray.put(R$id.rv_in_demo, 12);
        sparseIntArray.put(R$id.iv_close, 13);
    }

    public WindowStudentDemoListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f8654r, f8655s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8657q = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f8645g);
    }

    /* renamed from: g */
    public final boolean m6504g(LayoutRandomBinding layoutRandomBinding, int i10) {
        if (i10 != AbstractC0047a.f38a) {
            return false;
        }
        synchronized (this) {
            this.f8657q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f8657q != 0) {
                    return true;
                }
                return this.f8645g.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8657q = 2L;
        }
        this.f8645g.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m6504g((LayoutRandomBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f8645g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public WindowStudentDemoListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[2], (CardView) objArr[7], (ImageView) objArr[13], (LayoutRandomBinding) objArr[1], (RecyclerView) objArr[12], (RecyclerView) objArr[6], (TextView) objArr[11], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[9]);
        this.f8657q = -1L;
        setContainedBinding(this.f8645g);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8656p = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
