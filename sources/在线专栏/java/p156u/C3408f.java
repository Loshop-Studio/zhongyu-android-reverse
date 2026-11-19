package p156u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: u.f */
/* loaded from: classes.dex */
final class C3408f extends Drawable.ConstantState {

    /* renamed from: a */
    int f11964a;

    /* renamed from: b */
    Drawable.ConstantState f11965b;

    /* renamed from: c */
    ColorStateList f11966c;

    /* renamed from: d */
    PorterDuff.Mode f11967d;

    C3408f(C3408f c3408f) {
        this.f11966c = null;
        this.f11967d = C3406d.f11956g;
        if (c3408f != null) {
            this.f11964a = c3408f.f11964a;
            this.f11965b = c3408f.f11965b;
            this.f11966c = c3408f.f11966c;
            this.f11967d = c3408f.f11967d;
        }
    }

    /* renamed from: a */
    boolean m10409a() {
        return this.f11965b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i4 = this.f11964a;
        Drawable.ConstantState constantState = this.f11965b;
        return i4 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C3407e(this, resources);
    }
}
