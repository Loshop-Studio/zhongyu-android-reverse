package p156u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: u.e */
/* loaded from: classes.dex */
class C3407e extends C3406d {

    /* renamed from: h */
    private static Method f11963h;

    C3407e(Drawable drawable) {
        super(drawable);
        m10408g();
    }

    /* renamed from: g */
    private void m10408g() {
        if (f11963h == null) {
            try {
                f11963h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e4) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e4);
            }
        }
    }

    @Override // p156u.C3406d
    /* renamed from: c */
    protected boolean mo10407c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f11962f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f11962f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f11962f;
        if (drawable != null && (method = f11963h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e4) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e4);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        this.f11962f.setHotspot(f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        this.f11962f.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // p156u.C3406d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p156u.C3406d, android.graphics.drawable.Drawable
    public void setTint(int i4) {
        if (mo10407c()) {
            super.setTint(i4);
        } else {
            this.f11962f.setTint(i4);
        }
    }

    @Override // p156u.C3406d, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (mo10407c()) {
            super.setTintList(colorStateList);
        } else {
            this.f11962f.setTintList(colorStateList);
        }
    }

    @Override // p156u.C3406d, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo10407c()) {
            super.setTintMode(mode);
        } else {
            this.f11962f.setTintMode(mode);
        }
    }

    C3407e(C3408f c3408f, Resources resources) {
        super(c3408f, resources);
        m10408g();
    }
}
