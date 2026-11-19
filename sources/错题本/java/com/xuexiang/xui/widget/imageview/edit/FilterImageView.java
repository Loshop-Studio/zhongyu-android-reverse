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
import p129o2.C6268a;

/* loaded from: classes3.dex */
class FilterImageView extends AppCompatImageView {

    /* renamed from: a */
    public C6268a f4400a;

    public FilterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Bitmap getBitmap() {
        if (getDrawable() != null) {
            return ((BitmapDrawable) getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public final void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public final void setImageState(int[] iArr, boolean z8) {
        super.setImageState(iArr, z8);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public final void setImageTintList(ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public final void setImageTintMode(PorterDuff.Mode mode) {
        super.setImageTintMode(mode);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C6268a c6268a = this.f4400a;
        if (c6268a != null) {
            c6268a.m5869y(getBitmap());
        }
    }

    public FilterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
