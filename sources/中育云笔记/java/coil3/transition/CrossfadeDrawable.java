package coil3.transition;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.camera.video.AudioStats;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil3.size.Scale;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p211jd.AbstractC9719c;
import p228l.C10072h;
import p265nd.AbstractC10410o;

/* loaded from: classes3.dex */
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {

    /* renamed from: n */
    public static final C5487a f3916n = new C5487a(null);

    /* renamed from: c */
    public final Scale f3917c;

    /* renamed from: d */
    public final int f3918d;

    /* renamed from: e */
    public final boolean f3919e;

    /* renamed from: f */
    public final List f3920f;

    /* renamed from: g */
    public final int f3921g;

    /* renamed from: h */
    public final int f3922h;

    /* renamed from: i */
    public long f3923i;

    /* renamed from: j */
    public int f3924j;

    /* renamed from: k */
    public int f3925k;

    /* renamed from: l */
    public Drawable f3926l;

    /* renamed from: m */
    public final Drawable f3927m;

    /* renamed from: coil3.transition.CrossfadeDrawable$a */
    public static final class C5487a {
        public /* synthetic */ C5487a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5487a() {
        }
    }

    /* renamed from: a */
    public final void m3287a() {
        this.f3925k = 2;
        this.f3926l = null;
        List list = this.f3920f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Animatable2Compat.AnimationCallback) list.get(i10)).onAnimationEnd(this);
        }
    }

    /* renamed from: b */
    public final void m3288b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM21070d = C10072h.m21070d(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f3917c);
        double d10 = 2;
        int iM19281c = AbstractC9719c.m19281c((iWidth - (intrinsicWidth * dM21070d)) / d10);
        int iM19281c2 = AbstractC9719c.m19281c((iHeight - (dM21070d * intrinsicHeight)) / d10);
        drawable.setBounds(rect.left + iM19281c, rect.top + iM19281c2, rect.right - iM19281c, rect.bottom - iM19281c2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f3920f.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i10 = this.f3925k;
        if (i10 == 0) {
            Drawable drawable2 = this.f3926l;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f3924j);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i10 == 2) {
            Drawable drawable3 = this.f3927m;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f3924j);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f3923i) / this.f3918d;
        double dM21759l = AbstractC10410o.m21759l(dUptimeMillis, AudioStats.AUDIO_AMPLITUDE_NONE, 1.0d);
        int i11 = this.f3924j;
        int i12 = (int) (dM21759l * i11);
        if (this.f3919e) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f3926l) != null) {
            drawable.setAlpha(i11);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.f3927m;
        if (drawable4 != null) {
            drawable4.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            m3287a();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3924j;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f3925k;
        if (i10 == 0) {
            Drawable drawable2 = this.f3926l;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i10 != 1) {
            if (i10 == 2 && (drawable = this.f3927m) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f3927m;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f3926l;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3922h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3921g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3926l;
        Drawable drawable2 = this.f3927m;
        int i10 = this.f3925k;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3925k == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3926l;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.f3927m;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            m3288b(drawable, rect);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            m3288b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f3926l;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f3927m;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3926l;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f3927m;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        this.f3920f.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f3924j = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3926l;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f3927m;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f3926l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f3927m;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f3925k != 0) {
            return;
        }
        this.f3925k = 1;
        this.f3923i = SystemClock.uptimeMillis();
        List list = this.f3920f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Animatable2Compat.AnimationCallback) list.get(i10)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f3926l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f3927m;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f3925k != 2) {
            m3287a();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        return this.f3920f.remove(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
