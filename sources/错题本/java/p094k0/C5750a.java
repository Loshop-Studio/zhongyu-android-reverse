package p094k0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.C0039h;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p016b0.InterfaceC3064c0;
import p016b0.InterfaceC3072g0;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;
import p111m0.C6080c;
import p111m0.C6082e;
import p185v7.AbstractC6675d;
import p195x.C6740d;

/* renamed from: k0.a */
/* loaded from: classes2.dex */
public final class C5750a implements InterfaceC3072g0, InterfaceC3064c0 {

    /* renamed from: a */
    public final Drawable f9099a;

    /* renamed from: b */
    public final /* synthetic */ int f9100b;

    public C5750a(Drawable drawable, int i) {
        this.f9100b = i;
        AbstractC6675d.m6344f(drawable, "Argument must not be null");
        this.f9099a = drawable;
    }

    @Override // p016b0.InterfaceC3072g0
    /* renamed from: a */
    public final Class mo2004a() {
        switch (this.f9100b) {
            case 0:
                return this.f9099a.getClass();
            default:
                return GifDrawable.class;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final Object get() {
        Drawable drawable = this.f9099a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p016b0.InterfaceC3072g0
    public final int getSize() {
        switch (this.f9100b) {
            case 0:
                Drawable drawable = this.f9099a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C6082e c6082e = (C6082e) ((GifDrawable) this.f9099a).f2309a.f4733b;
                C6740d c6740d = c6082e.f9692a;
                return (c6740d.f11390j.length * 4) + c6740d.f11384d.limit() + c6740d.f11389i.length + c6082e.f9705n;
        }
    }

    @Override // p016b0.InterfaceC3064c0
    public void initialize() {
        switch (this.f9100b) {
            case 1:
                ((C6082e) ((GifDrawable) this.f9099a).f2309a.f4733b).f9703l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f9099a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof GifDrawable) {
                        ((C6082e) ((GifDrawable) drawable).f2309a.f4733b).f9703l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final void recycle() {
        switch (this.f9100b) {
            case 0:
                break;
            default:
                GifDrawable gifDrawable = (GifDrawable) this.f9099a;
                gifDrawable.stop();
                gifDrawable.f2312d = true;
                C6082e c6082e = (C6082e) gifDrawable.f2309a.f4733b;
                ComponentCallbacks2C3414h componentCallbacks2C3414h = c6082e.f9695d;
                c6082e.f9694c.clear();
                Bitmap bitmap = c6082e.f9703l;
                if (bitmap != null) {
                    c6082e.f9696e.mo2142b(bitmap);
                    c6082e.f9703l = null;
                }
                c6082e.f9697f = false;
                C6080c c6080c = c6082e.f9700i;
                if (c6080c != null) {
                    componentCallbacks2C3414h.m2385k(c6080c);
                    c6082e.f9700i = null;
                }
                C6080c c6080c2 = c6082e.f9702k;
                if (c6080c2 != null) {
                    componentCallbacks2C3414h.m2385k(c6080c2);
                    c6082e.f9702k = null;
                }
                C6080c c6080c3 = c6082e.f9704m;
                if (c6080c3 != null) {
                    componentCallbacks2C3414h.m2385k(c6080c3);
                    c6082e.f9704m = null;
                }
                C6740d c6740d = c6082e.f9692a;
                C0039h c0039h = c6740d.f11383c;
                c6740d.f11392l = null;
                byte[] bArr = c6740d.f11389i;
                if (bArr != null) {
                    ((C3210g) c0039h.f97c).m2160j(bArr);
                }
                int[] iArr = c6740d.f11390j;
                if (iArr != null) {
                    ((C3210g) c0039h.f97c).m2160j(iArr);
                }
                Bitmap bitmap2 = c6740d.f11393m;
                if (bitmap2 != null) {
                    ((InterfaceC3205b) c0039h.f96b).mo2142b(bitmap2);
                }
                c6740d.f11393m = null;
                c6740d.f11384d = null;
                c6740d.f11399s = null;
                byte[] bArr2 = c6740d.f11385e;
                if (bArr2 != null) {
                    ((C3210g) c0039h.f97c).m2160j(bArr2);
                }
                c6082e.f9701j = true;
                break;
        }
    }

    /* renamed from: b */
    private final void m5092b() {
    }
}
