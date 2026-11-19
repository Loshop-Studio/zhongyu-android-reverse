package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import com.zykj.view.widget.radio.WithSelectedRadioButton;
import p181m7.AbstractC9026c;

/* loaded from: classes5.dex */
public class ViewIncludeBackgroundColorBindingImpl extends ViewIncludeBackgroundColorBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f12689j = null;

    /* renamed from: k */
    public static final SparseIntArray f12690k;

    /* renamed from: h */
    public final LinearLayoutCompat f12691h;

    /* renamed from: i */
    public long f12692i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12690k = sparseIntArray;
        sparseIntArray.put(R$id.rg_background_color, 5);
        sparseIntArray.put(R$id.rb_background_interweave, 6);
        sparseIntArray.put(R$id.rb_background_line, 7);
    }

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f12689j, f12690k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j9;
        synchronized (this) {
            j9 = this.f12692i;
            this.f12692i = 0L;
        }
        if ((j9 & 1) != 0) {
            AbstractC9026c.m14389b(this.f12682a, "#1A1A1A");
            AbstractC9026c.m14389b(this.f12683b, "#435772");
            AbstractC9026c.m14389b(this.f12684c, "#4C7068");
            AbstractC9026c.m14389b(this.f12687f, "#EEEEEE");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12692i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12692i = 1L;
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

    public ViewIncludeBackgroundColorBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (NormalColorRadioButton) objArr[4], (WithSelectedRadioButton) objArr[6], (WithSelectedRadioButton) objArr[7], (NormalColorRadioButton) objArr[1], (RadioGroup) objArr[5]);
        this.f12692i = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f12691h = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.f12682a.setTag("#1A1A1A");
        this.f12683b.setTag("#435772");
        this.f12684c.setTag("#4C7068");
        this.f12687f.setTag("#FFFFFF");
        setRootTag(view);
        invalidateAll();
    }
}
