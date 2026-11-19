package p122t;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;
import p130v.C4616d;

/* renamed from: t.z */
/* loaded from: classes2.dex */
public class C4580z implements InterfaceC3795e {

    /* renamed from: a */
    public final C4616d f5759a;

    /* renamed from: b */
    public final InterfaceC4395d f5760b;

    public C4580z(C4616d c4616d, InterfaceC4395d interfaceC4395d) {
        this.f5759a = c4616d;
        this.f5760b = interfaceC4395d;
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(Uri uri, int i4, int i5, C3794d c3794d) {
        InterfaceC4361j interfaceC4361jMo1966b = this.f5759a.mo1966b(uri, i4, i5, c3794d);
        if (interfaceC4361jMo1966b == null) {
            return null;
        }
        return AbstractC4572r.m6293a(this.f5760b, (Drawable) interfaceC4361jMo1966b.get(), i4, i5);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(Uri uri, C3794d c3794d) {
        return "android.resource".equals(uri.getScheme());
    }
}
