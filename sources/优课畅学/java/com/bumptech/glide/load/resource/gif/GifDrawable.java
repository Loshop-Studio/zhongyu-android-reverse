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
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.load.resource.gif.C5454a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p116h0.AbstractC8706j;
import p148k.InterfaceC9042a;
import p160l.InterfaceC9233g;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements C5454a.b, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C5453a f3213a;

    /* renamed from: b */
    public boolean f3214b;

    /* renamed from: c */
    public boolean f3215c;

    /* renamed from: d */
    public boolean f3216d;

    /* renamed from: e */
    public boolean f3217e;

    /* renamed from: f */
    public int f3218f;

    /* renamed from: g */
    public int f3219g;

    /* renamed from: h */
    public boolean f3220h;

    /* renamed from: i */
    public Paint f3221i;

    /* renamed from: j */
    public Rect f3222j;

    /* renamed from: k */
    public List f3223k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C5453a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C5454a f3224a;

        public C5453a(C5454a c5454a) {
            this.f3224a = c5454a;
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

    public GifDrawable(Context context, InterfaceC9042a interfaceC9042a, InterfaceC9233g interfaceC9233g, int i10, int i11, Bitmap bitmap) {
        this(new C5453a(new C5454a(ComponentCallbacks2C5391b.m2732c(context), interfaceC9042a, i10, i11, interfaceC9233g, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C5454a.b
    /* renamed from: a */
    public void mo3113a() {
        if (m3114b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m3119g() == m3118f() - 1) {
            this.f3218f++;
        }
        int i10 = this.f3219g;
        if (i10 == -1 || this.f3218f < i10) {
            return;
        }
        m3122j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m3114b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m3115c() {
        return this.f3213a.f3224a.m3131b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f3223k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m3116d() {
        if (this.f3222j == null) {
            this.f3222j = new Rect();
        }
        return this.f3222j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3216d) {
            return;
        }
        if (this.f3220h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m3116d());
            this.f3220h = false;
        }
        canvas.drawBitmap(this.f3213a.f3224a.m3132c(), (Rect) null, m3116d(), m3120h());
    }

    /* renamed from: e */
    public Bitmap m3117e() {
        return this.f3213a.f3224a.m3134e();
    }

    /* renamed from: f */
    public int m3118f() {
        return this.f3213a.f3224a.m3135f();
    }

    /* renamed from: g */
    public int m3119g() {
        return this.f3213a.f3224a.m3133d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3213a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3213a.f3224a.m3136h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3213a.f3224a.m3138k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m3120h() {
        if (this.f3221i == null) {
            this.f3221i = new Paint(2);
        }
        return this.f3221i;
    }

    /* renamed from: i */
    public int m3121i() {
        return this.f3213a.f3224a.m3137j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3214b;
    }

    /* renamed from: j */
    public final void m3122j() {
        List list = this.f3223k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Animatable2Compat.AnimationCallback) this.f3223k.get(i10)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m3123k() {
        this.f3216d = true;
        this.f3213a.f3224a.m3130a();
    }

    /* renamed from: l */
    public final void m3124l() {
        this.f3218f = 0;
    }

    /* renamed from: m */
    public void m3125m(InterfaceC9233g interfaceC9233g, Bitmap bitmap) {
        this.f3213a.f3224a.m3142o(interfaceC9233g, bitmap);
    }

    /* renamed from: n */
    public final void m3126n() {
        AbstractC8706j.m14178a(!this.f3216d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3213a.f3224a.m3135f() == 1) {
            invalidateSelf();
        } else {
            if (this.f3214b) {
                return;
            }
            this.f3214b = true;
            this.f3213a.f3224a.m3145r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m3127o() {
        this.f3214b = false;
        this.f3213a.f3224a.m3146s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3220h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f3223k == null) {
            this.f3223k = new ArrayList();
        }
        this.f3223k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        m3120h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m3120h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        AbstractC8706j.m14178a(!this.f3216d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3217e = z10;
        if (!z10) {
            m3127o();
        } else if (this.f3215c) {
            m3126n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3215c = true;
        m3124l();
        if (this.f3217e) {
            m3126n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3215c = false;
        m3127o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f3223k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C5453a c5453a) {
        this.f3217e = true;
        this.f3219g = -1;
        this.f3213a = (C5453a) AbstractC8706j.m14181d(c5453a);
    }
}
