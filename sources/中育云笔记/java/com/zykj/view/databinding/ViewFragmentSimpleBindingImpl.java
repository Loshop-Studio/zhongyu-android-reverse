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
import p209jb.AbstractC9709a;

/* loaded from: classes6.dex */
public class ViewFragmentSimpleBindingImpl extends ViewFragmentSimpleBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f20622r;

    /* renamed from: s */
    public static final SparseIntArray f20623s;

    /* renamed from: p */
    public final ConstraintLayout f20624p;

    /* renamed from: q */
    public long f20625q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f20622r = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{R$layout.view_include_menu, R$layout.view_item_sketch_record, R$layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{R$layout.view_include_pen, R$layout.view_include_eraser, R$layout.view_include_image_add, R$layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20623s = sparseIntArray;
        sparseIntArray.put(R$id.sketch_view, 9);
        sparseIntArray.put(R$id.iv_back, 10);
        sparseIntArray.put(R$id.iv_expansion, 11);
        sparseIntArray.put(R$id.sketch_progress_vertical, 12);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 13);
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f20622r, f20623s));
    }

    /* renamed from: g */
    private boolean m17349g(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 8;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m17350k(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 4;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m17351m(ViewIncludeEraserBinding viewIncludeEraserBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 32;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m17352n(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 1;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m17353o(ViewIncludeMenuBinding viewIncludeMenuBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 16;
        }
        return true;
    }

    /* renamed from: p */
    private boolean m17354p(ViewIncludePenBinding viewIncludePenBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 64;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m17355r(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20625q |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20625q = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f20613g);
        ViewDataBinding.executeBindingsOn(this.f20614h);
        ViewDataBinding.executeBindingsOn(this.f20611e);
        ViewDataBinding.executeBindingsOn(this.f20612f);
        ViewDataBinding.executeBindingsOn(this.f20609c);
        ViewDataBinding.executeBindingsOn(this.f20610d);
        ViewDataBinding.executeBindingsOn(this.f20615i);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f20625q != 0) {
                    return true;
                }
                return this.f20613g.hasPendingBindings() || this.f20614h.hasPendingBindings() || this.f20611e.hasPendingBindings() || this.f20612f.hasPendingBindings() || this.f20609c.hasPendingBindings() || this.f20610d.hasPendingBindings() || this.f20615i.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20625q = 128L;
        }
        this.f20613g.invalidateAll();
        this.f20614h.invalidateAll();
        this.f20611e.invalidateAll();
        this.f20612f.invalidateAll();
        this.f20609c.invalidateAll();
        this.f20610d.invalidateAll();
        this.f20615i.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return m17352n((ViewIncludeImageAddBinding) obj, i11);
            case 1:
                return m17355r((ViewItemSketchRecordAudioBinding) obj, i11);
            case 2:
                return m17350k((ViewItemSketchRecordBinding) obj, i11);
            case 3:
                return m17349g((ViewIncludeBackgroundColorBinding) obj, i11);
            case 4:
                return m17353o((ViewIncludeMenuBinding) obj, i11);
            case 5:
                return m17351m((ViewIncludeEraserBinding) obj, i11);
            case 6:
                return m17354p((ViewIncludePenBinding) obj, i11);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f20613g.setLifecycleOwner(lifecycleOwner);
        this.f20614h.setLifecycleOwner(lifecycleOwner);
        this.f20611e.setLifecycleOwner(lifecycleOwner);
        this.f20612f.setLifecycleOwner(lifecycleOwner);
        this.f20609c.setLifecycleOwner(lifecycleOwner);
        this.f20610d.setLifecycleOwner(lifecycleOwner);
        this.f20615i.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SimpleBoardView) objArr[9], (FrameLayout) objArr[1]);
        this.f20625q = -1L;
        setContainedBinding(this.f20609c);
        setContainedBinding(this.f20610d);
        setContainedBinding(this.f20611e);
        setContainedBinding(this.f20612f);
        setContainedBinding(this.f20613g);
        setContainedBinding(this.f20614h);
        setContainedBinding(this.f20615i);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20624p = constraintLayout;
        constraintLayout.setTag(null);
        this.f20621o.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
