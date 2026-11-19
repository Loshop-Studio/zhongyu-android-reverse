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
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.load.resource.gif.C2896a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p062g0.AbstractC3749i;
import p071i.InterfaceC3771a;
import p076j.InterfaceC3797g;

/* loaded from: classes2.dex */
public class GifDrawable extends Drawable implements C2896a.b, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C2895a f908a;

    /* renamed from: b */
    public boolean f909b;

    /* renamed from: c */
    public boolean f910c;

    /* renamed from: d */
    public boolean f911d;

    /* renamed from: e */
    public boolean f912e;

    /* renamed from: f */
    public int f913f;

    /* renamed from: g */
    public int f914g;

    /* renamed from: h */
    public boolean f915h;

    /* renamed from: i */
    public Paint f916i;

    /* renamed from: j */
    public Rect f917j;

    /* renamed from: k */
    public List f918k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C2895a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C2896a f919a;

        public C2895a(C2896a c2896a) {
            this.f919a = c2896a;
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

    public GifDrawable(Context context, InterfaceC3771a interfaceC3771a, InterfaceC3797g interfaceC3797g, int i4, int i5, Bitmap bitmap) {
        this(new C2895a(new C2896a(ComponentCallbacks2C2858c.m1680c(context), interfaceC3771a, i4, i5, interfaceC3797g, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C2896a.b
    /* renamed from: a */
    public void mo1969a() {
        if (m1970b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m1975g() == m1974f() - 1) {
            this.f913f++;
        }
        int i4 = this.f914g;
        if (i4 == -1 || this.f913f < i4) {
            return;
        }
        m1978j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m1970b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m1971c() {
        return this.f908a.f919a.m1987b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f918k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m1972d() {
        if (this.f917j == null) {
            this.f917j = new Rect();
        }
        return this.f917j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f911d) {
            return;
        }
        if (this.f915h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m1972d());
            this.f915h = false;
        }
        canvas.drawBitmap(this.f908a.f919a.m1988c(), (Rect) null, m1972d(), m1976h());
    }

    /* renamed from: e */
    public Bitmap m1973e() {
        return this.f908a.f919a.m1990e();
    }

    /* renamed from: f */
    public int m1974f() {
        return this.f908a.f919a.m1991f();
    }

    /* renamed from: g */
    public int m1975g() {
        return this.f908a.f919a.m1989d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f908a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f908a.f919a.m1992h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f908a.f919a.m1994k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m1976h() {
        if (this.f916i == null) {
            this.f916i = new Paint(2);
        }
        return this.f916i;
    }

    /* renamed from: i */
    public int m1977i() {
        return this.f908a.f919a.m1993j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f909b;
    }

    /* renamed from: j */
    public final void m1978j() {
        List list = this.f918k;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Animatable2Compat.AnimationCallback) this.f918k.get(i4)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m1979k() {
        this.f911d = true;
        this.f908a.f919a.m1986a();
    }

    /* renamed from: l */
    public final void m1980l() {
        this.f913f = 0;
    }

    /* renamed from: m */
    public void m1981m(InterfaceC3797g interfaceC3797g, Bitmap bitmap) {
        this.f908a.f919a.m1998o(interfaceC3797g, bitmap);
    }

    /* renamed from: n */
    public final void m1982n() {
        AbstractC3749i.m4765a(!this.f911d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f908a.f919a.m1991f() == 1) {
            invalidateSelf();
        } else {
            if (this.f909b) {
                return;
            }
            this.f909b = true;
            this.f908a.f919a.m2001r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m1983o() {
        this.f909b = false;
        this.f908a.f919a.m2002s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f915h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f918k == null) {
            this.f918k = new ArrayList();
        }
        this.f918k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        m1976h().setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m1976h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        AbstractC3749i.m4765a(!this.f911d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f912e = z3;
        if (!z3) {
            m1983o();
        } else if (this.f910c) {
            m1982n();
        }
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f910c = true;
        m1980l();
        if (this.f912e) {
            m1982n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f910c = false;
        m1983o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f918k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C2895a c2895a) {
        this.f912e = true;
        this.f914g = -1;
        this.f908a = (C2895a) AbstractC3749i.m4768d(c2895a);
    }
}
