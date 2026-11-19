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
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.load.resource.gif.C5405a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p117i1.AbstractC7651j;
import p151l0.InterfaceC8482a;
import p162m0.InterfaceC8542g;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements C5405a.b, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C5404a f3780a;

    /* renamed from: b */
    public boolean f3781b;

    /* renamed from: c */
    public boolean f3782c;

    /* renamed from: d */
    public boolean f3783d;

    /* renamed from: e */
    public boolean f3784e;

    /* renamed from: f */
    public int f3785f;

    /* renamed from: g */
    public int f3786g;

    /* renamed from: h */
    public boolean f3787h;

    /* renamed from: i */
    public Paint f3788i;

    /* renamed from: j */
    public Rect f3789j;

    /* renamed from: k */
    public List f3790k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C5404a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C5405a f3791a;

        public C5404a(C5405a c5405a) {
            this.f3791a = c5405a;
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

    public GifDrawable(Context context, InterfaceC8482a interfaceC8482a, InterfaceC8542g interfaceC8542g, int i10, int i11, Bitmap bitmap) {
        this(new C5404a(new C5405a(ComponentCallbacks2C5342b.m3291c(context), interfaceC8482a, i10, i11, interfaceC8542g, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C5405a.b
    /* renamed from: a */
    public void mo3668a() {
        if (m3669b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m3674g() == m3673f() - 1) {
            this.f3785f++;
        }
        int i10 = this.f3786g;
        if (i10 == -1 || this.f3785f < i10) {
            return;
        }
        m3677j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m3669b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m3670c() {
        return this.f3780a.f3791a.m3686b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f3790k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m3671d() {
        if (this.f3789j == null) {
            this.f3789j = new Rect();
        }
        return this.f3789j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3783d) {
            return;
        }
        if (this.f3787h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m3671d());
            this.f3787h = false;
        }
        canvas.drawBitmap(this.f3780a.f3791a.m3687c(), (Rect) null, m3671d(), m3675h());
    }

    /* renamed from: e */
    public Bitmap m3672e() {
        return this.f3780a.f3791a.m3689e();
    }

    /* renamed from: f */
    public int m3673f() {
        return this.f3780a.f3791a.m3690f();
    }

    /* renamed from: g */
    public int m3674g() {
        return this.f3780a.f3791a.m3688d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3780a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3780a.f3791a.m3691h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3780a.f3791a.m3693k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m3675h() {
        if (this.f3788i == null) {
            this.f3788i = new Paint(2);
        }
        return this.f3788i;
    }

    /* renamed from: i */
    public int m3676i() {
        return this.f3780a.f3791a.m3692j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3781b;
    }

    /* renamed from: j */
    public final void m3677j() {
        List list = this.f3790k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Animatable2Compat.AnimationCallback) this.f3790k.get(i10)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m3678k() {
        this.f3783d = true;
        this.f3780a.f3791a.m3685a();
    }

    /* renamed from: l */
    public final void m3679l() {
        this.f3785f = 0;
    }

    /* renamed from: m */
    public void m3680m(InterfaceC8542g interfaceC8542g, Bitmap bitmap) {
        this.f3780a.f3791a.m3697o(interfaceC8542g, bitmap);
    }

    /* renamed from: n */
    public final void m3681n() {
        AbstractC7651j.m12680a(!this.f3783d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3780a.f3791a.m3690f() == 1) {
            invalidateSelf();
        } else {
            if (this.f3781b) {
                return;
            }
            this.f3781b = true;
            this.f3780a.f3791a.m3700r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m3682o() {
        this.f3781b = false;
        this.f3780a.f3791a.m3701s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3787h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f3790k == null) {
            this.f3790k = new ArrayList();
        }
        this.f3790k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        m3675h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m3675h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        AbstractC7651j.m12680a(!this.f3783d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3784e = z9;
        if (!z9) {
            m3682o();
        } else if (this.f3782c) {
            m3681n();
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3782c = true;
        m3679l();
        if (this.f3784e) {
            m3681n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3782c = false;
        m3682o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f3790k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C5404a c5404a) {
        this.f3784e = true;
        this.f3786g = -1;
        this.f3780a = (C5404a) AbstractC7651j.m12683d(c5404a);
    }
}
