package p353u0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p109d1.AbstractC8909j;
import p168h0.InterfaceC9441h;
import p198j0.InterfaceC9657j;
import p298q0.C10697f;

/* renamed from: u0.e */
/* loaded from: classes3.dex */
public class C11317e implements InterfaceC9441h {

    /* renamed from: b */
    public final InterfaceC9441h f27127b;

    public C11317e(InterfaceC9441h interfaceC9441h) {
        this.f27127b = (InterfaceC9441h) AbstractC8909j.m17468d(interfaceC9441h);
    }

    @Override // p168h0.InterfaceC9441h
    /* renamed from: a */
    public InterfaceC9657j mo18617a(Context context, InterfaceC9657j interfaceC9657j, int i10, int i11) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC9657j.get();
        InterfaceC9657j c10697f = new C10697f(gifDrawable.m4321e(), ComponentCallbacks2C5810b.m3940c(context).m3952f());
        InterfaceC9657j interfaceC9657jMo18617a = this.f27127b.mo18617a(context, c10697f, i10, i11);
        if (!c10697f.equals(interfaceC9657jMo18617a)) {
            c10697f.recycle();
        }
        gifDrawable.m4329m(this.f27127b, (Bitmap) interfaceC9657jMo18617a.get());
        return interfaceC9657j;
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        this.f27127b.mo2797b(messageDigest);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C11317e) {
            return this.f27127b.equals(((C11317e) obj).f27127b);
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return this.f27127b.hashCode();
    }
}
