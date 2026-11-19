package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes5.dex */
class FilterImageView extends AppCompatImageView {

    /* renamed from: c */
    public InterfaceC8130a f16140c;

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.FilterImageView$a */
    public interface InterfaceC8130a {
        /* renamed from: a */
        void mo12746a(Bitmap bitmap);
    }

    public FilterImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m12745a(InterfaceC8130a interfaceC8130a) {
        this.f16140c = interfaceC8130a;
    }

    public Bitmap getBitmap() {
        if (getDrawable() != null) {
            return ((BitmapDrawable) getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageState(int[] iArr, boolean z10) {
        super.setImageState(iArr, z10);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageTintList(ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageTintMode(PorterDuff.Mode mode) {
        super.setImageTintMode(mode);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        InterfaceC8130a interfaceC8130a = this.f16140c;
        if (interfaceC8130a != null) {
            interfaceC8130a.mo12746a(getBitmap());
        }
    }

    public FilterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
