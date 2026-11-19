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
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.resource.gif.C5873a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p109d1.AbstractC8909j;
import p156g0.InterfaceC9253a;
import p168h0.InterfaceC9441h;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements C5873a.b, Animatable, Animatable2Compat {

    /* renamed from: c */
    public final C5872a f4983c;

    /* renamed from: d */
    public boolean f4984d;

    /* renamed from: e */
    public boolean f4985e;

    /* renamed from: f */
    public boolean f4986f;

    /* renamed from: g */
    public boolean f4987g;

    /* renamed from: h */
    public int f4988h;

    /* renamed from: i */
    public int f4989i;

    /* renamed from: j */
    public boolean f4990j;

    /* renamed from: k */
    public Paint f4991k;

    /* renamed from: l */
    public Rect f4992l;

    /* renamed from: m */
    public List f4993m;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C5872a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C5873a f4994a;

        public C5872a(C5873a c5873a) {
            this.f4994a = c5873a;
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

    public GifDrawable(Context context, InterfaceC9253a interfaceC9253a, InterfaceC9441h interfaceC9441h, int i10, int i11, Bitmap bitmap) {
        this(new C5872a(new C5873a(ComponentCallbacks2C5810b.m3940c(context), interfaceC9253a, i10, i11, interfaceC9441h, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C5873a.b
    /* renamed from: a */
    public void mo4317a() {
        if (m4318b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m4323g() == m4322f() - 1) {
            this.f4988h++;
        }
        int i10 = this.f4989i;
        if (i10 == -1 || this.f4988h < i10) {
            return;
        }
        m4326j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m4318b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m4319c() {
        return this.f4983c.f4994a.m4335b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f4993m;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m4320d() {
        if (this.f4992l == null) {
            this.f4992l = new Rect();
        }
        return this.f4992l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4986f) {
            return;
        }
        if (this.f4990j) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m4320d());
            this.f4990j = false;
        }
        canvas.drawBitmap(this.f4983c.f4994a.m4336c(), (Rect) null, m4320d(), m4324h());
    }

    /* renamed from: e */
    public Bitmap m4321e() {
        return this.f4983c.f4994a.m4338e();
    }

    /* renamed from: f */
    public int m4322f() {
        return this.f4983c.f4994a.m4339f();
    }

    /* renamed from: g */
    public int m4323g() {
        return this.f4983c.f4994a.m4337d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4983c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4983c.f4994a.m4340h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4983c.f4994a.m4342k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m4324h() {
        if (this.f4991k == null) {
            this.f4991k = new Paint(2);
        }
        return this.f4991k;
    }

    /* renamed from: i */
    public int m4325i() {
        return this.f4983c.f4994a.m4341j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4984d;
    }

    /* renamed from: j */
    public final void m4326j() {
        List list = this.f4993m;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Animatable2Compat.AnimationCallback) this.f4993m.get(i10)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m4327k() {
        this.f4986f = true;
        this.f4983c.f4994a.m4334a();
    }

    /* renamed from: l */
    public final void m4328l() {
        this.f4988h = 0;
    }

    /* renamed from: m */
    public void m4329m(InterfaceC9441h interfaceC9441h, Bitmap bitmap) {
        this.f4983c.f4994a.m4346o(interfaceC9441h, bitmap);
    }

    /* renamed from: n */
    public final void m4330n() {
        AbstractC8909j.m17465a(!this.f4986f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4983c.f4994a.m4339f() == 1) {
            invalidateSelf();
        } else {
            if (this.f4984d) {
                return;
            }
            this.f4984d = true;
            this.f4983c.f4994a.m4349r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m4331o() {
        this.f4984d = false;
        this.f4983c.f4994a.m4350s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4990j = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f4993m == null) {
            this.f4993m = new ArrayList();
        }
        this.f4993m.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        m4324h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m4324h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        AbstractC8909j.m17465a(!this.f4986f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4987g = z10;
        if (!z10) {
            m4331o();
        } else if (this.f4985e) {
            m4330n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4985e = true;
        m4328l();
        if (this.f4987g) {
            m4330n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4985e = false;
        m4331o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f4993m;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C5872a c5872a) {
        this.f4987g = true;
        this.f4989i = -1;
        this.f4983c = (C5872a) AbstractC8909j.m17468d(c5872a);
    }
}
