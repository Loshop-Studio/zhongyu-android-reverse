package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchProgressView;
import p199o5.AbstractC9529a;

/* loaded from: classes5.dex */
public class ViewFragmentBoardBindingImpl extends ViewFragmentBoardBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f15382r;

    /* renamed from: s */
    public static final SparseIntArray f15383s;

    /* renamed from: p */
    public final ConstraintLayout f15384p;

    /* renamed from: q */
    public long f15385q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        f15382r = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15383s = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
        sparseIntArray.put(R$id.loadingLayout, 14);
        sparseIntArray.put(R$id.tvLoadingTips, 15);
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f15382r, f15383s));
    }

    /* renamed from: d */
    public final boolean m13266d(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15385q = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f15371e);
        ViewDataBinding.executeBindingsOn(this.f15372f);
        ViewDataBinding.executeBindingsOn(this.f15369c);
        ViewDataBinding.executeBindingsOn(this.f15370d);
        ViewDataBinding.executeBindingsOn(this.f15367a);
        ViewDataBinding.executeBindingsOn(this.f15368b);
        ViewDataBinding.executeBindingsOn(this.f15373g);
    }

    /* renamed from: h */
    public final boolean m13267h(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f15385q != 0) {
                    return true;
                }
                return this.f15371e.hasPendingBindings() || this.f15372f.hasPendingBindings() || this.f15369c.hasPendingBindings() || this.f15370d.hasPendingBindings() || this.f15367a.hasPendingBindings() || this.f15368b.hasPendingBindings() || this.f15373g.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final boolean m13268i(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15385q = 128L;
        }
        this.f15371e.invalidateAll();
        this.f15372f.invalidateAll();
        this.f15369c.invalidateAll();
        this.f15370d.invalidateAll();
        this.f15367a.invalidateAll();
        this.f15368b.invalidateAll();
        this.f15373g.invalidateAll();
        requestRebind();
    }

    /* renamed from: j */
    public final boolean m13269j(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 1;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m13270k(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 16;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m13271l(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 64;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m13272m(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15385q |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m13269j((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m13272m((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m13267h((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m13266d((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m13270k((ViewIncludeMenuBinding) obj, i11);
            case 5:
                return m13268i((ViewIncludeEraserBinding) obj, i11);
            case 6:
                return m13271l((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f15371e.setLifecycleOwner(lifecycleOwner);
        this.f15372f.setLifecycleOwner(lifecycleOwner);
        this.f15369c.setLifecycleOwner(lifecycleOwner);
        this.f15370d.setLifecycleOwner(lifecycleOwner);
        this.f15367a.setLifecycleOwner(lifecycleOwner);
        this.f15368b.setLifecycleOwner(lifecycleOwner);
        this.f15373g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (FrameLayout) objArr[14], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SketchRecorderView) objArr[9], (FrameLayout) objArr[1], (TextView) objArr[15]);
        this.f15385q = -1L;
        setContainedBinding(this.f15367a);
        setContainedBinding(this.f15368b);
        setContainedBinding(this.f15369c);
        setContainedBinding(this.f15370d);
        setContainedBinding(this.f15371e);
        setContainedBinding(this.f15372f);
        setContainedBinding(this.f15373g);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f15384p = constraintLayout;
        constraintLayout.setTag(null);
        this.f15380n.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
