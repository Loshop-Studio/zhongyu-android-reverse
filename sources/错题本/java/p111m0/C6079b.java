package p111m0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p016b0.InterfaceC3072g0;
import p077i0.C5647c;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6766i;

/* renamed from: m0.b */
/* loaded from: classes2.dex */
public final class C6079b implements InterfaceC6766i {

    /* renamed from: b */
    public final InterfaceC6766i f9687b;

    public C6079b(InterfaceC6766i interfaceC6766i) {
        AbstractC6675d.m6344f(interfaceC6766i, "Argument must not be null");
        this.f9687b = interfaceC6766i;
    }

    @Override // p202y.InterfaceC6766i
    /* renamed from: a */
    public final InterfaceC3072g0 mo4937a(Context context, InterfaceC3072g0 interfaceC3072g0, int i, int i8) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC3072g0.get();
        InterfaceC3072g0 c5647c = new C5647c(((C6082e) gifDrawable.f2309a.f4733b).f9703l, ComponentCallbacks2C3408b.m2360c(context).f2199b);
        InterfaceC6766i interfaceC6766i = this.f9687b;
        InterfaceC3072g0 interfaceC3072g0Mo4937a = interfaceC6766i.mo4937a(context, c5647c, i, i8);
        if (!c5647c.equals(interfaceC3072g0Mo4937a)) {
            c5647c.recycle();
        }
        ((C6082e) gifDrawable.f2309a.f4733b).m5799c(interfaceC6766i, (Bitmap) interfaceC3072g0Mo4937a.get());
        return interfaceC3072g0;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        this.f9687b.mo2013b(messageDigest);
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C6079b) {
            return this.f9687b.equals(((C6079b) obj).f9687b);
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return this.f9687b.hashCode();
    }
}
