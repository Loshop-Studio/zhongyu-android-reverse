package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.p014h.C0077e;
import p000a.p005b.p014h.C0087j;
import p000a.p005b.p014h.C0100p0;
import p000a.p005b.p014h.C0104r0;
import p000a.p005b.p014h.C0106s0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: b */
    public final C0077e f2852b;

    /* renamed from: c */
    public final C0087j f2853c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0077e c0077e = new C0077e(this);
        this.f2852b = c0077e;
        c0077e.m303d(attributeSet, i);
        C0087j c0087j = new C0087j(this);
        this.f2853c = c0087j;
        c0087j.m345b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m344a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0106s0 c0106s0;
        C0087j c0087j = this.f2853c;
        if (c0087j == null || (c0106s0 = c0087j.f685b) == null) {
            return null;
        }
        return c0106s0.f786a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0106s0 c0106s0;
        C0087j c0087j = this.f2853c;
        if (c0087j == null || (c0106s0 = c0087j.f685b) == null) {
            return null;
        }
        return c0106s0.f787b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f2853c.f684a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m344a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m344a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m346c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m344a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f2852b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m347d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0087j c0087j = this.f2853c;
        if (c0087j != null) {
            c0087j.m348e(mode);
        }
    }
}
