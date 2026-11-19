package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;
import p199o5.AbstractC9529a;

/* loaded from: classes5.dex */
public class ViewFragmentSimpleBindingImpl extends ViewFragmentSimpleBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f15411p;

    /* renamed from: q */
    public static final SparseIntArray f15412q;

    /* renamed from: n */
    public final ConstraintLayout f15413n;

    /* renamed from: o */
    public long f15414o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f15411p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15412q = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f15411p, f15412q));
    }

    /* renamed from: d */
    private boolean m13277d(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 8;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m13278h(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 4;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m13279i(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 32;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m13280j(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 1;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m13281k(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 16;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m13282l(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 64;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m13283m(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC9529a.f18900a) {
            return false;
        }
        synchronized (this) {
            this.f15414o |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15414o = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f15402e);
        ViewDataBinding.executeBindingsOn(this.f15403f);
        ViewDataBinding.executeBindingsOn(this.f15400c);
        ViewDataBinding.executeBindingsOn(this.f15401d);
        ViewDataBinding.executeBindingsOn(this.f15398a);
        ViewDataBinding.executeBindingsOn(this.f15399b);
        ViewDataBinding.executeBindingsOn(this.f15404g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f15414o != 0) {
                    return true;
                }
                return this.f15402e.hasPendingBindings() || this.f15403f.hasPendingBindings() || this.f15400c.hasPendingBindings() || this.f15401d.hasPendingBindings() || this.f15398a.hasPendingBindings() || this.f15399b.hasPendingBindings() || this.f15404g.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15414o = 128L;
        }
        this.f15402e.invalidateAll();
        this.f15403f.invalidateAll();
        this.f15400c.invalidateAll();
        this.f15401d.invalidateAll();
        this.f15398a.invalidateAll();
        this.f15399b.invalidateAll();
        this.f15404g.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m13280j((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m13283m((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m13278h((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m13277d((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m13281k((ViewIncludeMenuBinding) obj, i11);
            case 5:
                return m13279i((ViewIncludeEraserBinding) obj, i11);
            case 6:
                return m13282l((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f15402e.setLifecycleOwner(lifecycleOwner);
        this.f15403f.setLifecycleOwner(lifecycleOwner);
        this.f15400c.setLifecycleOwner(lifecycleOwner);
        this.f15401d.setLifecycleOwner(lifecycleOwner);
        this.f15398a.setLifecycleOwner(lifecycleOwner);
        this.f15399b.setLifecycleOwner(lifecycleOwner);
        this.f15404g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SimpleBoardView) objArr[9], (FrameLayout) objArr[1]);
        this.f15414o = -1L;
        setContainedBinding(this.f15398a);
        setContainedBinding(this.f15399b);
        setContainedBinding(this.f15400c);
        setContainedBinding(this.f15401d);
        setContainedBinding(this.f15402e);
        setContainedBinding(this.f15403f);
        setContainedBinding(this.f15404g);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f15413n = constraintLayout;
        constraintLayout.setTag(null);
        this.f15410m.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
