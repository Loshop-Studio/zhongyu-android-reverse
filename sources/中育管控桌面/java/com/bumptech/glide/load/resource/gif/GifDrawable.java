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
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.load.resource.gif.C4741a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p016b1.AbstractC4408j;
import p046e0.InterfaceC6256a;
import p053f0.InterfaceC6288g;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements C4741a.b, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C4740a f2571a;

    /* renamed from: b */
    public boolean f2572b;

    /* renamed from: c */
    public boolean f2573c;

    /* renamed from: d */
    public boolean f2574d;

    /* renamed from: e */
    public boolean f2575e;

    /* renamed from: f */
    public int f2576f;

    /* renamed from: g */
    public int f2577g;

    /* renamed from: h */
    public boolean f2578h;

    /* renamed from: i */
    public Paint f2579i;

    /* renamed from: j */
    public Rect f2580j;

    /* renamed from: k */
    public List f2581k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C4740a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C4741a f2582a;

        public C4740a(C4741a c4741a) {
            this.f2582a = c4741a;
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

    public GifDrawable(Context context, InterfaceC6256a interfaceC6256a, InterfaceC6288g interfaceC6288g, int i6, int i7, Bitmap bitmap) {
        this(new C4740a(new C4741a(ComponentCallbacks2C4678c.m2470c(context), interfaceC6256a, i6, i7, interfaceC6288g, bitmap)));
    }

    @Override // com.bumptech.glide.load.resource.gif.C4741a.b
    /* renamed from: a */
    public void mo2848a() {
        if (m2849b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m2854g() == m2853f() - 1) {
            this.f2576f++;
        }
        int i6 = this.f2577g;
        if (i6 == -1 || this.f2576f < i6) {
            return;
        }
        m2857j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m2849b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m2850c() {
        return this.f2571a.f2582a.m2866b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f2581k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect m2851d() {
        if (this.f2580j == null) {
            this.f2580j = new Rect();
        }
        return this.f2580j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2574d) {
            return;
        }
        if (this.f2578h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m2851d());
            this.f2578h = false;
        }
        canvas.drawBitmap(this.f2571a.f2582a.m2867c(), (Rect) null, m2851d(), m2855h());
    }

    /* renamed from: e */
    public Bitmap m2852e() {
        return this.f2571a.f2582a.m2869e();
    }

    /* renamed from: f */
    public int m2853f() {
        return this.f2571a.f2582a.m2870f();
    }

    /* renamed from: g */
    public int m2854g() {
        return this.f2571a.f2582a.m2868d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2571a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2571a.f2582a.m2871h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2571a.f2582a.m2873k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m2855h() {
        if (this.f2579i == null) {
            this.f2579i = new Paint(2);
        }
        return this.f2579i;
    }

    /* renamed from: i */
    public int m2856i() {
        return this.f2571a.f2582a.m2872j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2572b;
    }

    /* renamed from: j */
    public final void m2857j() {
        List list = this.f2581k;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((Animatable2Compat.AnimationCallback) this.f2581k.get(i6)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void m2858k() {
        this.f2574d = true;
        this.f2571a.f2582a.m2865a();
    }

    /* renamed from: l */
    public final void m2859l() {
        this.f2576f = 0;
    }

    /* renamed from: m */
    public void m2860m(InterfaceC6288g interfaceC6288g, Bitmap bitmap) {
        this.f2571a.f2582a.m2877o(interfaceC6288g, bitmap);
    }

    /* renamed from: n */
    public final void m2861n() {
        AbstractC4408j.m1435a(!this.f2574d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f2571a.f2582a.m2870f() == 1) {
            invalidateSelf();
        } else {
            if (this.f2572b) {
                return;
            }
            this.f2572b = true;
            this.f2571a.f2582a.m2880r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m2862o() {
        this.f2572b = false;
        this.f2571a.f2582a.m2881s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2578h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f2581k == null) {
            this.f2581k = new ArrayList();
        }
        this.f2581k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        m2855h().setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m2855h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        AbstractC4408j.m1435a(!this.f2574d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f2575e = z6;
        if (!z6) {
            m2862o();
        } else if (this.f2573c) {
            m2861n();
        }
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f2573c = true;
        m2859l();
        if (this.f2575e) {
            m2861n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f2573c = false;
        m2862o();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f2581k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C4740a c4740a) {
        this.f2575e = true;
        this.f2577g = -1;
        this.f2571a = (C4740a) AbstractC4408j.m1438d(c4740a);
    }
}
