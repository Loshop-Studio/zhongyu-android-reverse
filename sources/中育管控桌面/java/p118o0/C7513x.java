package p118o0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;
import p132q0.C7616k;

/* renamed from: o0.x */
/* loaded from: classes3.dex */
public class C7513x implements InterfaceC6286e {

    /* renamed from: a */
    public final C7616k f9700a;

    /* renamed from: b */
    public final InterfaceC6499d f9701b;

    public C7513x(C7616k c7616k, InterfaceC6499d interfaceC6499d) {
        this.f9700a = c7616k;
        this.f9701b = interfaceC6499d;
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(Uri uri, int i6, int i7, C6285d c6285d) {
        InterfaceC6440j interfaceC6440jMo2796a = this.f9700a.mo2796a(uri, i6, i7, c6285d);
        if (interfaceC6440jMo2796a == null) {
            return null;
        }
        return AbstractC7505p.m8629a(this.f9701b, (Drawable) interfaceC6440jMo2796a.get(), i6, i7);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(Uri uri, C6285d c6285d) {
        return "android.resource".equals(uri.getScheme());
    }
}
