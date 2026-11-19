package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentAnswerTabBindingImpl extends DialogueFragmentAnswerTabBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f10440g = null;

    /* renamed from: h */
    public static final SparseIntArray f10441h;

    /* renamed from: e */
    public final ConstraintLayout f10442e;

    /* renamed from: f */
    public long f10443f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10441h = sparseIntArray;
        sparseIntArray.put(R.id.guide_line, 1);
        sparseIntArray.put(R.id.tab_layout, 2);
        sparseIntArray.put(R.id.iv_refresh, 3);
        sparseIntArray.put(R.id.view_pager, 4);
    }

    public DialogueFragmentAnswerTabBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10440g, f10441h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10443f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10443f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10443f = 1L;
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

    public DialogueFragmentAnswerTabBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[1], (ImageView) objArr[3], (TabLayout) objArr[2], (ViewPager2) objArr[4]);
        this.f10443f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f10442e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
