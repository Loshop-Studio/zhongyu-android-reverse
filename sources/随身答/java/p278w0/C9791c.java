package p278w0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p122h0.C8084d;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;
import p228r0.C9395e;

/* renamed from: w0.c */
/* loaded from: classes3.dex */
public final class C9791c implements InterfaceC9793e {

    /* renamed from: a */
    public final InterfaceC8867d f17416a;

    /* renamed from: b */
    public final InterfaceC9793e f17417b;

    /* renamed from: c */
    public final InterfaceC9793e f17418c;

    public C9791c(InterfaceC8867d interfaceC8867d, InterfaceC9793e interfaceC9793e, InterfaceC9793e interfaceC9793e2) {
        this.f17416a = interfaceC8867d;
        this.f17417b = interfaceC9793e;
        this.f17418c = interfaceC9793e2;
    }

    @Override // p278w0.InterfaceC9793e
    /* renamed from: a */
    public InterfaceC8259j mo16593a(InterfaceC8259j interfaceC8259j, C8084d c8084d) {
        Drawable drawable = (Drawable) interfaceC8259j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f17417b.mo16593a(C9395e.m15464c(((BitmapDrawable) drawable).getBitmap(), this.f17416a), c8084d);
        }
        if (drawable instanceof GifDrawable) {
            return this.f17418c.mo16593a(m16594b(interfaceC8259j), c8084d);
        }
        return null;
    }

    /* renamed from: b */
    public static InterfaceC8259j m16594b(InterfaceC8259j interfaceC8259j) {
        return interfaceC8259j;
    }
}
