package com.zykj.view.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.Converters;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.canhub.cropper.CropImageView;
import com.zykj.view.R$color;
import com.zykj.view.R$drawable;
import com.zykj.view.R$id;
import p008a7.AbstractC0044a;

/* loaded from: classes5.dex */
public class ViewActivityEzyCropBindingImpl extends ViewActivityEzyCropBinding {

    /* renamed from: p */
    public static final ViewDataBinding.IncludedLayouts f12557p = null;

    /* renamed from: q */
    public static final SparseIntArray f12558q;

    /* renamed from: j */
    public final ConstraintLayout f12559j;

    /* renamed from: k */
    public final ImageView f12560k;

    /* renamed from: l */
    public final TextView f12561l;

    /* renamed from: m */
    public final ImageView f12562m;

    /* renamed from: n */
    public final TextView f12563n;

    /* renamed from: o */
    public long f12564o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12558q = sparseIntArray;
        sparseIntArray.put(R$id.cropImageView, 8);
        sparseIntArray.put(R$id.cancel, 9);
        sparseIntArray.put(R$id.confirm_crop, 10);
        sparseIntArray.put(R$id.rotate, 11);
        sparseIntArray.put(R$id.iv_tip, 12);
    }

    public ViewActivityEzyCropBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f12557p, f12558q));
    }

    @Override // com.zykj.view.databinding.ViewActivityEzyCropBinding
    /* renamed from: a */
    public void mo11875a(boolean z9) {
        this.f12556i = z9;
        synchronized (this) {
            this.f12564o |= 1;
        }
        notifyPropertyChanged(AbstractC0044a.f141b);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j9;
        Drawable drawable;
        int colorFromResource;
        int colorFromResource2;
        int colorFromResource3;
        int colorFromResource4;
        int colorFromResource5;
        int colorFromResource6;
        Drawable drawable2;
        TextView textView;
        int i9;
        synchronized (this) {
            j9 = this.f12564o;
            this.f12564o = 0L;
        }
        boolean z9 = this.f12556i;
        long j10 = j9 & 3;
        if (j10 != 0) {
            if (j10 != 0) {
                j9 |= z9 ? 174760L : 87380L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f12550c, z9 ? R$color.frame_gray : R$color.guide_line_color);
            colorFromResource3 = ViewDataBinding.getColorFromResource(this.f12555h, z9 ? R$color.view_crop_content_light : R$color.view_crop_content_dark);
            colorFromResource4 = ViewDataBinding.getColorFromResource(this.f12561l, z9 ? R$color.view_crop_content_light : R$color.view_crop_content_dark);
            drawable = AppCompatResources.getDrawable(this.f12560k.getContext(), z9 ? R$drawable.view_icon_crop_cancel_light : R$drawable.selector_icon_cancel);
            colorFromResource5 = ViewDataBinding.getColorFromResource(this.f12551d, z9 ? R$color.view_crop_background_light : R$color.view_crop_background_dark);
            colorFromResource6 = ViewDataBinding.getColorFromResource(this.f12559j, z9 ? R$color.view_crop_background_light : R$color.view_crop_background_dark);
            drawable2 = AppCompatResources.getDrawable(this.f12562m.getContext(), z9 ? R$drawable.view_icon_crop_rotate_light : R$drawable.view_icon_rotate);
            if (z9) {
                textView = this.f12563n;
                i9 = R$color.view_crop_content_light;
            } else {
                textView = this.f12563n;
                i9 = R$color.view_crop_content_dark;
            }
            colorFromResource2 = ViewDataBinding.getColorFromResource(textView, i9);
        } else {
            drawable = null;
            colorFromResource = 0;
            colorFromResource2 = 0;
            colorFromResource3 = 0;
            colorFromResource4 = 0;
            colorFromResource5 = 0;
            colorFromResource6 = 0;
            drawable2 = null;
        }
        if ((j9 & 3) != 0) {
            ViewBindingAdapter.setBackground(this.f12550c, Converters.convertColorToDrawable(colorFromResource));
            ViewBindingAdapter.setBackground(this.f12551d, Converters.convertColorToDrawable(colorFromResource5));
            ViewBindingAdapter.setBackground(this.f12559j, Converters.convertColorToDrawable(colorFromResource6));
            ImageViewBindingAdapter.setImageDrawable(this.f12560k, drawable);
            this.f12561l.setTextColor(colorFromResource4);
            ImageViewBindingAdapter.setImageDrawable(this.f12562m, drawable2);
            this.f12563n.setTextColor(colorFromResource2);
            this.f12555h.setTextColor(colorFromResource3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12564o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12564o = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        if (AbstractC0044a.f141b != i9) {
            return false;
        }
        mo11875a(((Boolean) obj).booleanValue());
        return true;
    }

    public ViewActivityEzyCropBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[9], (FrameLayout) objArr[10], (View) objArr[6], (ConstraintLayout) objArr[1], (CropImageView) objArr[8], (ImageView) objArr[12], (LinearLayout) objArr[11], (TextView) objArr[7]);
        this.f12564o = -1L;
        this.f12550c.setTag(null);
        this.f12551d.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12559j = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f12560k = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f12561l = textView;
        textView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.f12562m = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f12563n = textView2;
        textView2.setTag(null);
        this.f12555h.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
