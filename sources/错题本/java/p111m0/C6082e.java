package p111m0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.C3409c;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.ArrayList;
import p016b0.AbstractC3085o;
import p018b2.C3101a;
import p024c0.InterfaceC3205b;
import p069h0.C5618a;
import p147r0.C6446d;
import p172u0.C6610b;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;
import p195x.C6737a;
import p195x.C6740d;
import p202y.InterfaceC6766i;

/* renamed from: m0.e */
/* loaded from: classes2.dex */
public final class C6082e {

    /* renamed from: a */
    public final C6740d f9692a;

    /* renamed from: b */
    public final Handler f9693b;

    /* renamed from: c */
    public final ArrayList f9694c;

    /* renamed from: d */
    public final ComponentCallbacks2C3414h f9695d;

    /* renamed from: e */
    public final InterfaceC3205b f9696e;

    /* renamed from: f */
    public boolean f9697f;

    /* renamed from: g */
    public boolean f9698g;

    /* renamed from: h */
    public C3412f f9699h;

    /* renamed from: i */
    public C6080c f9700i;

    /* renamed from: j */
    public boolean f9701j;

    /* renamed from: k */
    public C6080c f9702k;

    /* renamed from: l */
    public Bitmap f9703l;

    /* renamed from: m */
    public C6080c f9704m;

    /* renamed from: n */
    public int f9705n;

    /* renamed from: o */
    public int f9706o;

    /* renamed from: p */
    public int f9707p;

    public C6082e(ComponentCallbacks2C3408b componentCallbacks2C3408b, C6740d c6740d, int i, int i8, Bitmap bitmap) {
        InterfaceC3205b interfaceC3205b = componentCallbacks2C3408b.f2199b;
        C3409c c3409c = componentCallbacks2C3408b.f2201d;
        ComponentCallbacks2C3414h componentCallbacks2C3414hM2362e = ComponentCallbacks2C3408b.m2362e(c3409c.getBaseContext());
        C3412f c3412fM2376w = ComponentCallbacks2C3408b.m2362e(c3409c.getBaseContext()).m2384j().mo2374c(((C6446d) ((C6446d) ((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6100v()).m6096r()).m6089k(i, i8));
        this.f9694c = new ArrayList();
        this.f9695d = componentCallbacks2C3414hM2362e;
        Handler handler = new Handler(Looper.getMainLooper(), new C3101a(this, 1));
        this.f9696e = interfaceC3205b;
        this.f9693b = handler;
        this.f9699h = c3412fM2376w;
        this.f9692a = c6740d;
        m5799c(C5618a.f8750b, bitmap);
    }

    /* renamed from: a */
    public final void m5797a() {
        int i;
        if (!this.f9697f || this.f9698g) {
            return;
        }
        C6080c c6080c = this.f9704m;
        if (c6080c != null) {
            this.f9704m = null;
            m5798b(c6080c);
            return;
        }
        this.f9698g = true;
        C6740d c6740d = this.f9692a;
        int i8 = c6740d.f11392l.f11368c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i8 <= 0 || (i = c6740d.f11391k) < 0) ? 0 : (i < 0 || i >= i8) ? -1 : ((C6737a) r2.f11370e.get(i)).f11363i);
        int i9 = (c6740d.f11391k + 1) % c6740d.f11392l.f11368c;
        c6740d.f11391k = i9;
        this.f9702k = new C6080c(this.f9693b, i9, jUptimeMillis);
        C3412f c3412fM2376w = this.f9699h.mo2374c((C6446d) new C6446d().m6095q(new C6610b(Double.valueOf(Math.random()))));
        c3412fM2376w.f2234w = c6740d;
        c3412fM2376w.f2236y = true;
        c3412fM2376w.m2379z(this.f9702k);
    }

    /* renamed from: b */
    public final void m5798b(C6080c c6080c) {
        this.f9698g = false;
        boolean z8 = this.f9701j;
        Handler handler = this.f9693b;
        if (z8) {
            handler.obtainMessage(2, c6080c).sendToTarget();
            return;
        }
        if (!this.f9697f) {
            this.f9704m = c6080c;
            return;
        }
        if (c6080c.f9691g != null) {
            Bitmap bitmap = this.f9703l;
            if (bitmap != null) {
                this.f9696e.mo2142b(bitmap);
                this.f9703l = null;
            }
            C6080c c6080c2 = this.f9700i;
            this.f9700i = c6080c;
            ArrayList arrayList = this.f9694c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                GifDrawable gifDrawable = (GifDrawable) ((InterfaceC6081d) arrayList.get(size));
                Object callback = gifDrawable.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    gifDrawable.stop();
                    gifDrawable.invalidateSelf();
                } else {
                    gifDrawable.invalidateSelf();
                    C6080c c6080c3 = ((C6082e) gifDrawable.f2309a.f4733b).f9700i;
                    if ((c6080c3 != null ? c6080c3.f9689e : -1) == r6.f9692a.f11392l.f11368c - 1) {
                        gifDrawable.f2314f++;
                    }
                    int i = gifDrawable.f2315g;
                    if (i != -1 && gifDrawable.f2314f >= i) {
                        ArrayList arrayList2 = gifDrawable.f2319k;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                ((Animatable2Compat.AnimationCallback) gifDrawable.f2319k.get(i8)).onAnimationEnd(gifDrawable);
                            }
                        }
                        gifDrawable.stop();
                    }
                }
            }
            if (c6080c2 != null) {
                handler.obtainMessage(2, c6080c2).sendToTarget();
            }
        }
        m5797a();
    }

    /* renamed from: c */
    public final void m5799c(InterfaceC6766i interfaceC6766i, Bitmap bitmap) {
        AbstractC6675d.m6344f(interfaceC6766i, "Argument must not be null");
        AbstractC6675d.m6344f(bitmap, "Argument must not be null");
        this.f9703l = bitmap;
        this.f9699h = this.f9699h.mo2374c(new C6446d().m6099u(interfaceC6766i, true));
        this.f9705n = AbstractC6664k.m6323c(bitmap);
        this.f9706o = bitmap.getWidth();
        this.f9707p = bitmap.getHeight();
    }
}
