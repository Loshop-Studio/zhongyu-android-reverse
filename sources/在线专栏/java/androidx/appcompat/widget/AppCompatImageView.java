package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C0207d mBackgroundTintHelper;
    private final C0215h mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m770b();
        }
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m838b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            return c0215h.m839c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            return c0215h.m840d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m841e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m838b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m838b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m843g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m838b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m844h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0215h c0215h = this.mImageHelper;
        if (c0215h != null) {
            c0215h.m845i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0215h c0215h = new C0215h(this);
        this.mImageHelper = c0215h;
        c0215h.m842f(attributeSet, i4);
    }
}
