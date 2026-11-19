package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.view.AbstractC7203a;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;

/* loaded from: classes5.dex */
public class ViewFragmentSimpleBindingImpl extends ViewFragmentSimpleBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f11422p;

    /* renamed from: q */
    public static final SparseIntArray f11423q;

    /* renamed from: n */
    public final ConstraintLayout f11424n;

    /* renamed from: o */
    public long f11425o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f11422p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11423q = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f11422p, f11423q));
    }

    /* renamed from: o */
    private boolean m11408o(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 8;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m11409q(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 4;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m11410r(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 32;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m11411s(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 1;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m11412t(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 16;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m11413u(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 64;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m11414v(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC7203a.f10872a) {
            return false;
        }
        synchronized (this) {
            this.f11425o |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11425o = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f11413e);
        ViewDataBinding.executeBindingsOn(this.f11414f);
        ViewDataBinding.executeBindingsOn(this.f11411c);
        ViewDataBinding.executeBindingsOn(this.f11412d);
        ViewDataBinding.executeBindingsOn(this.f11409a);
        ViewDataBinding.executeBindingsOn(this.f11410b);
        ViewDataBinding.executeBindingsOn(this.f11415g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f11425o != 0) {
                    return true;
                }
                return this.f11413e.hasPendingBindings() || this.f11414f.hasPendingBindings() || this.f11411c.hasPendingBindings() || this.f11412d.hasPendingBindings() || this.f11409a.hasPendingBindings() || this.f11410b.hasPendingBindings() || this.f11415g.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11425o = 128L;
        }
        this.f11413e.invalidateAll();
        this.f11414f.invalidateAll();
        this.f11411c.invalidateAll();
        this.f11412d.invalidateAll();
        this.f11409a.invalidateAll();
        this.f11410b.invalidateAll();
        this.f11415g.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m11411s((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m11414v((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m11409q((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m11408o((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m11412t((ViewIncludeMenuBinding) obj, i11);
            case 5:
                return m11410r((ViewIncludeEraserBinding) obj, i11);
            case 6:
                return m11413u((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f11413e.setLifecycleOwner(lifecycleOwner);
        this.f11414f.setLifecycleOwner(lifecycleOwner);
        this.f11411c.setLifecycleOwner(lifecycleOwner);
        this.f11412d.setLifecycleOwner(lifecycleOwner);
        this.f11409a.setLifecycleOwner(lifecycleOwner);
        this.f11410b.setLifecycleOwner(lifecycleOwner);
        this.f11415g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SimpleBoardView) objArr[9], (FrameLayout) objArr[1]);
        this.f11425o = -1L;
        setContainedBinding(this.f11409a);
        setContainedBinding(this.f11410b);
        setContainedBinding(this.f11411c);
        setContainedBinding(this.f11412d);
        setContainedBinding(this.f11413e);
        setContainedBinding(this.f11414f);
        setContainedBinding(this.f11415g);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f11424n = constraintLayout;
        constraintLayout.setTag(null);
        this.f11421m.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
