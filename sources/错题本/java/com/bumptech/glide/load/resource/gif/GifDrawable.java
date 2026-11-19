package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.xuexiang.xui.widget.progress.materialprogressbar.C4185b;
import java.util.ArrayList;
import p111m0.C6080c;
import p111m0.C6082e;
import p111m0.InterfaceC6081d;
import p185v7.AbstractC6675d;

/* loaded from: classes2.dex */
public class GifDrawable extends Drawable implements InterfaceC6081d, Animatable, Animatable2Compat {

    /* renamed from: a */
    public final C4185b f2309a;

    /* renamed from: b */
    public boolean f2310b;

    /* renamed from: c */
    public boolean f2311c;

    /* renamed from: d */
    public boolean f2312d;

    /* renamed from: f */
    public int f2314f;

    /* renamed from: h */
    public boolean f2316h;

    /* renamed from: i */
    public Paint f2317i;

    /* renamed from: j */
    public Rect f2318j;

    /* renamed from: k */
    public ArrayList f2319k;

    /* renamed from: e */
    public boolean f2313e = true;

    /* renamed from: g */
    public final int f2315g = -1;

    public GifDrawable(C4185b c4185b) {
        this.f2309a = c4185b;
    }

    /* renamed from: a */
    public final void m2416a() {
        AbstractC6675d.m6342d("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f2312d);
        C6082e c6082e = (C6082e) this.f2309a.f4733b;
        if (c6082e.f9692a.f11392l.f11368c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f2310b) {
            return;
        }
        this.f2310b = true;
        ArrayList arrayList = c6082e.f9694c;
        if (c6082e.f9701j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c6082e.f9697f) {
            c6082e.f9697f = true;
            c6082e.f9701j = false;
            c6082e.m5797a();
        }
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ArrayList arrayList = this.f2319k;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2312d) {
            return;
        }
        if (this.f2316h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f2318j == null) {
                this.f2318j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2318j);
            this.f2316h = false;
        }
        C6082e c6082e = (C6082e) this.f2309a.f4733b;
        C6080c c6080c = c6082e.f9700i;
        Bitmap bitmap = c6080c != null ? c6080c.f9691g : c6082e.f9703l;
        if (this.f2318j == null) {
            this.f2318j = new Rect();
        }
        Rect rect = this.f2318j;
        if (this.f2317i == null) {
            this.f2317i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f2317i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2309a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C6082e) this.f2309a.f4733b).f9707p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C6082e) this.f2309a.f4733b).f9706o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2310b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2316h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f2319k == null) {
            this.f2319k = new ArrayList();
        }
        this.f2319k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2317i == null) {
            this.f2317i = new Paint(2);
        }
        this.f2317i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2317i == null) {
            this.f2317i = new Paint(2);
        }
        this.f2317i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        AbstractC6675d.m6342d("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f2312d);
        this.f2313e = z8;
        if (!z8) {
            this.f2310b = false;
            C6082e c6082e = (C6082e) this.f2309a.f4733b;
            ArrayList arrayList = c6082e.f9694c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c6082e.f9697f = false;
            }
        } else if (this.f2311c) {
            m2416a();
        }
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f2311c = true;
        this.f2314f = 0;
        if (this.f2313e) {
            m2416a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2311c = false;
        this.f2310b = false;
        C6082e c6082e = (C6082e) this.f2309a.f4733b;
        ArrayList arrayList = c6082e.f9694c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c6082e.f9697f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.f2319k;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        return arrayList.remove(animationCallback);
    }
}
