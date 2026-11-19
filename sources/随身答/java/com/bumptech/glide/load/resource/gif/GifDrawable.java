package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.load.resource.gif.C5509a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p091e1.AbstractC7837i;
import p112g0.InterfaceC7983a;
import p122h0.InterfaceC8087g;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements C5509a.b, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C5508a f3562a;

    /* renamed from: b */
    public boolean f3563b;

    /* renamed from: c */
    public boolean f3564c;

    /* renamed from: d */
    public boolean f3565d;

    /* renamed from: e */
    public boolean f3566e;

    /* renamed from: f */
    public int f3567f;

    /* renamed from: g */
    public int f3568g;

    /* renamed from: h */
    public boolean f3569h;

    /* renamed from: i */
    public Paint f3570i;

    /* renamed from: j */
    public Rect f3571j;

    /* renamed from: k */
    public List f3572k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C5508a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C5509a f3573a;

        public C5508a(C5509a c5509a) {
            this.f3573a = c5509a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, InterfaceC7983a interfaceC7983a, InterfaceC8087g interfaceC8087g, int i9, int i10, Bitmap bitmap) {
        this(new C5508a(new C5509a(ComponentCallbacks2C5471b.m3006c(context), interfaceC7983a, i9, i10, interfaceC8087g, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C5509a.b
    /* renamed from: a */
    public void mo3293a() {
        if (m3294b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m3299g() == m3298f() - 1) {
            this.f3567f++;
        }
        int i9 = this.f3568g;
        if (i9 == -1 || this.f3567f < i9) {
            return;
        }
        m3302j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m3294b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m3295c() {
        return this.f3562a.f3573a.m3311b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f3572k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m3296d() {
        if (this.f3571j == null) {
            this.f3571j = new Rect();
        }
        return this.f3571j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3565d) {
            return;
        }
        if (this.f3569h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m3296d());
            this.f3569h = false;
        }
        canvas.drawBitmap(this.f3562a.f3573a.m3312c(), (Rect) null, m3296d(), m3300h());
    }

    /* renamed from: e */
    public Bitmap m3297e() {
        return this.f3562a.f3573a.m3314e();
    }

    /* renamed from: f */
    public int m3298f() {
        return this.f3562a.f3573a.m3315f();
    }

    /* renamed from: g */
    public int m3299g() {
        return this.f3562a.f3573a.m3313d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3562a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3562a.f3573a.m3316h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3562a.f3573a.m3318k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m3300h() {
        if (this.f3570i == null) {
            this.f3570i = new Paint(2);
        }
        return this.f3570i;
    }

    /* renamed from: i */
    public int m3301i() {
        return this.f3562a.f3573a.m3317j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3563b;
    }

    /* renamed from: j */
    public final void m3302j() {
        List list = this.f3572k;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((Animatable2Compat.AnimationCallback) this.f3572k.get(i9)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m3303k() {
        this.f3565d = true;
        this.f3562a.f3573a.m3310a();
    }

    /* renamed from: l */
    public final void m3304l() {
        this.f3567f = 0;
    }

    /* renamed from: m */
    public void m3305m(InterfaceC8087g interfaceC8087g, Bitmap bitmap) {
        this.f3562a.f3573a.m3322o(interfaceC8087g, bitmap);
    }

    /* renamed from: n */
    public final void m3306n() {
        AbstractC7837i.m12253a(!this.f3565d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3562a.f3573a.m3315f() == 1) {
            invalidateSelf();
        } else {
            if (this.f3563b) {
                return;
            }
            this.f3563b = true;
            this.f3562a.f3573a.m3325r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m3307o() {
        this.f3563b = false;
        this.f3562a.f3573a.m3326s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3569h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f3572k == null) {
            this.f3572k = new ArrayList();
        }
        this.f3572k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        m3300h().setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m3300h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        AbstractC7837i.m12253a(!this.f3565d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3566e = z9;
        if (!z9) {
            m3307o();
        } else if (this.f3564c) {
            m3306n();
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3564c = true;
        m3304l();
        if (this.f3566e) {
            m3306n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3564c = false;
        m3307o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f3572k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C5508a c5508a) {
        this.f3566e = true;
        this.f3568g = -1;
        this.f3562a = (C5508a) AbstractC7837i.m12256d(c5508a);
    }
}
