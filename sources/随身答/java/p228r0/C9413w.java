package p228r0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;
import p248t0.C9605d;

/* renamed from: r0.w */
/* loaded from: classes3.dex */
public class C9413w implements InterfaceC8085e {

    /* renamed from: a */
    public final C9605d f16409a;

    /* renamed from: b */
    public final InterfaceC8867d f16410b;

    public C9413w(C9605d c9605d, InterfaceC8867d interfaceC8867d) {
        this.f16409a = c9605d;
        this.f16410b = interfaceC8867d;
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(Uri uri, int i9, int i10, C8084d c8084d) {
        InterfaceC8259j interfaceC8259jMo3290b = this.f16409a.mo3290b(uri, i9, i10, c8084d);
        if (interfaceC8259jMo3290b == null) {
            return null;
        }
        return AbstractC9405o.m15474a(this.f16410b, (Drawable) interfaceC8259jMo3290b.get(), i9, i10);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(Uri uri, C8084d c8084d) {
        return "android.resource".equals(uri.getScheme());
    }
}
